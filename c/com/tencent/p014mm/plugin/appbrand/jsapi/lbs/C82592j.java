package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.j */
public class C82592j extends C82593k {
    private static final int CTRL_INDEX = 587;
    private static final String NAME = "disableLocationUpdate";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.AppBrand.JsApiDisableLocationUpdate", "disableLocationUpdate invoke");
        C82581d0 d0Var = (C82581d0) i2Var.mo109666h(C82581d0.class);
        this.f241718g = d0Var;
        if (d0Var == null) {
            Log.m105924i("MicroMsg.AppBrand.JsApiDisableLocationUpdate", "fail:location update not enabled");
            i2Var.mo109647a(i, mo115109j("fail:location update not enabled"));
        } else {
            d0Var.f241700i = true;
            d0Var.sendMessage(2);
            i2Var.mo109647a(i, mo115109j("ok"));
        }
        C82581d0 d0Var2 = this.f241718g;
        if (!(d0Var2 instanceof C82587e0)) {
            Log.m105928w("MicroMsg.AppBrand.JsApiDisableLocationUpdateWxa", "state manager not RuntimeLocationUpdateStateManagerWxa");
            i2Var.mo109647a(i, mo115109j("fail:system error"));
        } else {
            ((C82587e0) d0Var2).mo114900e(i2Var.getRuntime());
        }
        C82581d0 d0Var3 = this.f241718g;
        if (d0Var3 != null && d0Var3.f241702n) {
            AppBrandBackgroundRunningMonitor.m100056a(i2Var, 2, 2, false);
        }
    }
}
