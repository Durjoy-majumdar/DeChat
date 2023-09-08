package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONObject;
import p775zi.C79332c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.z0 */
public class C82783z0 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 532;
    public static final String NAME = "chooseMessageFile";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiChooseMessageFile", "data is null");
            kVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            Log.m105921e("MicroMsg.JsApiChooseMessageFile", "context is null, invoke with appId:%s, callbackId:%d", kVar.getAppId(), Integer.valueOf(i));
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiChooseMessageFile", "chooseMsgFile data:%s, appId:%s, callbackId:%d", jSONObject, kVar.getAppId(), Integer.valueOf(i));
        String optString = jSONObject.optString("type", "all");
        String optString2 = jSONObject.optString("extension", "");
        ((C79332c) C86312j.m106911c(C79332c.class)).mo109364kZ(R, optString, jSONObject.optInt("count", 9), optString2, new C82779y0(this, kVar, i));
    }
}
