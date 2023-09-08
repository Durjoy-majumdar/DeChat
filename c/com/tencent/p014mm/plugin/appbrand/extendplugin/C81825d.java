package com.tencent.p014mm.plugin.appbrand.extendplugin;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.d */
public abstract class C81825d extends C82268c {
    /* JADX WARNING: type inference failed for: r6v6, types: [com.tencent.mm.plugin.appbrand.jsruntime.j] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r6 = ((com.tencent.p014mm.plugin.appbrand.C81925i2) r2).mo114341l0();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r18, org.json.JSONObject r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            java.lang.String r4 = "MicroMsg.SameLayer.AppBrandPluginAsyncJsApi"
            if (r2 != 0) goto L_0x0012
            java.lang.String r0 = "component is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            return
        L_0x0012:
            int r5 = r1.mo114215x(r0)
            r6 = -1
            java.lang.String r7 = "makeReturnJson with JSONObject, put errno, e=%s"
            java.lang.String r8 = "errno"
            java.lang.String r9 = "makeReturnJson, errno: %d, reason: %s"
            r10 = 2
            java.lang.String r11 = "MicroMsg.AppBrandJsApi"
            r12 = 0
            r13 = 1
            r14 = 4
            if (r5 != r6) goto L_0x0057
            java.lang.String r0 = "no viewId in data"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            java.lang.String r4 = "fail:no viewId in data"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r0[r12] = r5
            r0[r13] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
        L_0x003d:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r8, r14)     // Catch:{ Exception -> 0x0046 }
            goto L_0x004f
        L_0x0046:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r7, r0)
        L_0x004f:
            java.lang.String r0 = r1.mo115115p(r4, r5)
            r2.mo109647a(r3, r0)
            return
        L_0x0057:
            boolean r6 = r2 instanceof com.tencent.p014mm.plugin.appbrand.page.C83780d1
            r15 = 0
            if (r6 == 0) goto L_0x0061
            com.tencent.mm.plugin.appbrand.jsruntime.i r6 = r18.getJsRuntime()
            goto L_0x0074
        L_0x0061:
            boolean r6 = r2 instanceof com.tencent.p014mm.plugin.appbrand.C81925i2
            if (r6 == 0) goto L_0x0073
            r6 = r2
            com.tencent.mm.plugin.appbrand.i2 r6 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r6
            com.tencent.mm.plugin.appbrand.page.d1 r6 = r6.mo114341l0()
            if (r6 == 0) goto L_0x0073
            com.tencent.mm.plugin.appbrand.jsruntime.i r6 = r6.getJsRuntime()
            goto L_0x0074
        L_0x0073:
            r6 = r15
        L_0x0074:
            boolean r16 = r17.mo114216y(r18, r19, r20)
            if (r16 == 0) goto L_0x007b
            return
        L_0x007b:
            if (r6 != 0) goto L_0x007e
            goto L_0x0087
        L_0x007e:
            java.lang.Class<xc.b> r15 = p830xc.C53319b.class
            com.tencent.mm.plugin.appbrand.jsruntime.j r6 = r6.mo63321n0(r15)
            r15 = r6
            xc.b r15 = (p830xc.C53319b) r15
        L_0x0087:
            if (r15 != 0) goto L_0x00bb
            java.lang.String r0 = "invalid js runtime"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            java.lang.String r4 = "fail:invalid runtime"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x00a1
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r0[r12] = r5
            r0[r13] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
        L_0x00a1:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r8, r14)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b3
        L_0x00aa:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r7, r0)
        L_0x00b3:
            java.lang.String r0 = r1.mo115115p(r4, r5)
            r2.mo109647a(r3, r0)
            return
        L_0x00bb:
            kd.c r6 = r15.getWebViewPluginClientProxy()
            if (r6 != 0) goto L_0x00f4
            java.lang.String r0 = "webview has no plugin client"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            java.lang.String r4 = "fail:webview has no plugin client"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x00da
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r0[r12] = r5
            r0[r13] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
        L_0x00da:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r8, r14)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00ec
        L_0x00e3:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r7, r0)
        L_0x00ec:
            java.lang.String r0 = r1.mo115115p(r4, r5)
            r2.mo109647a(r3, r0)
            return
        L_0x00f4:
            com.tencent.mm.plugin.appbrand.extendplugin.b r4 = new com.tencent.mm.plugin.appbrand.extendplugin.b
            r4.<init>(r3, r0, r2, r1)
            java.lang.String r0 = r17.mo114214w()
            r6.mo122546e(r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.extendplugin.C81825d.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public abstract String mo114214w();

    /* renamed from: x */
    public int mo114215x(JSONObject jSONObject) {
        if (jSONObject == null) {
            return -1;
        }
        return jSONObject.optInt("viewId", -1);
    }

    /* renamed from: y */
    public boolean mo114216y(C82381f fVar, JSONObject jSONObject, int i) {
        return false;
    }
}
