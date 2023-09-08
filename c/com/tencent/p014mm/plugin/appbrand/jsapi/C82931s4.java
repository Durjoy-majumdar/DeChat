package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.s4 */
public class C82931s4 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 201;
    public static final String NAME = "openUrl";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        String optString = jSONObject.optString("url");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        String optString2 = jSONObject.optString("pageOrientation");
        Log.m105925i("MicroMsg.JsApiOpenUrl", "pageOrientation:%s", optString2);
        Context context = i2Var.getContext();
        if (context != null) {
            C40469j0.C40470a aVar = new C40469j0.C40470a();
            aVar.f108759c = i2Var;
            ((C40469j0) i2Var.mo109668l(C40469j0.class)).mo56167JF(context, optString, optString2, aVar);
            i2Var.mo109647a(i, mo115109j("ok"));
            return;
        }
        i2Var.mo109647a(i, mo115109j("fail"));
    }
}
