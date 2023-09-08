package n80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import java.nio.ByteBuffer;
import rx3.C13598b0;

/* renamed from: n80.c */
public final class C109698c extends C109696a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109698c(MediaFormat mediaFormat, C32228q<? super ByteBuffer, ? super MediaCodec.BufferInfo, ? super MediaFormat, C13598b0> qVar, C32224a<C13598b0> aVar) {
        super(mediaFormat, qVar, aVar);
        C87412m.m108594g(mediaFormat, "mediaFormat");
        C87412m.m108594g(qVar, "frameEncodeCallback");
        C87412m.m108594g(aVar, "frameEncodeEndCallback");
        this.f328338c.mo148222y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r11.f328341f = com.tencent.p014mm.sdk.platformtools.Util.currentTicks();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACEncoder", "sendDataToEncoder, pcmData size:" + r12.length + ", pts:" + r13 + ", isLast:" + r15);
        r5 = r11.f328338c.mo148204f(100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r5 >= 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.MediaCodecAACEncoder", "encoder no input buffer available, drain first");
        mo160923d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r5 < 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r1 = r11.f328338c.mo148208j()[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r1 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r1 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r1.position(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r1 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r1.put(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r15 == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACEncoder", "last, send EOS and try delay stop encoder");
        r15 = true;
        mo160915b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r15 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACEncoder", "EOS received in sendAudioToEncoder");
        r11.f328338c.mo148213o(r5, 0, r12.length, r13, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r11.f328338c.mo148213o(r5, 0, r12.length, r13, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        mo160923d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", r12, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo160916c(byte[] r12, long r13, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 0
            java.lang.Object r1 = r11.f328343h     // Catch:{ Exception -> 0x00a6 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00a6 }
            boolean r2 = r11.f328340e     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r12 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r13 = "sendDataToEncoder end now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00b0
        L_0x0017:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a3 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x00a6 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00a6 }
            r11.f328341f = r1     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r1 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a6 }
            r2.<init>()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = "sendDataToEncoder, pcmData size:"
            r2.append(r3)     // Catch:{ Exception -> 0x00a6 }
            int r3 = r12.length     // Catch:{ Exception -> 0x00a6 }
            r2.append(r3)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = ", pts:"
            r2.append(r3)     // Catch:{ Exception -> 0x00a6 }
            r2.append(r13)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r3 = ", isLast:"
            r2.append(r3)     // Catch:{ Exception -> 0x00a6 }
            r2.append(r15)     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00a6 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r11.f328338c     // Catch:{ Exception -> 0x00a6 }
            r2 = 100
            int r5 = r1.mo148204f(r2)     // Catch:{ Exception -> 0x00a6 }
            if (r5 >= 0) goto L_0x005b
            java.lang.String r1 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r2 = "encoder no input buffer available, drain first"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ Exception -> 0x00a6 }
            r11.mo160923d()     // Catch:{ Exception -> 0x00a6 }
        L_0x005b:
            if (r5 < 0) goto L_0x009f
            com.tencent.mm.compatible.deviceinfo.a r1 = r11.f328338c     // Catch:{ Exception -> 0x00a6 }
            java.nio.ByteBuffer[] r1 = r1.mo148208j()     // Catch:{ Exception -> 0x00a6 }
            r1 = r1[r5]     // Catch:{ Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x006a
            r1.clear()     // Catch:{ Exception -> 0x00a6 }
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.position(r0)     // Catch:{ Exception -> 0x00a6 }
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.put(r12)     // Catch:{ Exception -> 0x00a6 }
        L_0x0074:
            if (r15 == 0) goto L_0x0082
            java.lang.String r15 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r1 = "last, send EOS and try delay stop encoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)     // Catch:{ Exception -> 0x00a6 }
            r15 = 1
            r11.mo160915b()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0083
        L_0x0082:
            r15 = 0
        L_0x0083:
            if (r15 == 0) goto L_0x0096
            java.lang.String r15 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r1 = "EOS received in sendAudioToEncoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)     // Catch:{ Exception -> 0x00a6 }
            com.tencent.mm.compatible.deviceinfo.a r4 = r11.f328338c     // Catch:{ Exception -> 0x00a6 }
            r6 = 0
            int r7 = r12.length     // Catch:{ Exception -> 0x00a6 }
            r10 = 4
            r8 = r13
            r4.mo148213o(r5, r6, r7, r8, r10)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x009f
        L_0x0096:
            com.tencent.mm.compatible.deviceinfo.a r4 = r11.f328338c     // Catch:{ Exception -> 0x00a6 }
            r6 = 0
            int r7 = r12.length     // Catch:{ Exception -> 0x00a6 }
            r10 = 0
            r8 = r13
            r4.mo148213o(r5, r6, r7, r8, r10)     // Catch:{ Exception -> 0x00a6 }
        L_0x009f:
            r11.mo160923d()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00b0
        L_0x00a3:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x00a6 }
            throw r12     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            r12 = move-exception
            java.lang.String r13 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r14 = ""
            java.lang.Object[] r15 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r12, r14, r15)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n80.C109698c.mo160916c(byte[], long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
        r2 = new android.media.MediaCodec.BufferInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        r3 = r8.f328338c.mo148205g(r2, 100);
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.MediaCodecAACEncoder", "encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r3 != -1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.MediaCodecAACEncoder", "no output available, break");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r3 != -2) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r3 = r8.f328338c.mo148212n();
        gy3.C87412m.m108593f(r3, "encoder.outputFormat");
        r8.f328339d = r3;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.MediaCodecAACEncoder", "dstMediaFormat change: %s", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r3 >= 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.MediaCodecAACEncoder", "unexpected encoderOutputBufferIndex: %s", java.lang.Integer.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if ((r2.flags & 2) == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105927v("MicroMsg.MediaCodecAACEncoder", "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s", java.lang.Integer.valueOf(r2.size), java.lang.Boolean.TRUE);
        r2.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105926v("MicroMsg.MediaCodecAACEncoder", "perform encoding");
        r4 = r8.f328338c.mo148211m()[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r4 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.MediaCodecAACEncoder", "ERROR, retrieve encoderOutputBuffer is null!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r2.size <= 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        mo160914a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r8.f328338c.mo148216r(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if ((r2.flags & 4) == 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACEncoder", "receive EOS!");
        r8.f328338c.mo148223z();
        r8.f328338c.mo148214p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.MediaCodecAACEncoder", r2, "drainEncoder error: %s", r2.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160923d() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r8.f328343h     // Catch:{ Exception -> 0x00c8 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x00c8 }
            boolean r3 = r8.f328340e     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r4 = "drainEncoder end now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x00c8 }
            return
        L_0x0012:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c5 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x00c8 }
            android.media.MediaCodec$BufferInfo r2 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x00c8 }
            r2.<init>()     // Catch:{ Exception -> 0x00c8 }
        L_0x001a:
            com.tencent.mm.compatible.deviceinfo.a r3 = r8.f328338c     // Catch:{ Exception -> 0x00c8 }
            r4 = 100
            int r3 = r3.mo148205g(r2, r4)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r4 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r5 = "encoderOutputBufferIndex: %s"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00c8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00c8 }
            r6[r1] = r7     // Catch:{ Exception -> 0x00c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r6)     // Catch:{ Exception -> 0x00c8 }
            r4 = -1
            if (r3 != r4) goto L_0x003d
            java.lang.String r2 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r3 = "no output available, break"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d8
        L_0x003d:
            r4 = -2
            if (r3 != r4) goto L_0x0059
            com.tencent.mm.compatible.deviceinfo.a r3 = r8.f328338c     // Catch:{ Exception -> 0x00c8 }
            android.media.MediaFormat r3 = r3.mo148212n()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r4 = "encoder.outputFormat"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x00c8 }
            r8.f328339d = r3     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r4 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r5 = "dstMediaFormat change: %s"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00c8 }
            r6[r1] = r3     // Catch:{ Exception -> 0x00c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x001a
        L_0x0059:
            if (r3 >= 0) goto L_0x006b
            java.lang.String r4 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r5 = "unexpected encoderOutputBufferIndex: %s"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00c8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00c8 }
            r6[r1] = r3     // Catch:{ Exception -> 0x00c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x001a
        L_0x006b:
            int r4 = r2.flags     // Catch:{ Exception -> 0x00c8 }
            r5 = 2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0088
            java.lang.String r4 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r6 = "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00c8 }
            int r7 = r2.size     // Catch:{ Exception -> 0x00c8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00c8 }
            r5[r1] = r7     // Catch:{ Exception -> 0x00c8 }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00c8 }
            r5[r0] = r7     // Catch:{ Exception -> 0x00c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r6, r5)     // Catch:{ Exception -> 0x00c8 }
            r2.size = r1     // Catch:{ Exception -> 0x00c8 }
        L_0x0088:
            java.lang.String r4 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r5 = "perform encoding"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r5)     // Catch:{ Exception -> 0x00c8 }
            com.tencent.mm.compatible.deviceinfo.a r4 = r8.f328338c     // Catch:{ Exception -> 0x00c8 }
            java.nio.ByteBuffer[] r4 = r4.mo148211m()     // Catch:{ Exception -> 0x00c8 }
            r4 = r4[r3]     // Catch:{ Exception -> 0x00c8 }
            if (r4 != 0) goto L_0x00a1
            java.lang.String r2 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r3 = "ERROR, retrieve encoderOutputBuffer is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d8
        L_0x00a1:
            int r5 = r2.size     // Catch:{ Exception -> 0x00c8 }
            if (r5 <= 0) goto L_0x00a8
            r8.mo160914a(r4, r2)     // Catch:{ Exception -> 0x00c8 }
        L_0x00a8:
            com.tencent.mm.compatible.deviceinfo.a r4 = r8.f328338c     // Catch:{ Exception -> 0x00c8 }
            r4.mo148216r(r3, r1)     // Catch:{ Exception -> 0x00c8 }
            int r3 = r2.flags     // Catch:{ Exception -> 0x00c8 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x001a
            java.lang.String r2 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r3 = "receive EOS!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x00c8 }
            com.tencent.mm.compatible.deviceinfo.a r2 = r8.f328338c     // Catch:{ Exception -> 0x00c8 }
            r2.mo148223z()     // Catch:{ Exception -> 0x00c8 }
            com.tencent.mm.compatible.deviceinfo.a r2 = r8.f328338c     // Catch:{ Exception -> 0x00c8 }
            r2.mo148214p()     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d8
        L_0x00c5:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x00c8 }
            throw r3     // Catch:{ Exception -> 0x00c8 }
        L_0x00c8:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.MediaCodecAACEncoder"
            java.lang.String r4 = "drainEncoder error: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = r2.getMessage()
            r0[r1] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r0)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n80.C109698c.mo160923d():void");
    }
}
