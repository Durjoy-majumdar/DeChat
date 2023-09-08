package org.webrtc;

import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import androidx.camera.core.FocusMeteringAction;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "HardwareVideoEncoder";
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private ByteBuffer[] outputBuffers;
    private final BusyCount outputBuffersBusyCount;
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    /* access modifiers changed from: private */
    public volatile boolean running;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private final Integer surfaceColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;

    public static class BusyCount {
        private int count;
        private final Object countLock;

        private BusyCount() {
            this.countLock = new Object();
        }

        public void decrement() {
            synchronized (this.countLock) {
                int i = this.count - 1;
                this.count = i;
                if (i == 0) {
                    this.countLock.notifyAll();
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z;
            synchronized (this.countLock) {
                z = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e) {
                        Logging.m25024e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e);
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public enum YuvFormat {
        I420 {
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            public void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        public static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException("Unsupported colorFormat: " + i);
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster2, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i2);
        this.bitrateAdjuster = bitrateAdjuster2;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() {
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j, VideoFrame.Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                Logging.m25022d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, j, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    Logging.m25024e(TAG, "queueInputBuffer failed", e);
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
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, (Matrix) null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.m25024e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus initEncodeInternal() {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.nextPresentationTimestampUs = 0;
        this.lastKeyFrameNs = -1;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            int intValue = (this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat).intValue();
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
                createVideoFormat.setInteger(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.adjustedBitrate);
                createVideoFormat.setInteger(KEY_BITRATE_MODE, 2);
                createVideoFormat.setInteger("color-format", intValue);
                createVideoFormat.setFloat("frame-rate", (float) this.bitrateAdjuster.getAdjustedFramerateFps());
                createVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                if (this.codecType == VideoCodecMimeType.H264) {
                    String str = this.params.get("profile-level-id");
                    if (str == null) {
                        str = "42e01f";
                    }
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != 1537948542) {
                        if (hashCode == 1595523974) {
                            if (str.equals("640c1f")) {
                                c = 0;
                            }
                        }
                    } else if (str.equals("42e01f")) {
                        c = 1;
                    }
                    if (c == 0) {
                        createVideoFormat.setInteger(Scopes.PROFILE, 8);
                        createVideoFormat.setInteger(FirebaseAnalytics.C113379b.LEVEL, 256);
                    } else if (c != 1) {
                        Logging.m25026w(TAG, "Unknown profile level id: " + str);
                    }
                }
                Logging.m25022d(TAG, "Format: " + createVideoFormat);
                this.codec.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                if (this.useSurfaceMode) {
                    this.textureEglBase = EglBase.EglBaseStatic.createEgl14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    Surface createInputSurface = this.codec.createInputSurface();
                    this.textureInputSurface = createInputSurface;
                    this.textureEglBase.createSurface(createInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                this.codec.start();
                this.outputBuffers = this.codec.getOutputBuffers();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (IllegalStateException e) {
                Logging.m25024e(TAG, "initEncodeInternal failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException unused) {
            Logging.m25023e(TAG, "Cannot create media encoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i) {
        try {
            this.codec.releaseOutputBuffer(i, false);
        } catch (Exception e) {
            Logging.m25024e(TAG, "releaseOutputBuffer failed", e);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m25022d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m25024e(TAG, "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m25024e(TAG, "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        Logging.m25022d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.m25024e(TAG, "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        return j2 > 0 && j > this.lastKeyFrameNs + j2;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.m25024e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public /* synthetic */ long createNativeVideoEncoder() {
        return C21874f.m25066a(this);
    }

    public void deliverEncodedImage() {
        ByteBuffer byteBuffer;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = this.outputBuffers[dequeueOutputBuffer];
                byteBuffer2.position(bufferInfo.offset);
                byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 2) != 0) {
                    Logging.m25022d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.configBuffer = allocateDirect;
                    allocateDirect.put(byteBuffer2);
                    return;
                }
                this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
                if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                    updateBitrate();
                }
                boolean z = true;
                if ((bufferInfo.flags & 1) == 0) {
                    z = false;
                }
                if (z) {
                    Logging.m25022d(TAG, "Sync frame generated");
                }
                if (!z || this.codecType != VideoCodecMimeType.H264) {
                    byteBuffer = byteBuffer2.slice();
                } else {
                    Logging.m25022d(TAG, "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                    byteBuffer = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                    this.configBuffer.rewind();
                    byteBuffer.put(this.configBuffer);
                    byteBuffer.put(byteBuffer2);
                    byteBuffer.rewind();
                }
                EncodedImage.FrameType frameType = z ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
                this.outputBuffersBusyCount.increment();
                EncodedImage createEncodedImage = this.outputBuilders.poll().setBuffer(byteBuffer, new HardwareVideoEncoder$$a(this, dequeueOutputBuffer)).setFrameType(frameType).createEncodedImage();
                this.callback.onEncodedFrame(createEncodedImage, new VideoEncoder.CodecSpecificInfo());
                createEncodedImage.release();
            } else if (dequeueOutputBuffer == -3) {
                this.outputBuffersBusyCount.waitForZero();
                this.outputBuffers = this.codec.getOutputBuffers();
            }
        } catch (IllegalStateException e) {
            Logging.m25024e(TAG, "deliverOutput failed", e);
        }
    }

    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus resetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z = buffer instanceof VideoFrame.TextureBuffer;
        int width2 = videoFrame.getBuffer().getWidth();
        int height2 = videoFrame.getBuffer().getHeight();
        boolean z2 = canUseSurface() && z;
        if ((width2 != this.width || height2 != this.height || z2 != this.useSurfaceMode) && (resetCodec = resetCodec(width2, height2, z2)) != VideoCodecStatus.OK) {
            return resetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.m25023e(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z3 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z3 = true;
            }
        }
        if (z3 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int height3 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (((double) TimeUnit.SECONDS.toMicros(1)) / this.bitrateAdjuster.getAdjustedFramerateFps());
        VideoCodecStatus encodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, j) : encodeByteBuffer(videoFrame, j, buffer, height3);
        if (encodeTextureBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return encodeTextureBuffer;
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    public String getImplementationName() {
        return "HWEncoder";
    }

    public /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return C21874f.m25067b(this);
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback2) {
        int i;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback2;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i2 = settings.startBitrate;
        if (!(i2 == 0 || (i = settings.maxFramerate) == 0)) {
            this.bitrateAdjuster.setTargets(i2 * 1000, (double) i);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        Logging.m25022d(TAG, "initEncode: " + this.width + " x " + this.height + ". @ " + settings.startBitrate + "kbps. Fps: " + settings.maxFramerate + " Use surface mode: " + this.useSurfaceMode);
        return initEncodeInternal();
    }

    public /* synthetic */ boolean isHardwareEncoder() {
        return C21874f.m25068c(this);
    }

    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION)) {
                Logging.m25023e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m25024e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputBuffers = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > 30) {
            i = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), (double) i);
        return VideoCodecStatus.OK;
    }

    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}
