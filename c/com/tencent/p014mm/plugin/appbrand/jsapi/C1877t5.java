package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t5 */
public final class C1877t5 extends C82268c<C82554k> {
    private static final int CTRL_INDEX = 1087;
    private static final String NAME = "requestSnsPayment";

    /* renamed from: g */
    public final int f11716g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar != null && jSONObject != null) {
            Activity R = kVar.getRuntime().mo113026R();
            if (R == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error invalid android context");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                kVar.mo109647a(i, mo115115p("fail:internal error invalid android context", jSONObject2));
                Log.m105920e("MicroMsg.JsApiRequestSnsPayment", "context null");
                return;
            }
            C89916g.m112446a(R).mo124232f(new C1852s5(this, kVar, i));
            Bundle bundle = new Bundle();
            bundle.putString("appId", kVar.getAppId());
            bundle.putInt("payScene", jSONObject.optInt("payScene", 2));
            bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
            bundle.putString("package", jSONObject.optString("package"));
            bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
            bundle.putString("paySign", jSONObject.optString("paySign"));
            bundle.putString("signType", jSONObject.optString("signType"));
            bundle.putString("prepayId", jSONObject.optString("prepayId"));
            bundle.putString("partnerId", jSONObject.optString("partnerId"));
            bundle.putString("bindSerial", jSONObject.optString("bindSerial"));
            bundle.putString("bankType", jSONObject.optString("bankType"));
            bundle.putString("jsapiName", NAME);
            bundle.putString("paymentDeskModalTitle", jSONObject.optString("paymentDeskModalTitle"));
            bundle.putInt("jsapi_type", 1);
            C88144b.m109795m(R, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new Intent().putExtras(bundle), this.f11716g);
        }
    }
}
