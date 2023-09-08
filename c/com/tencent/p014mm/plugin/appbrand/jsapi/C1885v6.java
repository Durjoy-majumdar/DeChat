package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import te3.aq4;
import te3.zp4;
import zp0.C16377l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.v6 */
public final class C1885v6 extends C82268c<C81925i2> {
    @Deprecated
    public static final int CTRL_INDEX = 313;
    @Deprecated
    public static final String NAME = "verifyPlugin";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C87412m.m108594g(i2Var, "service");
        if (jSONObject == null || !jSONObject.has("data")) {
            i2Var.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        String str = "appId[" + i2Var.getAppId() + "] callbackId[" + i + ']';
        zp4 zp4 = new zp4();
        zp4.f146173d = i2Var.getAppId();
        zp4.f146174e = jSONObject.optString("data");
        C16377l lVar = (C16377l) i2Var.mo109668l(C16377l.class);
        if (lVar == null) {
            Log.m105920e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " NULL cgiService");
            i2Var.mo109647a(i, mo115109j("fail:internal error"));
            return;
        }
        lVar.mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/verifyplugin", zp4.f146173d, zp4, aq4.class).mo114038a(new C1882u6(str, i2Var, i, this));
    }
}
