package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.n0 */
public class C1815n0 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 707;
    public static final String NAME = "requestVerifyUserIdentity";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("MicroMsg.JsApiRequestVerifyUserIdentity", "invoke JsApiRequestVerifyUserIdentity!");
        if (eVar == null) {
            Log.m105920e("MicroMsg.JsApiRequestVerifyUserIdentity", "fail:component is null");
            return;
        }
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            Log.m105920e("MicroMsg.JsApiRequestVerifyUserIdentity", "fail:context is null");
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            String appId = eVar.getAppId();
            String optString = jSONObject.optString("sessionid");
            if (!(optString == null || appId == null || optString.isEmpty())) {
                if (!appId.isEmpty()) {
                    hashMap.put("appId", appId);
                    hashMap.put("sessionId", optString);
                    AppBrandJsApiPayService.INSTANCE.startPayComponent(o0, eVar.getRuntime().mo121253n1(), "verifyUserIdentity", hashMap, new C1813m0(this, eVar, i));
                    return;
                }
            }
            eVar.mo109647a(i, mo115112m("fail", new C1809k0(this)));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiRequestVerifyUserIdentity", e.getMessage());
            eVar.mo109647a(i, mo115112m("fail", new C1811l0(this)));
        }
    }
}
