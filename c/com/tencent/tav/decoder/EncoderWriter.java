package com.tencent.tav.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.codec.MediaCodecAnalyse;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import com.tencent.tav.decoder.muxer.MediaMuxerFactory;
import com.tencent.tav.report.AverageTimeReporter;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EncoderWriter {
    public static final int OUTPUT_AUDIO_AAC_PROFILE = 2;
    public static final int OUTPUT_AUDIO_BIT_RATE = 128000;
    public static final int OUTPUT_AUDIO_CHANNEL_COUNT = 1;
    public static final String OUTPUT_AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final int OUTPUT_AUDIO_SAMPLE_RATE_HZ = 44100;
    public static final int OUTPUT_VIDEO_BIT_RATE = 8000000;
    public static final int OUTPUT_VIDEO_COLOR_FORMAT = 2130708361;
    public static final int OUTPUT_VIDEO_FRAME_RATE = 30;
    public static final int OUTPUT_VIDEO_IFRAME_INTERVAL = 1;
    public static final String OUTPUT_VIDEO_MIME_TYPE = "video/avc";
    private static final long WAIT_TRANSIENT_MS = 20;
    public static final long WRITER_FINISH = -1;
    private final String SCENE;
    private final String TAG;
    private Surface _inputSurface;
    private volatile MediaFormat audioEncodeFormat;
    private AssetWriterAudioEncoder audioEncoder;
    private final Lock audioEncoderLock;
    private boolean audioEncoderStarted;
    private boolean enOfAudioInputStream;
    private boolean enOfVideoInputStream;
    private ExportConfig encodeOption;
    private final AverageTimeReporter encodeReporter;
    private boolean hasAudioTrack;
    private boolean hasVideoTrack;
    private boolean isCancel;
    private ReadWriteLock lock;
    private IMediaMuxer muxer;
    private volatile boolean muxerStarted;
    private volatile int outputAudioTrack;
    private String outputPath;
    private volatile int outputVideoTrack;
    private boolean released;
    private volatile MediaFormat videoEncodeFormat;
    private AssetWriterVideoEncoder videoEncoder;
    private final Lock videoEncoderLock;
    private boolean videoEncoderStarted;

    @Deprecated
    public static final class OutputConfig {
        public int AUDIO_AAC_PROFILE = 2;
        public int AUDIO_BIT_RATE = EncoderWriter.OUTPUT_AUDIO_BIT_RATE;
        public int AUDIO_CHANNEL_COUNT = 1;
        public String AUDIO_MIME_TYPE = "audio/mp4a-latm";
        public int AUDIO_SAMPLE_RATE_HZ = 44100;
        public boolean HIGH_PROFILE = false;
        public int VIDEO_BIT_RATE = 8000000;
        public int VIDEO_FRAME_RATE = 30;
        public int VIDEO_IFRAME_INTERVAL = 1;
        public int VIDEO_TARGET_HEIGHT = 0;
        public int VIDEO_TARGET_WIDTH = 0;
    }

    public EncoderWriter(String str, IEncoderFactory iEncoderFactory) {
        this.TAG = "EncoderWriter" + hashCode();
        this.SCENE = "tav-encoder-writer";
        this.encodeReporter = new AverageTimeReporter();
        this.hasVideoTrack = false;
        this.hasAudioTrack = false;
        this.enOfVideoInputStream = false;
        this.enOfAudioInputStream = false;
        this.videoEncoderLock = new ReentrantLock();
        this.audioEncoderLock = new ReentrantLock();
        this.lock = new ReentrantReadWriteLock();
        this._inputSurface = null;
        this.videoEncodeFormat = null;
        this.audioEncodeFormat = null;
        this.outputVideoTrack = -1;
        this.outputAudioTrack = -1;
        this.muxerStarted = false;
        this.videoEncoderStarted = false;
        this.audioEncoderStarted = false;
        this.released = false;
        this.isCancel = false;
        this.outputPath = str;
        this.muxer = MediaMuxerFactory.createMediaMuxer(str, 0);
        iEncoderFactory = iEncoderFactory == null ? new DefaultEncoderFactory() : iEncoderFactory;
        AssetWriterAudioEncoder audioEncoder2 = iEncoderFactory.getAudioEncoder();
        this.audioEncoder = audioEncoder2;
        audioEncoder2.setMediaMuxer(this.muxer);
        AssetWriterVideoEncoder videoEncoder2 = iEncoderFactory.getVideoEncoder();
        this.videoEncoder = videoEncoder2;
        videoEncoder2.setMediaMuxer(this.muxer);
    }

    private void checkStartMuxer() {
        if (unStarted()) {
            Logger.m144646i(this.TAG, "checkStartMuxer");
            synchronized (this) {
                if (unStarted()) {
                    if (this.hasVideoTrack) {
                        this.outputVideoTrack = this.muxer.addTrack(this.videoEncodeFormat);
                    }
                    if (this.hasAudioTrack) {
                        this.outputAudioTrack = this.muxer.addTrack(this.audioEncodeFormat);
                    }
                    this.muxer.start();
                    this.muxerStarted = true;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int dequeueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse r6) {
        /*
            r5 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            int r6 = r6.dequeueInputBuffer(r0)     // Catch:{ Exception -> 0x0009, Error -> 0x0007 }
            return r6
        L_0x0007:
            r0 = move-exception
            goto L_0x000a
        L_0x0009:
            r0 = move-exception
        L_0x000a:
            java.lang.String r1 = r5.TAG
            java.lang.String r2 = "dequeueInputBuffer e = "
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException
            if (r2 == 0) goto L_0x0063
            r2 = 23
            if (r2 > r1) goto L_0x0050
            java.lang.String r1 = r5.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r4 = r3.isTransient()
            r2.append(r4)
            java.lang.String r4 = " , isRecoverable = "
            r2.append(r4)
            boolean r4 = r3.isRecoverable()
            r2.append(r4)
            java.lang.String r4 = " , errorCode = "
            r2.append(r4)
            int r3 = r3.getErrorCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)
        L_0x0050:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x0063
            r0 = 20
            r5.waitTime(r0)
            int r6 = r5.dequeueInputBuffer(r6)
            return r6
        L_0x0063:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.dequeueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse):int");
    }

    private int dequeueOutputBuffer(MediaCodecAnalyse mediaCodecAnalyse, MediaCodec.BufferInfo bufferInfo) {
        try {
            return mediaCodecAnalyse.dequeueOutputBuffer(bufferInfo, 1000);
        } catch (Exception e) {
            Logger.m144644e(this.TAG, "dequeueOutputBuffer e = ", (Throwable) e);
            if (e instanceof MediaCodec.CodecException) {
                if (23 <= Build.VERSION.SDK_INT) {
                    String str = this.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("CodecException - isTransient = ");
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) e;
                    sb.append(codecException.isTransient());
                    sb.append(" , isRecoverable = ");
                    sb.append(codecException.isRecoverable());
                    sb.append(" , errorCode = ");
                    sb.append(codecException.getErrorCode());
                    Logger.m144643e(str, sb.toString());
                }
                if (((MediaCodec.CodecException) e).isTransient()) {
                    waitTime(20);
                    return dequeueOutputBuffer(mediaCodecAnalyse, bufferInfo);
                }
            }
            throw e;
        }
    }

    private void drainAudioEncoder(boolean z, CMSampleBuffer cMSampleBuffer) {
        boolean z2 = z ? this.hasAudioTrack : false;
        boolean z3 = !this.hasAudioTrack;
        long currentTimeMillis = System.currentTimeMillis();
        while (!z3 && this.hasAudioTrack) {
            if (z2) {
                signalEndOfAudioStream();
                z2 = false;
            }
            if (!z3) {
                z3 = writeAudioFrame(z);
                if (System.currentTimeMillis() - currentTimeMillis > 2000) {
                    this.hasAudioTrack = !z;
                    Logger.m144643e(this.TAG, "drainEncoder: 音频写入处理时间超时，提前结束写入");
                    z3 = true;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drainVideoEncoder(boolean r12, com.tencent.tav.coremedia.CMSampleBuffer r13) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x0011
            boolean r2 = r11.hasVideoTrack
            if (r2 == 0) goto L_0x0011
            android.view.Surface r2 = r11._inputSurface
            if (r2 != 0) goto L_0x000e
            r2 = 1
            goto L_0x0012
        L_0x000e:
            r11.signalEndOfVideoStream()
        L_0x0011:
            r2 = 0
        L_0x0012:
            boolean r3 = r11.hasVideoTrack
            r3 = r3 ^ r1
            r4 = 2000(0x7d0, double:9.88E-321)
            long r6 = java.lang.System.currentTimeMillis()
        L_0x001b:
            if (r3 != 0) goto L_0x0043
            boolean r8 = r11.hasVideoTrack
            if (r8 == 0) goto L_0x0043
            if (r2 == 0) goto L_0x0027
            r11.signalEndOfVideoStream()
            r2 = 0
        L_0x0027:
            if (r3 != 0) goto L_0x001b
            boolean r3 = r11.writeVideoFrame(r13, r12)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r6
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x001b
            r3 = r12 ^ 1
            r11.hasVideoTrack = r3
            java.lang.String r3 = r11.TAG
            java.lang.String r8 = "drainEncoder: 视频写入处理时间超时，提前结束写入"
            com.tencent.tav.decoder.logger.Logger.m144643e(r3, r8)
            r3 = 1
            goto L_0x001b
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.drainVideoEncoder(boolean, com.tencent.tav.coremedia.CMSampleBuffer):void");
    }

    private void fixAudioFormat(MediaFormat mediaFormat) {
        fixStringKey(mediaFormat, "mime", "audio/mp4a-latm");
        fixIntegerKey(mediaFormat, "sample-rate", 44100);
        fixIntegerKey(mediaFormat, "channel-count", 1);
        fixIntegerKey(mediaFormat, FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, OUTPUT_AUDIO_BIT_RATE);
        fixIntegerKey(mediaFormat, "aac-profile", 2);
        String str = this.TAG;
        Logger.m144641d(str, "fixAudioFormat() called with: format = [" + mediaFormat + "]");
    }

    private void fixIntegerKey(MediaFormat mediaFormat, String str, int i) {
        if (!mediaFormat.containsKey(str) || mediaFormat.getInteger(str) <= 0) {
            String str2 = this.TAG;
            Logger.m144649w(str2, "fixIntegerKey: 缺少关键配置：" + str + ", 使用默认值：" + i);
            mediaFormat.setInteger(str, i);
        }
    }

    private void fixStringKey(MediaFormat mediaFormat, String str, String str2) {
        if (!mediaFormat.containsKey(str) || TextUtils.isEmpty(mediaFormat.getString(str))) {
            String str3 = this.TAG;
            Logger.m144649w(str3, "fixStringKey: 缺少关键配置：" + str + ", 使用默认值：" + str2);
            mediaFormat.setString(str, str2);
        }
    }

    private void fixVideoFormat(MediaFormat mediaFormat) {
        mediaFormat.setInteger("color-format", OUTPUT_VIDEO_COLOR_FORMAT);
        fixStringKey(mediaFormat, "mime", "video/avc");
        fixIntegerKey(mediaFormat, FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 8000000);
        fixIntegerKey(mediaFormat, "frame-rate", 30);
        fixIntegerKey(mediaFormat, "i-frame-interval", 1);
        String str = this.TAG;
        Logger.m144641d(str, "fixVideoFormat() called with: format = [" + mediaFormat + "]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer getInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse r6, int r7) {
        /*
            r5 = this;
            java.nio.ByteBuffer r6 = com.tencent.tav.decoder.DecoderUtils.getInputBuffer(r6, r7)     // Catch:{ Exception -> 0x0007, Error -> 0x0005 }
            return r6
        L_0x0005:
            r0 = move-exception
            goto L_0x0008
        L_0x0007:
            r0 = move-exception
        L_0x0008:
            java.lang.String r1 = r5.TAG
            java.lang.String r2 = "getInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException
            if (r2 == 0) goto L_0x0061
            r2 = 23
            if (r1 < r2) goto L_0x004e
            java.lang.String r1 = r5.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r4 = r3.isTransient()
            r2.append(r4)
            java.lang.String r4 = " , isRecoverable = "
            r2.append(r4)
            boolean r4 = r3.isRecoverable()
            r2.append(r4)
            java.lang.String r4 = " , errorCode = "
            r2.append(r4)
            int r3 = r3.getErrorCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)
        L_0x004e:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x0061
            r0 = 20
            r5.waitTime(r0)
            java.nio.ByteBuffer r6 = r5.getInputBuffer(r6, r7)
            return r6
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.getInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int):java.nio.ByteBuffer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse r6, int r7) {
        /*
            r5 = this;
            java.nio.ByteBuffer r6 = com.tencent.tav.decoder.DecoderUtils.getOutputBuffer(r6, r7)     // Catch:{ Exception -> 0x0007, Error -> 0x0005 }
            return r6
        L_0x0005:
            r0 = move-exception
            goto L_0x0008
        L_0x0007:
            r0 = move-exception
        L_0x0008:
            java.lang.String r1 = r5.TAG
            java.lang.String r2 = "getOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException
            if (r2 == 0) goto L_0x0061
            r2 = 23
            if (r1 < r2) goto L_0x004e
            java.lang.String r1 = r5.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r4 = r3.isTransient()
            r2.append(r4)
            java.lang.String r4 = " , isRecoverable = "
            r2.append(r4)
            boolean r4 = r3.isRecoverable()
            r2.append(r4)
            java.lang.String r4 = " , errorCode = "
            r2.append(r4)
            int r3 = r3.getErrorCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)
        L_0x004e:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x0061
            r0 = 20
            r5.waitTime(r0)
            java.nio.ByteBuffer r6 = r5.getOutputBuffer(r6, r7)
            return r6
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int):java.nio.ByteBuffer");
    }

    private void prepareAudioEncoder(ExportConfig exportConfig) {
        String str = this.TAG;
        Logger.m144641d(str, "AssetWriter prepareAudioEncoder " + this);
        MediaFormat audioFormat = exportConfig.getAudioFormat();
        fixAudioFormat(audioFormat);
        String str2 = this.TAG;
        Logger.m144646i(str2, "prepareAudioEncoder, input mediaFormat:" + audioFormat + ", isAudioEncodeNeedCodecSpecificData:" + exportConfig.isAudioEncodeNeedCodecSpecificData());
        if (exportConfig.isAudioEncodeNeedCodecSpecificData()) {
            int integer = audioFormat.getInteger("aac-profile");
            int integer2 = audioFormat.getInteger("sample-rate");
            int integer3 = audioFormat.getInteger("channel-count");
            String str3 = this.TAG;
            Logger.m144646i(str3, "try set adts csd-0 data, profile:" + integer + ", sampleRate:" + integer2 + ", " + integer3);
            audioFormat.setByteBuffer(TUtils.CSD_0, ADTSUtils.getADTSCodecSpecificData(integer, integer2, integer3));
        }
        this.audioEncoder.prepare(exportConfig, audioFormat);
    }

    private void prepareVideoEncoder(ExportConfig exportConfig) {
        MediaFormat videoFormat = exportConfig.getVideoFormat();
        fixVideoFormat(videoFormat);
        this.videoEncoder.prepare(exportConfig, videoFormat);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void queueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse r6, int r7, int r8, int r9, long r10, int r12) {
        /*
            r5 = this;
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ Exception -> 0x0006, Error -> 0x0004 }
            return
        L_0x0004:
            r0 = move-exception
            goto L_0x0007
        L_0x0006:
            r0 = move-exception
        L_0x0007:
            java.lang.String r1 = r5.TAG
            java.lang.String r2 = "queueInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException
            if (r2 == 0) goto L_0x005e
            r2 = 23
            if (r1 < r2) goto L_0x004d
            java.lang.String r1 = r5.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r4 = r3.isTransient()
            r2.append(r4)
            java.lang.String r4 = " , isRecoverable = "
            r2.append(r4)
            boolean r4 = r3.isRecoverable()
            r2.append(r4)
            java.lang.String r4 = " , errorCode = "
            r2.append(r4)
            int r3 = r3.getErrorCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)
        L_0x004d:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005e
            r1 = 20
            r5.waitTime(r1)
            r5.queueInputBuffer(r6, r7, r8, r9, r10, r12)
        L_0x005e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.queueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int, int, int, long, int):void");
    }

    private boolean release() {
        this.released = true;
        String str = this.TAG;
        Logger.m144646i(str, "AssetWriter release: " + this);
        try {
            this.videoEncoderLock.lock();
            this.audioEncoderLock.lock();
            String str2 = this.TAG;
            Logger.m144641d(str2, "AssetWriter release " + this);
            AssetWriterVideoEncoder assetWriterVideoEncoder = this.videoEncoder;
            if (assetWriterVideoEncoder != null) {
                assetWriterVideoEncoder.stop();
                try {
                    this.videoEncoder.release();
                } catch (Exception e) {
                    Logger.m144644e(this.TAG, "release: videoEncoder.release()", (Throwable) e);
                }
                this.videoEncoder = null;
            }
        } catch (Exception e2) {
            Logger.m144644e(this.TAG, "release: videoEncoder.stop()", (Throwable) e2);
        } catch (Throwable th) {
            this.videoEncoderLock.unlock();
            this.audioEncoderLock.unlock();
            throw th;
        }
        AssetWriterAudioEncoder assetWriterAudioEncoder = this.audioEncoder;
        if (assetWriterAudioEncoder != null) {
            try {
                assetWriterAudioEncoder.stop();
            } catch (Exception e3) {
                Logger.m144644e(this.TAG, "release: audioEncoder.stop()", (Throwable) e3);
            }
            try {
                this.audioEncoder.release();
            } catch (Exception e4) {
                Logger.m144644e(this.TAG, "release: audioEncoder.release()", (Throwable) e4);
            }
            this.audioEncoder = null;
        }
        boolean z = false;
        if (this.muxer != null) {
            if (this.muxerStarted) {
                this.muxerStarted = false;
                try {
                    z = this.muxer.stop(this.isCancel);
                } catch (Exception e5) {
                    Logger.m144644e(this.TAG, "release: muxer.stop()", (Throwable) e5);
                }
            }
            try {
                this.muxer.release();
            } catch (Exception e6) {
                Logger.m144644e(this.TAG, "release: muxer.release()", (Throwable) e6);
            }
        }
        this.videoEncoderLock.unlock();
        this.audioEncoderLock.unlock();
        String str3 = this.TAG;
        Logger.m144646i(str3, "encode performance: " + this.encodeReporter);
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void releaseOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse r6, int r7, boolean r8) {
        /*
            r5 = this;
            r6.releaseOutputBuffer(r7, r8)     // Catch:{ Exception -> 0x0006, Error -> 0x0004 }
            return
        L_0x0004:
            r0 = move-exception
            goto L_0x0007
        L_0x0006:
            r0 = move-exception
        L_0x0007:
            java.lang.String r1 = r5.TAG
            java.lang.String r2 = "releaseOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            boolean r2 = r0 instanceof android.media.MediaCodec.CodecException
            if (r2 == 0) goto L_0x005e
            r2 = 23
            if (r1 < r2) goto L_0x004d
            java.lang.String r1 = r5.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CodecException - isTransient = "
            r2.append(r3)
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r4 = r3.isTransient()
            r2.append(r4)
            java.lang.String r4 = " , isRecoverable = "
            r2.append(r4)
            boolean r4 = r3.isRecoverable()
            r2.append(r4)
            java.lang.String r4 = " , errorCode = "
            r2.append(r4)
            int r3 = r3.getErrorCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144643e(r1, r2)
        L_0x004d:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005e
            r1 = 20
            r5.waitTime(r1)
            r5.releaseOutputBuffer(r6, r7, r8)
        L_0x005e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.releaseOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int, boolean):void");
    }

    private void signalEndOfAudioStream() {
        try {
            if (!this.enOfAudioInputStream) {
                Logger.m144641d(this.TAG, "signalEndOfAudioStream: ");
                this.enOfAudioInputStream = this.audioEncoder.endWriteAudioSample();
            }
        } catch (Throwable th) {
            Logger.m144644e(this.TAG, "signalEndOfAudioStream failed", th);
        }
    }

    private void signalEndOfVideoStream() {
        Logger.m144641d(this.TAG, "signalEndOfVideoStream: ");
        if (this._inputSurface != null && !this.enOfVideoInputStream) {
            try {
                this.videoEncoder.signalEndOfInputStream();
                this.enOfVideoInputStream = true;
            } catch (Throwable th) {
                Logger.m144644e(this.TAG, "signalEndOfVideoStream failed", th);
            }
        }
    }

    private boolean unStarted() {
        return !this.muxerStarted && (!this.hasVideoTrack || this.videoEncodeFormat != null) && (!this.hasAudioTrack || this.audioEncodeFormat != null);
    }

    private boolean validAndCorrectBufferInfo(MediaCodec.BufferInfo bufferInfo) {
        return bufferInfo.size > 0 && (bufferInfo.flags & 4) == 0;
    }

    private void waitTime(long j) {
        try {
            wait(j);
        } catch (InterruptedException unused) {
        }
    }

    private boolean writeAudioFrame(boolean z) {
        System.currentTimeMillis();
        try {
            this.audioEncoderLock.lock();
            boolean writeAudioFrame = this.audioEncoder.writeAudioFrame(z);
            this.audioEncodeFormat = this.audioEncoder.getEncodeFormat();
            if (this.audioEncoder.isEncodeToEndOfStream()) {
                this.hasAudioTrack = false;
            }
            return writeAudioFrame;
        } finally {
            this.audioEncoderLock.unlock();
        }
    }

    private boolean writeVideoFrame(CMSampleBuffer cMSampleBuffer, boolean z) {
        try {
            this.videoEncoderLock.lock();
            boolean writeVideoSample = this.videoEncoder.writeVideoSample(cMSampleBuffer, z);
            this.videoEncodeFormat = this.videoEncoder.getEncodeFormat();
            if (this.videoEncoder.isEncodeToEndOfStream()) {
                this.hasVideoTrack = false;
            }
            this.videoEncoderLock.unlock();
            return writeVideoSample;
        } catch (Throwable th) {
            this.videoEncoderLock.unlock();
            throw th;
        }
    }

    public boolean audioTrackWritable() {
        boolean z = true;
        if (this.hasAudioTrack && (this.muxerStarted || this.audioEncodeFormat == null)) {
            return true;
        }
        synchronized (this) {
            if (this.hasAudioTrack) {
                if (!this.muxerStarted) {
                    if (this.audioEncodeFormat == null) {
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public synchronized Surface createInputSurface() {
        if (this._inputSurface == null && this.hasVideoTrack) {
            this._inputSurface = this.videoEncoder.createInputSurface();
        }
        return this._inputSurface;
    }

    public void endWriteAudioSample() {
        String str = this.TAG;
        Logger.m144641d(str, "endWriteAudioSample:" + this);
        try {
            this.audioEncoderLock.lock();
            if (!this.released) {
                if (!this.enOfAudioInputStream) {
                    Logger.m144641d(this.TAG, "endWriteAudioSample: ");
                    this.enOfAudioInputStream = this.audioEncoder.endWriteAudioSample();
                    drainAudioEncoder(false, (CMSampleBuffer) null);
                    this.audioEncoderLock.unlock();
                }
            }
        } finally {
            this.audioEncoderLock.unlock();
        }
    }

    public void endWriteVideoSample(CMSampleBuffer cMSampleBuffer) {
        Logger.m144646i(this.TAG, "endWriteVideoSample: ");
        if (!this.released && this._inputSurface != null && !this.enOfVideoInputStream) {
            try {
                this.videoEncoderLock.lock();
                this.videoEncoder.signalEndOfInputStream();
                this.enOfVideoInputStream = true;
            } catch (Throwable th) {
                this.videoEncoderLock.unlock();
                throw th;
            }
            this.videoEncoderLock.unlock();
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (!this.videoEncoder.isEncodeToEndOfStream() && System.currentTimeMillis() - currentTimeMillis < 3000) {
                i++;
                drainVideoEncoder(false, cMSampleBuffer);
            }
            Logger.m144647i(this.TAG, "make sure eos received,loop:%d  cost:%d", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public long getAudioPresentationTimeUs() {
        return this.audioEncoder.getEncodePresentationTimeUs();
    }

    public IMediaMuxer getMuxer() {
        return this.muxer;
    }

    public int getOutHeight() {
        return (int) this.videoEncoder.getEncodeSize().height;
    }

    public int getOutWidth() {
        return (int) this.videoEncoder.getEncodeSize().width;
    }

    public AverageTimeReporter getPerformance() {
        return this.encodeReporter;
    }

    public long getVideoPresentationTimeUs() {
        AssetWriterVideoEncoder assetWriterVideoEncoder = this.videoEncoder;
        if (assetWriterVideoEncoder == null) {
            return -1;
        }
        return assetWriterVideoEncoder.getEncodePresentationTimeUs();
    }

    public boolean isVideoEncodeNeedVideoRenderOutputTexture() {
        return this.videoEncoder.isNeedVideoOutputTexture();
    }

    public void prepareParallelSegmentInfo(int i, CMTimeRange cMTimeRange, CMTimeRange cMTimeRange2) {
        this.muxer.prepareParallelSegmentInfo(i, cMTimeRange, cMTimeRange2);
    }

    public void processVideoTexture(TextureInfo textureInfo, CMTime cMTime) {
        this.videoEncoder.processVideoTexture(textureInfo, cMTime);
    }

    public void reset() {
        this.muxerStarted = false;
        this.hasVideoTrack = true;
        this._inputSurface = null;
        this.enOfVideoInputStream = false;
        IMediaMuxer createMediaMuxer = MediaMuxerFactory.createMediaMuxer(this.outputPath, 0);
        this.muxer = createMediaMuxer;
        createMediaMuxer.setExportConfig(this.encodeOption);
        this.videoEncoder.reset();
        this.videoEncoder.setMediaMuxer(this.muxer);
    }

    public void setEncodeOption(ExportConfig exportConfig) {
        if (exportConfig.getOutputWidth() <= 0 || exportConfig.getOutputHeight() <= 0) {
            throw new IllegalArgumentException("width and height must > 0");
        }
        this.encodeOption = exportConfig.clone();
        this.muxer.setExportConfig(exportConfig);
    }

    public void setVideoSampleRenderContext(RenderContext renderContext) {
        this.videoEncoder.setVideoSampleRenderContext(renderContext);
    }

    public synchronized void startAudioEncoder() {
        try {
            this.audioEncoderLock.lock();
            String str = this.TAG;
            Logger.m144641d(str, "AssetWriter startAudioEncoder " + this);
            prepareAudioEncoder(this.encodeOption);
            this.hasAudioTrack = true;
            this.audioEncoder.start();
            this.audioEncoderStarted = true;
            this.audioEncoderLock.unlock();
        } catch (Throwable th) {
            this.audioEncoderLock.unlock();
            throw th;
        }
    }

    public synchronized void startVideoEncoder() {
        try {
            this.videoEncoderLock.lock();
            String str = this.TAG;
            Logger.m144641d(str, "AssetWriter startVideoEncoder " + this);
            prepareVideoEncoder(this.encodeOption);
            this.hasVideoTrack = true;
            createInputSurface();
            this.videoEncoder.start();
            this.videoEncoderStarted = true;
            this.videoEncoderLock.unlock();
        } catch (Throwable th) {
            this.videoEncoderLock.unlock();
            throw th;
        }
    }

    public boolean stop() {
        String str = this.TAG;
        Logger.m144646i(str, "AssetWriter stop " + this);
        if (this.released) {
            return false;
        }
        if (!this.videoEncoderStarted && !this.audioEncoderStarted) {
            return false;
        }
        this.videoEncoderStarted = false;
        this.audioEncoderStarted = false;
        drainVideoEncoder(true, (CMSampleBuffer) null);
        drainAudioEncoder(true, (CMSampleBuffer) null);
        return release();
    }

    public boolean videoTrackWritable() {
        boolean z = true;
        if (this.hasVideoTrack && (this.muxerStarted || this.videoEncodeFormat == null)) {
            return true;
        }
        synchronized (this) {
            if (this.hasVideoTrack) {
                if (!this.muxerStarted) {
                    if (this.videoEncodeFormat == null) {
                    }
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        com.tencent.tav.decoder.logger.Logger.m144649w(r1.TAG, "attach retry limit, break it");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.audioEncoderLock.unlock();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeAudioSample(long r17, java.nio.ByteBuffer r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r19
            java.lang.String r4 = "writeAudioSample finish cost "
            java.lang.String r5 = r1.TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "writeAudioSample: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = "  "
            r6.append(r7)
            int r7 = r19.limit()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.tav.decoder.logger.Logger.m144646i(r5, r6)
            long r5 = java.lang.System.currentTimeMillis()
            boolean r7 = r1.released     // Catch:{ all -> 0x00c7 }
            if (r7 == 0) goto L_0x004c
            java.lang.String r0 = r1.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r5
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144646i(r0, r2)
            return
        L_0x004c:
            int r7 = r19.limit()     // Catch:{ all -> 0x00c7 }
            int r8 = r19.position()     // Catch:{ all -> 0x00c7 }
            int r9 = r19.position()     // Catch:{ all -> 0x00c7 }
            r10 = 0
            r13 = 0
        L_0x005b:
            if (r9 >= r7) goto L_0x00a7
            java.util.concurrent.locks.Lock r14 = r1.audioEncoderLock     // Catch:{ all -> 0x00a0 }
            r14.lock()     // Catch:{ all -> 0x00a0 }
            com.tencent.tav.decoder.AssetWriterAudioEncoder r14 = r1.audioEncoder     // Catch:{ all -> 0x00a0 }
            r15 = r13
            long r12 = r2 + r10
            long r12 = r14.writeAudioSample(r12, r0)     // Catch:{ all -> 0x00a0 }
            long r10 = r10 + r12
            int r12 = r19.position()     // Catch:{ all -> 0x00a0 }
            if (r12 != r9) goto L_0x008d
            r9 = 5
            r13 = r15
            if (r13 <= r9) goto L_0x0083
            java.lang.String r2 = r1.TAG     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = "attach retry limit, break it"
            com.tencent.tav.decoder.logger.Logger.m144649w(r2, r3)     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.locks.Lock r2 = r1.audioEncoderLock     // Catch:{ all -> 0x00c7 }
            r2.unlock()     // Catch:{ all -> 0x00c7 }
            goto L_0x00a7
        L_0x0083:
            java.lang.String r9 = r1.TAG     // Catch:{ all -> 0x00a0 }
            java.lang.String r14 = "write audio sample not forward"
            com.tencent.tav.decoder.logger.Logger.m144649w(r9, r14)     // Catch:{ all -> 0x00a0 }
            int r13 = r13 + 1
            goto L_0x008e
        L_0x008d:
            r13 = r15
        L_0x008e:
            r0.limit(r7)     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.locks.Lock r9 = r1.audioEncoderLock     // Catch:{ all -> 0x00c7 }
            r9.unlock()     // Catch:{ all -> 0x00c7 }
            r9 = 0
            r14 = 0
            r1.drainAudioEncoder(r14, r9)     // Catch:{ all -> 0x00c7 }
            r16.checkStartMuxer()     // Catch:{ all -> 0x00c7 }
            r9 = r12
            goto L_0x005b
        L_0x00a0:
            r0 = move-exception
            java.util.concurrent.locks.Lock r2 = r1.audioEncoderLock     // Catch:{ all -> 0x00c7 }
            r2.unlock()     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00a7:
            r0.position(r8)     // Catch:{ all -> 0x00c7 }
            r0.limit(r7)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r1.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r5
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tav.decoder.logger.Logger.m144646i(r0, r2)
            return
        L_0x00c7:
            r0 = move-exception
            com.tencent.tav.core.ExportRuntimeException r2 = new com.tencent.tav.core.ExportRuntimeException     // Catch:{ all -> 0x00d0 }
            r3 = -122(0xffffffffffffff86, float:NaN)
            r2.<init>(r3, r0)     // Catch:{ all -> 0x00d0 }
            throw r2     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            java.lang.String r2 = r1.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.tav.decoder.logger.Logger.m144646i(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.EncoderWriter.writeAudioSample(long, java.nio.ByteBuffer):void");
    }

    public void writeVideoSample(CMSampleBuffer cMSampleBuffer) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this._inputSurface != null) {
                long currentTimeMillis2 = System.currentTimeMillis();
                drainVideoEncoder(false, cMSampleBuffer);
                checkStartMuxer();
                this.encodeReporter.add(System.currentTimeMillis() - currentTimeMillis2);
                if (!cMSampleBuffer.getState().isInvalid()) {
                    this.muxer.writeSampleDataTime(true, cMSampleBuffer.getTime());
                } else {
                    Logger.m144643e(this.TAG, "sampleBuffer time isInvalid");
                }
                String str = this.TAG;
                Logger.m144646i(str, "writeVideoSample finish cost " + (System.currentTimeMillis() - currentTimeMillis));
            }
        } finally {
            String str2 = this.TAG;
            Logger.m144646i(str2, "writeVideoSample finish cost " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public boolean stop(boolean z) {
        this.isCancel = z;
        String str = this.TAG;
        Logger.m144646i(str, "AssetWriter stop " + this + " isCancel = " + z);
        return stop();
    }

    public EncoderWriter(String str) {
        this(str, (IEncoderFactory) null);
    }
}
