package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.h0 */
public class C1802h0 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 149;
    public static final String NAME = "requestPaymentToBank";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        try {
            jSONObject.put("appId", eVar.getAppId());
            AppBrandJsApiPayService.INSTANCE.startPayToBank(o0, eVar.getRuntime().mo121253n1(), jSONObject, new C1800g0(this, eVar, i));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiRequestPaymentToBank", e.getMessage());
            eVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
