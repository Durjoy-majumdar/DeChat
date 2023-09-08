package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.j */
public final class C82728j implements C82732k0 {

    /* renamed from: a */
    public static final C82728j f242046a = new C82728j();

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo114992a(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r5, com.tencent.p014mm.plugin.appbrand.C83231l.C83235e r6) {
        /*
            r4 = this;
            java.lang.String r0 = "appPauseType"
            gy3.C87412m.m108594g(r6, r0)
            com.tencent.mm.plugin.appbrand.l$e r0 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.LAUNCH_NATIVE_PAGE
            r1 = 1
            r2 = 0
            if (r0 == r6) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0063
            com.tencent.mm.plugin.appbrand.l$e r0 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.LAUNCH_MINI_PROGRAM
            if (r0 == r6) goto L_0x0016
        L_0x0014:
            r6 = 0
            goto L_0x0060
        L_0x0016:
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.appbrand.C81879g
            r0 = 0
            if (r6 == 0) goto L_0x001e
            com.tencent.mm.plugin.appbrand.g r5 = (com.tencent.p014mm.plugin.appbrand.C81879g) r5
            goto L_0x001f
        L_0x001e:
            r5 = r0
        L_0x001f:
            if (r5 == 0) goto L_0x0030
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r5.getRuntime()
            if (r5 == 0) goto L_0x0030
            com.tencent.mm.plugin.appbrand.e3 r5 = r5.f238142e
            if (r5 == 0) goto L_0x0030
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r5.getActiveRuntime()
            goto L_0x0031
        L_0x0030:
            r5 = r0
        L_0x0031:
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC
            if (r6 == 0) goto L_0x0038
            r0 = r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0
        L_0x0038:
            java.lang.String r5 = "MicroMsg.AppBrand.AutoPauseIfNotOpenNativeStrategyWC"
            if (r0 != 0) goto L_0x0042
            java.lang.String r6 = "isLaunchFakeNative, activeRuntime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x0014
        L_0x0042:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r0.mo113210l1()
            if (r6 == 0) goto L_0x004b
            boolean r6 = r6.f239373d1
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "isLaunchFakeNative, isActiveRuntimeFakeNative: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0060:
            if (r6 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.C82728j.mo114992a(com.tencent.mm.plugin.appbrand.jsapi.f, com.tencent.mm.plugin.appbrand.l$e):boolean");
    }

    /* renamed from: b */
    public C82732k0 mo114993b(C82732k0 k0Var) {
        return C82732k0.C82733a.m101507a(this, k0Var);
    }

    public String toString() {
        return "AutoPauseIfNotOpenNativeStrategyWC";
    }
}
