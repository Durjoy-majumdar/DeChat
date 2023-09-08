package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6012a;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import sw1.C48477m;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.p */
public class C4509p extends C43620m2 {
    /* renamed from: b */
    public String mo5382b() {
        return "downloadGameResource";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (C6012a.m5887a()) {
            Log.m105924i("MicroMsg.JsApiDownloadGameResource", "downloadGameResource isTeenMode and ignore");
            C6012a.m5888b(context);
            bVar.mo6945a("cancel", (JSONObject) null);
            return;
        }
        try {
            C48477m.C13789a.m13091a().mo65668e(new JSONObject(str).optString("appId", ""), 0, -1);
            bVar.mo6945a((String) null, (JSONObject) null);
        } catch (JSONException unused) {
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
