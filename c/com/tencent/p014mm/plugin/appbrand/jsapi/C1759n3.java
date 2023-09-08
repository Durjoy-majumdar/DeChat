package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n3 */
public class C1759n3 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 868;
    public static final String NAME = "requestQueryCashier";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar.getRuntime().mo113026R() == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e("MicroMsg.JsApiKindaRequestQueryCashier", "mmActivity is null, invoke fail!");
            return;
        }
        Log.m105925i("MicroMsg.JsApiKindaRequestQueryCashier", "get data: %s", jSONObject.toString());
        Bundle bundle = new Bundle();
        bundle.putString("jsApiScene", "1");
        bundle.putString("notifyType", NAME);
        bundle.putString("appId", kVar.getAppId());
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("paySign", jSONObject.optString("paySign"));
        bundle.putString("signType", jSONObject.optString("signType"));
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, IPCInvoke_KindaJSInvoke.class, new C1730m3(this, kVar, i));
    }
}
