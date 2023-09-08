package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.e0 */
public class C82877e0 extends C82878f0 {
    public static final int CTRL_INDEX = 431;
    public static final String NAME = "requestMallPayment";

    /* renamed from: w */
    public void mo1505u(C82554k kVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            kVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        try {
            jSONObject.put("appId", kVar.getAppId());
            jSONObject.put("pay_for_wallet_type", 3);
            super.mo1505u(kVar, jSONObject, i);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiRequestMallPayment", e.getMessage());
            kVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
