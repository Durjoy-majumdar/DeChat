package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.x2 */
public class C83124x2 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 101;
    public static final String NAME = "getAppConfig";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (jSONObject == null) {
            eVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiGetAppConfig", "data is null");
            return;
        }
        String appId = eVar.getAppId();
        int optInt = jSONObject.optInt("type", 0);
        Log.m105925i("MicroMsg.JsApiGetAppConfig", "getAppConfig app_id:%s,type:%d", appId, Integer.valueOf(optInt));
        if (optInt <= 0) {
            eVar.mo109647a(i, mo115109j("fail"));
            Log.m105921e("MicroMsg.JsApiGetAppConfig", "type %d is invalid", Integer.valueOf(optInt));
            return;
        }
        JsApiGetAppConfigTask jsApiGetAppConfigTask = new JsApiGetAppConfigTask();
        jsApiGetAppConfigTask.f240412f = appId;
        jsApiGetAppConfigTask.f240415i = optInt;
        jsApiGetAppConfigTask.f240416j = eVar.getRuntime().mo113208k1();
        jsApiGetAppConfigTask.f240417n = new C83057w2(this, optInt, jsApiGetAppConfigTask, eVar, i);
        jsApiGetAppConfigTask.mo114395c();
    }
}
