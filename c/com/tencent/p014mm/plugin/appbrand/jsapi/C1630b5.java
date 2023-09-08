package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONObject;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b5 */
public class C1630b5 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 617;
    public static final String NAME = "openWCPayLQTSave";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiOpenWCPayLQTSave", "mmActivity is null, invoke fail!");
            return;
        }
        C89916g.m112446a(R).mo124232f(new C1577a5(this, R, kVar, i));
        AppBrandSysConfigWC e = C81682d.m100225e(kVar.getAppId());
        if (e == null) {
            kVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenWCPayLQTSave", "sysConfig is null, invoke fail!");
            return;
        }
        AppBrandRuntimeWC b = C81682d.m100222b(kVar.getAppId());
        if (b == null) {
            kVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenWCPayLQTSave", "runtime is null, invoke fail!");
            return;
        }
        Log.m105918d("MicroMsg.JsApiOpenWCPayLQTSave", "do openWCPayLQTDepositPlan");
        String currentUrl = b.mo113212m1().getCurrentUrl();
        Intent intent = new Intent();
        intent.putExtra("appId", kVar.getAppId());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("pay_channel", jSONObject.optString("pay_channel"));
        intent.putExtra("wxapp_username", e.f261061d);
        intent.putExtra("jsapi_scene", 20);
        intent.putExtra("command_word", NAME);
        intent.putExtra("wxapp_path", currentUrl);
        intent.putExtra("source_type", 2);
        C88144b.m109795m(R, "wallet", ".ui.WalletJsApiAdapterUI", intent, hashCode() & 65535);
    }
}
