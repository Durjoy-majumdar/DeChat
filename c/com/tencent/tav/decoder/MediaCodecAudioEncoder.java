package com.tencent.tav.decoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.tav.codec.MediaCodecAnalyse;
import com.tencent.tav.core.ExportConfig;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.tav.core.ExportRuntimeException;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.decoder.muxer.IMediaMuxer;
import java.nio.ByteBuffer;

public class MediaCodecAudioEncoder implements AssetWriterAudioEncoder {
    public static final String OUTPUT_AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final String SCENE = "audio-encode";
    private static final String TAG = "MediaCodecAudioEncoder";
    private static final long WAIT_TRANSIENT_MS = 20;
    public static final long WRITER_FINISH = -1;
    private volatile MediaCodec.BufferInfo audioBufferInfo = new MediaCodec.BufferInfo();
    private volatile MediaFormat audioEncodeFormat = null;
    private MediaCodecAnalyse audioEncoder;
    private long audioPresentationTimeUs;
    private ExportConfig encodeOption;
    private boolean isEncodeToEndOfStream = false;
    private IMediaMuxer muxer;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.media.MediaCodec$CodecException} */
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
            java.lang.String r1 = "MediaCodecAudioEncoder"
            java.lang.String r2 = "dequeueInputBuffer e = "
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x0061
            r3 = 23
            if (r3 > r2) goto L_0x004e
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
            int r6 = r5.dequeueInputBuffer(r6)
            return r6
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAudioEncoder.dequeueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse):int");
    }

    private int dequeueOutputBuffer(MediaCodecAnalyse mediaCodecAnalyse, MediaCodec.BufferInfo bufferInfo) {
        try {
            return mediaCodecAnalyse.dequeueOutputBuffer(bufferInfo, 1000);
        } catch (Exception e) {
            Logger.m144644e(TAG, "dequeueOutputBuffer e = ", (Throwable) e);
            if (e instanceof MediaCodec.CodecException) {
                if (23 <= Build.VERSION.SDK_INT) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CodecException - isTransient = ");
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) e;
                    sb.append(codecException.isTransient());
                    sb.append(" , isRecoverable = ");
                    sb.append(codecException.isRecoverable());
                    sb.append(" , errorCode = ");
                    sb.append(codecException.getErrorCode());
                    Logger.m144643e(TAG, sb.toString());
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.media.MediaCodec$CodecException} */
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
            java.lang.String r1 = "MediaCodecAudioEncoder"
            java.lang.String r2 = "getInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x005f
            r3 = 23
            if (r2 < r3) goto L_0x004c
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
        L_0x004c:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005f
            r0 = 20
            r5.waitTime(r0)
            java.nio.ByteBuffer r6 = r5.getInputBuffer(r6, r7)
            return r6
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAudioEncoder.getInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int):java.nio.ByteBuffer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.media.MediaCodec$CodecException} */
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
            java.lang.String r1 = "MediaCodecAudioEncoder"
            java.lang.String r2 = "getOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x005f
            r3 = 23
            if (r2 < r3) goto L_0x004c
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
        L_0x004c:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005f
            r0 = 20
            r5.waitTime(r0)
            java.nio.ByteBuffer r6 = r5.getOutputBuffer(r6, r7)
            return r6
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAudioEncoder.getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int):java.nio.ByteBuffer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.media.MediaCodec$CodecException} */
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
            java.lang.String r1 = "MediaCodecAudioEncoder"
            java.lang.String r2 = "queueInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x005c
            r3 = 23
            if (r2 < r3) goto L_0x004b
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
        L_0x004b:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005c
            r1 = 20
            r5.waitTime(r1)
            r5.queueInputBuffer(r6, r7, r8, r9, r10, r12)
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAudioEncoder.queueInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int, int, int, long, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.media.MediaCodec$CodecException} */
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
            java.lang.String r1 = "MediaCodecAudioEncoder"
            java.lang.String r2 = "releaseOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x005c
            r3 = 23
            if (r2 < r3) goto L_0x004b
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
        L_0x004b:
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isTransient()
            if (r1 == 0) goto L_0x005c
            r1 = 20
            r5.waitTime(r1)
            r5.releaseOutputBuffer(r6, r7, r8)
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAudioEncoder.releaseOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse, int, boolean):void");
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

    public boolean endWriteAudioSample() {
        try {
            int dequeueInputBuffer = dequeueInputBuffer(this.audioEncoder);
            if (dequeueInputBuffer < 0) {
                return false;
            }
            queueInputBuffer(this.audioEncoder, dequeueInputBuffer, 0, 0, 0, 4);
            return true;
        } catch (Throwable th) {
            Logger.m144644e(TAG, "endWriteAudioSample failed", th);
            return false;
        }
    }

    public MediaFormat getEncodeFormat() {
        return this.audioEncodeFormat;
    }

    public long getEncodePresentationTimeUs() {
        return this.audioPresentationTimeUs;
    }

    public boolean isEncodeToEndOfStream() {
        return this.isEncodeToEndOfStream;
    }

    public boolean prepare(ExportConfig exportConfig, MediaFormat mediaFormat) {
        this.encodeOption = exportConfig;
        try {
            Logger.m144646i(TAG, "prepareAudioEncoder: format = " + mediaFormat);
            MediaCodecAnalyse createEncoderByType = MediaCodecAnalyse.createEncoderByType("audio/mp4a-latm", SCENE);
            this.audioEncoder = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return true;
        } catch (Exception e) {
            throw new ExportRuntimeException(new ExportErrorStatus(-104, e, mediaFormat.toString()));
        }
    }

    public void release() {
        MediaCodecAnalyse mediaCodecAnalyse = this.audioEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.release();
        }
    }

    public void setMediaMuxer(IMediaMuxer iMediaMuxer) {
        this.muxer = iMediaMuxer;
    }

    public boolean start() {
        this.audioEncoder.start();
        return true;
    }

    public void stop() {
        MediaCodecAnalyse mediaCodecAnalyse = this.audioEncoder;
        if (mediaCodecAnalyse != null) {
            mediaCodecAnalyse.stop();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean writeAudioFrame(boolean r13) {
        /*
            r12 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r0 = r12.muxer
            r1 = 0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isMuxerStarted()
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            r2 = 1
            if (r0 != 0) goto L_0x0018
            android.media.MediaFormat r3 = r12.audioEncodeFormat
            if (r3 != 0) goto L_0x0013
            goto L_0x0018
        L_0x0013:
            if (r13 != 0) goto L_0x00f5
        L_0x0015:
            r1 = 1
            goto L_0x00f5
        L_0x0018:
            com.tencent.tav.codec.MediaCodecAnalyse r3 = r12.audioEncoder
            android.media.MediaCodec$BufferInfo r4 = r12.audioBufferInfo
            int r3 = r12.dequeueOutputBuffer(r3, r4)
            r4 = -1
            if (r3 != r4) goto L_0x0026
            if (r13 != 0) goto L_0x00f5
            goto L_0x0015
        L_0x0026:
            r13 = -2
            java.lang.String r4 = "MediaCodecAudioEncoder"
            if (r3 != r13) goto L_0x004b
            com.tencent.tav.codec.MediaCodecAnalyse r13 = r12.audioEncoder
            android.media.MediaFormat r13 = r13.getOutputFormat()
            r12.audioEncodeFormat = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "audio format changed "
            r13.append(r0)
            android.media.MediaFormat r0 = r12.audioEncodeFormat
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.tav.decoder.logger.Logger.m144646i(r4, r13)
            goto L_0x00f5
        L_0x004b:
            if (r3 < 0) goto L_0x00f5
            com.tencent.tav.codec.MediaCodecAnalyse r13 = r12.audioEncoder
            java.nio.ByteBuffer r13 = r12.getOutputBuffer(r13, r3)
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo
            int r5 = r5.flags
            r5 = r5 & 2
            if (r5 == 0) goto L_0x005f
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo
            r5.size = r1
        L_0x005f:
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo
            int r5 = r5.offset
            r13.position(r5)
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo
            int r5 = r5.offset
            android.media.MediaCodec$BufferInfo r6 = r12.audioBufferInfo
            int r6 = r6.size
            int r5 = r5 + r6
            r13.limit(r5)
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo
            boolean r5 = r12.validAndCorrectBufferInfo(r5)
            if (r5 == 0) goto L_0x00db
            if (r0 == 0) goto L_0x00db
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x00d5 }
            r0.<init>()     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            int r7 = r5.offset     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            int r8 = r5.size     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            long r9 = r5.presentationTimeUs     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            int r11 = r5.flags     // Catch:{ Exception -> 0x00d5 }
            r6 = r0
            r6.set(r7, r8, r9, r11)     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r5 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            long r5 = r5.presentationTimeUs     // Catch:{ Exception -> 0x00d5 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x00ad
            com.tencent.tav.decoder.muxer.IMediaMuxer r5 = r12.muxer     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r6 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            long r6 = r6.presentationTimeUs     // Catch:{ Exception -> 0x00d5 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x00d5 }
            com.tencent.tav.coremedia.CMTime r6 = com.tencent.tav.coremedia.CMTime.fromSeconds(r6)     // Catch:{ Exception -> 0x00d5 }
            r5.writeSampleDataTime(r1, r6)     // Catch:{ Exception -> 0x00d5 }
        L_0x00ad:
            com.tencent.tav.decoder.muxer.IMediaMuxer r5 = r12.muxer     // Catch:{ Exception -> 0x00d5 }
            int r6 = r5.audioTrackIndex()     // Catch:{ Exception -> 0x00d5 }
            r5.writeSampleData(r6, r13, r0)     // Catch:{ Exception -> 0x00d5 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d5 }
            r13.<init>()     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = "writeAudioFrame:  "
            r13.append(r0)     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r0 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            long r5 = r0.presentationTimeUs     // Catch:{ Exception -> 0x00d5 }
            r13.append(r5)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x00d5 }
            com.tencent.tav.decoder.logger.Logger.m144648v(r4, r13)     // Catch:{ Exception -> 0x00d5 }
            android.media.MediaCodec$BufferInfo r13 = r12.audioBufferInfo     // Catch:{ Exception -> 0x00d5 }
            long r5 = r13.presentationTimeUs     // Catch:{ Exception -> 0x00d5 }
            r12.audioPresentationTimeUs = r5     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00db
        L_0x00d5:
            r13 = move-exception
            java.lang.String r0 = "writeAudioFrame: "
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r4, (java.lang.String) r0, (java.lang.Throwable) r13)
        L_0x00db:
            com.tencent.tav.codec.MediaCodecAnalyse r13 = r12.audioEncoder
            r12.releaseOutputBuffer(r13, r3, r1)
            android.media.MediaCodec$BufferInfo r13 = r12.audioBufferInfo
            int r13 = r13.flags
            r13 = r13 & 4
            if (r13 == 0) goto L_0x00f5
            java.lang.String r13 = "writeAudioFrame: BUFFER_FLAG_END_OF_STREAM"
            com.tencent.tav.decoder.logger.Logger.m144646i(r4, r13)
            r0 = -1
            r12.audioPresentationTimeUs = r0
            r12.isEncodeToEndOfStream = r2
            goto L_0x0015
        L_0x00f5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecAudioEncoder.writeAudioFrame(boolean):boolean");
    }

    public long writeAudioSample(long j, ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int dequeueInputBuffer = dequeueInputBuffer(this.audioEncoder);
        if (dequeueInputBuffer < 0) {
            return 0;
        }
        ByteBuffer inputBuffer = getInputBuffer(this.audioEncoder, dequeueInputBuffer);
        int min = Math.min(limit - position, inputBuffer.capacity());
        int i = position + min;
        byteBuffer.limit(i);
        byteBuffer.position(position);
        inputBuffer.put(byteBuffer);
        queueInputBuffer(this.audioEncoder, dequeueInputBuffer, 0, min, j, 0);
        byteBuffer.position(i);
        return DecoderUtils.getAudioDuration((long) min, this.encodeOption.getAudioChannelCount(), this.encodeOption.getAudioSampleRateHz());
    }
}
