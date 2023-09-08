package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.luggage.sdk.launching.C80242c;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t */
public final class C83600t implements C83596o {

    /* renamed from: a */
    public final C83588k f244167a;

    /* renamed from: b */
    public final int f244168b = (hashCode() & 65535);

    public C83600t(C83588k kVar) {
        C87412m.m108594g(kVar, "runtime");
        this.f244167a = kVar;
    }

    /* renamed from: a */
    public void mo115856a(C1938p pVar, int i, String str) {
        C87412m.m108594g(pVar, "component");
        C87412m.m108594g(str, "data");
        if (this.f244168b == i) {
            mo115914d((String) null, str);
        }
    }

    /* renamed from: b */
    public void mo115857b(C1938p pVar, int i, String str) {
        C87412m.m108594g(pVar, "component");
        C87412m.m108594g(str, "callbackStr");
        Log.m105924i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.WebInvokeProcess", "onPayAheadCallback, instance(" + hashCode() + ", callbackId(" + i + "), callbackStr(" + str + ')');
        mo115914d((String) null, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061 A[ADDED_TO_REGION, Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115858c(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "name"
            java.lang.String r1 = "invokeData"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "performInvoke with instance("
            r1.append(r2)
            int r2 = r8.hashCode()
            r1.append(r2)
            java.lang.String r2 = "), appId("
            r1.append(r2)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r8.f244167a
            java.lang.String r2 = r2.f238147j
            r1.append(r2)
            java.lang.String r2 = ") data("
            r1.append(r2)
            r1.append(r9)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.FunctionalAPIInvokeManager.WebInvokeProcess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            r1.<init>(r9)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.String r9 = r1.optString(r0)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.String r3 = "args"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.String r4 = "transitiveData"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            r5 = 0
            r6 = 1
            if (r9 == 0) goto L_0x005e
            int r7 = r9.length()     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            if (r7 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r7 = 0
            goto L_0x005f
        L_0x005e:
            r7 = 1
        L_0x005f:
            if (r7 != 0) goto L_0x00bd
            if (r3 == 0) goto L_0x0069
            int r7 = r3.length()     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            if (r7 != 0) goto L_0x006a
        L_0x0069:
            r5 = 1
        L_0x006a:
            if (r5 == 0) goto L_0x006d
            goto L_0x00bd
        L_0x006d:
            java.lang.String r5 = "jsapiType"
            java.lang.String r1 = r1.optString(r5)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.String r5 = "appservice"
            boolean r5 = gy3.C87412m.m108589b(r1, r5)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            if (r5 == 0) goto L_0x0089
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r0 = r8.f244167a     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            com.tencent.mm.plugin.appbrand.i2 r0 = r0.f238150p     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            kr0.e r0 = (kr0.C88267e) r0     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService"
            gy3.C87412m.m108592e(r0, r1)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e r0 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83557e) r0     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            goto L_0x00a3
        L_0x0089:
            java.lang.String r5 = "webview"
            boolean r1 = gy3.C87412m.m108589b(r1, r5)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            if (r1 == 0) goto L_0x00ab
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r0 = r8.f244167a     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r0.mo113212m1()     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r0.getPageView()     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView"
            gy3.C87412m.m108592e(r0, r1)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j r0 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83563j) r0     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
        L_0x00a3:
            java.lang.String r1 = ""
            int r4 = r8.f244168b     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            r0.mo114844O(r9, r3, r1, r4)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            goto L_0x00d9
        L_0x00ab:
            java.lang.String r1 = "fail invalid jsapiType"
            gy3.C87412m.m108593f(r9, r0)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.String r9 = com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C1931d.m1941a(r1, r9)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            r8.mo115914d(r4, r9)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            r9.<init>()     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            throw r9     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
        L_0x00bd:
            java.lang.String r9 = "fail invalid args"
            r8.mo115914d(r4, r9)     // Catch:{ JSONException -> 0x00c3, RuntimeException -> 0x00d9 }
            return
        L_0x00c3:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "performInvoke, json parse e = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83600t.mo115858c(java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo115914d(String str, String str2) {
        Log.m105924i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.WebInvokeProcess", "navigateBack, instance(" + hashCode() + "), invokeResult(" + str2 + ')');
        C80242c<?> cVar = this.f244167a.mo113210l1().f234820U;
        if (cVar != null) {
            cVar.mo111345a(new ByRuntimeQrcodeResult(str2, str));
            C83588k kVar = this.f244167a;
            kVar.mo113176H1(new C83593l(kVar, kVar.mo113026R()));
        }
    }
}
