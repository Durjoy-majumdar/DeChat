package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kr0.C88267e;
import org.json.JSONObject;
import p225rc.C12969d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o5 */
public final class C82867o5 extends C82268c<C88267e> {
    private static final int CTRL_INDEX = 1070;
    private static final String NAME = "publishWechatStateActivity";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String a;
        C88267e eVar = (C88267e) fVar;
        if (eVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "invoke, env is null");
            return;
        }
        String appId = eVar.getAppId();
        String str = "";
        if (appId == null) {
            appId = str;
        }
        if (!(jSONObject == null || (a = C12969d.m12407a(jSONObject, "activityToken")) == null)) {
            str = a;
        }
        PublishTextStatusParams publishTextStatusParams = new PublishTextStatusParams(appId, str);
        Log.m105924i("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "prepareParams, publishTextStatusParams: " + publishTextStatusParams);
        Context context = eVar.getContext();
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C87412m.m108593f(context, "env.context ?: MMApplicationContext.getContext()");
        C81956c.m100675c(context, new DoPublishTextStatusRequest(publishTextStatusParams), new C82642m5(new C82840n5(eVar, i, this)), (Intent) null);
    }
}
