package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.k */
public class C55513k extends C82268c {
    public static final int CTRL_INDEX = 1139;
    public static final String NAME = "shareFinderShop";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.Finder.JsApiShareShopWindow", "invoke data:" + jSONObject + ",callbackId:" + i);
        if (jSONObject != null) {
            Intent intent = new Intent();
            intent.putExtra("KEY_SHOP_WINDOW", jSONObject.toString());
            Context context = MMApplicationContext.getContext();
            if (MMApplicationContext.isMainProcess()) {
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76805Rl(context2, intent);
            } else {
                if (context == null) {
                    context = MMApplicationContext.getContext();
                }
                C81956c.m100675c(context, new ShareShopWindowProxy$ShareShopWindowRequest(intent), (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("ok", jSONObject2));
            return;
        }
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1007, "fail:get no data");
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("errno", 1007);
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
        }
        fVar.mo109647a(i, mo115115p("fail:get no data", jSONObject3));
    }
}
