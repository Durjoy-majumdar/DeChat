package m80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: m80.f */
public abstract class C109537f {

    /* renamed from: a */
    public long f327867a;

    /* renamed from: b */
    public long f327868b;

    /* renamed from: c */
    public final C109993a f327869c;

    /* renamed from: d */
    public Surface f327870d;

    /* renamed from: e */
    public final String f327871e = "MicroMsg.IMediaCodecTransDecoder";

    /* renamed from: f */
    public C104619a f327872f;

    /* renamed from: g */
    public MediaFormat f327873g;

    /* renamed from: h */
    public C32229r<? super ByteBuffer, ? super Long, ? super MediaCodec.BufferInfo, ? super Boolean, C13598b0> f327874h;

    /* renamed from: i */
    public C32224a<C13598b0> f327875i;

    /* renamed from: j */
    public C32226l<? super MediaFormat, C13598b0> f327876j;

    /* renamed from: k */
    public C32224a<C13598b0> f327877k;

    /* renamed from: l */
    public int f327878l;

    /* renamed from: m */
    public final Semaphore f327879m = new Semaphore(1);

    /* renamed from: n */
    public final Object f327880n = new Object();

    /* renamed from: o */
    public volatile boolean f327881o;

    /* renamed from: p */
    public int f327882p;

    /* renamed from: q */
    public float f327883q;

    /* renamed from: r */
    public C34475b f327884r;

    /* renamed from: s */
    public boolean f327885s;

    /* renamed from: t */
    public long f327886t = -1;

    /* renamed from: u */
    public long f327887u = -1;

    /* renamed from: v */
    public volatile int f327888v;

    /* renamed from: w */
    public ArrayList<Long> f327889w = new ArrayList<>();

    public C109537f(long j, long j2, C109993a aVar, Surface surface, int i, boolean z) {
        this.f327867a = j;
        this.f327868b = j2;
        this.f327869c = aVar;
        this.f327870d = surface;
        Log.m105924i("MicroMsg.IMediaCodecTransDecoder", "create IMediaCodecTransDecoder, startTimeMs:" + this.f327867a + ", endTimeMs:" + this.f327868b);
        if (aVar != null) {
            aVar.mo161330h();
        }
        long j3 = this.f327867a;
        if (j3 >= 0 && aVar != null) {
            aVar.mo161328f(j3 * ((long) 1000));
        }
        this.f327884r = new C34475b(aVar != null ? aVar.f329154a : null, i, this.f327867a * ((long) 1000), z);
        this.f327888v = 0;
    }

