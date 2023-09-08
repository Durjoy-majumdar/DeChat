package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.x3 */
public final class C1907x3 extends C82268c<C82554k> {
    private static final int CTRL_INDEX = 1157;
    private static final String NAME = "notifyWCPayResult";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        if (kVar != null) {
            if (kVar.getRuntime() == null) {
                kVar.mo109647a(i, mo115109j("fail:internal error"));
            } else if (jSONObject == null) {
                kVar.mo109647a(i, mo115109j("fail:invalid data"));
            } else {
                C1887w3<T> w3Var = C1887w3.f11729d;
                Bundle bundle = new Bundle();
                bundle.putString("appId", kVar.getAppId());
                bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
                bundle.putString("bizEventKey", jSONObject.optString("bizEventKey"));
                bundle.putString("jsapiName", NAME);
                bundle.putInt("jsapi_type", 1);
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, IPCInvoke_KindaJSInvoke.class, w3Var);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                kVar.mo109647a(i, mo115115p("ok", jSONObject2));
            }
        }
    }
}
