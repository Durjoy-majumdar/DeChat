package m80;

import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: m80.g */
public final class C109538g extends C109536e {

    /* renamed from: v */
    public boolean f327890v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109538g(C109993a aVar, String str, long j, long j2, C32227p<? super byte[], ? super Long, C13598b0> pVar, C32224a<C13598b0> aVar2) {
        super(aVar, str, j, j2, pVar, aVar2);
        C87412m.m108594g(aVar, "mediaExtractorWrapper");
        C87412m.m108594g(str, "audioId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f3, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.MediaCodecAACDecoder", r1, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158417d() {
        /*
            r13 = this;
            com.tencent.mm.compatible.deviceinfo.a r0 = r13.f327853h
            if (r0 == 0) goto L_0x0007
            r0.mo148222y()
        L_0x0007:
            boolean r0 = r13.f327890v
            if (r0 != 0) goto L_0x00fe
            boolean r0 = r13.f327855j
            if (r0 != 0) goto L_0x00fe
            r0 = 0
            java.lang.Object r1 = r13.f327858m     // Catch:{ Exception -> 0x00f2 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00f2 }
            boolean r2 = r13.f327855j     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r3 = "readNextSample decoder stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x00ef }
        L_0x001e:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ef }
            monitor-exit(r1)     // Catch:{ Exception -> 0x00f2 }
            com.tencent.mm.compatible.deviceinfo.a r3 = r13.f327853h     // Catch:{ Exception -> 0x00f2 }
            if (r3 == 0) goto L_0x0007
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00f2 }
            r13.f327859n = r1     // Catch:{ Exception -> 0x00f2 }
            r1 = 100
            int r4 = r3.mo148204f(r1)     // Catch:{ Exception -> 0x00f2 }
            if (r4 >= 0) goto L_0x0036
            r13.mo160762f()     // Catch:{ Exception -> 0x00f2 }
        L_0x0036:
            if (r4 >= 0) goto L_0x0039
            goto L_0x0007
        L_0x0039:
            java.lang.String r1 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f2 }
            r2.<init>()     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r5 = "inputIndex: "
            r2.append(r5)     // Catch:{ Exception -> 0x00f2 }
            r2.append(r4)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00f2 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00f2 }
            r13.f327859n = r1     // Catch:{ Exception -> 0x00f2 }
            java.nio.ByteBuffer[] r1 = r3.mo148208j()     // Catch:{ Exception -> 0x00f2 }
            r1 = r1[r4]     // Catch:{ Exception -> 0x00f2 }
            if (r1 == 0) goto L_0x0060
            r1.clear()     // Catch:{ Exception -> 0x00f2 }
        L_0x0060:
            o80.a r2 = r13.f327846a     // Catch:{ Exception -> 0x00f2 }
            r5 = 0
            if (r2 == 0) goto L_0x0073
            java.lang.String r6 = "inputBuffer"
            gy3.C87412m.m108593f(r1, r6)     // Catch:{ Exception -> 0x00f2 }
            r6 = 2
            boolean r2 = o80.C109993a.m149513d(r2, r1, r0, r6, r5)     // Catch:{ Exception -> 0x00f2 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x00f2 }
        L_0x0073:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00f2 }
            boolean r2 = gy3.C87412m.m108589b(r5, r2)     // Catch:{ Exception -> 0x00f2 }
            r5 = 1
            if (r2 == 0) goto L_0x0085
            java.lang.String r2 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r6 = "read sample end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)     // Catch:{ Exception -> 0x00f2 }
            r2 = 1
            goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            r6 = 0
            if (r2 != 0) goto L_0x00d9
            o80.a r6 = r13.f327846a     // Catch:{ Exception -> 0x00f2 }
            if (r6 == 0) goto L_0x0091
            int r6 = r6.f329162i     // Catch:{ Exception -> 0x00f2 }
            goto L_0x0092
        L_0x0091:
            r6 = 0
        L_0x0092:
            if (r1 == 0) goto L_0x0097
            r1.position(r0)     // Catch:{ Exception -> 0x00f2 }
        L_0x0097:
            o80.a r1 = r13.f327846a     // Catch:{ Exception -> 0x00f2 }
            if (r1 == 0) goto L_0x00a0
            long r7 = r1.mo161325b()     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00a2
        L_0x00a0:
            r7 = -1
        L_0x00a2:
            java.lang.String r1 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f2 }
            r9.<init>()     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r10 = "sampleTime : "
            r9.append(r10)     // Catch:{ Exception -> 0x00f2 }
            r9.append(r7)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r10 = ", sampleSize:"
            r9.append(r10)     // Catch:{ Exception -> 0x00f2 }
            r9.append(r6)     // Catch:{ Exception -> 0x00f2 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)     // Catch:{ Exception -> 0x00f2 }
            if (r6 < 0) goto L_0x00d0
            long r9 = r13.f327849d     // Catch:{ Exception -> 0x00f2 }
            r1 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r1     // Catch:{ Exception -> 0x00f2 }
            long r9 = r9 * r11
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r5 = r2
            goto L_0x00d7
        L_0x00d0:
            java.lang.String r1 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r2 = "sawInputEOS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00f2 }
        L_0x00d7:
            r2 = r5
            goto L_0x00db
        L_0x00d9:
            r7 = r6
            r6 = 0
        L_0x00db:
            r5 = 0
            if (r2 == 0) goto L_0x00e1
            r1 = 4
            r9 = 4
            goto L_0x00e2
        L_0x00e1:
            r9 = 0
        L_0x00e2:
            r3.mo148213o(r4, r5, r6, r7, r9)     // Catch:{ Exception -> 0x00f2 }
            if (r2 == 0) goto L_0x00ea
            r13.mo158418e()     // Catch:{ Exception -> 0x00f2 }
        L_0x00ea:
            r13.mo160762f()     // Catch:{ Exception -> 0x00f2 }
            goto L_0x0007
        L_0x00ef:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x00f2 }
            throw r2     // Catch:{ Exception -> 0x00f2 }
        L_0x00f2:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
            goto L_0x0007
        L_0x00fe:
            r13.mo158418e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m80.C109538g.mo158417d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        r0 = r1.f327853h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        r4 = new android.media.MediaCodec.BufferInfo();
        r1.f327861p = r4;
        r4 = r0.mo148205g(r4, 60000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if (r4 != -2) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r4 = r0.mo148212n();
        r1.f327854i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        if (r4 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        if (r4.containsKey("sample-rate") != true) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r4 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        r4 = r1.f327854i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        if (r4 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        r4 = r4.getInteger("sample-rate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r4 <= 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        r1.f327857l = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACDecoder", "onOutputFormatChanged:" + r1.f327854i + ", aacSampleRate:" + r1.f327857l + ", audioId:" + r1.f327847b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r4 < 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        r7 = r0.mo148211m()[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r7 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.MediaCodecAACDecoder", "ERROR, retrieve decoderOutputBuffer is null!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r8 = r1.f327861p.presentationTimeUs;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACDecoder", "presentationTimeUs : " + r8);
        r12 = (long) 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (r8 >= (r1.f327848c * r12)) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        if ((r1.f327861p.flags & 4) != 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        r0.mo148216r(r4, false);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACDecoder", "decoder pts: " + r8 + ", not reach start: " + (r1.f327848c * r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e8, code lost:
        r10 = r1.f327861p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        if (r10.size <= 0) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        mo160759c(r7, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        r0.mo148216r(r4, false);
        r10 = r1.f327849d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        if ((r10 * r12) == 1) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0102, code lost:
        if (r8 < (r10 * r12)) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0104, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.MediaCodecAACDecoder", "exceed endTimeMs");
        mo158418e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        if ((r1.f327861p.flags & 4) == 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0117, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MediaCodecAACDecoder", "receive EOS!");
        mo158418e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        r4 = r0.mo148205g(r1.f327861p, 60000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        if (r4 >= 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160762f() {
        /*
            r18 = this;
            r1 = r18
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r1.f327858m     // Catch:{ Exception -> 0x012d }
            monitor-enter(r4)     // Catch:{ Exception -> 0x012d }
            boolean r0 = r1.f327855j     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r5 = "drainDecoder, decoder is stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0014 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x012d }
            return
        L_0x0014:
            r0 = move-exception
            goto L_0x012b
        L_0x0017:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0014 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x012d }
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f327853h     // Catch:{ Exception -> 0x012d }
            if (r0 == 0) goto L_0x0139
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x012d }
            r4.<init>()     // Catch:{ Exception -> 0x012d }
            r1.f327861p = r4     // Catch:{ Exception -> 0x012d }
            r5 = 60000(0xea60, double:2.9644E-319)
            int r4 = r0.mo148205g(r4, r5)     // Catch:{ Exception -> 0x012d }
        L_0x002c:
            r7 = -2
            if (r4 != r7) goto L_0x0082
            android.media.MediaFormat r4 = r0.mo148212n()     // Catch:{ Exception -> 0x012d }
            r1.f327854i = r4     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x0041
            java.lang.String r7 = "sample-rate"
            boolean r4 = r4.containsKey(r7)     // Catch:{ Exception -> 0x012d }
            if (r4 != r2) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r4 == 0) goto L_0x0054
            android.media.MediaFormat r4 = r1.f327854i     // Catch:{ Exception -> 0x012d }
            if (r4 == 0) goto L_0x004f
            java.lang.String r7 = "sample-rate"
            int r4 = r4.getInteger(r7)     // Catch:{ Exception -> 0x012d }
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            if (r4 <= 0) goto L_0x0054
            r1.f327857l = r4     // Catch:{ Exception -> 0x012d }
        L_0x0054:
            java.lang.String r4 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r7.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r8 = "onOutputFormatChanged:"
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            android.media.MediaFormat r8 = r1.f327854i     // Catch:{ Exception -> 0x012d }
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            java.lang.String r8 = ", aacSampleRate:"
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            int r8 = r1.f327857l     // Catch:{ Exception -> 0x012d }
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            java.lang.String r8 = ", audioId:"
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            java.lang.String r8 = r1.f327847b     // Catch:{ Exception -> 0x012d }
            r7.append(r8)     // Catch:{ Exception -> 0x012d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x012d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)     // Catch:{ Exception -> 0x012d }
            goto L_0x0122
        L_0x0082:
            if (r4 < 0) goto L_0x0122
            java.nio.ByteBuffer[] r7 = r0.mo148211m()     // Catch:{ Exception -> 0x012d }
            r7 = r7[r4]     // Catch:{ Exception -> 0x012d }
            if (r7 != 0) goto L_0x0095
            java.lang.String r0 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r4 = "ERROR, retrieve decoderOutputBuffer is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ Exception -> 0x012d }
            goto L_0x0139
        L_0x0095:
            android.media.MediaCodec$BufferInfo r8 = r1.f327861p     // Catch:{ Exception -> 0x012d }
            long r8 = r8.presentationTimeUs     // Catch:{ Exception -> 0x012d }
            java.lang.String r10 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r11.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r12 = "presentationTimeUs : "
            r11.append(r12)     // Catch:{ Exception -> 0x012d }
            r11.append(r8)     // Catch:{ Exception -> 0x012d }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x012d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x012d }
            long r10 = r1.f327848c     // Catch:{ Exception -> 0x012d }
            r12 = 1000(0x3e8, float:1.401E-42)
            long r12 = (long) r12     // Catch:{ Exception -> 0x012d }
            long r10 = r10 * r12
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x00e8
            android.media.MediaCodec$BufferInfo r10 = r1.f327861p     // Catch:{ Exception -> 0x012d }
            int r10 = r10.flags     // Catch:{ Exception -> 0x012d }
            r10 = r10 & 4
            if (r10 != 0) goto L_0x00e8
            r0.mo148216r(r4, r3)     // Catch:{ Exception -> 0x012d }
            java.lang.String r0 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r4.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = "decoder pts: "
            r4.append(r5)     // Catch:{ Exception -> 0x012d }
            r4.append(r8)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = ", not reach start: "
            r4.append(r5)     // Catch:{ Exception -> 0x012d }
            long r5 = r1.f327848c     // Catch:{ Exception -> 0x012d }
            long r5 = r5 * r12
            r4.append(r5)     // Catch:{ Exception -> 0x012d }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x012d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x012d }
            goto L_0x0139
        L_0x00e8:
            android.media.MediaCodec$BufferInfo r10 = r1.f327861p     // Catch:{ Exception -> 0x012d }
            int r11 = r10.size     // Catch:{ Exception -> 0x012d }
            if (r11 <= 0) goto L_0x00f1
            r1.mo160759c(r7, r10)     // Catch:{ Exception -> 0x012d }
        L_0x00f1:
            r0.mo148216r(r4, r3)     // Catch:{ Exception -> 0x012d }
            long r10 = r1.f327849d     // Catch:{ Exception -> 0x012d }
            long r14 = r10 * r12
            r16 = 1
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x010f
            long r10 = r10 * r12
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x010f
            java.lang.String r0 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r4 = "exceed endTimeMs"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ Exception -> 0x012d }
            r18.mo158418e()     // Catch:{ Exception -> 0x012d }
            goto L_0x0139
        L_0x010f:
            android.media.MediaCodec$BufferInfo r4 = r1.f327861p     // Catch:{ Exception -> 0x012d }
            int r4 = r4.flags     // Catch:{ Exception -> 0x012d }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0122
            java.lang.String r0 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r4 = "receive EOS!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ Exception -> 0x012d }
            r18.mo158418e()     // Catch:{ Exception -> 0x012d }
            goto L_0x0139
        L_0x0122:
            android.media.MediaCodec$BufferInfo r4 = r1.f327861p     // Catch:{ Exception -> 0x012d }
            int r4 = r0.mo148205g(r4, r5)     // Catch:{ Exception -> 0x012d }
            if (r4 >= 0) goto L_0x002c
            goto L_0x0139
        L_0x012b:
            monitor-exit(r4)     // Catch:{ Exception -> 0x012d }
            throw r0     // Catch:{ Exception -> 0x012d }
        L_0x012d:
            r0 = move-exception
            r1.f327890v = r2
            java.lang.String r2 = "MicroMsg.MediaCodecAACDecoder"
            java.lang.String r4 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m80.C109538g.mo160762f():void");
    }
}
