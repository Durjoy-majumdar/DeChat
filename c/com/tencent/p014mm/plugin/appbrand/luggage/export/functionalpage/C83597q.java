package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.app.Activity;
import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kr0.C88267e;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q */
public final class C83597q implements C83596o {

    /* renamed from: a */
    public final C83588k f244160a;

    /* renamed from: b */
    public int f244161b;

    /* renamed from: c */
    public final SparseArray<C55537a> f244162c = new SparseArray<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q$a */
    public static abstract class C55537a {

        /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q$a$a */
        public static final class C55538a extends C55537a {

            /* renamed from: a */
            public final String f158144a;

            public C55538a(String str) {
                this.f158144a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C55538a) && C87412m.m108589b(this.f158144a, ((C55538a) obj).f158144a);
            }

            public int hashCode() {
                String str = this.f158144a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "InvokeCallbackContext(transitiveData=" + this.f158144a + ')';
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q$a$b */
        public static final class C55539b extends C55537a {

            /* renamed from: a */
            public static final C55539b f158145a = new C55539b();
        }
    }

    public C83597q(C83588k kVar) {
        C87412m.m108594g(kVar, "runtime");
        this.f244160a = kVar;
    }

    /* renamed from: a */
    public void mo115856a(C1938p pVar, int i, String str) {
        C87412m.m108594g(pVar, "component");
        C87412m.m108594g(str, "data");
        C55537a aVar = this.f244162c.get(i, (Object) null);
        if (aVar instanceof C55537a.C55538a) {
            this.f244162c.remove(i);
            mo115913d(((C55537a.C55538a) aVar).f158144a, str);
        } else if (aVar instanceof C55537a.C55539b) {
            this.f244162c.remove(i);
            Activity R = this.f244160a.mo113026R();
            if (R != null) {
                R.moveTaskToBack(true);
            }
            this.f244160a.mo113006E();
        }
    }

    /* renamed from: b */
    public void mo115857b(C1938p pVar, int i, String str) {
        C87412m.m108594g(pVar, "component");
        C87412m.m108594g(str, "callbackStr");
        Log.m105924i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess", "onPayAheadCallback, instance(" + hashCode() + ", callbackId(" + i + "), callbackStr(" + str + ')');
        mo115856a(pVar, i, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061 A[ADDED_TO_REGION, Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }] */
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
            java.lang.String r2 = ") appId("
            r1.append(r2)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r8.f244160a
            java.lang.String r2 = r2.f238147j
            r1.append(r2)
            java.lang.String r2 = ") data("
            r1.append(r2)
            r1.append(r9)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            r1.<init>(r9)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r9 = r1.optString(r0)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r3 = "args"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r4 = "transitiveData"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            r5 = 0
            r6 = 1
            if (r9 == 0) goto L_0x005e
            int r7 = r9.length()     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            if (r7 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r7 = 0
            goto L_0x005f
        L_0x005e:
            r7 = 1
        L_0x005f:
            if (r7 != 0) goto L_0x00ca
            if (r3 == 0) goto L_0x0069
            int r7 = r3.length()     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            if (r7 != 0) goto L_0x006a
        L_0x0069:
            r5 = 1
        L_0x006a:
            if (r5 == 0) goto L_0x006d
            goto L_0x00ca
        L_0x006d:
            java.lang.String r5 = "jsapiType"
            java.lang.String r1 = r1.optString(r5)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r5 = "appservice"
            boolean r5 = gy3.C87412m.m108589b(r1, r5)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            if (r5 == 0) goto L_0x0089
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r0 = r8.f244160a     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.i2 r0 = r0.f238150p     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            kr0.e r0 = (kr0.C88267e) r0     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService"
            gy3.C87412m.m108592e(r0, r1)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e r0 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83557e) r0     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            goto L_0x00a3
        L_0x0089:
            java.lang.String r5 = "webview"
            boolean r1 = gy3.C87412m.m108589b(r1, r5)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            if (r1 == 0) goto L_0x00b8
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r0 = r8.f244160a     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r0 = r0.mo113212m1()     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r0.getPageView()     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView"
            gy3.C87412m.m108592e(r0, r1)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j r0 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83563j) r0     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
        L_0x00a3:
            int r1 = r8.f244161b     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            int r1 = r1 + r6
            r8.f244161b = r1     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q$a> r5 = r8.f244162c     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q$a$a r6 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q$a$a     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            r5.put(r1, r6)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r4 = ""
            r0.mo114844O(r9, r3, r4, r1)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            goto L_0x00e6
        L_0x00b8:
            java.lang.String r1 = "fail invalid jsapiType"
            gy3.C87412m.m108593f(r9, r0)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.String r9 = com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C1931d.m1941a(r1, r9)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            r8.mo115913d(r4, r9)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            r9.<init>()     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            throw r9     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
        L_0x00ca:
            java.lang.String r9 = "fail invalid args"
            r8.mo115913d(r4, r9)     // Catch:{ JSONException -> 0x00d0, RuntimeException -> 0x00e6 }
            return
        L_0x00d0:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "performInvoke, json parse e = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83597q.mo115858c(java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo115913d(String str, String str2) {
        Log.m105924i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.LegacySDKInvokeProcess", "navigateBack, instance(" + hashCode() + "), invokeResult(" + str2 + ')');
        int i = this.f244161b + 1;
        this.f244161b = i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", str2);
        jSONObject2.put("transitiveData", str);
        C13598b0 b0Var = C13598b0.f38549a;
        jSONObject.put("extraData", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "JSONObject().apply {\n   …   )\n        }.toString()");
        this.f244162c.put(i, C55537a.C55539b.f158145a);
        ((C88267e) this.f244160a.f238150p).mo114844O(JsApiNavigateBackApplication.NAME, jSONObject3, "", i);
    }
}
