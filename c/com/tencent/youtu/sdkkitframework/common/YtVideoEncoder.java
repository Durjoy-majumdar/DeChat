package com.tencent.youtu.sdkkitframework.common;

import android.graphics.Bitmap;
import android.graphics.YuvImage;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.coremedia.TimeUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;

public class YtVideoEncoder {
    private static final int AUDIO_CHANNEL_NUM = 1;
    private static final int BIT_RATE = 16000000;
    private static final int FRAME_RATE = 30;
    private static final int I_FRAME_INTERVAL = 1;
    private static final String MIME_TYPE = "video/avc";
    /* access modifiers changed from: private */
    public static final String TAG = "YtVideoEncoder";
    private static int mHeight;
    private static int mWidth;
    private int addedTrackCount = 0;
    /* access modifiers changed from: private */
    public boolean audioEncodeFinished = false;
    private ConcurrentLinkedQueue<byte[]> audioEncodeQueue = new ConcurrentLinkedQueue<>();
    private Thread audioEncodeThread;
    private MediaCodec audioEncoder;
    private int audioGenerateIndex = 0;
    /* access modifiers changed from: private */
    public AudioRecord audioRecord = null;
    /* access modifiers changed from: private */
    public int audioSampleRate = 8000;
    private int audioTrackIndex;
    private int colorFormat = 21;
    private boolean isEncodingStarted = false;
    private boolean isMediaMuxerStarted = false;
    private boolean mAbort = false;
    private IYUVToVideoEncoderCallback mCallback;
    private final Object mFrameSync = new Object();
    private boolean mNeedWork;
    private CountDownLatch mNewFrameLatch;
    private boolean mNoMoreFrames = false;
    private File mOutputFile;
    private ConcurrentLinkedQueue<MediaData> mediaDataQueue = new ConcurrentLinkedQueue<>();
    private MediaMuxer mediaMuxer;
    private final Object mediaMuxerSync = new Object();
    /* access modifiers changed from: private */
    public int minAudioBufferSize = 0;
    private boolean needAudio = false;
    private int realColorFormat = 0;
    private MediaCodec videoEncoder;
    private int videoGenerateIndex = 0;
    private int videoTrackIndex;
    private ConcurrentLinkedQueue<YuvImage> vidoeEncodeQueue = new ConcurrentLinkedQueue<>();
    private byte[] yuvnv12;

    public interface IYUVToVideoEncoderCallback {
        void onEncodingComplete(File file);
    }

    public class MediaData {
        public MediaCodec.BufferInfo bufferInfo;
        public ByteBuffer byteBuffer;
        public int index;
        public int trackIndex;

        public MediaData(int i, int i2, ByteBuffer byteBuffer2, MediaCodec.BufferInfo bufferInfo2) {
            this.index = i;
            this.trackIndex = i2;
            this.byteBuffer = byteBuffer2;
            this.bufferInfo = bufferInfo2;
        }
    }

    public enum MediaType {
        VideoType,
        AudioType
    }

    public YtVideoEncoder(IYUVToVideoEncoderCallback iYUVToVideoEncoderCallback, boolean z) {
        this.mCallback = iYUVToVideoEncoderCallback;
        this.mNeedWork = z;
    }

    private byte[] I420ToNV21(int i, int i2, YuvImage yuvImage) {
        if (this.yuvnv12 == null) {
            this.yuvnv12 = new byte[(((i * i2) * 3) / 2)];
        }
        byte[] yuvData = yuvImage.getYuvData();
        int i3 = i * i2;
        if (i3 >= 0) {
            System.arraycopy(yuvData, 0, this.yuvnv12, 0, i3);
        }
        int i4 = (i3 / 4) + i3;
        int i5 = i3;
        int i6 = i5;
        while (i5 < (i3 * 3) / 2) {
            byte[] bArr = this.yuvnv12;
            bArr[i4] = yuvData[i5];
            bArr[i6] = yuvData[i5 + 1];
            i4++;
            i6++;
            i5 += 2;
        }
        return this.yuvnv12;
    }

