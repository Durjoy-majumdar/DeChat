package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5 */
public class C1700h5 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 829;
    public static final String NAME = "phoneBindCardVerifySms";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar.getRuntime().mo113026R() == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiPhoneBindCardVerifySms", "mmActivity is null, invoke fail!");
            return;
        }
        Log.m105925i("MicroMsg.JsApiPhoneBindCardVerifySms", "get data: %s", jSONObject.toString());
        Bundle bundle = new Bundle();
        bundle.putString("app_id", kVar.getAppId());
        bundle.putString("nonce_str", jSONObject.optString("noncestr"));
        bundle.putString("timeStamp", jSONObject.optString(AppMeasurement.Param.TIMESTAMP));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("signType", jSONObject.optString("signtype"));
        bundle.putString("paySign", jSONObject.optString("paysign"));
        bundle.putString("sessionid", jSONObject.optString("sessionid"));
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, IPCInvoke_KindaJSInvoke.class, new C1696g5(this, kVar, i));
    }
}
