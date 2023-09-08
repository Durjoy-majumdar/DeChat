package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import androidx.camera.core.FocusMeteringAction;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final Object dimensionLock = new Object();
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    /* access modifiers changed from: private */
    public ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private final Object renderedTextureMetadataLock = new Object();
    /* access modifiers changed from: private */
    public volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;

    public static class DecodedTextureMetadata {
        public final Integer decodeTimeMs;
        public final long presentationTimestampUs;

        public DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    public static class FrameInfo {
        public final long decodeStartTimeMs;
        public final int rotation;

        public FrameInfo(long j, int i) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecMimeType videoCodecMimeType, int i, EglBase.Context context) {
        if (isSupportedColorFormat(i)) {
            Logging.m25022d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        throw new IllegalArgumentException("Unsupported color format: " + i);
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        if (i5 % 2 == 0) {
            int i8 = (i6 + 1) / 2;
            int i9 = i2 % 2;
            int i15 = i9 == 0 ? (i7 + 1) / 2 : i7 / 2;
            int i16 = i5 / 2;
            int i17 = (i5 * i2) + 0;
            int i18 = i16 * i15;
            int i19 = i17 + ((i16 * i2) / 2);
            int i25 = i19 + i18;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i6, i7);
            byteBuffer2.limit((i5 * i7) + 0);
            byteBuffer2.position(0);
            copyPlane(byteBuffer.slice(), i, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i3, i4);
            byteBuffer2.limit(i17 + i18);
            byteBuffer2.position(i17);
            copyPlane(byteBuffer.slice(), i16, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i8, i15);
            if (i9 == 1) {
                byteBuffer2.position(i17 + ((i15 - 1) * i16));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i15);
                dataU.put(byteBuffer2);
            }
            byteBuffer2.limit(i25);
            byteBuffer2.position(i19);
            copyPlane(byteBuffer.slice(), i16, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i8, i15);
            if (i9 == 1) {
                byteBuffer2.position(i19 + (i16 * (i15 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i15);
                dataV.put(byteBuffer2);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError("Stride is not divisible by two: " + i5);
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, (Runnable) null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") {
            public void run() {
                ThreadUtils.ThreadChecker unused = AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        int i7 = bufferInfo.size;
        if (i7 < ((i3 * i4) * 3) / 2) {
            Logging.m25023e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        int i8 = (i7 >= ((i5 * i4) * 3) / 2 || i6 != i4 || i5 <= i3) ? i5 : (i7 * 2) / (i4 * 3);
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        VideoFrame.Buffer copyI420Buffer = this.colorFormat == 19 ? copyI420Buffer(slice, i8, i6, i3, i4) : copyNV12ToI420Buffer(slice, i8, i6, i3, i4);
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(copyI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, (Integer) null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                this.codec.releaseOutputBuffer(i, false);
                return;
            }
            this.surfaceTextureHelper.setTextureSize(i3, i4);
            this.surfaceTextureHelper.setFrameRotation(i2);
            this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
            this.codec.releaseOutputBuffer(i, true);
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i + " height: " + i2);
        if (this.outputThread != null) {
            Logging.m25023e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i;
        this.height = i2;
        this.stride = i;
        this.sliceHeight = i2;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.m25022d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException | IllegalStateException e) {
                Logging.m25024e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            Logging.m25023e(TAG, "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        if (r5.surfaceTextureHelper != null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c6, code lost:
        if (r6.containsKey("color-format") == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        r5.colorFormat = r6.getInteger("color-format");
        org.webrtc.Logging.m25022d(TAG, "Color: 0x" + java.lang.Integer.toHexString(r5.colorFormat));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f2, code lost:
        if (isSupportedColorFormat(r5.colorFormat) != false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f4, code lost:
        stopOnOutputThread(new java.lang.IllegalStateException("Unsupported color format: " + r5.colorFormat));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0110, code lost:
        r0 = r5.dimensionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0112, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        if (r6.containsKey(MEDIA_FORMAT_KEY_STRIDE) == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        r5.stride = r6.getInteger(MEDIA_FORMAT_KEY_STRIDE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012c, code lost:
        if (r6.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012e, code lost:
        r5.sliceHeight = r6.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0137, code lost:
        org.webrtc.Logging.m25022d(TAG, "Frame stride and slice height: " + r5.stride + " x " + r5.sliceHeight);
        r5.stride = java.lang.Math.max(r5.width, r5.stride);
        r5.sliceHeight = java.lang.Math.max(r5.height, r5.sliceHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016d, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void reformat(android.media.MediaFormat r6) {
        /*
            r5 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r5.outputThreadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder format changed: "
            r1.append(r2)
            java.lang.String r2 = r6.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.m25022d(r0, r1)
            java.lang.String r0 = "crop-left"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "crop-right"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "crop-bottom"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "crop-top"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "crop-right"
            int r0 = r6.getInteger(r0)
            int r0 = r0 + 1
            java.lang.String r1 = "crop-left"
            int r1 = r6.getInteger(r1)
            int r0 = r0 - r1
            java.lang.String r1 = "crop-bottom"
            int r1 = r6.getInteger(r1)
            int r1 = r1 + 1
            java.lang.String r2 = "crop-top"
            int r2 = r6.getInteger(r2)
            int r1 = r1 - r2
            goto L_0x006b
        L_0x005e:
            java.lang.String r0 = "width"
            int r0 = r6.getInteger(r0)
            java.lang.String r1 = "height"
            int r1 = r6.getInteger(r1)
        L_0x006b:
            java.lang.Object r2 = r5.dimensionLock
            monitor-enter(r2)
            int r3 = r5.width     // Catch:{ all -> 0x01ab }
            if (r0 != r3) goto L_0x0076
            int r3 = r5.height     // Catch:{ all -> 0x01ab }
            if (r1 == r3) goto L_0x00bb
        L_0x0076:
            boolean r3 = r5.hasDecodedFirstFrame     // Catch:{ all -> 0x01ab }
            if (r3 == 0) goto L_0x00b1
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r3.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = "Unexpected size change. Configured "
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            int r4 = r5.width     // Catch:{ all -> 0x01ab }
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = "*"
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            int r4 = r5.height     // Catch:{ all -> 0x01ab }
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = ". New "
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            r3.append(r0)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "*"
            r3.append(r0)     // Catch:{ all -> 0x01ab }
            r3.append(r1)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01ab }
            r6.<init>(r0)     // Catch:{ all -> 0x01ab }
            r5.stopOnOutputThread(r6)     // Catch:{ all -> 0x01ab }
            monitor-exit(r2)     // Catch:{ all -> 0x01ab }
            return
        L_0x00b1:
            if (r0 <= 0) goto L_0x0172
            if (r1 > 0) goto L_0x00b7
            goto L_0x0172
        L_0x00b7:
            r5.width = r0     // Catch:{ all -> 0x01ab }
            r5.height = r1     // Catch:{ all -> 0x01ab }
        L_0x00bb:
            monitor-exit(r2)     // Catch:{ all -> 0x01ab }
            org.webrtc.SurfaceTextureHelper r0 = r5.surfaceTextureHelper
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "color-format"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "color-format"
            int r0 = r6.getInteger(r0)
            r5.colorFormat = r0
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Color: 0x"
            r1.append(r2)
            int r2 = r5.colorFormat
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.m25022d(r0, r1)
            int r0 = r5.colorFormat
            boolean r0 = r5.isSupportedColorFormat(r0)
            if (r0 != 0) goto L_0x0110
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported color format: "
            r0.append(r1)
            int r1 = r5.colorFormat
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            r5.stopOnOutputThread(r6)
            return
        L_0x0110:
            java.lang.Object r0 = r5.dimensionLock
            monitor-enter(r0)
            java.lang.String r1 = "stride"
            boolean r1 = r6.containsKey(r1)     // Catch:{ all -> 0x016f }
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = "stride"
            int r1 = r6.getInteger(r1)     // Catch:{ all -> 0x016f }
            r5.stride = r1     // Catch:{ all -> 0x016f }
        L_0x0125:
            java.lang.String r1 = "slice-height"
            boolean r1 = r6.containsKey(r1)     // Catch:{ all -> 0x016f }
            if (r1 == 0) goto L_0x0137
            java.lang.String r1 = "slice-height"
            int r6 = r6.getInteger(r1)     // Catch:{ all -> 0x016f }
            r5.sliceHeight = r6     // Catch:{ all -> 0x016f }
        L_0x0137:
            java.lang.String r6 = "AndroidVideoDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016f }
            r1.<init>()     // Catch:{ all -> 0x016f }
            java.lang.String r2 = "Frame stride and slice height: "
            r1.append(r2)     // Catch:{ all -> 0x016f }
            int r2 = r5.stride     // Catch:{ all -> 0x016f }
            r1.append(r2)     // Catch:{ all -> 0x016f }
            java.lang.String r2 = " x "
            r1.append(r2)     // Catch:{ all -> 0x016f }
            int r2 = r5.sliceHeight     // Catch:{ all -> 0x016f }
            r1.append(r2)     // Catch:{ all -> 0x016f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x016f }
            org.webrtc.Logging.m25022d(r6, r1)     // Catch:{ all -> 0x016f }
            int r6 = r5.width     // Catch:{ all -> 0x016f }
            int r1 = r5.stride     // Catch:{ all -> 0x016f }
            int r6 = java.lang.Math.max(r6, r1)     // Catch:{ all -> 0x016f }
            r5.stride = r6     // Catch:{ all -> 0x016f }
            int r6 = r5.height     // Catch:{ all -> 0x016f }
            int r1 = r5.sliceHeight     // Catch:{ all -> 0x016f }
            int r6 = java.lang.Math.max(r6, r1)     // Catch:{ all -> 0x016f }
            r5.sliceHeight = r6     // Catch:{ all -> 0x016f }
            monitor-exit(r0)     // Catch:{ all -> 0x016f }
            return
        L_0x016f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x016f }
            throw r6
        L_0x0172:
            java.lang.String r6 = "AndroidVideoDecoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r3.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = "Unexpected format dimensions. Configured "
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            int r4 = r5.width     // Catch:{ all -> 0x01ab }
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = "*"
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            int r4 = r5.height     // Catch:{ all -> 0x01ab }
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            java.lang.String r4 = ". New "
            r3.append(r4)     // Catch:{ all -> 0x01ab }
            r3.append(r0)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "*"
            r3.append(r0)     // Catch:{ all -> 0x01ab }
            r3.append(r1)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = ". Skip it"
            r3.append(r0)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01ab }
            org.webrtc.Logging.m25026w(r6, r0)     // Catch:{ all -> 0x01ab }
            monitor-exit(r2)     // Catch:{ all -> 0x01ab }
            return
        L_0x01ab:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ab }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        return releaseInternal != VideoCodecStatus.OK ? releaseInternal : initDecodeInternal(i, i2);
    }

    /* access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m25024e(TAG, "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m25024e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        Logging.m25022d(TAG, "Release on output thread done");
    }

    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.m25022d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION)) {
                Logging.m25024e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m25024e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.ERROR;
                this.codec = null;
                this.outputThread = null;
                return videoCodecStatus;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public /* synthetic */ long createNativeVideoDecoder() {
        return C21872d.m25064a(this);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i;
        int i2;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        boolean z = false;
        if (this.codec == null || this.callback == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("decode uninitalized, codec: ");
            if (this.codec != null) {
                z = true;
            }
            sb.append(z);
            sb.append(", callback: ");
            sb.append(this.callback);
            Logging.m25022d(TAG, sb.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.m25023e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            Logging.m25023e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i = this.width;
            i2 = this.height;
        }
        int i3 = encodedImage.encodedWidth;
        int i4 = encodedImage.encodedHeight;
        if (i3 * i4 > 0 && ((i3 != i || i4 != i2) && (reinitDecode = reinitDecode(i3, i4)) != VideoCodecStatus.OK)) {
            return reinitDecode;
        }
        if (!this.keyFrameRequired || encodedImage.frameType == EncodedImage.FrameType.VideoFrameKey) {
            try {
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000);
                if (dequeueInputBuffer < 0) {
                    Logging.m25023e(TAG, "decode() - no HW buffers available; decoder falling behind");
                    return VideoCodecStatus.ERROR;
                }
                try {
                    ByteBuffer byteBuffer2 = this.codec.getInputBuffers()[dequeueInputBuffer];
                    if (byteBuffer2.capacity() < remaining) {
                        Logging.m25023e(TAG, "decode() - HW buffer too small");
                        return VideoCodecStatus.ERROR;
                    }
                    byteBuffer2.put(encodedImage.buffer);
                    this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                    try {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                        if (this.keyFrameRequired) {
                            this.keyFrameRequired = false;
                        }
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e) {
                        Logging.m25024e(TAG, "queueInputBuffer failed", e);
                        this.frameInfos.pollLast();
                        return VideoCodecStatus.ERROR;
                    }
                } catch (IllegalStateException e2) {
                    Logging.m25024e(TAG, "getInputBuffers failed", e2);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e3) {
                Logging.m25024e(TAG, "dequeueInputBuffer failed", e3);
                return VideoCodecStatus.ERROR;
            }
        } else {
            Logging.m25023e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
    }

    public void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                Logging.m25025v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                FrameInfo poll = this.frameInfos.poll();
                Integer num = null;
                int i = 0;
                if (poll != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                    i = poll.rotation;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i, num);
                }
            }
        } catch (IllegalStateException e) {
            Logging.m25024e(TAG, "deliverDecodedFrame failed", e);
        }
    }

    public String getImplementationName() {
        return this.codecName;
    }

    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback2) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback2;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j = decodedTextureMetadata.presentationTimestampUs * 1000;
                num = decodedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j), num, (Integer) null);
    }

    public VideoCodecStatus release() {
        Logging.m25022d(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }
}
