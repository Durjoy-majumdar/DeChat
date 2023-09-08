package q70;

import bp3.C79760s;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner;
import com.tencent.matrix.util.MemInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.TimeUnit;
import p659qe.C89616n;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: q70.g0 */
public final class C89508g0 {

    /* renamed from: a */
    public static final C89508g0 f257593a = new C89508g0();

    /* renamed from: b */
    public static final long f257594b;

    /* renamed from: c */
    public static final long f257595c;

    /* renamed from: d */
    public static final long f257596d;

    /* renamed from: q70.g0$a */
    public static final class C89509a extends C87413o implements C32226l<MemInfo, C13598b0> {

        /* renamed from: d */
        public static final C89509a f257597d = new C89509a();

        public C89509a() {
            super(1);
        }

        public Object invoke(Object obj) {
            MemInfo memInfo = (MemInfo) obj;
            C87412m.m108594g(memInfo, "memInfo");
            ((C119157j) C119157j.f356862d).mo183884o(new C89506f0(memInfo));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.g0$b */
    public static final class C89510b extends C87413o implements C32226l<MemInfo, C13598b0> {

        /* renamed from: d */
        public static final C89510b f257598d = new C89510b();

        public C89510b() {
            super(1);
        }

        public Object invoke(Object obj) {
            MemInfo memInfo = (MemInfo) obj;
            C87412m.m108594g(memInfo, "memInfo");
            ((C119157j) C119157j.f356862d).mo183884o(new C89519m0(memInfo));
            return C13598b0.f38549a;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f257594b = timeUnit.toMillis(1);
        f257595c = timeUnit.toMillis(3);
        f257596d = timeUnit.toMillis(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r0.f235665f <= 367001600) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (((double) r0.f235665f) <= (((double) r0.f235666g) * 0.8d)) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        r3 = r55;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c8 A[Catch:{ all -> 0x0219 }, LOOP:1: B:62:0x01c2->B:64:0x01c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0240  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m111903a(q70.C89508g0 r53, com.tencent.matrix.util.MemInfo r54, int r55, long r56) {
        /*
            r1 = r54
            r53.getClass()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            q70.c0$a r0 = q70.C89491c0.f257566a
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, xv.n> r0 = q70.C89491c0.f257567b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0019:
            boolean r0 = r3.hasNext()
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.monitor.ProcBackgroundMemory"
            r6 = 0
            r7 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getValue()
            xv.n r9 = (p757xv.C91349n) r9
            java.util.Map r9 = r9.getExtra()
            gy3.C87412m.m108593f(r9, r4)     // Catch:{ all -> 0x0052 }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0052 }
            r7 = r7 ^ r10
            if (r7 == 0) goto L_0x0019
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0046 }
            r7.<init>(r9)     // Catch:{ all -> 0x0046 }
            r6 = r7
        L_0x0046:
            if (r6 == 0) goto L_0x0019
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0052 }
            r2.put(r0, r6)     // Catch:{ all -> 0x0052 }
            goto L_0x0019
        L_0x0052:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r8]
            p723vf.C118672d.m167354d(r5, r0, r4, r6)
            goto L_0x0019
        L_0x0059:
            com.tencent.matrix.util.JavaMemInfo r0 = r1.f235673g
            gy3.C87412m.m108591d(r0)
            long r9 = r0.f235666g
            r11 = 419430400(0x19000000, double:2.072261515E-315)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            com.tencent.matrix.util.JavaMemInfo r0 = r1.f235673g
            gy3.C87412m.m108591d(r0)
            long r9 = r0.f235665f
            r13 = 367001600(0x15e00000, double:1.813228825E-315)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x009c
        L_0x0075:
            com.tencent.matrix.util.JavaMemInfo r0 = r1.f235673g
            gy3.C87412m.m108591d(r0)
            long r9 = r0.f235666g
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x009f
            com.tencent.matrix.util.JavaMemInfo r0 = r1.f235673g
            gy3.C87412m.m108591d(r0)
            long r9 = r0.f235665f
            double r9 = (double) r9
            r11 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            com.tencent.matrix.util.JavaMemInfo r0 = r1.f235673g
            gy3.C87412m.m108591d(r0)
            long r13 = r0.f235666g
            double r13 = (double) r13
            double r13 = r13 * r11
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            r3 = r55
            goto L_0x00a5
        L_0x009f:
            r0 = 2000(0x7d0, float:2.803E-42)
            r3 = r55
            if (r3 != r0) goto L_0x00dc
        L_0x00a5:
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.u0 r0 = r0.mo177788a()
            com.tencent.mm.vfs.x0 r0 = (com.tencent.p014mm.vfs.C116340x0) r0
            java.lang.String r9 = "hprofs"
            com.tencent.mm.vfs.FileSystem$c r0 = r0.mo177847b(r9)
            if (r0 == 0) goto L_0x00bd
            android.os.CancellationSignal r9 = new android.os.CancellationSignal
            r9.<init>()
            r0.mo119928a(r9)
        L_0x00bd:
            t70.c r9 = t70.C36963e.f98036a
            if (r9 == 0) goto L_0x00d3
            r10 = 0
            q70.j0 r12 = new q70.j0
            r12.<init>(r2)
            r13 = 1
            r14 = 0
            r11 = r55
            boolean r0 = t70.C36961c.C36962a.m41108a(r9, r10, r11, r12, r13, r14)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x00d3:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r6, r0)
            r35 = r0
            goto L_0x00de
        L_0x00dc:
            r35 = 0
        L_0x00de:
            t70.c r9 = t70.C36963e.f98037b
            if (r9 == 0) goto L_0x00f1
            r10 = 0
            r12 = 0
            r13 = 5
            r14 = 0
            r11 = r55
            boolean r0 = t70.C36961c.C36962a.m41108a(r9, r10, r11, r12, r13, r14)
            if (r7 != r0) goto L_0x00f1
            r36 = 1
            goto L_0x00f3
        L_0x00f1:
            r36 = 0
        L_0x00f3:
            t70.c r9 = t70.C36963e.f98038c
            if (r9 == 0) goto L_0x0106
            r10 = 0
            r12 = 0
            r13 = 5
            r14 = 0
            r11 = r55
            boolean r0 = t70.C36961c.C36962a.m41108a(r9, r10, r11, r12, r13, r14)
            if (r7 != r0) goto L_0x0106
            r37 = 1
            goto L_0x0108
        L_0x0106:
            r37 = 0
        L_0x0108:
            t70.c r9 = t70.C36963e.f98039d
            if (r9 == 0) goto L_0x011b
            r10 = 0
            r12 = 0
            r13 = 5
            r14 = 0
            r11 = r55
            boolean r0 = t70.C36961c.C36962a.m41108a(r9, r10, r11, r12, r13, r14)
            if (r7 != r0) goto L_0x011b
            r48 = 1
            goto L_0x011d
        L_0x011b:
            r48 = 0
        L_0x011d:
            java.lang.String r0 = "xweb-sdk"
            int r6 = com.tencent.xweb.XWebSdk.getXWebSdkVersion()     // Catch:{ all -> 0x013c }
            r2.put(r0, r6)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "xweb-apk"
            int r6 = com.tencent.xweb.XWebSdk.getAvailableVersion()     // Catch:{ all -> 0x013c }
            r2.put(r0, r6)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "webview-count"
            int r6 = com.tencent.xweb.XWebSdk.getWebViewCount()     // Catch:{ all -> 0x013c }
            r2.put(r0, r6)     // Catch:{ all -> 0x013c }
            goto L_0x0142
        L_0x013c:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r8]
            p723vf.C118672d.m167354d(r5, r0, r4, r6)
        L_0x0142:
            xe.k$a r6 = p269xe.C91190k.f261451a
            xe.k$b r14 = new xe.k$b
            com.tencent.matrix.util.JavaMemInfo r0 = r1.f235673g
            gy3.C87412m.m108591d(r0)
            long r9 = r0.f235665f
            com.tencent.matrix.util.NativeMemInfo r0 = r1.f235674h
            gy3.C87412m.m108591d(r0)
            long r12 = r0.f235681f
            com.tencent.matrix.util.StatusInfo r0 = r1.f235672f
            gy3.C87412m.m108591d(r0)
            r15 = r12
            r53 = r14
            long r13 = r0.f235701f
            com.tencent.matrix.util.PssInfo r0 = r1.f235677n
            gy3.C87412m.m108591d(r0)
            int r12 = r0.f235688d
            com.tencent.matrix.util.PssInfo r0 = r1.f235677n
            gy3.C87412m.m108591d(r0)
            org.json.JSONObject r0 = r0.mo112172a()
            java.lang.String r21 = p269xe.C91191l.m114455a(r0)
            com.tencent.matrix.util.PssInfo r0 = r1.f235676j
            gy3.C87412m.m108591d(r0)
            int r11 = r0.f235688d
            com.tencent.matrix.util.PssInfo r0 = r1.f235676j
            gy3.C87412m.m108591d(r0)
            org.json.JSONObject r0 = r0.mo112172a()
            java.lang.String r23 = p269xe.C91191l.m114455a(r0)
            r24 = 0
            com.tencent.matrix.util.StatusInfo r0 = r1.f235672f
            gy3.C87412m.m108591d(r0)
            r17 = r13
            long r13 = r0.f235702g
            com.tencent.matrix.util.StatusInfo r0 = r1.f235672f
            gy3.C87412m.m108591d(r0)
            r19 = r13
            long r13 = r0.f235703h
            com.tencent.matrix.util.StatusInfo r0 = r1.f235672f
            gy3.C87412m.m108591d(r0)
            r25 = r13
            long r13 = r0.f235704i
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner r0 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235399x
            r0.getClass()
            java.lang.String r32 = com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.f235392q
            java.util.Map r0 = r0.mo111928e()
            org.json.JSONObject r22 = new org.json.JSONObject
            r22.<init>()
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ all -> 0x0219 }
            r7.<init>()     // Catch:{ all -> 0x0219 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0219 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0219 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0219 }
        L_0x01c2:
            boolean r29 = r0.hasNext()     // Catch:{ all -> 0x0219 }
            if (r29 == 0) goto L_0x0205
            java.lang.Object r29 = r0.next()     // Catch:{ all -> 0x0219 }
            java.util.Map$Entry r29 = (java.util.Map.Entry) r29     // Catch:{ all -> 0x0219 }
            java.lang.Object r30 = r29.getValue()     // Catch:{ all -> 0x0219 }
            java.lang.Number r30 = (java.lang.Number) r30     // Catch:{ all -> 0x0219 }
            int r30 = r30.intValue()     // Catch:{ all -> 0x0219 }
            int r8 = r8 + r30
            r30 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0219 }
            r0.<init>()     // Catch:{ all -> 0x0219 }
            java.lang.String r3 = "A"
            r31 = r8
            java.lang.Object r8 = r29.getKey()     // Catch:{ all -> 0x0219 }
            r0.put(r3, r8)     // Catch:{ all -> 0x0219 }
            java.lang.String r3 = "C"
            java.lang.Object r8 = r29.getValue()     // Catch:{ all -> 0x0219 }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ all -> 0x0219 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0219 }
            r0.put(r3, r8)     // Catch:{ all -> 0x0219 }
            r7.put(r0)     // Catch:{ all -> 0x0219 }
            r3 = r55
            r0 = r30
            r8 = r31
            goto L_0x01c2
        L_0x0205:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0219 }
            r0.<init>()     // Catch:{ all -> 0x0219 }
            java.lang.String r3 = "total"
            r0.put(r3, r8)     // Catch:{ all -> 0x0219 }
            java.lang.String r3 = "leak"
            r0.put(r3, r7)     // Catch:{ all -> 0x0219 }
            r22 = r0
            r3 = 0
            goto L_0x0220
        L_0x0219:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]
            p723vf.C118672d.m167354d(r5, r0, r4, r7)
        L_0x0220:
            java.lang.String r33 = p269xe.C91191l.m114455a(r22)
            yd.c r0 = p761yd.C91441c.m114730d()
            java.lang.Class<com.tencent.matrix.resource.h> r4 = com.tencent.matrix.resource.C80530h.class
            we.b r0 = r0.mo125377a(r4)
            com.tencent.matrix.resource.h r0 = (com.tencent.matrix.resource.C80530h) r0
            cf.a r0 = r0.f235548h
            cf.a$b r0 = r0.f234432b
            cf.a$b r4 = p937cf.C80018a.C80020b.SILENCE_ANALYSE
            if (r0 == r4) goto L_0x0240
            cf.a$b r4 = p937cf.C80018a.C80020b.FORK_ANALYSE
            if (r0 != r4) goto L_0x023d
            goto L_0x0240
        L_0x023d:
            r34 = 0
            goto L_0x0242
        L_0x0240:
            r34 = 1
        L_0x0242:
            boolean r38 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            com.tencent.matrix.util.SystemInfo r0 = r1.f235675i
            gy3.C87412m.m108591d(r0)
            org.json.JSONObject r0 = r0.mo112194a()
            java.lang.String r41 = p269xe.C91191l.m114455a(r0)
            com.tencent.matrix.util.StatusInfo r0 = r1.f235672f
            gy3.C87412m.m108591d(r0)
            java.lang.String r0 = r0.f235699d
            r42 = r0
            java.lang.String r43 = p269xe.C91191l.m114455a(r2)
            com.tencent.matrix.util.PssInfo r0 = r1.f235677n
            gy3.C87412m.m108591d(r0)
            int r0 = r0.f235691g
            r44 = r0
            com.tencent.matrix.util.PssInfo r0 = r1.f235676j
            gy3.C87412m.m108591d(r0)
            int r0 = r0.f235691g
            r45 = r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.BUILD_TAG
            r46 = r0
            java.lang.String r1 = "BUILD_TAG"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r47 = r0
            java.lang.String r1 = "REV"
            gy3.C87412m.m108593f(r0, r1)
            r49 = 0
            r50 = 14
            r51 = 1
            r52 = 0
            r0 = 0
            r1 = r11
            r11 = r0
            r0 = 0
            r4 = r12
            r2 = r15
            r12 = r0
            r30 = r13
            r7 = r17
            r28 = r25
            r26 = r19
            r13 = r0
            java.lang.String r25 = ""
            r14 = r9
            r9 = r53
            r10 = r55
            r54 = r53
            r16 = r2
            r18 = r7
            r20 = r4
            r22 = r1
            r39 = r56
            r9.<init>(r10, r11, r12, r13, r14, r16, r18, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            java.lang.String r0 = r54.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r1 = r54
            r6.mo53491a(r1)
            java.lang.String r0 = "report done"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q70.C89508g0.m111903a(q70.g0, com.tencent.matrix.util.MemInfo, int, long):void");
    }

    /* renamed from: b */
    public final C89616n mo123802b() {
        long j = ((long) 600) * 1024;
        return new C89616n(true, ProcessDeepBackgroundOwner.INSTANCE, f257595c, mo123804d(150), mo123804d(250), j, j, 3, C89509a.f257597d);
    }

    /* renamed from: c */
    public final C89616n mo123803c() {
        C79760s.m96908a("stagedBgConfig_3min config expt");
        long d = mo123804d(250);
        long d2 = mo123804d(500);
        long j = ((long) 800) * 1024;
        C79760s.m96909b();
        C79760s.m96908a("stagedBgConfig_3min create config");
        C89616n nVar = new C89616n(true, ProcessStagedBackgroundOwner.INSTANCE, f257595c, d, d2, j, j, 3, C89510b.f257598d);
        C79760s.m96909b();
        return nVar;
    }

    /* renamed from: d */
    public final long mo123804d(int i) {
        return ((long) (i * 1024)) * 1024;
    }
}
