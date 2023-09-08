package org.libpag;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.libpag.SynchronizeHandler;

public class GPUDecoder {
    private static final int DECODER_THREAD_MAX_COUNT = 10;
    private static final int END_OF_STREAM = -3;
    private static final int ERROR = -2;
    private static final int INIT_DECODER_TIMEOUT_MS = 2000;
    private static final int SUCCESS = 0;
    private static final int TIMEOUT_US = 1000;
    private static final int TRY_AGAIN_LATER = -1;
    /* access modifiers changed from: private */
    public static final AtomicInteger decoderThreadCount = new AtomicInteger();
    private MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
    /* access modifiers changed from: private */
    public MediaCodec decoder;
    private boolean disableFlush = true;
    private int lastOutputBufferIndex = -1;
    private boolean released = false;
    /* access modifiers changed from: private */
    public VideoSurface videoSurface = null;

    private static GPUDecoder Create(final VideoSurface videoSurface2, final MediaFormat mediaFormat) {
        if (videoSurface2 != null) {
            AtomicInteger atomicInteger = decoderThreadCount;
            if (atomicInteger.get() < 10) {
                videoSurface2.retain();
                atomicInteger.getAndIncrement();
                HandlerThread handlerThread = new HandlerThread("libpag_GPUDecoder_init_decoder");
                handlerThread.start();
                final MediaCodec[] mediaCodecArr = {null};
                boolean runSync = new SynchronizeHandler(handlerThread.getLooper()).runSync(new SynchronizeHandler.TimeoutRunnable() {
                    private MediaCodec decoder;
                    private long startTime;

                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void afterRun(boolean r5) {
                        /*
                            r4 = this;
                            if (r5 == 0) goto L_0x003a
                            android.media.MediaCodec r0 = r4.decoder
                            if (r0 == 0) goto L_0x003a
                            long r0 = android.os.SystemClock.uptimeMillis()
                            long r2 = r4.startTime
                            long r0 = r0 - r2
                            android.media.MediaCodec r2 = r4.decoder     // Catch:{ Exception -> 0x0012 }
                            r2.stop()     // Catch:{ Exception -> 0x0012 }
                        L_0x0012:
                            android.media.MediaCodec r2 = r4.decoder     // Catch:{ Exception -> 0x0017 }
                            r2.release()     // Catch:{ Exception -> 0x0017 }
                        L_0x0017:
                            r2 = 0
                            r4.decoder = r2
                            org.libpag.VideoSurface r2 = r8
                            r2.release()
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "init decoder timeout. cost: "
                            r2.append(r3)
                            r2.append(r0)
                            java.lang.String r0 = "ms"
                            r2.append(r0)
                            java.lang.String r0 = r2.toString()
                            java.lang.RuntimeException r1 = new java.lang.RuntimeException
                            r1.<init>(r0)
                        L_0x003a:
                            if (r5 != 0) goto L_0x0043
                            android.media.MediaCodec[] r5 = r3
                            r0 = 0
                            android.media.MediaCodec r1 = r4.decoder
                            r5[r0] = r1
                        L_0x0043:
                            java.util.concurrent.atomic.AtomicInteger r5 = org.libpag.GPUDecoder.decoderThreadCount
                            r5.getAndDecrement()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: org.libpag.GPUDecoder.C218061.afterRun(boolean):void");
                    }

                    public void run() {
                        this.startTime = SystemClock.uptimeMillis();
                        try {
                            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
                            this.decoder = createDecoderByType;
                            createDecoderByType.configure(mediaFormat, videoSurface2.getOutputSurface(), (MediaCrypto) null, 0);
                            this.decoder.start();
                        } catch (Exception unused) {
                            MediaCodec mediaCodec = this.decoder;
                            if (mediaCodec != null) {
                                mediaCodec.release();
                                this.decoder = null;
                                videoSurface2.release();
                            }
                        }
                    }
                }, 2000);
                handlerThread.quitSafely();
                if (runSync) {
                    GPUDecoder gPUDecoder = new GPUDecoder();
                    gPUDecoder.videoSurface = videoSurface2;
                    gPUDecoder.decoder = mediaCodecArr[0];
                    return gPUDecoder;
                }
            }
        }
        return null;
    }

    private static boolean ForceSoftwareDecoder() {
        return false;
    }

    private int dequeueInputBuffer() {
        try {
            return this.decoder.dequeueInputBuffer(1000);
        } catch (Error | Exception unused) {
            return -1;
        }
    }

    private int dequeueOutputBuffer() {
        try {
            return this.decoder.dequeueOutputBuffer(this.bufferInfo, 1000);
        } catch (Exception unused) {
            return -1;
        }
    }

    private ByteBuffer getInputBuffer(int i) {
        try {
            return this.decoder.getInputBuffer(i);
        } catch (Error | Exception unused) {
            return null;
        }
    }

    private int onDecodeFrame() {
        releaseOutputBuffer();
        try {
            int dequeueOutputBuffer = dequeueOutputBuffer();
            if ((this.bufferInfo.flags & 4) == 0) {
                if (dequeueOutputBuffer >= 0) {
                    this.lastOutputBufferIndex = dequeueOutputBuffer;
                }
                return this.lastOutputBufferIndex != -1 ? 0 : -1;
            } else if (dequeueOutputBuffer < 0) {
                return -3;
            } else {
                this.lastOutputBufferIndex = dequeueOutputBuffer;
                return -3;
            }
        } catch (Exception unused) {
            return -2;
        }
    }

    private int onEndOfStream() {
        int dequeueInputBuffer = dequeueInputBuffer();
        if (dequeueInputBuffer >= 0) {
            return queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
        }
        return -1;
    }

    private void onFlush() {
        if (!this.disableFlush) {
            try {
                this.decoder.flush();
                this.bufferInfo = new MediaCodec.BufferInfo();
                this.lastOutputBufferIndex = -1;
            } catch (Exception unused) {
            }
        }
    }

    private void onRelease() {
        if (!this.released) {
            this.released = true;
            releaseOutputBuffer();
            releaseDecoder();
        }
    }

    private boolean onRenderFrame() {
        int i = this.lastOutputBufferIndex;
        if (i == -1) {
            return false;
        }
        int releaseOutputBuffer = releaseOutputBuffer(i, true);
        this.lastOutputBufferIndex = -1;
        return releaseOutputBuffer == 0;
    }

    private int onSendBytes(ByteBuffer byteBuffer, long j) {
        int dequeueInputBuffer = dequeueInputBuffer();
        if (dequeueInputBuffer < 0) {
            return -1;
        }
        ByteBuffer inputBuffer = getInputBuffer(dequeueInputBuffer);
        if (inputBuffer == null) {
            return -2;
        }
        inputBuffer.clear();
        byteBuffer.position(0);
        inputBuffer.put(byteBuffer);
        return queueInputBuffer(dequeueInputBuffer, 0, byteBuffer.limit(), j, 0);
    }

    private long presentationTime() {
        return this.bufferInfo.presentationTimeUs;
    }

    private int queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.decoder.queueInputBuffer(i, i2, i3, j, i4);
            this.disableFlush = false;
            return 0;
        } catch (Error | Exception unused) {
            return -2;
        }
    }

    private void releaseAsync(final Runnable runnable) {
        if (runnable != null) {
            decoderThreadCount.getAndIncrement();
            final HandlerThread handlerThread = new HandlerThread("libpag_GPUDecoder_release_decoder");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new Runnable() {
                public void run() {
                    runnable.run();
                    GPUDecoder.decoderThreadCount.getAndDecrement();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            handlerThread.quitSafely();
                        }
                    });
                }
            });
        }
    }

    private void releaseDecoder() {
        if (this.decoder != null) {
            releaseAsync(new Runnable() {
                /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0009 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r2 = this;
                        org.libpag.GPUDecoder r0 = org.libpag.GPUDecoder.this     // Catch:{ Exception -> 0x0009 }
                        android.media.MediaCodec r0 = r0.decoder     // Catch:{ Exception -> 0x0009 }
                        r0.stop()     // Catch:{ Exception -> 0x0009 }
                    L_0x0009:
                        org.libpag.GPUDecoder r0 = org.libpag.GPUDecoder.this     // Catch:{ Exception -> 0x0012 }
                        android.media.MediaCodec r0 = r0.decoder     // Catch:{ Exception -> 0x0012 }
                        r0.release()     // Catch:{ Exception -> 0x0012 }
                    L_0x0012:
                        org.libpag.GPUDecoder r0 = org.libpag.GPUDecoder.this
                        r1 = 0
                        android.media.MediaCodec unused = r0.decoder = r1
                        org.libpag.GPUDecoder r0 = org.libpag.GPUDecoder.this
                        org.libpag.VideoSurface r0 = r0.videoSurface
                        r0.release()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.libpag.GPUDecoder.C218072.run():void");
                }
            });
        }
    }

    private void releaseOutputBuffer() {
        int i = this.lastOutputBufferIndex;
        if (i != -1) {
            releaseOutputBuffer(i, false);
            this.lastOutputBufferIndex = -1;
        }
    }

    private int releaseOutputBuffer(int i, boolean z) {
        try {
            this.decoder.releaseOutputBuffer(i, z);
            return 0;
        } catch (Error | Exception unused) {
            return -2;
        }
    }
}
