package com.tencent.liteav.commonaudio.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class AacMediaCodecWrapper {

    /* renamed from: a */
    public MediaFormat f46331a;

    /* renamed from: b */
    public int f46332b = 0;

    /* renamed from: c */
    private final String f46333c;

    /* renamed from: d */
    private final int f46334d;

    /* renamed from: e */
    private MediaCodec f46335e;

    /* renamed from: f */
    private final MediaCodec.BufferInfo f46336f;

    /* renamed from: com.tencent.liteav.commonaudio.codec.AacMediaCodecWrapper$a */
    public enum C17161a {
        ;
        

        /* renamed from: a */
        public static final int f46337a = 1;

        /* renamed from: b */
        public static final int f46338b = 2;

        /* access modifiers changed from: public */
        static {
            f46339c = new int[]{1, 2};
        }
    }

    public AacMediaCodecWrapper(int i) {
        this.f46334d = i;
        this.f46333c = i == C17161a.f46337a ? "HardwareAacEncoder" : "HardwareAacDecoder";
        this.f46336f = new MediaCodec.BufferInfo();
    }

    /* renamed from: b */
    private ByteBuffer m16991b() {
        try {
            int dequeueOutputBuffer = this.f46335e.dequeueOutputBuffer(this.f46336f, TimeUnit.MILLISECONDS.toMicros(5));
            if (dequeueOutputBuffer == -1) {
                return null;
            }
            if (dequeueOutputBuffer == -3) {
                Log.m97547i(this.f46333c, "codec output buffers changed.", new Object[0]);
                return null;
            } else if (dequeueOutputBuffer == -2) {
                this.f46331a = this.f46335e.getOutputFormat();
                String str = this.f46333c;
                Log.m97547i(str, "codec output format changed: " + this.f46331a, new Object[0]);
                return null;
            } else if (dequeueOutputBuffer < 0) {
                Log.m97546e(this.f46333c, "unexpected result from dequeueOutputBuffer: ".concat(String.valueOf(dequeueOutputBuffer)), new Object[0]);
                return null;
            } else {
                ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f46335e.getOutputBuffer(dequeueOutputBuffer) : this.f46335e.getOutputBuffers()[dequeueOutputBuffer];
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f46336f.size);
                allocateDirect.put(outputBuffer);
                this.f46335e.releaseOutputBuffer(dequeueOutputBuffer, false);
                int i = this.f46332b;
                if (i > 0) {
                    this.f46332b = i - 1;
                }
                return allocateDirect;
            }
        } catch (Exception e) {
            Log.m97546e(this.f46333c, "dequeueOutputBuffer failed. ".concat(String.valueOf(e)), new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo19433a(MediaFormat mediaFormat) {
        if (this.f46335e == null && mediaFormat != null) {
            try {
                boolean z = this.f46334d == C17161a.f46337a;
                if (z) {
                    this.f46335e = MediaCodec.createEncoderByType("audio/mp4a-latm");
                } else {
                    this.f46335e = MediaCodec.createDecoderByType("audio/mp4a-latm");
                }
                this.f46335e.configure(mediaFormat, (Surface) null, (MediaCrypto) null, z ? 1 : 0);
                this.f46335e.start();
                return true;
            } catch (IOException e) {
                Log.m97546e(this.f46333c, "create codec failed. ".concat(String.valueOf(e)), new Object[0]);
                mo19432a();
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.ByteBuffer processFrame(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            android.media.MediaCodec r0 = r13.f46335e
            r1 = 0
            if (r0 == 0) goto L_0x0066
            if (r14 != 0) goto L_0x0008
            goto L_0x0066
        L_0x0008:
            r2 = 0
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch:{ Exception -> 0x0047 }
            if (r0 == 0) goto L_0x003d
            int r3 = r0.length     // Catch:{ Exception -> 0x0047 }
            if (r3 > 0) goto L_0x0013
            goto L_0x003d
        L_0x0013:
            android.media.MediaCodec r3 = r13.f46335e     // Catch:{ Exception -> 0x0047 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0047 }
            r5 = 5
            long r4 = r4.toMicros(r5)     // Catch:{ Exception -> 0x0047 }
            int r7 = r3.dequeueInputBuffer(r4)     // Catch:{ Exception -> 0x0047 }
            if (r7 >= 0) goto L_0x0024
            goto L_0x0059
        L_0x0024:
            int r9 = r14.remaining()     // Catch:{ Exception -> 0x0047 }
            r0 = r0[r7]     // Catch:{ Exception -> 0x0047 }
            r0.put(r14)     // Catch:{ Exception -> 0x0047 }
            android.media.MediaCodec r6 = r13.f46335e     // Catch:{ Exception -> 0x0047 }
            r8 = 0
            r10 = 0
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ Exception -> 0x0047 }
            int r14 = r13.f46332b     // Catch:{ Exception -> 0x0047 }
            int r14 = r14 + 1
            r13.f46332b = r14     // Catch:{ Exception -> 0x0047 }
            goto L_0x0059
        L_0x003d:
            java.lang.String r14 = r13.f46333c     // Catch:{ Exception -> 0x0047 }
            java.lang.String r0 = "get invalid input buffers."
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0047 }
            com.tencent.liteav.base.Log.m97546e(r14, r0, r3)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0059
        L_0x0047:
            r14 = move-exception
            java.lang.String r0 = r13.f46333c
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r3 = "feedData failed. "
            java.lang.String r14 = r3.concat(r14)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.liteav.base.Log.m97546e(r0, r14, r3)
        L_0x0059:
            r14 = 3
            if (r2 >= r14) goto L_0x0066
            java.nio.ByteBuffer r14 = r13.m16991b()
            if (r14 == 0) goto L_0x0063
            return r14
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.commonaudio.codec.AacMediaCodecWrapper.processFrame(java.nio.ByteBuffer):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public final void mo19432a() {
        MediaCodec mediaCodec = this.f46335e;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e) {
                Log.m97546e(this.f46333c, "codec stop failed.".concat(String.valueOf(e)), new Object[0]);
            }
            try {
                this.f46335e.release();
            } catch (Exception e2) {
                Log.m97546e(this.f46333c, "codec release failed.".concat(String.valueOf(e2)), new Object[0]);
            }
            this.f46335e = null;
            this.f46332b = 0;
        }
    }
}
