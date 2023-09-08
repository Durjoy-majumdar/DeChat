package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83135z1;
import com.tencent.p014mm.plugin.appbrand.preload.IAppBrandBatchPreloadController;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.j */
public class C5934j extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return C83135z1.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.Predownload.WebViewJsApiBatchPreloadMiniProgram", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject != null) {
            String preload = ((IAppBrandBatchPreloadController) C86312j.m106911c(IAppBrandBatchPreloadController.class)).preload(jSONObject, true);
            if (Util.isNullOrNil(preload)) {
                aVar.mo73778c("error", (JSONObject) null);
            } else if ("ok".equalsIgnoreCase(preload)) {
                aVar.mo73776a();
            } else {
                aVar.mo73778c(preload, (JSONObject) null);
            }
        }
    }
}
