package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.os.Bundle;
import com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.l */
public final class C1810l extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1130;
    public static final String NAME = "notifyDcpPaymentCallback";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (eVar != null) {
            if (eVar.getRuntime() == null) {
                eVar.mo109647a(i, mo115109j("fail:internal error"));
            } else if (jSONObject == null) {
                eVar.mo109647a(i, mo115109j("fail:invalid data"));
            } else {
                String optString = jSONObject.optString("ret_status");
                String optString2 = jSONObject.optString("dcp_token");
                Bundle bundle = new Bundle();
                bundle.putString("ret_status", optString);
                bundle.putString("dcp_token", optString2);
                bundle.putString("jsapiName", NAME);
                bundle.putInt("jsapi_type", 1);
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, IPCInvoke_KindaJSInvoke.class, C1808k.f11608d);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                eVar.mo109647a(i, mo115115p("ok", jSONObject2));
            }
        }
    }
}
