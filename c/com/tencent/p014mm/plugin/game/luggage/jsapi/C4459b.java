package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6012a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p237sp.C13747c0;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.b */
public class C4459b extends C43620m2 {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.b$a */
    public class C4460a implements C13747c0.C13748a {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19234a;

        public C4460a(C4459b bVar, C43620m2.C5947b bVar2) {
            this.f19234a = bVar2;
        }

        /* renamed from: a */
        public void mo287a(String str, JSONObject jSONObject) {
            this.f19234a.mo6945a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "addGameDownloadTask";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (C6012a.m5887a()) {
            Log.m105924i("MicroMsg.JsApiAddGameDownloadTask", "addGameDownloadTask isTeenMode and ignore");
            C6012a.m5888b(context);
            bVar.mo6945a("cancel", (JSONObject) null);
            return;
        }
        try {
            ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13114ky(context, C40979a.m44408b(new JSONObject(str)), new C4460a(this, bVar));
        } catch (JSONException unused) {
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
