package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.f */
public final class C55526f<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C82554k f158127a;

    /* renamed from: b */
    public final /* synthetic */ int f158128b;

    /* renamed from: c */
    public final /* synthetic */ C55527g f158129c;

    public C55526f(C82554k kVar, int i, C55527g gVar) {
        this.f158127a = kVar;
        this.f158128b = i;
        this.f158129c = gVar;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        BuyWCCoinResult buyWCCoinResult = (BuyWCCoinResult) processResult;
        if (buyWCCoinResult == null) {
            Log.m105920e("MicroMsg.JsApiBuyWCCoin", "onReceiveResult get NULL result");
            C82554k kVar = this.f158127a;
            int i = this.f158128b;
            C55527g gVar = this.f158129c;
            gVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            kVar.mo109647a(i, gVar.mo115115p("fail:internal error", jSONObject));
            return;
        }
        Log.m105925i("MicroMsg.JsApiBuyWCCoin", "onReceiveResult resultCode:%s", buyWCCoinResult.f158118d);
        if (!C87412m.m108589b(buyWCCoinResult.f158118d, "ok")) {
            C82554k kVar2 = this.f158127a;
            int i2 = this.f158128b;
            C55527g gVar2 = this.f158129c;
            String str = "fail " + buyWCCoinResult.f158118d;
            gVar2.getClass();
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
            kVar2.mo109647a(i2, gVar2.mo115115p(str, jSONObject2));
            return;
        }
        C82554k kVar3 = this.f158127a;
        int i3 = this.f158128b;
        C55527g gVar3 = this.f158129c;
        gVar3.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
        }
        kVar3.mo109647a(i3, gVar3.mo115115p("ok", jSONObject3));
    }
}
