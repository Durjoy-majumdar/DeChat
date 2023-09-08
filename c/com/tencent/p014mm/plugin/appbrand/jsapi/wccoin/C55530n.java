package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.n */
public final class C55530n<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C82554k f158133a;

    /* renamed from: b */
    public final /* synthetic */ int f158134b;

    /* renamed from: c */
    public final /* synthetic */ C55531o f158135c;

    public C55530n(C82554k kVar, int i, C55531o oVar) {
        this.f158133a = kVar;
        this.f158134b = i;
        this.f158135c = oVar;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        ShowWCCoinFirstBuyCoinTipsResult showWCCoinFirstBuyCoinTipsResult = (ShowWCCoinFirstBuyCoinTipsResult) processResult;
        if (showWCCoinFirstBuyCoinTipsResult == null) {
            Log.m105920e("MicroMsg.JsApiShowWCCoinFirstBuyCoinTips", "onReceiveResult get NULL result");
            C82554k kVar = this.f158133a;
            int i = this.f158134b;
            C55531o oVar = this.f158135c;
            oVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            kVar.mo109647a(i, oVar.mo115115p("fail:internal error", jSONObject));
            return;
        }
        Log.m105925i("MicroMsg.JsApiShowWCCoinFirstBuyCoinTips", "onReceiveResult resultCode:%s", showWCCoinFirstBuyCoinTipsResult.f158122d);
        if (!C87412m.m108589b(showWCCoinFirstBuyCoinTipsResult.f158122d, "ok")) {
            C82554k kVar2 = this.f158133a;
            int i2 = this.f158134b;
            C55531o oVar2 = this.f158135c;
            String str = "fail " + showWCCoinFirstBuyCoinTipsResult.f158122d;
            oVar2.getClass();
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
            kVar2.mo109647a(i2, oVar2.mo115115p(str, jSONObject2));
            return;
        }
        C82554k kVar3 = this.f158133a;
        int i3 = this.f158134b;
        C55531o oVar3 = this.f158135c;
        oVar3.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
        }
        kVar3.mo109647a(i3, oVar3.mo115115p("ok", jSONObject3));
    }
}
