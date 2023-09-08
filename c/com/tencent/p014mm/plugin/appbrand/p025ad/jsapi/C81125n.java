package com.tencent.p014mm.plugin.appbrand.p025ad.jsapi;

import ai0.C79570o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.n */
public class C81125n extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 757;
    public static final String NAME = "splashAdFirstStepViewLayoutStateChange";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        int optInt = jSONObject.optInt("state", -1);
        if (optInt == 0 || optInt == 1) {
            long nowMilliSecond = Util.nowMilliSecond();
            if (optInt == 0) {
                Log.m105925i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, startTime:%s", Long.valueOf(nowMilliSecond));
                C79570o.m96621a(eVar.getRuntime()).f233277k = nowMilliSecond;
            } else {
                Log.m105925i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, endTime:%s", Long.valueOf(nowMilliSecond));
                C79570o.m96621a(eVar.getRuntime()).f233278l = nowMilliSecond;
                Log.m105925i("MicroMsg.AppBrand.JsApiSplashAdFirstStepLayoutChange[AppBrandSplashAd]", "splashAdFirstStep, costTime:%s", Long.valueOf(C79570o.m96621a(eVar.getRuntime()).f233278l - C79570o.m96621a(eVar.getRuntime()).f233277k));
            }
            eVar.mo109647a(i, mo115109j("ok"));
            return;
        }
        eVar.mo109647a(i, mo115109j("fail:invalid data"));
    }
}
