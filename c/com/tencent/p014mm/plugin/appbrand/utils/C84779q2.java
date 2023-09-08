package com.tencent.p014mm.plugin.appbrand.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import km0.C88224a;
import km0.C88226c;
import org.json.JSONObject;
import sp0.C90272a;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.q2 */
public final class C84779q2 implements C88224a {

    /* renamed from: d */
    public static final C84779q2 f247202d = new C84779q2();

    /* renamed from: A4 */
    public String mo117489A4(C82381f fVar) {
        C87412m.m108594g(fVar, "component");
        C90272a aVar = (C90272a) fVar.mo109671p(C90272a.class);
        if (aVar == null) {
            Log.m105928w("MicroMsg.AppBrand.WxaReferrerHelper", "provideReferrer, networkConfig is null");
            return null;
        }
        String str = aVar.f259122D;
        C87412m.m108593f(str, "referrer");
        if (str.length() == 0) {
            Log.m105928w("MicroMsg.AppBrand.WxaReferrerHelper", "provideReferrer, referrer is empty");
            return null;
        }
        Log.m105924i("MicroMsg.AppBrand.WxaReferrerHelper", "provide, referrer: " + str);
        return str;
    }

    /* renamed from: BT */
    public String mo117490BT(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        if (!jSONObject.has("referrerPolicy")) {
            Log.m105924i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyStr, referrerPolicy does not exist");
            return null;
        }
        String optString = jSONObject.optString("referrerPolicy");
        C87412m.m108593f(optString, "referrerPolicyStr");
        if (!(optString.length() == 0)) {
            return optString;
        }
        Log.m105928w("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyStr, referrerPolicyStr is empty");
        return null;
    }

    /* renamed from: e4 */
    public C88226c mo117491e4() {
        return C88226c.NO_REFERRER;
    }

    /* renamed from: eV */
    public C88226c mo117492eV(C82381f fVar) {
        C87412m.m108594g(fVar, "component");
        C90272a aVar = (C90272a) fVar.mo109671p(C90272a.class);
        if (aVar != null) {
            return aVar.f259121C;
        }
        Log.m105928w("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyFallback, networkConfig is null");
        return null;
    }

    /* renamed from: f2 */
    public C88226c mo117493f2(JSONObject jSONObject, C82381f fVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(fVar, "component");
        String BT = mo117490BT(jSONObject);
        if (BT == null) {
            Log.m105924i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicyOrFallback, referrerPolicyStr is null");
            return mo117492eV(fVar);
        }
        C88226c kn = mo117494kn(BT);
        return kn == null ? mo117492eV(fVar) : kn;
    }

    /* renamed from: kn */
    public C88226c mo117494kn(String str) {
        C87412m.m108594g(str, "referrerPolicyStr");
        C88226c cVar = C87412m.m108589b(str, FirebaseAnalytics.C113379b.ORIGIN) ? C88226c.ORIGIN : C87412m.m108589b(str, "no-referrer") ? C88226c.NO_REFERRER : null;
        Log.m105924i("MicroMsg.AppBrand.WxaReferrerHelper", "parseReferrerPolicy, referrerPolicy: " + cVar);
        return cVar;
    }
}
