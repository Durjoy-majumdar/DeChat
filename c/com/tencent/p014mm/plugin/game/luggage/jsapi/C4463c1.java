package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C88273g1;
import kr0.C88274h0;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.c1 */
public final class C4463c1 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "preloadMiniProgramEnv";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiPreloadMiniProgramEnv", "preloadEnv");
        if (bVar != null) {
            ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113305TH(C88273g1.H5_JSAPI_PRELOAD);
            bVar.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
