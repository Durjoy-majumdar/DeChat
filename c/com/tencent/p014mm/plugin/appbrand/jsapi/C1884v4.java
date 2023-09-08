package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ie3.C76324c;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.v4 */
public class C1884v4 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 618;
    public static final String NAME = "openWCPayLQTDepositPlan";

    /* renamed from: g */
    public final int f11728g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "mmActivity is null, invoke fail!");
            return;
        }
        C89916g.m112446a(R).mo124232f(new C1881u4(this, R, kVar, i));
        AppBrandSysConfigWC e = C81682d.m100225e(kVar.getAppId());
        if (e == null) {
            kVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "sysConfig is null, invoke fail!");
            return;
        }
        AppBrandRuntimeWC b = C81682d.m100222b(kVar.getAppId());
        if (b == null) {
            kVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "runtime is null, invoke fail!");
            return;
        }
        Log.m105918d("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "do openWCPayLQTDepositPlan");
        String currentUrl = b.mo113212m1().getCurrentUrl();
        String optString = jSONObject.optString("routURL");
        Bundle bundle = new Bundle();
        bundle.putString("appId", kVar.getAppId());
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("packageExt", jSONObject.optString("package"));
        bundle.putString("signtype", jSONObject.optString("signType"));
        bundle.putString("paySignature", jSONObject.optString("paySign"));
        bundle.putString("pay_channel", jSONObject.optString("pay_channel"));
        bundle.putString("routeURL", jSONObject.optString("routURL"));
        bundle.putString("wxapp_username", e.f261061d);
        bundle.putInt("jsapi_scene", 21);
        bundle.putString("command_word", NAME);
        bundle.putString("wxapp_path", currentUrl);
        bundle.putInt("source_type", 2);
        if (TextUtils.isEmpty(optString)) {
            C88144b.m109795m(R, "wallet", ".ui.WalletJsApiAdapterUI", new Intent().putExtras(bundle), this.f11728g);
        } else if ("LQTFixedDepositPlanList".equals(optString)) {
            ((C76324c) C86312j.m106911c(C76324c.class)).startLqtFixedDepositPlanListUseCase(R, bundle);
            kVar.mo109647a(i, mo115109j("ok"));
        } else {
            kVar.mo109647a(i, mo115109j("fail:auth denied"));
            Log.m105920e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "routURL auth failed!");
        }
    }
}
