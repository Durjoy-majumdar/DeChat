package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.f */
public class C1798f extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 86;
    public static final String NAME = "bindPaymentCard";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (jSONObject == null) {
            eVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        try {
            jSONObject.put("appId", eVar.getAppId());
            AppBrandJsApiPayService.INSTANCE.startBindBankcard(o0, eVar.getRuntime().mo121253n1(), jSONObject, new C1797e(this, eVar, i));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiBindPaymentCard", e.getMessage());
            eVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
