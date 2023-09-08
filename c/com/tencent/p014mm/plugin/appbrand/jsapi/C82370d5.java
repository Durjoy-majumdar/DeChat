package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p1044ub.C90630c;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.d5 */
public class C82370d5 extends C82268c<C91635f> {
    public static final int CTRL_INDEX = 430;
    public static final String NAME = "pageNotFoundCallback";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91635f fVar2 = (C91635f) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiPageNotFoundCallback", "data is null, do nothing");
            fVar2.mo109647a(i, mo115109j("fail"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiPageNotFoundCallback", "pageNotFoundCallback data:%s", jSONObject);
        boolean optBoolean = jSONObject.optBoolean("hasHandler", false);
        int optInt = jSONObject.optInt("webviewId", -1);
        C90630c F0 = fVar2.mo114341l0();
        if (optBoolean) {
            if (F0 != null) {
                F0.mo124770z1(true);
                if (F0.getComponentId() != optInt) {
                    Log.m105921e("MicroMsg.JsApiPageNotFoundCallback", "appBrandPageView.getComponentId():%d, webviewId:%d, err", Integer.valueOf(F0.getComponentId()), Integer.valueOf(optInt));
                }
            } else {
                Log.m105920e("MicroMsg.JsApiPageNotFoundCallback", "appBrandPageView is null");
            }
            Log.m105924i("MicroMsg.JsApiPageNotFoundCallback", "already handler, ignore");
            fVar2.mo109647a(i, mo115109j("ok"));
            return;
        }
        if (F0 != null && F0.getComponentId() == optInt) {
            F0.mo109673t(new C82271c5(this, F0));
        }
        Log.m105920e("MicroMsg.JsApiPageNotFoundCallback", "currentPageView is null, return");
        fVar2.mo109647a(i, mo115109j("ok"));
    }
}
