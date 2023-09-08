package com.tencent.tav.decoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.tav.codec.MediaCodecAnalyse;
import com.tencent.tav.decoder.logger.Logger;

class MediaCodecWrapper {
    private static final int MAX_RETRY_COUNT = 10;
    private static final String SCENE = "tav-video-decoder";
    private static final long WAIT_TRANSIENT_MS = 20;
    /* access modifiers changed from: private */
    public final String TAG = ("MediaCodecWrapper@" + Integer.toHexString(hashCode()));
    /* access modifiers changed from: private */
    public MediaCodecAnalyse mediaCodec;
    /* access modifiers changed from: private */
    public final VideoDecoder videoDecoder;

    public MediaCodecWrapper(VideoDecoder videoDecoder2) {
        this.videoDecoder = videoDecoder2;
    }

    private boolean isLollipop() {
        return true;
    }

    private void resetMediaCodec(MediaFormat mediaFormat) {
        if (isLollipop()) {
            this.mediaCodec.reset();
            return;
        }
        try {
            this.mediaCodec.stop();
        } catch (Exception unused) {
        }
        this.mediaCodec.release();
        this.mediaCodec = MediaCodecAnalyse.createDecoderByType(mediaFormat.getString("mime"), SCENE);
    }

    private void tryLogMediaCodecError(MediaCodec.CodecException codecException) {
        if (Build.VERSION.SDK_INT >= 23) {
            String str = this.TAG;
            Logger.m144643e(str, "CodecException - isTransient = " + codecException.isTransient() + " , isRecoverable = " + codecException.isRecoverable() + " , errorCode = " + codecException.getErrorCode());
        }
    }

