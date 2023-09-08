package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.i */
public class C55511i extends C82268c<C82381f> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "openFinderProfile";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (!(fVar.getContext() instanceof Activity)) {
            fVar.mo109647a(i, "fail");
        } else if (jSONObject == null) {
            fVar.mo109647a(i, "fail:data is null");
        } else {
            String optString = jSONObject.optString("username", "");
            if (Util.isNullOrNil(optString)) {
                fVar.mo109647a(i, "fail:username is null");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("finder_username", optString);
            Context context = fVar.getContext();
            if (MMApplicationContext.isMainProcess()) {
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                if (context == null) {
                    context = MMApplicationContext.getContext();
                }
                C87412m.m108593f(context, "context ?: MMApplicationContext.getContext()");
                t1Var.mo76819V1(context, intent);
            } else {
                if (context == null) {
                    context = MMApplicationContext.getContext();
                }
                C81956c.m100675c(context, new OpenFinderProfileProxy$FinderProfileRequest(intent), (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
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
        }
    }
}
