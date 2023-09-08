package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g7 */
public final class C82519g7 extends C1883v2<C81879g> {
    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(gVar, "service");
        return mo114482u(gVar, jSONObject, gVar.getJsRuntime());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: org.json.JSONObject} */
    /* JADX WARNING: type inference failed for: r10v13, types: [org.json.JSONObject] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo114482u(com.tencent.p014mm.plugin.appbrand.C81879g r9, org.json.JSONObject r10, com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o r11) {
        /*
            r8 = this;
            java.lang.String r11 = "env"
            gy3.C87412m.m108594g(r9, r11)
            r11 = 0
            if (r10 == 0) goto L_0x000f
            java.lang.String r0 = "experimentType"
            java.lang.String r0 = r10.optString(r0)
            goto L_0x0010
        L_0x000f:
            r0 = r11
        L_0x0010:
            java.lang.String r1 = "opConfig"
            boolean r0 = u24.C90599h.m113509b(r1, r0)
            if (r0 == 0) goto L_0x014f
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r10 = r9.getRuntime()
            java.lang.String r0 = "), parse "
            java.lang.String r2 = "getOpConfig("
            java.lang.String r3 = "MicroMsg.WAJsApiGetABTestConfig"
            r4 = 1
            r5 = 0
            if (r10 == 0) goto L_0x0084
            java.lang.Class<com.tencent.luggage.sdk.config.AppBrandSysConfigLU> r6 = com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class
            com.tencent.mm.plugin.appbrand.jsapi.m r10 = r10.mo113021O(r6, r5)
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU r10 = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) r10
            if (r10 == 0) goto L_0x0084
            com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized r10 = r10.f234856A
            java.lang.String r10 = r10.f234897f
            if (r10 == 0) goto L_0x0084
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005d }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x005d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x005d }
            r6.<init>()     // Catch:{ JSONException -> 0x005d }
            r6.append(r2)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r7 = r9.getAppId()     // Catch:{ JSONException -> 0x005d }
            r6.append(r7)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r7 = "), sysConfig return "
            r6.append(r7)     // Catch:{ JSONException -> 0x005d }
            r6.append(r11)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x005d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ JSONException -> 0x005d }
            r10 = r11
            goto L_0x0116
        L_0x005d:
            r11 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r9 = r9.getAppId()
            r6.append(r9)
            r6.append(r0)
            r6.append(r10)
            java.lang.String r9 = " from sysConfig get exception:"
            r6.append(r9)
            r6.append(r11)
            java.lang.String r9 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
            goto L_0x0116
        L_0x0084:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r10 = r9.getRuntime()
            if (r10 == 0) goto L_0x008f
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r10 = r10.mo113036W()
            goto L_0x0090
        L_0x008f:
            r10 = r11
        L_0x0090:
            boolean r6 = r10 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU
            if (r6 == 0) goto L_0x0097
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r10 = (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) r10
            goto L_0x0098
        L_0x0097:
            r10 = r11
        L_0x0098:
            if (r10 == 0) goto L_0x00a1
            java.lang.String r10 = r10.f234823V0
            if (r10 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r11 = r10
            goto L_0x00ae
        L_0x00a1:
            boolean r10 = r9 instanceof kr0.C88267e
            if (r10 == 0) goto L_0x00a9
            r10 = r9
            kr0.e r10 = (kr0.C88267e) r10
            goto L_0x00aa
        L_0x00a9:
            r10 = r11
        L_0x00aa:
            if (r10 == 0) goto L_0x00ae
            java.lang.String r11 = r10.f255132R
        L_0x00ae:
            if (r11 == 0) goto L_0x00b9
            int r10 = r11.length()
            if (r10 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r10 = 0
            goto L_0x00ba
        L_0x00b9:
            r10 = 1
        L_0x00ba:
            if (r10 != 0) goto L_0x0111
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e1 }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x00e1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00e1 }
            r6.<init>()     // Catch:{ JSONException -> 0x00e1 }
            r6.append(r2)     // Catch:{ JSONException -> 0x00e1 }
            java.lang.String r7 = r9.getAppId()     // Catch:{ JSONException -> 0x00e1 }
            r6.append(r7)     // Catch:{ JSONException -> 0x00e1 }
            java.lang.String r7 = "), initConfig return "
            r6.append(r7)     // Catch:{ JSONException -> 0x00e1 }
            r6.append(r11)     // Catch:{ JSONException -> 0x00e1 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x00e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ JSONException -> 0x00e1 }
            r11 = r10
            goto L_0x0106
        L_0x00e1:
            r10 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r9 = r9.getAppId()
            r6.append(r9)
            r6.append(r0)
            r6.append(r11)
            java.lang.String r9 = " from initConfig get exception:"
            r6.append(r9)
            r6.append(r10)
            java.lang.String r9 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
        L_0x0106:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r9 = "expt_info"
            r10.put(r9, r11)
            goto L_0x0116
        L_0x0111:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
        L_0x0116:
            rx3.l[] r9 = new rx3.C13604l[r4]
            rx3.l r11 = new rx3.l
            r11.<init>(r1, r10)
            r9[r5] = r11
            java.util.HashMap r9 = sx3.C90364q0.m113146e(r9)
            java.lang.String r10 = "ok"
            boolean r11 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r11 == 0) goto L_0x013b
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r11[r5] = r0
            r11[r4] = r10
            java.lang.String r0 = "MicroMsg.AppBrandJsApi"
            java.lang.String r1 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r11)
        L_0x013b:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "errno"
            r9.put(r0, r11)
            java.lang.String r9 = r8.mo115114o(r10, r9)
            java.lang.String r10 = "{\n                makeRe… opConfig))\n            }"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        L_0x014f:
            java.lang.String r9 = super.mo1731t(r9, r10)
            java.lang.String r10 = "super.invoke(env, data)"
            gy3.C87412m.m108593f(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C82519g7.mo114482u(com.tencent.mm.plugin.appbrand.g, org.json.JSONObject, com.tencent.mm.plugin.appbrand.jsruntime.o):java.lang.String");
    }
}
