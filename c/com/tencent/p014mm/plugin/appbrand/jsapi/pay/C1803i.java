package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.pluginsdk.wallet.WalletJsapiData;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.i */
public class C1803i extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 693;
    public static final String NAME = "getWCPayOverseaPrepayRequest";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "invoke JsApiGetWCPayOverseaPrepayRequest!");
        if (eVar == null) {
            Log.m105920e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "fail:component is null");
            return;
        }
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            Log.m105920e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "fail:context is null");
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        WalletJsapiData walletJsapiData = new WalletJsapiData(jSONObject);
        walletJsapiData.f24058A = 2;
        if (!AppBrandJsApiPayUtils.m101643b(o0, new C1801h(this, walletJsapiData, new C1799g(this, o0, eVar, i)))) {
            eVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
