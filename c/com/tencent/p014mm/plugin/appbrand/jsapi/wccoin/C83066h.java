package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.h */
public final class C83066h<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

    /* renamed from: a */
    public final /* synthetic */ C82554k f242820a;

    /* renamed from: b */
    public final /* synthetic */ int f242821b;

    /* renamed from: c */
    public final /* synthetic */ C83067i f242822c;

    public C83066h(C82554k kVar, int i, C83067i iVar) {
        this.f242820a = kVar;
        this.f242821b = i;
        this.f242822c = iVar;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        ConsumeWCCoinResult consumeWCCoinResult = (ConsumeWCCoinResult) processResult;
        if (consumeWCCoinResult == null) {
            Log.m105920e("MicroMsg.JsApiConsumeWCCoin", "onReceiveResult get NULL result");
            C82554k kVar = this.f242820a;
            int i = this.f242821b;
            C83067i iVar = this.f242822c;
            iVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            kVar.mo109647a(i, iVar.mo115115p("fail:internal error", jSONObject));
            return;
        }
        Log.m105925i("MicroMsg.JsApiConsumeWCCoin", "onReceiveResult resultCode:%s", consumeWCCoinResult.f242810d);
        if (C87412m.m108589b(consumeWCCoinResult.f242810d, "ok")) {
            C82554k kVar2 = this.f242820a;
            int i2 = this.f242821b;
            C83067i iVar2 = this.f242822c;
            HashMap e2 = C90364q0.m113146e(new C13604l("balance", consumeWCCoinResult.f242811e));
            iVar2.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            e2.put("errno", 0);
            kVar2.mo109647a(i2, iVar2.mo115114o("ok", e2));
            return;
        }
        C82554k kVar3 = this.f242820a;
        int i3 = this.f242821b;
        C83067i iVar3 = this.f242822c;
        String str = "fail " + consumeWCCoinResult.f242810d;
        iVar3.getClass();
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
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
        }
        kVar3.mo109647a(i3, iVar3.mo115115p(str, jSONObject2));
    }
}
