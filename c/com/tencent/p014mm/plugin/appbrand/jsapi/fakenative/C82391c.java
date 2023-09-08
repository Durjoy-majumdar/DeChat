package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.c */
public class C82391c extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 593;
    public static final String NAME = "navigateBackH5";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        String str = C84072q1.m103587b(kVar.getRuntime().f238147j).f245465i;
        Log.m105925i("MicroMsg.JsApiNavigateBackH5", "navigate back H5, businessType:%s", str);
        if (!Util.isNullOrNil(str)) {
            OpenBusinessViewUtil.m101149c(str, jSONObject.optString("extraData"), 0);
            C84072q1.m103586a(kVar.getAppId()).f245467k = true;
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 0);
            kVar.mo109647a(i, mo115112m("ok", hashMap));
            kVar.getRuntime().mo113006E();
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("errCode", -1);
        Log.m105924i("MicroMsg.JsApiNavigateBackH5", "fail system error");
        kVar.mo109647a(i, mo115112m("fail system error", hashMap2));
    }
}