    public synchronized boolean decoderConfigure(MediaFormat mediaFormat, Surface surface) {
        long currentTimeMillis = System.currentTimeMillis();
        this.mediaCodec = MediaCodecAnalyse.createDecoderByType(mediaFormat.getString("mime"), SCENE);
        int i = 0;
        while (true) {
            i++;
            try {
                String str = this.TAG;
                Logger.m144641d(str, "createdDecoder---time---" + i);
                if (i > 10) {
                    return false;
                }
                this.mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
                String str2 = this.TAG;
                Logger.m144641d(str2, "decoderConfigure cost:" + (System.currentTimeMillis() - currentTimeMillis));
                return true;
            } catch (Exception e) {
                Logger.m144644e(this.TAG, "decoderConfigure", (Throwable) e);
                if (e instanceof MediaCodec.CodecException) {
                    if (!((MediaCodec.CodecException) e).isTransient()) {
                        if (!((MediaCodec.CodecException) e).isRecoverable()) {
                            break;
                        }
                    }
                } else {
                    break;
                }
                this.mediaCodec.release();
                throw e;
            }
        }
        this.mediaCodec.release();
        throw e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int dequeueInputBuffer() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.tencent.tav.codec.MediaCodecAnalyse r0 = r3.mediaCodec     // Catch:{ Exception -> 0x000f, Error -> 0x000d }
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = r0.dequeueInputBuffer(r1)     // Catch:{ Exception -> 0x000f, Error -> 0x000d }
            monitor-exit(r3)
            return r0
        L_0x000b:
            r0 = move-exception
            goto L_0x003c
        L_0x000d:
            r0 = move-exception
            goto L_0x0010
        L_0x000f:
            r0 = move-exception
        L_0x0010:
            java.lang.String r1 = r3.TAG     // Catch:{ all -> 0x000b }
            java.lang.String r2 = "dequeueInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x000b }
            boolean r1 = r3.isLollipop()     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x003b
            boolean r1 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x003b
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000b }
            r3.tryLogMediaCodecError(r1)     // Catch:{ all -> 0x000b }
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000b }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x003b
            r0 = 20
            r3.waitTime(r0)     // Catch:{ all -> 0x000b }
            int r0 = r3.dequeueInputBuffer()     // Catch:{ all -> 0x000b }
            monitor-exit(r3)
            return r0
        L_0x003b:
            throw r0     // Catch:{ all -> 0x000b }
        L_0x003c:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecWrapper.dequeueInputBuffer():int");
    }

    public synchronized int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo) {
        try {
        } catch (Exception e) {
            Logger.m144644e(this.TAG, "dequeueOutputBuffer", (Throwable) e);
            if (isLollipop() && (e instanceof MediaCodec.CodecException)) {
                tryLogMediaCodecError((MediaCodec.CodecException) e);
                if (((MediaCodec.CodecException) e).isTransient()) {
                    waitTime(20);
                    return dequeueOutputBuffer(bufferInfo);
                }
            }
            throw e;
        }
        return this.mediaCodec.dequeueOutputBuffer(bufferInfo, 1000);
    }

    public void flushDecoder() {
        this.mediaCodec.flush();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.nio.ByteBuffer getInputBuffer(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.tencent.tav.codec.MediaCodecAnalyse r0 = r3.mediaCodec     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            java.nio.ByteBuffer r4 = com.tencent.tav.decoder.DecoderUtils.getInputBuffer(r0, r4)     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            monitor-exit(r3)
            return r4
        L_0x0009:
            r4 = move-exception
            goto L_0x003a
        L_0x000b:
            r0 = move-exception
            goto L_0x000e
        L_0x000d:
            r0 = move-exception
        L_0x000e:
            java.lang.String r1 = r3.TAG     // Catch:{ all -> 0x0009 }
            java.lang.String r2 = "getInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0009 }
            boolean r1 = r3.isLollipop()     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0039
            boolean r1 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0039
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x0009 }
            r3.tryLogMediaCodecError(r1)     // Catch:{ all -> 0x0009 }
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0039
            r0 = 20
            r3.waitTime(r0)     // Catch:{ all -> 0x0009 }
            java.nio.ByteBuffer r4 = r3.getInputBuffer(r4)     // Catch:{ all -> 0x0009 }
            monitor-exit(r3)
            return r4
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0009 }
        L_0x003a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecWrapper.getInputBuffer(int):java.nio.ByteBuffer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.nio.ByteBuffer getOnputBuffer(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.tencent.tav.codec.MediaCodecAnalyse r0 = r3.mediaCodec     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            java.nio.ByteBuffer r4 = com.tencent.tav.decoder.DecoderUtils.getOutputBuffer(r0, r4)     // Catch:{ Exception -> 0x000d, Error -> 0x000b }
            monitor-exit(r3)
            return r4
        L_0x0009:
            r4 = move-exception
            goto L_0x003a
        L_0x000b:
            r0 = move-exception
            goto L_0x000e
        L_0x000d:
            r0 = move-exception
        L_0x000e:
            java.lang.String r1 = r3.TAG     // Catch:{ all -> 0x0009 }
            java.lang.String r2 = "getOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0009 }
            boolean r1 = r3.isLollipop()     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0039
            boolean r1 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0039
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x0009 }
            r3.tryLogMediaCodecError(r1)     // Catch:{ all -> 0x0009 }
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0039
            r0 = 20
            r3.waitTime(r0)     // Catch:{ all -> 0x0009 }
            java.nio.ByteBuffer r4 = r3.getOnputBuffer(r4)     // Catch:{ all -> 0x0009 }
            monitor-exit(r3)
            return r4
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0009 }
        L_0x003a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecWrapper.getOnputBuffer(int):java.nio.ByteBuffer");
    }

    public synchronized MediaFormat getOutputFormat() {
        try {
        } catch (Exception e) {
            e.toString();
            return null;
        }
        return this.mediaCodec.getOutputFormat();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void queueInputBuffer(int r8, int r9, int r10, long r11, int r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.tencent.tav.codec.MediaCodecAnalyse r0 = r7.mediaCodec     // Catch:{ Exception -> 0x0011, Error -> 0x000f }
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch:{ Exception -> 0x0011, Error -> 0x000f }
            monitor-exit(r7)
            return
        L_0x000d:
            r8 = move-exception
            goto L_0x003b
        L_0x000f:
            r0 = move-exception
            goto L_0x0012
        L_0x0011:
            r0 = move-exception
        L_0x0012:
            java.lang.String r1 = r7.TAG     // Catch:{ all -> 0x000d }
            java.lang.String r2 = "queueInputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x000d }
            boolean r1 = r7.isLollipop()     // Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x003a
            boolean r1 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x003a
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000d }
            r7.tryLogMediaCodecError(r1)     // Catch:{ all -> 0x000d }
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000d }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x003a
            r1 = 20
            r7.waitTime(r1)     // Catch:{ all -> 0x000d }
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x000d }
        L_0x003a:
            throw r0     // Catch:{ all -> 0x000d }
        L_0x003b:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecWrapper.queueInputBuffer(int, int, int, long, int):void");
    }

    public void release() {
        if (this.mediaCodec != null) {
            new Thread() {
                public void run() {
                    try {
                        MediaCodecWrapper.this.videoDecoder.releaseOutputBuffer();
                        MediaCodecWrapper.this.mediaCodec.stop();
                    } catch (Exception e) {
                        Logger.m144644e(MediaCodecWrapper.this.TAG, "mediaCodec.stop", (Throwable) e);
                    }
                    try {
                        MediaCodecWrapper.this.mediaCodec.release();
                    } catch (Exception e2) {
                        Logger.m144644e(MediaCodecWrapper.this.TAG, "mediaCodec.release", (Throwable) e2);
                    } catch (Throwable th) {
                        MediaCodecAnalyse unused = MediaCodecWrapper.this.mediaCodec = null;
                        throw th;
                    }
                    MediaCodecAnalyse unused2 = MediaCodecWrapper.this.mediaCodec = null;
                    MediaCodecAnalyse unused3 = MediaCodecWrapper.this.mediaCodec = null;
                }
            }.start();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.media.MediaCodec$CodecException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void releaseOutputBuffer(int r4, boolean r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.tencent.tav.codec.MediaCodecAnalyse r0 = r3.mediaCodec     // Catch:{ Exception -> 0x0013, Error -> 0x0011 }
            r0.releaseOutputBuffer(r4, r5)     // Catch:{ Exception -> 0x0013, Error -> 0x0011 }
            if (r5 == 0) goto L_0x000d
            com.tencent.tav.decoder.VideoDecoder r0 = r3.videoDecoder     // Catch:{ Exception -> 0x0013, Error -> 0x0011 }
            r1 = 1
            r0.lastFrameValid = r1     // Catch:{ Exception -> 0x0013, Error -> 0x0011 }
        L_0x000d:
            monitor-exit(r3)
            return
        L_0x000f:
            r4 = move-exception
            goto L_0x003d
        L_0x0011:
            r0 = move-exception
            goto L_0x0014
        L_0x0013:
            r0 = move-exception
        L_0x0014:
            java.lang.String r1 = r3.TAG     // Catch:{ all -> 0x000f }
            java.lang.String r2 = "releaseOutputBuffer"
            com.tencent.tav.decoder.logger.Logger.m144644e((java.lang.String) r1, (java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x000f }
            boolean r1 = r3.isLollipop()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x003c
            boolean r1 = r0 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x003c
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000f }
            r3.tryLogMediaCodecError(r1)     // Catch:{ all -> 0x000f }
            r1 = r0
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1     // Catch:{ all -> 0x000f }
            boolean r1 = r1.isTransient()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x003c
            r1 = 20
            r3.waitTime(r1)     // Catch:{ all -> 0x000f }
            r3.releaseOutputBuffer(r4, r5)     // Catch:{ all -> 0x000f }
        L_0x003c:
            throw r0     // Catch:{ all -> 0x000f }
        L_0x003d:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecWrapper.releaseOutputBuffer(int, boolean):void");
    }

    public synchronized void reset(Surface surface, MediaFormat mediaFormat) {
        if (!this.videoDecoder.isReleased) {
            Logger.m144641d(this.TAG, "reset");
            try {
                resetMediaCodec(mediaFormat);
                decoderConfigure(mediaFormat, surface);
                startDecoder(surface, mediaFormat);
            } catch (Exception e) {
                Logger.m144644e(this.TAG, "reset", (Throwable) e);
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void startDecoder(Surface surface, MediaFormat mediaFormat) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.mediaCodec.start();
            String str = this.TAG;
            Logger.m144646i(str, "startDecoder cost:" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Logger.m144644e(this.TAG, "startDecoder: start", (Throwable) e);
            if (isLollipop() && (e instanceof MediaCodec.CodecException)) {
                tryLogMediaCodecError((MediaCodec.CodecException) e);
                if (((MediaCodec.CodecException) e).isTransient()) {
                    waitTime(20);
                    startDecoder(surface, mediaFormat);
                    return;
                } else if (((MediaCodec.CodecException) e).isRecoverable()) {
                    reset(surface, mediaFormat);
                    return;
                }
            }
            this.videoDecoder.release(false);
            throw e;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void waitTime(long r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.tav.decoder.VideoDecoder r0 = r1.videoDecoder     // Catch:{ InterruptedException -> 0x000a, all -> 0x0007 }
            r0.wait(r2)     // Catch:{ InterruptedException -> 0x000a, all -> 0x0007 }
            goto L_0x000a
        L_0x0007:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000a:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.MediaCodecWrapper.waitTime(long):void");
    }
}
