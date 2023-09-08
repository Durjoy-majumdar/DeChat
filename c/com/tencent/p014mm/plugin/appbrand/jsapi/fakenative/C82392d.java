package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82802h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.d */
public class C82392d extends C82802h {
    /* renamed from: w */
    public void mo1505u(C82554k kVar, JSONObject jSONObject, int i) {
        String str = C84072q1.m103587b(kVar.getRuntime().f238147j).f245465i;
        Log.m105925i("MicroMsg.JsApiNavigateBackMiniProgramWC", "navigate back miniprogram, businessType:%s", str);
        if (!Util.isNullOrNil(str)) {
            String optString = jSONObject.optString("extraData");
            Log.m105925i("MicroMsg.JsApiNavigateBackMiniProgramWC", "navigate back MiniProgram, businessType:%s", str);
            OpenBusinessViewUtil.m101150d(str, 0, optString);
            C84072q1.m103586a(kVar.getAppId()).f245468l = true;
        }
        OpenBusinessViewUtil.m101148b((AppBrandRuntimeWC) kVar.getRuntime());
        super.mo1505u(kVar, jSONObject, i);
    }
}
