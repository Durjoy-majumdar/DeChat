package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.j */
public final class C55528j<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C82554k f158130a;

    /* renamed from: b */
    public final /* synthetic */ int f158131b;

    /* renamed from: c */
    public final /* synthetic */ C55529k f158132c;

    public C55528j(C82554k kVar, int i, C55529k kVar2) {
        this.f158130a = kVar;
        this.f158131b = i;
        this.f158132c = kVar2;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        EnterWCCoinHomePageResult enterWCCoinHomePageResult = (EnterWCCoinHomePageResult) processResult;
        if (enterWCCoinHomePageResult == null) {
            Log.m105920e("MicroMsg.JsApiEnterWCCoinHomePage", "onReceiveResult get NULL result");
            C82554k kVar = this.f158130a;
            int i = this.f158131b;
            C55529k kVar2 = this.f158132c;
            kVar2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            kVar.mo109647a(i, kVar2.mo115115p("fail:internal error", jSONObject));
            return;
        }
        Log.m105925i("MicroMsg.JsApiEnterWCCoinHomePage", "onReceiveResult resultCode:%s", enterWCCoinHomePageResult.f158120d);
        if (!C87412m.m108589b(enterWCCoinHomePageResult.f158120d, "ok")) {
            C82554k kVar3 = this.f158130a;
            int i2 = this.f158131b;
            C55529k kVar4 = this.f158132c;
            String str = "fail " + enterWCCoinHomePageResult.f158120d;
            kVar4.getClass();
            if (str == null) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, str);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            kVar3.mo109647a(i2, kVar4.mo115115p(str, jSONObject2));
            return;
        }
        C82554k kVar5 = this.f158130a;
        int i3 = this.f158131b;
        C55529k kVar6 = this.f158132c;
        kVar6.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
        }
        kVar5.mo109647a(i3, kVar6.mo115115p("ok", jSONObject3));
    }
}
