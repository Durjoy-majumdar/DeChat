package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.launching.C83341j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask$$a */
public final /* synthetic */ class AppBrandPreInitTask$$a implements C83341j.C83342a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandPreInitTask f243150a;

    public /* synthetic */ AppBrandPreInitTask$$a(AppBrandPreInitTask appBrandPreInitTask) {
        this.f243150a = appBrandPreInitTask;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        if (((ky2.C10432i) di3.C86312j.m106911c(ky2.C10432i.class)).mo10738JD(1, "weapp_" + r0) == false) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115495a(com.tencent.luggage.sdk.config.AppBrandInitConfigLU r6, com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject r7, int r8) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask r8 = r5.f243150a
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r6
            r8.f243146p = r6
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r0 = r8.f243142i
            r0.f243738o = r7
            if (r6 == 0) goto L_0x008c
            r0.mo115681b(r6)
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r0 = r8.f243142i
            com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy.C83284b.m102229b(r6, r0)
            com.tencent.p014mm.plugin.appbrand.launching.C83323g.m102275a(r6, r7)
            if (r7 == 0) goto L_0x001c
            int r0 = r7.f245533f
            goto L_0x001d
        L_0x001c:
            r0 = -1
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r6.f234839s
            int r2 = r6.f239365g
            boolean r0 = com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83482f.m102439a(r6, r0, r1, r2)
            r1 = 1
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = r6.f239362d
            java.lang.String r2 = "appId"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.Class<ky2.i> r2 = ky2.C10432i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ky2.i r2 = (ky2.C10432i) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "weapp_"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            boolean r0 = r2.mo10738JD(r1, r0)
            if (r0 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            r8.f243147q = r1
            if (r1 == 0) goto L_0x0062
            java.lang.String r6 = r6.f234839s
            com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83472a.m102435d(r6)
            r8.mo114394b()
            goto L_0x008f
        L_0x0062:
            com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask$$b r0 = new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask$$b
            r0.<init>(r8, r6, r7)
            com.tencent.mm.plugin.appbrand.launching.precondition.l r7 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C1926l.f11800a
            java.lang.String r1 = r6.f239362d
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r6.f234815R0
            boolean r2 = r2.mo76931c()
            boolean r6 = r6.f239373d1
            boolean r6 = r7.mo1819a(r1, r2, r6)
            if (r6 == 0) goto L_0x0088
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r7 = r8.f243141h
            com.tencent.mm.plugin.appbrand.launching.i r1 = new com.tencent.mm.plugin.appbrand.launching.i
            r1.<init>(r8, r0)
            com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.m100645J7(r6, r7, r1)
            goto L_0x008f
        L_0x0088:
            r0.run()
            goto L_0x008f
        L_0x008c:
            r8.mo114394b()
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask$$a.mo115495a(com.tencent.luggage.sdk.config.AppBrandInitConfigLU, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject, int):void");
    }
}
