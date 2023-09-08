package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import org.json.JSONObject;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r4 */
public class C1849r4 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 192;
    public static final String NAME = "openSetting";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Class<AppBrandAuthorizeUI> cls = AppBrandAuthorizeUI.class;
        if (eVar.getRuntime().mo113213o1() == null) {
            Log.m105920e("MicroMsg.JsApiOpenSetting", "config is null!");
            eVar.mo109647a(i, mo115109j("fail:internal error"));
            return;
        }
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiOpenSetting", "mmActivity is null, invoke fail!");
            return;
        }
        String optString = eVar.getRuntime().mo113210l1().f234841u == 7 ? jSONObject.optString("username") : "";
        boolean optBoolean = jSONObject.optBoolean("withSubscriptions", false);
        if (Util.isNullOrNil(optString)) {
            optString = eVar.getRuntime().mo113210l1().f234839s;
        }
        Intent putExtra = new Intent(eVar.getContext(), cls).putExtra("key_username", optString);
        putExtra.putExtra("key_app_authorize_jsapi", true);
        putExtra.setClass(o0, cls);
        C89916g.m112446a(o0).mo124236j(putExtra, new C1843q4(this, optBoolean, eVar, i));
    }
}
