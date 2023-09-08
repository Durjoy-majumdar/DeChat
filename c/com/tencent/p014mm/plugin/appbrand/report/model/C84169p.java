package com.tencent.p014mm.plugin.appbrand.report.model;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.p */
public final class C84169p {

    /* renamed from: n */
    public static final C84169p f245754n = new C84169p(true, C84153l.f245688a);

    /* renamed from: a */
    public final boolean f245755a;

    /* renamed from: b */
    public final C84153l f245756b;

    /* renamed from: c */
    public String f245757c;

    /* renamed from: d */
    public String f245758d;

    /* renamed from: e */
    public int f245759e;

    /* renamed from: f */
    public String f245760f;

    /* renamed from: g */
    public int f245761g;

    /* renamed from: h */
    public String f245762h;

    /* renamed from: i */
    public String f245763i;

    /* renamed from: j */
    public int f245764j;

    /* renamed from: k */
    public int f245765k;

    /* renamed from: l */
    public String f245766l;

    /* renamed from: m */
    public int f245767m;

    public C84169p(boolean z, C84153l lVar) {
        this.f245755a = z;
        this.f245756b = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r4 = r4.f245692d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116842a(p1044ub.C90630c r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.mo116163R0()
            r3.f245763i = r0
            com.tencent.mm.plugin.appbrand.report.model.l r0 = r3.f245756b
            com.tencent.mm.plugin.appbrand.report.model.l$b r4 = r0.mo116807o(r4)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x001b
            if (r4 == 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "mismatch stack state, call @smoothieli fix this"
            r4.<init>(r0)
            throw r4
        L_0x001b:
            if (r4 == 0) goto L_0x0024
            com.tencent.mm.plugin.appbrand.report.model.l$c r4 = r4.f245692d
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = r4.f245693a
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            r3.f245766l = r4
            com.tencent.mm.plugin.appbrand.report.model.l r4 = r3.f245756b
            java.lang.String r0 = r3.f245763i
            boolean r4 = r4.mo116806i(r0)
            r3.f245767m = r4
            boolean r4 = r3.f245755a
            if (r4 == 0) goto L_0x0037
            goto L_0x00d1
        L_0x0037:
            java.lang.String r4 = r3.f245763i
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            int r0 = r0.length()
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r0 <= r1) goto L_0x004a
            java.lang.String r4 = r4.substring(r2, r1)
        L_0x004a:
            r3.f245763i = r4
            java.lang.String r4 = r3.f245766l
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            int r0 = r0.length()
            if (r0 <= r1) goto L_0x005c
            java.lang.String r4 = r4.substring(r2, r1)
        L_0x005c:
            r3.f245766l = r4
            te3.j55 r4 = new te3.j55
            r4.<init>()
            r0 = 1
            r4.f259611d = r0
            java.lang.String r1 = r3.f245757c
            r4.f259612e = r1
            java.lang.String r1 = r3.f245763i
            r4.f259613f = r1
            r4.f259614g = r2
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r2 = (int) r1
            r4.f259615h = r2
            r4.f259616i = r0
            java.lang.String r0 = ""
            r4.f259617j = r0
            int r0 = r3.f245765k
            r4.f259618n = r0
            java.lang.String r0 = r3.f245758d
            r4.f259619o = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.report.C84116i0.m103659b(r0)
            r4.f259620p = r0
            int r0 = r3.f245759e
            r4.f259621q = r0
            int r0 = r3.f245764j
            r4.f259622r = r0
            java.lang.String r0 = r3.f245760f
            r4.f259623s = r0
            java.lang.String r0 = r3.f245766l
            r4.f259624t = r0
            int r0 = r3.f245761g
            r4.f259625u = r0
            java.lang.String r0 = r3.f245762h
            r4.f259626v = r0
            int r0 = r3.f245767m
            r4.f259627w = r0
            fy3.a<com.tencent.mm.plugin.appbrand.report.l0> r0 = com.tencent.p014mm.plugin.appbrand.report.C84134l0.C84135a.f245612a
            java.lang.Object r0 = r0.invoke()
            com.tencent.mm.plugin.appbrand.report.l0 r0 = (com.tencent.p014mm.plugin.appbrand.report.C84134l0) r0
            r0.mo116790a(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "report "
            r4.append(r0)
            java.lang.String r0 = r3.toString()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "MicroMsg.AppBrand.Report.kv_14004"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84169p.mo116842a(ub.c):void");
    }

    public String toString() {
        return "kv_14004{appId='" + this.f245757c + '\'' + ", sessionId='" + this.f245758d + '\'' + ", scene=" + this.f245759e + ", sceneNote='" + this.f245760f + '\'' + ", preScene=" + this.f245761g + ", preSceneNote='" + this.f245762h + '\'' + ", pagePath='" + this.f245763i + '\'' + ", usedState=" + this.f245764j + ", appState=" + this.f245765k + ", referPagePath='" + this.f245766l + '\'' + ", isEntrance=" + this.f245767m + '}';
    }
}
