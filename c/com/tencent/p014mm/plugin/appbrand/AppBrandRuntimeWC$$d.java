package com.tencent.p014mm.plugin.appbrand;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$d */
public final /* synthetic */ class AppBrandRuntimeWC$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238316d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f238317e;

    public /* synthetic */ AppBrandRuntimeWC$$d(AppBrandRuntimeWC appBrandRuntimeWC, Runnable runnable) {
        this.f238316d = appBrandRuntimeWC;
        this.f238317e = runnable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r9.f238316d
            java.lang.Runnable r1 = r9.f238317e
            boolean r2 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC.f238264Q1
            boolean r2 = r0.mo113064k0()
            java.lang.String r3 = "MicroMsg.AppBrandRuntimeWC"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f238147j
            r1[r5] = r0
            java.lang.String r0 = "startPrepareOrientation, finished appId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
            goto L_0x00df
        L_0x001e:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r6 = "mayRequestOrientation"
            r0.mo113052e(r6, r2)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$e r2 = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$e
            r2.<init>(r0, r1)
            com.tencent.mm.plugin.appbrand.b2 r1 = new com.tencent.mm.plugin.appbrand.b2
            r1.<init>(r0)
            boolean r6 = r0.mo113064k0()
            r7 = 0
            if (r6 == 0) goto L_0x003c
            java.lang.String r6 = "destroyed"
            r1.invoke(r6)
            goto L_0x0070
        L_0x003c:
            boolean r6 = r0.f238116N
            if (r6 != 0) goto L_0x0059
            com.tencent.mm.plugin.appbrand.config.a r6 = r0.mo113008F()
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = "NULL appConfig"
            r1.invoke(r6)
            goto L_0x0070
        L_0x004c:
            java.lang.String r1 = r0.mo113030T()
            java.lang.String r1 = p225rc.C89925n.m112488a(r1)
            com.tencent.mm.plugin.appbrand.config.a$e r1 = r6.mo113984c(r1)
            goto L_0x0076
        L_0x0059:
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r6 = r0.mo113212m1()
            if (r6 != 0) goto L_0x0065
            java.lang.String r6 = "NULL pageContainer"
            r1.invoke(r6)
            goto L_0x0070
        L_0x0065:
            com.tencent.mm.plugin.appbrand.page.i0 r6 = r6.getCurrentPage()
            if (r6 != 0) goto L_0x0072
            java.lang.String r6 = "NULL currentPage"
            r1.invoke(r6)
        L_0x0070:
            r1 = r7
            goto L_0x0076
        L_0x0072:
            com.tencent.mm.plugin.appbrand.config.a$e r1 = r6.getPageConfig()
        L_0x0076:
            br0.e$b r6 = br0.C79778e.C79780b.PORTRAIT
            boolean r8 = r0.mo113064k0()
            if (r8 == 0) goto L_0x008a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.f238147j
            r1[r5] = r0
            java.lang.String r0 = "mayRequestOrientation mFinished is true return,mAppId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r1)
            goto L_0x00df
        L_0x008a:
            boolean r3 = r0.mo121254q1()
            if (r3 == 0) goto L_0x009d
            com.tencent.mm.plugin.appbrand.config.a r1 = r0.mo113008F()
            com.tencent.mm.plugin.appbrand.config.a$b r1 = r1.f239611q
            java.lang.String r1 = r1.f239621a
            br0.e$b r7 = br0.C79778e.C79780b.m96933b(r1)
            goto L_0x00d0
        L_0x009d:
            if (r1 != 0) goto L_0x00ad
            boolean r1 = r0.f238127U0
            if (r1 != 0) goto L_0x00a4
            goto L_0x00d0
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "page config should not be NULL!!"
            r0.<init>(r1)
            throw r0
        L_0x00ad:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r3 = r0.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r3.f234815R0
            java.lang.String r7 = "embedWxa.initConfig.halfScreenConfig"
            gy3.C87412m.m108593f(r3, r7)
            boolean r7 = r3.mo76931c()
            if (r7 == 0) goto L_0x00c5
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r3 = r3.f157932C
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r7 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
            if (r3 != r7) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r4 = 0
        L_0x00c6:
            if (r4 == 0) goto L_0x00ca
            r7 = r6
            goto L_0x00d0
        L_0x00ca:
            java.lang.String r1 = r1.f239663m
            br0.e$b r7 = br0.C79778e.C79780b.m96933b(r1)
        L_0x00d0:
            br0.c r0 = r0.mo113054f0()
            br0.e r0 = r0.getOrientationHandler()
            if (r7 != 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r6 = r7
        L_0x00dc:
            r0.mo109918b(r6, r2)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$d.run():void");
    }
}
