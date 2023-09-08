package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p275xz.C15919f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.c0 */
public class C1795c0 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 682;
    public static final String NAME = "requestH5Transaction";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Log.m105924i("MicroMsg.JsApiRequestH5Transaction", "invoke JsApiRequestH5Transaction!");
        if (kVar == null) {
            Log.m105920e("MicroMsg.JsApiRequestH5Transaction", "fail:component is null");
            return;
        }
        Context context = kVar.getContext();
        if (context == null) {
            Log.m105920e("MicroMsg.JsApiRequestH5Transaction", "fail:context is null");
            kVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        String optString = jSONObject.optString("closeWebAfterPayDetailBack");
        Log.m105925i("MicroMsg.JsApiRequestH5Transaction", "close window: %s", optString);
        if (Util.isEqual("1", optString)) {
            MMHandlerThread.postToMainThreadDelayed(new C1793b0(this, kVar), 1000);
        }
        Intent intent = new Intent();
        intent.putExtra("appId", kVar.getAppId());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("url", jSONObject.optString("url"));
        if (((C15919f) C86312j.m106911c(C15919f.class)).mo14573mq(context, intent)) {
            kVar.mo109647a(i, mo115109j("ok"));
        } else {
            kVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
