package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.h1$$b */
public final /* synthetic */ class h1$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C1734h1 f11440d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f11441e;

    /* renamed from: f */
    public final /* synthetic */ int f11442f;

    public /* synthetic */ h1$$b(C1734h1 h1Var, C82381f fVar, int i) {
        this.f11440d = h1Var;
        this.f11441e = fVar;
        this.f11442f = i;
    }

    public final void run() {
        C1734h1 h1Var = this.f11440d;
        C82381f fVar = this.f11441e;
        int i = this.f11442f;
        h1Var.getClass();
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 3, "fail:system permission denied");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errno", 3);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        fVar.mo109647a(i, h1Var.mo115115p("fail:system permission denied", jSONObject));
    }
}
