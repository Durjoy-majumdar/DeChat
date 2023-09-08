package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import p275xz.C15919f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p4 */
public class C1774p4 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 403;
    public static final String NAME = "openOfflinePayView";

    /* renamed from: g */
    public final int f11531g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiOpenOfflinePayView", "mmActivity is null, invoke fail!");
            return;
        }
        C89916g.m112446a(R).mo124232f(new C1765o4(this, kVar, i));
        Log.m105919d("MicroMsg.JsApiOpenOfflinePayView", "json: %s", jSONObject.toString());
        AppBrandSysConfigWC e = C81682d.m100225e(kVar.getAppId());
        if (e == null) {
            kVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenOfflinePayView", "sysConfig is null, invoke fail!");
            return;
        }
        AppBrandRuntimeWC b = C81682d.m100222b(kVar.getAppId());
        if (b == null) {
            kVar.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenOfflinePayView", "runtime is null, invoke fail!");
            return;
        }
        String currentUrl = b.mo113212m1().getCurrentUrl();
        Intent intent = new Intent();
        intent.putExtra("appId", kVar.getAppId());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("wxapp_username", e.f261061d);
        intent.putExtra("wxapp_path", currentUrl);
        ((C15919f) C86312j.m106911c(C15919f.class)).mo14569ew(R, intent, this.f11531g);
    }
}
