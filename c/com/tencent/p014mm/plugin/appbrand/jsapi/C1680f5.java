package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f5 */
public class C1680f5 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1050;
    public static final String NAME = "phoneBindCardEntry";

    /* renamed from: g */
    public final int f11357g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiPhoneBindCardEntry", "mmActivity is null, invoke fail!");
            return;
        }
        C89916g.m112446a(R).mo124232f(new C1674e5(this, kVar, i));
        Log.m105925i("MicroMsg.JsApiPhoneBindCardEntry", "get data: %s", jSONObject.toString());
        Bundle bundle = new Bundle();
        bundle.putString("app_id", kVar.getAppId());
        bundle.putString("nonce_str", jSONObject.optString("noncestr"));
        bundle.putString("timeStamp", jSONObject.optString(AppMeasurement.Param.TIMESTAMP));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("paySign", jSONObject.optString("paysign"));
        bundle.putString("signType", jSONObject.optString("signtype"));
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        C88144b.m109795m(R, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new Intent().putExtras(bundle), this.f11357g);
    }
}