    /* renamed from: a */
    public final void mo160760a(long j, long j2, MediaCodec.BufferInfo bufferInfo) {
        if (this.f327889w.contains(Long.valueOf(j))) {
            C32229r<? super ByteBuffer, ? super Long, ? super MediaCodec.BufferInfo, ? super Boolean, C13598b0> rVar = this.f327874h;
            if (rVar != null) {
                C13598b0 I = rVar.mo162I(null, Long.valueOf(j2), bufferInfo, Boolean.TRUE);
                return;
            }
            return;
        }
        this.f327889w.add(Long.valueOf(j));
        C32229r<? super ByteBuffer, ? super Long, ? super MediaCodec.BufferInfo, ? super Boolean, C13598b0> rVar2 = this.f327874h;
        if (rVar2 != null) {
            C13598b0 I2 = rVar2.mo162I(null, Long.valueOf(j2), bufferInfo, Boolean.FALSE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0187, code lost:
        if (r0.f92792e.containsKey(java.lang.Long.valueOf(r4)) != false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ed, code lost:
        if (r7.longValue() != r8) goto L_0x01f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ab A[EDGE_INSN: B:110:0x02ab->B:92:0x02ab ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ad  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160761b(int r13, android.media.MediaCodec.BufferInfo r14) {
        /*
            r12 = this;
            java.lang.String r0 = "bufferInfo"
            gy3.C87412m.m108594g(r14, r0)
            int r0 = r12.f327882p
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 > 0) goto L_0x005b
            android.media.MediaFormat r0 = r12.f327873g
            java.lang.String r4 = "frame-rate"
            if (r0 == 0) goto L_0x001a
            boolean r5 = r0.containsKey(r4)
            if (r5 != 0) goto L_0x001a
            r5 = 1
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            if (r5 == 0) goto L_0x0025
            o80.a r0 = r12.f327869c
            if (r0 == 0) goto L_0x0024
            android.media.MediaFormat r0 = r0.f329158e
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r0 == 0) goto L_0x002f
            boolean r5 = r0.containsKey(r4)
            if (r5 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0047
            o80.a r0 = r12.f327869c
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.f329154a
            goto L_0x003a
        L_0x0039:
            r0 = r1
        L_0x003a:
            com.tencent.mm.plugin.sight.base.a r0 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r0, r3)
            if (r0 == 0) goto L_0x0043
            int r0 = r0.f273447e
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r12.f327882p = r0
            goto L_0x0051
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            int r0 = r0.getInteger(r4)
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r12.f327882p = r0
        L_0x0051:
            int r0 = r12.f327882p
            if (r0 <= 0) goto L_0x005b
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r0 = (float) r0
            float r4 = r4 / r0
            r12.f327883q = r4
        L_0x005b:
            int r0 = r12.f327882p
            if (r0 > 0) goto L_0x006a
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 104(0x68, double:5.14E-322)
            r0.mo175912v(r4, r6)
            r0 = 0
            goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            int r4 = r12.f327878l
            int r4 = r4 + r3
            r12.f327878l = r4
            long r4 = r14.presentationTimeUs
            r12.f327886t = r4
            java.lang.String r4 = r12.f327871e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "processDecodeOutputBuffer, usePts:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", pts: "
            r5.append(r6)
            long r6 = r14.presentationTimeUs
            r5.append(r6)
            java.lang.String r6 = ", frameDuration:"
            r5.append(r6)
            float r6 = r12.f327883q
            r5.append(r6)
            java.lang.String r6 = ", frameCount:"
            r5.append(r6)
            int r6 = r12.f327878l
            r5.append(r6)
            java.lang.String r6 = ", startTimeMs:"
            r5.append(r6)
            long r6 = r12.f327867a
            r5.append(r6)
            java.lang.String r6 = ", size: "
            r5.append(r6)
            int r6 = r14.size
            r5.append(r6)
            java.lang.String r6 = ", isKeyFrame:"
            r5.append(r6)
            int r6 = r14.flags
            r6 = r6 & r3
            if (r6 != r3) goto L_0x00c1
            r6 = 1
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            r5.append(r6)
            java.lang.String r6 = ", isMain:"
            r5.append(r6)
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            long r4 = r12.f327887u
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x011f
            long r6 = r12.f327886t
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x011f
            int r4 = r12.f327888v
            int r4 = r4 + r3
            r12.f327888v = r4
            java.lang.String r4 = r12.f327871e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "processDecodeOutputBuffer has B Frame, decodePts:"
            r5.append(r6)
            long r6 = r12.f327886t
            r5.append(r6)
            java.lang.String r6 = ", lastDecodePts:"
            r5.append(r6)
            long r6 = r12.f327887u
            r5.append(r6)
            java.lang.String r6 = ", bFrameNum:"
            r5.append(r6)
            int r6 = r12.f327888v
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
        L_0x011f:
            long r4 = r12.f327886t
            r12.f327887u = r4
            if (r0 == 0) goto L_0x02c8
            long r4 = r14.presentationTimeUs
            m80.b r0 = r12.f327884r
            r0.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "sendPacket, pts:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", recentPts:"
            r6.append(r7)
            long r7 = r0.f92790c
            r6.append(r7)
            java.lang.String r7 = ", parents["
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = "]:"
            r6.append(r7)
            u.b<java.lang.Long, java.lang.Long> r7 = r0.f92792e
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.Object r7 = r7.getOrDefault(r8, r1)
            r6.append(r7)
            java.lang.String r7 = ", lastPts:"
            r6.append(r7)
            long r7 = r0.f92791d
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "DecodeHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            long r6 = r0.f92790c
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0177
            goto L_0x018a
        L_0x0177:
            long r6 = r0.f92791d
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x018c
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            u.b<java.lang.Long, java.lang.Long> r7 = r0.f92792e
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            r0 = 0
            goto L_0x019f
        L_0x018c:
            java.util.PriorityQueue<rx3.l<java.lang.Long, java.lang.Integer>> r0 = r0.f92794g
            rx3.l r6 = new rx3.l
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r6.<init>(r7, r8)
            r0.add(r6)
            r0 = 1
        L_0x019f:
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = r12.f327871e
            java.lang.String r1 = "processDecodeOutputBuffer sendPacket return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.compatible.deviceinfo.a r0 = r12.f327872f
            if (r0 == 0) goto L_0x01af
            r0.mo148216r(r13, r2)
        L_0x01af:
            r0 = 1
            goto L_0x02ab
        L_0x01b2:
            r0 = 0
        L_0x01b3:
            m80.b r6 = r12.f327884r
            java.util.PriorityQueue<rx3.l<java.lang.Long, java.lang.Integer>> r7 = r6.f92794g
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x01f0
            java.util.PriorityQueue<rx3.l<java.lang.Long, java.lang.Integer>> r7 = r6.f92794g
            java.lang.Object r7 = r7.peek()
            rx3.l r7 = (rx3.C13604l) r7
            A r7 = r7.f38555d
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            long r9 = r6.f92791d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01d6
        L_0x01d4:
            r6 = 1
            goto L_0x01f1
        L_0x01d6:
            u.b<java.lang.Long, java.lang.Long> r9 = r6.f92792e
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r7 = r9.getOrDefault(r7, r1)
            java.lang.Long r7 = (java.lang.Long) r7
            long r8 = r6.f92790c
            if (r7 != 0) goto L_0x01e7
            goto L_0x01f0
        L_0x01e7:
            long r6 = r7.longValue()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x01f0
            goto L_0x01d4
        L_0x01f0:
            r6 = 0
        L_0x01f1:
            if (r6 == 0) goto L_0x02ab
            java.lang.String r6 = r12.f327871e
            java.lang.String r7 = "decode hasFrame"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            m80.b r6 = r12.f327884r
            java.util.PriorityQueue<rx3.l<java.lang.Long, java.lang.Integer>> r7 = r6.f92794g
            java.lang.Object r7 = r7.poll()
            rx3.l r7 = (rx3.C13604l) r7
            A r8 = r7.f38555d
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            B r7 = r7.f38556e
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6.f92790c = r8
            u.b<java.lang.Long, java.util.List<java.lang.Long>> r6 = r6.f92793f
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            java.lang.Object r6 = r6.get(r10)
            if (r6 != 0) goto L_0x022a
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.util.List r6 = sx3.C26236u.m33719b(r6)
        L_0x022a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.List r6 = (java.util.List) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.String r8 = r12.f327871e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "processDecodeOutputBuffer, duplicate frame size:"
            r9.append(r10)
            int r10 = r6.size()
            r9.append(r10)
            java.lang.String r10 = ", bufferInfo pts:"
            r9.append(r10)
            long r10 = r14.presentationTimeUs
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            boolean r8 = r6.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto L_0x01b3
            com.tencent.mm.compatible.deviceinfo.a r0 = r12.f327872f
            if (r0 == 0) goto L_0x026f
            android.view.Surface r8 = r12.f327870d
            if (r8 == 0) goto L_0x026b
            r8 = 1
            goto L_0x026c
        L_0x026b:
            r8 = 0
        L_0x026c:
            r0.mo148216r(r7, r8)
        L_0x026f:
            java.util.Iterator r0 = r6.iterator()
        L_0x0273:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x02a8
            java.lang.Object r6 = r0.next()
            java.lang.Number r6 = (java.lang.Number) r6
            long r9 = r6.longValue()
            java.lang.String r6 = r12.f327871e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "processDecodeOutputBuffer, duplicate frame, pts: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r8 = ", bufferInfo: "
            r7.append(r8)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            r6 = r12
            r7 = r4
            r11 = r14
            r6.mo160760a(r7, r9, r11)
            goto L_0x0273
        L_0x02a8:
            r0 = 1
            goto L_0x01b3
        L_0x02ab:
            if (r0 != 0) goto L_0x02e6
            java.lang.String r0 = r12.f327871e
            java.lang.String r1 = "processDecodeOutputBuffer still not release buffer fallback release it"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            com.tencent.mm.compatible.deviceinfo.a r0 = r12.f327872f
            if (r0 == 0) goto L_0x02c0
            android.view.Surface r1 = r12.f327870d
            if (r1 == 0) goto L_0x02bd
            r2 = 1
        L_0x02bd:
            r0.mo148216r(r13, r2)
        L_0x02c0:
            r6 = r12
            r7 = r4
            r9 = r4
            r11 = r14
            r6.mo160760a(r7, r9, r11)
            goto L_0x02e6
        L_0x02c8:
            com.tencent.mm.compatible.deviceinfo.a r0 = r12.f327872f
            if (r0 == 0) goto L_0x02d4
            android.view.Surface r4 = r12.f327870d
            if (r4 == 0) goto L_0x02d1
            r2 = 1
        L_0x02d1:
            r0.mo148216r(r13, r2)
        L_0x02d4:
            fy3.r<? super java.nio.ByteBuffer, ? super java.lang.Long, ? super android.media.MediaCodec$BufferInfo, ? super java.lang.Boolean, rx3.b0> r13 = r12.f327874h
            if (r13 == 0) goto L_0x02e6
            long r2 = r14.presentationTimeUs
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r13 = r13.mo162I(r1, r0, r14, r2)
            rx3.b0 r13 = (rx3.C13598b0) r13
        L_0x02e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m80.C109537f.mo160761b(int, android.media.MediaCodec$BufferInfo):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0054 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145767c() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f327871e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "releaseDecoder  "
            r1.append(r2)
            int r2 = r3.hashCode()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.Object r0 = r3.f327880n
            monitor-enter(r0)
            m80.b r1 = r3.f327884r     // Catch:{ Exception -> 0x0054 }
            java.util.PriorityQueue<rx3.l<java.lang.Long, java.lang.Integer>> r1 = r1.f92794g     // Catch:{ Exception -> 0x0054 }
            r1.clear()     // Catch:{ Exception -> 0x0054 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r3.f327872f     // Catch:{ Exception -> 0x0054 }
            if (r1 == 0) goto L_0x002b
            r1.mo148223z()     // Catch:{ Exception -> 0x0054 }
        L_0x002b:
            java.lang.String r1 = r3.f327871e     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = "decoder?.stop()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0054 }
            com.tencent.mm.compatible.deviceinfo.a r1 = r3.f327872f     // Catch:{ Exception -> 0x0054 }
            if (r1 == 0) goto L_0x0039
            r1.mo148214p()     // Catch:{ Exception -> 0x0054 }
        L_0x0039:
            java.lang.String r1 = r3.f327871e     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = "decoder?.release()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0054 }
            r1 = 1
            r3.f327881o = r1     // Catch:{ Exception -> 0x0054 }
            android.view.Surface r1 = r3.f327870d     // Catch:{ Exception -> 0x0054 }
            if (r1 == 0) goto L_0x004a
            r1.release()     // Catch:{ Exception -> 0x0054 }
        L_0x004a:
            java.lang.String r1 = r3.f327871e     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = "releaseDecoder end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0054
        L_0x0052:
            r1 = move-exception
            goto L_0x0058
        L_0x0054:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)
            return
        L_0x0058:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m80.C109537f.mo145767c():void");
    }

    /* renamed from: d */
    public void mo145768d(boolean z) {
        long currentTicks = Util.currentTicks();
        String str = this.f327871e;
        Log.m105918d(str, "setPauseDecoder:" + z + ", remain:" + this.f327879m.availablePermits() + ", thread:" + Thread.currentThread() + ' ' + currentTicks);
        if (z) {
            String str2 = this.f327871e;
            Log.m105918d(str2, "try acquire, thread:" + Thread.currentThread() + ' ' + currentTicks);
            this.f327879m.acquire();
        } else {
            String str3 = this.f327871e;
            Log.m105918d(str3, "release, thread:" + Thread.currentThread() + ' ' + currentTicks);
            this.f327879m.release();
        }
        String str4 = this.f327871e;
        Log.m105918d(str4, "after setPauseDecoder:" + z + ", remain:" + this.f327879m.availablePermits() + ", thread:" + Thread.currentThread() + ' ' + currentTicks);
    }

    /* renamed from: e */
    public abstract void mo145769e();
}
