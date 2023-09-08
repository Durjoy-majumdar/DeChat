package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C5872b0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.t */
public class C5985t extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "disableBounceScroll";
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
        Log.m105924i("MicroMsg.JsApiDisableBounceScroll", "invoke");
        JSONArray optJSONArray = aVar.f148190b.f129368c.optJSONArray("place");
        if (optJSONArray == null) {
            Log.m105924i("MicroMsg.JsApiDisableBounceScroll", "placeArray is null");
            aVar.mo73778c("fail", (JSONObject) null);
            return;
        }
        boolean z = false;
        for (int i = 0; i < optJSONArray.length(); i++) {
            if ("top".equalsIgnoreCase(optJSONArray.optString(i))) {
                z = true;
            }
        }
        if (!z) {
            aVar.mo73776a();
            return;
        }
        C43658n nVar = (C43658n) aVar.f148189a;
        nVar.f117925P.post(new C5872b0(nVar));
        aVar.mo73776a();
    }
}
