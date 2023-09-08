package com.tencent.p014mm.plugin.appbrand.jsapi;

import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t3 */
public final class C83038t3 extends C82016a0<C88267e> {
    public static final int CTRL_INDEX = 651;
    public static final String NAME = "markScene";

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r4 = r11.getAppId();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo1731t(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r11, org.json.JSONObject r12) {
        /*
            r10 = this;
            kr0.e r11 = (kr0.C88267e) r11
            java.lang.String r0 = "MicroMsg.JsApiMarkScene"
            if (r11 == 0) goto L_0x0083
            boolean r1 = r11.isRunning()
            if (r1 != 0) goto L_0x000e
            goto L_0x0083
        L_0x000e:
            java.lang.String r1 = r11.getAppId()
            r2 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r1 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r1, r2)
            if (r1 != 0) goto L_0x0025
            java.lang.String r11 = "fail:session dead"
            java.lang.String r11 = r10.mo115109j(r11)
            java.lang.String r12 = "makeReturnJson(\"fail:session dead\")"
            gy3.C87412m.m108593f(r11, r12)
            goto L_0x0093
        L_0x0025:
            r3 = -1
            if (r12 == 0) goto L_0x002f
            java.lang.String r4 = "sceneId"
            int r3 = r12.optInt(r4, r3)
        L_0x002f:
            if (r3 >= 0) goto L_0x0052
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "parameter fail "
            r11.append(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            java.lang.String r11 = "fail:illegal argument"
            java.lang.String r11 = r10.mo115109j(r11)
            java.lang.String r12 = "makeReturnJson(\"fail:illegal argument\")"
            gy3.C87412m.m108593f(r11, r12)
            goto L_0x0093
        L_0x0052:
            java.util.concurrent.atomic.AtomicInteger r12 = r1.f245840A
            r12.set(r3)
            boolean r12 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            if (r12 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0077
            java.lang.String r4 = r11.getAppId()
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r11 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r4, r2)
            if (r11 != 0) goto L_0x0068
            goto L_0x0077
        L_0x0068:
            long r8 = java.lang.System.currentTimeMillis()
            long r6 = r11.f245859t
            boolean r11 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            if (r11 == 0) goto L_0x0077
            java.lang.String r5 = "FirstRenderToGameInteractive"
            com.tencent.p014mm.plugin.appbrand.performance.C83997d.m103521d(r4, r5, r6, r8)
        L_0x0077:
            java.lang.String r11 = "ok"
            java.lang.String r11 = r10.mo115109j(r11)
            java.lang.String r12 = "makeReturnJson(\"ok\")"
            gy3.C87412m.m108593f(r11, r12)
            goto L_0x0093
        L_0x0083:
            java.lang.String r11 = "Service dead, miss"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            java.lang.String r11 = "fail:service dead"
            java.lang.String r11 = r10.mo115109j(r11)
            java.lang.String r12 = "makeReturnJson(\"fail:service dead\")"
            gy3.C87412m.m108593f(r11, r12)
        L_0x0093:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C83038t3.mo1731t(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject):java.lang.String");
    }
}
