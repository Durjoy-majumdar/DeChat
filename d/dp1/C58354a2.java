package dp1;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dp1.a2 */
public final class C58354a2 {

    /* renamed from: a */
    public static final C58354a2 f167095a = new C58354a2();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C58355a> f167096b = new ConcurrentHashMap<>();

    /* renamed from: dp1.a2$a */
    public static final class C58355a {

        /* renamed from: a */
        public String f167097a = "";

        /* renamed from: b */
        public String f167098b = "";

        /* renamed from: c */
        public String f167099c = "";

        /* renamed from: d */
        public String f167100d = "";

        /* renamed from: e */
        public long f167101e;

        /* renamed from: f */
        public long f167102f;

        /* renamed from: g */
        public long f167103g;

        /* renamed from: h */
        public long f167104h;

        /* renamed from: i */
        public boolean f167105i = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83107a(java.lang.String r19, boolean r20) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "mediaId"
            gy3.C87412m.m108594g(r0, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, dp1.a2$a> r2 = f167096b
            java.lang.Object r3 = r2.get(r0)
            dp1.a2$a r3 = (dp1.C58354a2.C58355a) r3
            r4 = 0
            if (r3 == 0) goto L_0x002b
            long r7 = r3.f167103g
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x001b
            r7 = 1
            goto L_0x001c
        L_0x001b:
            r7 = 0
        L_0x001c:
            if (r7 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r3 == 0) goto L_0x002b
            if (r20 == 0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            long r7 = eb0.C31543z5.m39453c()
            r3.f167103g = r7
        L_0x002b:
            if (r20 != 0) goto L_0x0102
            java.lang.Object r0 = r2.remove(r0)
            dp1.a2$a r0 = (dp1.C58354a2.C58355a) r0
            if (r0 == 0) goto L_0x0102
            com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct
            r2.<init>()
            r7 = 10
            r2.f155345d = r7
            r7 = 3
            r2.f155346e = r7
            long r7 = r0.f167103g
            long r9 = r7 - r4
            long r11 = r0.f167101e
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x004f
            long r13 = r11 - r4
            goto L_0x0050
        L_0x004f:
            r13 = r4
        L_0x0050:
            if (r3 <= 0) goto L_0x005b
            long r4 = r0.f167104h
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x005b
            long r3 = r4 - r11
            goto L_0x005d
        L_0x005b:
            r3 = 0
        L_0x005d:
            long r11 = r7 - r11
            r19 = r7
            long r6 = r0.f167102f
            r8 = r1
            r17 = r2
            r1 = 0
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 <= 0) goto L_0x0076
            r15 = r19
            long r6 = r15 - r6
            long r6 = java.lang.Math.max(r6, r1)
            r1 = r6
            goto L_0x0078
        L_0x0076:
            r1 = 0
        L_0x0078:
            c30.g r6 = new c30.g
            r6.<init>()
            java.lang.String r7 = "commentScene"
            r5 = 0
            r6.mo145953n(r7, r5)
            java.lang.String r7 = "totalTime"
            r6.mo145954o(r7, r9)
            java.lang.String r7 = "isExit"
            r6.mo145966q(r7, r5)
            java.lang.String r7 = "enterToViewInit"
            r6.mo145954o(r7, r13)
            boolean r7 = r0.f167105i
            java.lang.String r9 = "isMoovReadyBeforeEnter"
            r6.mo145966q(r9, r7)
            java.lang.String r7 = "viewInitToMoovDownloaded"
            r6.mo145954o(r7, r3)
            r3 = 0
            long r3 = java.lang.Math.max(r11, r3)
            java.lang.String r7 = "viewInitToFirstFrame"
            r6.mo145954o(r7, r3)
            java.lang.String r3 = "seekToFirstFrame"
            r6.mo145954o(r3, r1)
            java.lang.String r1 = r0.f167097a
            r6.put(r8, r1)
            java.lang.String r1 = r0.f167100d
            java.lang.String r2 = "type"
            r6.put(r2, r1)
            java.lang.String r1 = r0.f167098b
            java.lang.String r2 = "url"
            r6.put(r2, r1)
            java.lang.String r0 = r0.f167099c
            java.lang.String r1 = "urlToken"
            r6.put(r1, r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "buildJson(data, isExit).toString()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = ","
            java.lang.String r2 = ";"
            r3 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r1, r2, r3)
            r1 = r17
            r1.mo76254s(r0)
            r1.mo86054n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "report21680 info:"
            r0.append(r2)
            java.lang.String r1 = r1.mo1006q()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MegaVideoReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58354a2.mo83107a(java.lang.String, boolean):void");
    }
}
