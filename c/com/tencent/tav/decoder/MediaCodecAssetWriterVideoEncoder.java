package com.tencent.tav.decoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.tav.codec.MediaCodecAnalyse;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.ExportRuntimeException;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.muxer.IMediaMuxer;

public class MediaCodecAssetWriterVideoEncoder implements AssetWriterVideoEncoder {
    public static final String SCENE = "tav-encoder-assetwriter";
    private static final long WAIT_TRANSIENT_MS = 20;
    private final String TAG = ("MediaCodecAssetWriterVideoEncoder@" + hashCode());
    private ExportConfig encodeOption;
    private CGSize encodeSize;
    private Surface inputSurface;
    private boolean isEncodeToEndOfStream = false;
    private MediaFormat mediaFormat;
    private IMediaMuxer muxer;
    private int outHeight;
    private int outWidth;
    private volatile MediaCodec.BufferInfo videoBufferInfo = new MediaCodec.BufferInfo();
    private volatile MediaFormat videoEncodeFormat = null;
    private MediaCodecAnalyse videoEncoder;
    private long videoPresentationTimeUs = 0;

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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAssetWriterVideoEncoder.getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int):java.nio.ByteBuffer");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAssetWriterVideoEncoder.releaseOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int, boolean):void");
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

    public Surface createInputSurface() {
        if (this.videoEncoder != null && this.inputSurface == null) {
            Logger.m144646i(this.TAG, "createInputSurface");
            this.inputSurface = this.videoEncoder.createInputSurface();
        }
        return this.inputSurface;
    }

    public void flush() {
        MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            this.isEncodeToEndOfStream = false;
            mediaCodecAnalyse.flush();
        }
    }

    public MediaFormat getEncodeFormat() {
        return this.videoEncodeFormat;
    }

    public long getEncodePresentationTimeUs() {
        return this.videoPresentationTimeUs;
    }

    public CGSize getEncodeSize() {
        return this.encodeSize;
    }

    public boolean isEncodeToEndOfStream() {
        return this.isEncodeToEndOfStream;
    }

    public boolean isNeedVideoOutputTexture() {
        return false;
    }

    public boolean prepare(ExportConfig exportConfig, MediaFormat mediaFormat2) {
        CGSize outputSize = exportConfig.getOutputSize();
        this.outHeight = (int) outputSize.height;
        this.outWidth = (int) outputSize.width;
        this.encodeSize = new CGSize((float) this.outWidth, (float) this.outHeight);
        this.encodeOption = exportConfig;
        this.mediaFormat = mediaFormat2;
        try {
            String str = this.TAG;
            Logger.m144646i(str, "prepareVideoEncoder: format = " + mediaFormat2);
            MediaCodecAnalyse createEncoderByType = MediaCodecAnalyse.createEncoderByType(mediaFormat2.containsKey("mime") ? mediaFormat2.getString("mime") : "video/avc", SCENE);
            this.videoEncoder = createEncoderByType;
            createEncoderByType.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 1);
            return true;
        } catch (Exception e) {
            String str2 = this.TAG;
            Logger.m144644e(str2, "prepareVideoEncoder: 失败，准备重试。format = " + mediaFormat2, (Throwable) e);
            mediaFormat2.setInteger(Scopes.PROFILE, 0);
            mediaFormat2.setInteger(FirebaseAnalytics.C113379b.LEVEL, 0);
            try {
                MediaCodecAnalyse createEncoderByType2 = MediaCodecAnalyse.createEncoderByType("video/avc", SCENE);
                this.videoEncoder = createEncoderByType2;
                createEncoderByType2.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 1);
                return true;
            } catch (Exception e2) {
                String str3 = this.TAG;
                Logger.m144644e(str3, "prepareVideoEncoder: retry 失败 format = " + mediaFormat2, (Throwable) e2);
                throw new ExportRuntimeException(new ExportErrorStatus(-103, e2, mediaFormat2.toString()));
            }
        }
    }

    public void processVideoTexture(TextureInfo textureInfo, CMTime cMTime) {
    }

    public void release() {
        MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.release();
        }
    }

    public void reset() {
        MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            this.isEncodeToEndOfStream = false;
            mediaCodecAnalyse.reset();
            this.videoEncoder.configure(this.mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.inputSurface = null;
            this.videoEncoder.start();
        }
    }

    public void setMediaMuxer(IMediaMuxer iMediaMuxer) {
        this.muxer = iMediaMuxer;
    }

    public void setVideoSampleRenderContext(RenderContext renderContext) {
    }

    public void signalEndOfInputStream() {
        MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.signalEndOfInputStream();
        }
    }

    public boolean start() {
        MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse == null) {
            return false;
        }
        mediaCodecAnalyse.start();
        return true;
    }

    public void stop() {
        MediaCodecAnalyse mediaCodecAnalyse = this.videoEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.stop();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer r10, boolean r11) {
        /*
            r9 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r10 = r9.muxer
            r0 = 0
            if (r10 == 0) goto L_0x000a
            boolean r10 = r10.isMuxerStarted()
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.System.currentTimeMillis()
            r1 = 1
            if (r10 != 0) goto L_0x001b
            android.media.MediaFormat r2 = r9.videoEncodeFormat
            if (r2 != 0) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            if (r11 != 0) goto L_0x00d0
        L_0x0018:
            r0 = 1
            goto L_0x00d0
        L_0x001b:
            java.lang.String r2 = "encode-dequeue"
            android.os.Trace.beginSection(r2)
            com.tencent.tav.codec.MediaCodecAnalyse r2 = r9.videoEncoder
            android.media.MediaCodec$BufferInfo r3 = r9.videoBufferInfo
            int r2 = r9.dequeueOutputBuffer(r2, r3)
            android.os.Trace.endSection()
            r3 = -1
            if (r2 != r3) goto L_0x0031
            if (r11 != 0) goto L_0x00d0
            goto L_0x0018
        L_0x0031:
            r11 = -2
            if (r2 != r11) goto L_0x0056
            com.tencent.tav.codec.MediaCodecAnalyse r10 = r9.videoEncoder
            android.media.MediaFormat r10 = r10.getOutputFormat()
            r9.videoEncodeFormat = r10
            java.lang.String r10 = r9.TAG
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "encoder output format changed:"
            r11.append(r1)
            android.media.MediaFormat r1 = r9.videoEncodeFormat
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.tencent.tav.decoder.logger.Logger.m144646i(r10, r11)
            goto L_0x00d0
        L_0x0056:
            if (r2 < 0) goto L_0x00d0
            java.lang.String r11 = "has-data"
            android.os.Trace.beginSection(r11)
            com.tencent.tav.codec.MediaCodecAnalyse r11 = r9.videoEncoder
            java.nio.ByteBuffer r11 = r9.getOutputBuffer(r11, r2)
            android.media.MediaCodec$BufferInfo r3 = r9.videoBufferInfo
            int r3 = r3.flags
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0077
            com.tencent.tav.decoder.muxer.IMediaMuxer r3 = r9.muxer
            boolean r3 = r3.ignoreHeader()
            if (r3 == 0) goto L_0x0077
            android.media.MediaCodec$BufferInfo r3 = r9.videoBufferInfo
            r3.size = r0
        L_0x0077:
            if (r10 == 0) goto L_0x00b2
            android.media.MediaCodec$BufferInfo r10 = r9.videoBufferInfo
            boolean r10 = r9.validAndCorrectBufferInfo(r10)
            if (r10 == 0) goto L_0x00b2
            android.media.MediaCodec$BufferInfo r10 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x00aa }
            r10.<init>()     // Catch:{ Exception -> 0x00aa }
            android.media.MediaCodec$BufferInfo r3 = r9.videoBufferInfo     // Catch:{ Exception -> 0x00aa }
            int r4 = r3.offset     // Catch:{ Exception -> 0x00aa }
            android.media.MediaCodec$BufferInfo r3 = r9.videoBufferInfo     // Catch:{ Exception -> 0x00aa }
            int r5 = r3.size     // Catch:{ Exception -> 0x00aa }
            android.media.MediaCodec$BufferInfo r3 = r9.videoBufferInfo     // Catch:{ Exception -> 0x00aa }
            long r6 = r3.presentationTimeUs     // Catch:{ Exception -> 0x00aa }
            android.media.MediaCodec$BufferInfo r3 = r9.videoBufferInfo     // Catch:{ Exception -> 0x00aa }
            int r8 = r3.flags     // Catch:{ Exception -> 0x00aa }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ Exception -> 0x00aa }
            com.tencent.tav.decoder.muxer.IMediaMuxer r3 = r9.muxer     // Catch:{ Exception -> 0x00aa }
            int r4 = r3.videoTrackIndex()     // Catch:{ Exception -> 0x00aa }
            r3.writeSampleData(r4, r11, r10)     // Catch:{ Exception -> 0x00aa }
            android.media.MediaCodec$BufferInfo r10 = r9.videoBufferInfo     // Catch:{ Exception -> 0x00aa }
            long r10 = r10.presentationTimeUs     // Catch:{ Exception -> 0x00aa }
            r9.videoPresentationTimeUs = r10     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b2
        L_0x00aa:
            r10 = move-exception
            java.lang.String r11 = r9.TAG
            java.lang.String r3 = "writeVideoFrame: "
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r11, (java.lang.String) r3, (java.lang.Throwable) r10)
        L_0x00b2:
            com.tencent.tav.codec.MediaCodecAnalyse r10 = r9.videoEncoder
            r9.releaseOutputBuffer(r10, r2, r0)
            android.media.MediaCodec$BufferInfo r10 = r9.videoBufferInfo
            int r10 = r10.flags
            r10 = r10 & 4
            if (r10 == 0) goto L_0x00cd
            java.lang.String r10 = r9.TAG
            java.lang.String r11 = "writeVideoFrame: BUFFER_FLAG_END_OF_STREAM"
            com.tencent.tav.decoder.logger.Logger.m144646i(r10, r11)
            r10 = -1
            r9.videoPresentationTimeUs = r10
            r9.isEncodeToEndOfStream = r1
            r0 = 1
        L_0x00cd:
            android.os.Trace.endSection()
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAssetWriterVideoEncoder.writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer, boolean):boolean");
    }
}