    private byte[] NV12ToNV21(int i, int i2, YuvImage yuvImage) {
        if (this.yuvnv12 == null) {
            this.yuvnv12 = new byte[(((i * i2) * 3) / 2)];
        }
        byte[] yuvData = yuvImage.getYuvData();
        int i3 = i * i2;
        if (i3 >= 0) {
            System.arraycopy(yuvData, 0, this.yuvnv12, 0, i3);
        }
        int i4 = i3;
        while (i4 < (i3 * 3) / 2) {
            int i5 = i4 + 1;
            if (i5 % 2 == 0) {
                byte[] bArr = this.yuvnv12;
                int i6 = i4 - 1;
                bArr[i4] = yuvData[i6];
                bArr[i6] = yuvData[i4];
            }
            i4 = i5;
        }
        return this.yuvnv12;
    }

    private long computePresentationTime(long j, int i) {
        return ((j * TimeUtil.SECOND_TO_US) / ((long) i)) + 132;
    }

    private byte[] convertYUV(int i, int i2, YuvImage yuvImage) {
        return this.colorFormat == 21 ? NV12ToNV21(i, i2, yuvImage) : I420ToNV21(i, i2, yuvImage);
    }

    private void encodeYUV420SP(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = i3 * i4;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            while (i9 < i3) {
                int i15 = iArr[i7];
                int i16 = (16711680 & i15) >> 16;
                int i17 = (65280 & i15) >> 8;
                int i18 = 255;
                int i19 = i15 & 255;
                int i25 = (((((i16 * 66) + (i17 * 129)) + (i19 * 25)) + 128) >> 8) + 16;
                int i26 = (((((i16 * -38) - (i17 * 74)) + (i19 * 112)) + 128) >> 8) + 128;
                int i27 = (((((i16 * 112) - (i17 * 94)) - (i19 * 18)) + 128) >> 8) + 128;
                int i28 = i6 + 1;
                if (i25 < 0) {
                    i25 = 0;
                } else if (i25 > 255) {
                    i25 = 255;
                }
                bArr[i6] = (byte) i25;
                if (i8 % 2 == 0 && i7 % 2 == 0) {
                    int i29 = i5 + 1;
                    if (i26 < 0) {
                        i26 = 0;
                    } else if (i26 > 255) {
                        i26 = 255;
                    }
                    bArr[i5] = (byte) i26;
                    i5 = i29 + 1;
                    if (i27 < 0) {
                        i18 = 0;
                    } else if (i27 <= 255) {
                        i18 = i27;
                    }
                    bArr[i29] = (byte) i18;
                }
                i7++;
                i9++;
                i6 = i28;
            }
        }
    }

    private ByteBuffer getInputBuffer(MediaType mediaType, int i) {
        return mediaType == MediaType.VideoType ? this.videoEncoder.getInputBuffer(i) : this.audioEncoder.getInputBuffer(i);
    }

    private byte[] getNV21(int i, int i2, Bitmap bitmap) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        byte[] bArr = new byte[((i3 * 3) / 2)];
        encodeYUV420SP(bArr, iArr, i, i2);
        bitmap.recycle();
        return bArr;
    }

    private ByteBuffer getOutputBuffer(MediaType mediaType, int i) {
        return mediaType == MediaType.VideoType ? this.videoEncoder.getOutputBuffer(i) : this.audioEncoder.getOutputBuffer(i);
    }

    private static boolean isRecognizedFormat(int i) {
        if (i == 39 || i == 2130706688) {
            return true;
        }
        switch (i) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public void onAudioStart() {
        ByteBuffer outputBuffer;
        int i;
        this.audioEncoder.start();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        this.audioEncodeFinished = false;
        long j = 0;
        long j2 = 0;
        while (!this.audioEncodeFinished) {
            byte[] poll = this.audioEncodeQueue.poll();
            if (poll == null) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    YtLogger.m106579e(TAG, e.getLocalizedMessage());
                }
            } else {
                int dequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(10000);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = getInputBuffer(MediaType.AudioType, dequeueInputBuffer);
                    inputBuffer.clear();
                    inputBuffer.limit(poll.length);
                    inputBuffer.put(poll);
                    j += (long) poll.length;
                    if (this.isEncodingStarted) {
                        i = 1;
                        this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, poll.length, j2, 0);
                    } else {
                        i = 1;
                        YtLogger.m106580i(TAG, "End of audio stream");
                        this.audioEncodeFinished = true;
                        this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, poll.length, j2, 4);
                    }
                    this.audioGenerateIndex += i;
                    j2 = (((j / 1) * TimeUtil.SECOND_TO_US) / ((long) this.audioSampleRate)) / 2;
                }
                int dequeueOutputBuffer = this.audioEncoder.dequeueOutputBuffer(bufferInfo, 10000);
                if (dequeueOutputBuffer == -2) {
                    startMediaMuxer(MediaType.AudioType, this.audioEncoder.getOutputFormat());
                } else if (!(dequeueOutputBuffer == -1 || dequeueOutputBuffer < 0 || bufferInfo.size == 0 || (outputBuffer = getOutputBuffer(MediaType.AudioType, dequeueOutputBuffer)) == null)) {
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    YtLogger.m106580i(TAG, "media muxer write audio data outputindex " + this.audioGenerateIndex + " buff size:" + bufferInfo.size);
                    synchronized (this.mediaMuxer) {
                        this.mediaMuxer.writeSampleData(this.audioTrackIndex, outputBuffer, bufferInfo);
                    }
                    this.audioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        }
        YtLogger.m106580i(TAG, "Audio encoder stop");
    }

    private void release() {
        synchronized (this.mediaMuxerSync) {
            MediaCodec mediaCodec = this.videoEncoder;
            if (mediaCodec != null) {
                mediaCodec.reset();
                this.videoEncoder.stop();
                this.videoEncoder.release();
                this.videoEncoder = null;
                YtLogger.m106580i(TAG, "RELEASE Video CODEC");
            }
            if (this.audioEncoder != null) {
                try {
                    this.audioEncodeThread.join();
                } catch (InterruptedException e) {
                    YtLogger.m106579e(TAG, e.getLocalizedMessage());
                }
                this.audioEncoder.stop();
                this.audioEncoder.release();
                this.audioEncoder = null;
                YtLogger.m106580i(TAG, "RELEASE Audio CODEC");
            }
            MediaMuxer mediaMuxer2 = this.mediaMuxer;
            if (mediaMuxer2 != null) {
                try {
                    mediaMuxer2.stop();
                } catch (Exception e2) {
                    String str = TAG;
                    YtLogger.m106579e(str, "media muxer stop failed:" + e2.getLocalizedMessage());
                }
                this.mediaMuxer.release();
                this.mediaMuxer = null;
                this.isMediaMuxerStarted = false;
                YtLogger.m106580i(TAG, "RELEASE MUXER");
            }
        }
    }

    private static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i >= iArr.length) {
                return 0;
            }
            int i2 = iArr[i];
            String str2 = TAG;
            YtLogger.m106580i(str2, "found colorformat: " + i2);
            if (isRecognizedFormat(i2)) {
                return i2;
            }
            i++;
        }
    }

    private void startAudioEncoding(int i, int i2) {
        if (this.mNeedWork) {
            this.needAudio = true;
            try {
                this.audioEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
                MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i2, 1);
                createAudioFormat.setInteger("aac-profile", 2);
                createAudioFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i);
                createAudioFormat.setInteger("max-input-size", 16384);
                this.audioSampleRate = i2;
                this.audioEncoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                this.isEncodingStarted = true;
                startAudioRecord();
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        YtVideoEncoder.this.onAudioStart();
                    }
                });
                this.audioEncodeThread = thread;
                thread.start();
            } catch (IOException unused) {
            }
        }
    }

    private void startAudioRecord() {
        new Thread(new Runnable() {
            public void run() {
                YtVideoEncoder ytVideoEncoder = YtVideoEncoder.this;
                int unused = ytVideoEncoder.minAudioBufferSize = AudioRecord.getMinBufferSize(ytVideoEncoder.audioSampleRate, 16, 2);
                AudioRecord unused2 = YtVideoEncoder.this.audioRecord = new AudioRecord(1, YtVideoEncoder.this.audioSampleRate, 16, 2, Math.min(16384, YtVideoEncoder.this.minAudioBufferSize * 2));
                String access$400 = YtVideoEncoder.TAG;
                YtLogger.m106580i(access$400, "Audio recorder init :" + YtVideoEncoder.this.audioRecord.getState());
                byte[] bArr = new byte[2048];
                YtVideoEncoder.this.audioRecord.startRecording();
                while (!YtVideoEncoder.this.audioEncodeFinished) {
                    if (YtVideoEncoder.this.audioRecord.read(bArr, 0, 2048) > 0) {
                        YtVideoEncoder.this.encodeAudioData(bArr);
                    }
                }
                YtLogger.m106580i(YtVideoEncoder.TAG, "Audio push last buffer");
                YtVideoEncoder.this.audioRecord.stop();
                YtVideoEncoder.this.audioRecord.release();
                AudioRecord unused3 = YtVideoEncoder.this.audioRecord = null;
            }
        }).start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:7|(1:9)|10|(1:12)|13|(1:(2:22|23))(1:20)|24|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void startMediaMuxer(com.tencent.youtu.sdkkitframework.common.YtVideoEncoder.MediaType r4, android.media.MediaFormat r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mediaMuxerSync
            monitor-enter(r0)
            boolean r1 = r3.isMediaMuxerStarted     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0009:
            com.tencent.youtu.sdkkitframework.common.YtVideoEncoder$MediaType r1 = com.tencent.youtu.sdkkitframework.common.YtVideoEncoder.MediaType.VideoType     // Catch:{ all -> 0x0058 }
            r2 = 1
            if (r4 != r1) goto L_0x001b
            android.media.MediaMuxer r1 = r3.mediaMuxer     // Catch:{ all -> 0x0058 }
            int r1 = r1.addTrack(r5)     // Catch:{ all -> 0x0058 }
            r3.videoTrackIndex = r1     // Catch:{ all -> 0x0058 }
            int r1 = r3.addedTrackCount     // Catch:{ all -> 0x0058 }
            int r1 = r1 + r2
            r3.addedTrackCount = r1     // Catch:{ all -> 0x0058 }
        L_0x001b:
            com.tencent.youtu.sdkkitframework.common.YtVideoEncoder$MediaType r1 = com.tencent.youtu.sdkkitframework.common.YtVideoEncoder.MediaType.AudioType     // Catch:{ all -> 0x0058 }
            if (r4 != r1) goto L_0x002c
            android.media.MediaMuxer r4 = r3.mediaMuxer     // Catch:{ all -> 0x0058 }
            int r4 = r4.addTrack(r5)     // Catch:{ all -> 0x0058 }
            r3.audioTrackIndex = r4     // Catch:{ all -> 0x0058 }
            int r4 = r3.addedTrackCount     // Catch:{ all -> 0x0058 }
            int r4 = r4 + r2
            r3.addedTrackCount = r4     // Catch:{ all -> 0x0058 }
        L_0x002c:
            boolean r4 = r3.needAudio     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0035
            int r5 = r3.addedTrackCount     // Catch:{ all -> 0x0058 }
            r1 = 2
            if (r5 >= r1) goto L_0x003b
        L_0x0035:
            if (r4 != 0) goto L_0x004f
            int r5 = r3.addedTrackCount     // Catch:{ all -> 0x0058 }
            if (r5 < r2) goto L_0x004f
        L_0x003b:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "Media muxer is starting..."
            com.tencent.youtu.sdkkitframework.common.YtLogger.m106580i(r4, r5)     // Catch:{ all -> 0x0058 }
            android.media.MediaMuxer r4 = r3.mediaMuxer     // Catch:{ all -> 0x0058 }
            r4.start()     // Catch:{ all -> 0x0058 }
            r3.isMediaMuxerStarted = r2     // Catch:{ all -> 0x0058 }
            java.lang.Object r4 = r3.mediaMuxerSync     // Catch:{ all -> 0x0058 }
            r4.notifyAll()     // Catch:{ all -> 0x0058 }
            goto L_0x0056
        L_0x004f:
            if (r4 == 0) goto L_0x0056
            java.lang.Object r4 = r3.mediaMuxerSync     // Catch:{ InterruptedException -> 0x0056 }
            r4.wait()     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.common.YtVideoEncoder.startMediaMuxer(com.tencent.youtu.sdkkitframework.common.YtVideoEncoder$MediaType, android.media.MediaFormat):void");
    }

    public void abortEncoding() {
        this.isEncodingStarted = false;
        if (this.mOutputFile != null) {
            YtLogger.m106580i(TAG, "Clean up record file");
            this.mOutputFile.delete();
            this.mOutputFile = null;
        }
        if (this.mNeedWork) {
            if (this.videoEncoder == null || this.mediaMuxer == null) {
                YtLogger.m106580i(TAG, "Failed to abort encoding since it never started");
                return;
            }
            YtLogger.m106580i(TAG, "Aborting encoding");
            this.mNoMoreFrames = true;
            this.mAbort = true;
            this.vidoeEncodeQueue = new ConcurrentLinkedQueue<>();
            this.audioEncodeQueue = new ConcurrentLinkedQueue<>();
            synchronized (this.mFrameSync) {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            }
            release();
        }
    }

    public void encode() {
        CountDownLatch countDownLatch;
        if (this.mNeedWork && this.isEncodingStarted) {
            YtLogger.m106580i(TAG, "Encoder started");
            if (!this.mNoMoreFrames || this.vidoeEncodeQueue.size() != 0) {
                YuvImage poll = this.vidoeEncodeQueue.poll();
                if (poll == null) {
                    synchronized (this.mFrameSync) {
                        countDownLatch = new CountDownLatch(1);
                        this.mNewFrameLatch = countDownLatch;
                    }
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException unused) {
                    }
                    poll = this.vidoeEncodeQueue.poll();
                }
                if (poll != null) {
                    byte[] convertYUV = convertYUV(mWidth, mHeight, poll);
                    int dequeueInputBuffer = this.videoEncoder.dequeueInputBuffer(200000);
                    long computePresentationTime = computePresentationTime((long) this.videoGenerateIndex, 30);
                    if (dequeueInputBuffer >= 0) {
                        ByteBuffer inputBuffer = getInputBuffer(MediaType.VideoType, dequeueInputBuffer);
                        inputBuffer.clear();
                        inputBuffer.put(convertYUV);
                        this.videoEncoder.queueInputBuffer(dequeueInputBuffer, 0, convertYUV.length, computePresentationTime, 0);
                        this.videoGenerateIndex++;
                    }
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int dequeueOutputBuffer = this.videoEncoder.dequeueOutputBuffer(bufferInfo, 200000);
                    if (dequeueOutputBuffer == -1) {
                        YtLogger.m106579e(TAG, "No output from encoder available");
                    } else if (dequeueOutputBuffer == -2) {
                        startMediaMuxer(MediaType.VideoType, this.videoEncoder.getOutputFormat());
                    } else if (dequeueOutputBuffer < 0) {
                        YtLogger.m106579e(TAG, "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
                    } else if (bufferInfo.size != 0) {
                        ByteBuffer outputBuffer = getOutputBuffer(MediaType.VideoType, dequeueOutputBuffer);
                        if (outputBuffer == null) {
                            YtLogger.m106579e(TAG, "encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                            return;
                        }
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        YtLogger.m106580i(TAG, "media muxer write video data outputindex " + this.videoGenerateIndex);
                        synchronized (this.mediaMuxer) {
                            this.mediaMuxer.writeSampleData(this.videoTrackIndex, outputBuffer, bufferInfo);
                        }
                        this.videoEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    }
                }
            }
        }
    }

    public void encodeAudioData(byte[] bArr) {
        this.audioEncodeQueue.add(bArr);
    }

    public int getColorFormat() {
        return this.realColorFormat;
    }

    public int getYUVImageSize() {
        return this.vidoeEncodeQueue.size();
    }

    public boolean isEncodingStarted() {
        return this.isEncodingStarted;
    }

    public void queueFrame(YuvImage yuvImage) {
        if (this.mNeedWork && this.videoEncoder != null && this.mediaMuxer != null) {
            YtLogger.m106580i(TAG, "Queueing frame");
            this.vidoeEncodeQueue.add(yuvImage);
            synchronized (this.mFrameSync) {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            }
        }
    }

    public void startAudioVideoEncoding(int i, int i2, File file, int i3, int i4, int i5, int i6, int i7) {
        try {
            file.delete();
            String canonicalPath = file.getCanonicalPath();
            if (this.mediaMuxer == null) {
                this.mediaMuxer = new MediaMuxer(canonicalPath, 0);
            }
            startAudioEncoding(i7, i6);
            startEncoding(i, i2, file, i3, i4, i5);
            try {
                Thread.sleep(300);
            } catch (InterruptedException unused) {
            }
        } catch (IOException unused2) {
            String str = TAG;
            YtLogger.m106579e(str, "Unable to get path for " + file);
        }
    }

    public void startEncoding(int i, int i2, File file, int i3, int i4, int i5) {
        if (this.mNeedWork) {
            mWidth = i;
            mHeight = i2;
            this.mOutputFile = file;
            try {
                file.delete();
                String canonicalPath = file.getCanonicalPath();
                if (this.mediaMuxer == null) {
                    this.mediaMuxer = new MediaMuxer(canonicalPath, 0);
                }
                MediaCodecInfo selectCodec = selectCodec("video/avc");
                if (selectCodec == null) {
                    YtLogger.m106579e(TAG, "Unable to find an appropriate codec for video/avc");
                    return;
                }
                String str = TAG;
                YtLogger.m106580i(str, "found codec: " + selectCodec.getName());
                this.colorFormat = 21;
                try {
                    int selectColorFormat = selectColorFormat(selectCodec, "video/avc");
                    this.colorFormat = selectColorFormat;
                    this.realColorFormat = selectColorFormat;
                } catch (Exception unused) {
                    this.colorFormat = 21;
                }
                try {
                    this.videoEncoder = MediaCodec.createByCodecName(selectCodec.getName());
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", mWidth, mHeight);
                    createVideoFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, i3);
                    createVideoFormat.setInteger("frame-rate", i4);
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                    createVideoFormat.setInteger("i-frame-interval", i5);
                    this.videoEncoder.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                    this.videoEncoder.start();
                    YtLogger.m106580i(TAG, "Initialization complete. Starting encoder...");
                    this.isEncodingStarted = true;
                } catch (Exception e) {
                    String str2 = TAG;
                    YtLogger.m106579e(str2, "Unable to create MediaCodec " + e.getMessage());
                }
            } catch (IOException unused2) {
                String str3 = TAG;
                YtLogger.m106579e(str3, "Unable to get path for " + file);
            }
        }
    }

    public void stopEncoding() {
        this.isEncodingStarted = false;
        if (this.mNeedWork && this.videoEncoder != null && this.mediaMuxer != null) {
            YtLogger.m106580i(TAG, "Stopping encoding");
            this.mNoMoreFrames = true;
            synchronized (this.mFrameSync) {
                CountDownLatch countDownLatch = this.mNewFrameLatch;
                if (countDownLatch != null && countDownLatch.getCount() > 0) {
                    this.mNewFrameLatch.countDown();
                }
            }
            release();
        }
    }
}
