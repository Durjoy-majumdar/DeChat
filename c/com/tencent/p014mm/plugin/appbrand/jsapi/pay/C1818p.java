package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.p */
public class C1818p extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 701;
    public static final String NAME = "openSelectPayment";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            String appId = eVar.getAppId();
            String optString = jSONObject.optString("sessionid");
            String optString2 = jSONObject.optString("url");
            if (!(optString == null || appId == null || optString.isEmpty())) {
                if (!appId.isEmpty()) {
                    hashMap.put("appId", appId);
                    hashMap.put("sessionId", optString);
                    hashMap.put("JSAPIFunc", mo114779e());
                    if (optString2 != null) {
                        hashMap.put("webViewUrl", optString2);
                    }
                    AppBrandJsApiPayService.INSTANCE.startPayComponent(o0, eVar.getRuntime().mo121253n1(), "selectPayment", hashMap, new C1816o(this, eVar, i));
                    return;
                }
            }
            eVar.mo109647a(i, mo115112m("fail", new C1812m(this)));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiOpenSelectPayment", e.getMessage());
            eVar.mo109647a(i, mo115112m("fail", new C1814n(this)));
        }
    }
}
