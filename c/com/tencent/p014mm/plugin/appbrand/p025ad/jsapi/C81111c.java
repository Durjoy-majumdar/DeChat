package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import ai0.C79575q;
import ai0.C79579t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandCloseAppBrandAdUIEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.c */
public class C81111c extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 749;
    public static final String NAME = "closeSplashAd";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        String optString = jSONObject.optString(FirebaseAnalytics.C113379b.SOURCE, "");
        boolean optBoolean = jSONObject.optBoolean("animated", true);
        Log.m105925i("MicroMsg.AppBrand.JsApiCloseSplashAd[AppBrandSplashAd]", "closeSplashAd, source:%s, animated:%s", optString, Boolean.valueOf(optBoolean));
        if ("launch".equalsIgnoreCase(optString)) {
            if (eVar.getRuntime().f238294v1 != null) {
                C79575q qVar = eVar.getRuntime().f238294v1;
                qVar.f233331b.mo113024P0(new C79579t(qVar, optBoolean, optString));
            }
        } else if ("menu".equalsIgnoreCase(optString)) {
            AppBrandCloseAppBrandAdUIEvent appBrandCloseAppBrandAdUIEvent = new AppBrandCloseAppBrandAdUIEvent();
            appBrandCloseAppBrandAdUIEvent.f238417d.f238418a = eVar.getAppId();
            appBrandCloseAppBrandAdUIEvent.publish();
        }
        eVar.mo109647a(i, mo115109j("ok"));
    }
}
