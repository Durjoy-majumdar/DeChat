package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.wepkg.model.C44502l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import k00.C46630b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.z */
public class C4556z extends C43620m2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.z$a */
    public class C4557a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f19304d;

        /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.z$a$a */
        public class C4558a implements C46630b.C46632b {
            public C4558a() {
            }

            /* renamed from: a */
            public void mo5417a(JSONObject jSONObject) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("wepkg_info", jSONObject);
                } catch (JSONException unused) {
                }
                C4557a.this.f19304d.mo6945a((String) null, jSONObject2);
            }
        }

        public C4557a(C4556z zVar, C43620m2.C5947b bVar) {
            this.f19304d = bVar;
        }

        public void run() {
            C44502l.m48872b(new C4558a());
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getLocalWePkgInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiGetLocalWePkgInfo", "invokeInMM");
        MMHandlerThread.postToMainThread(new C4557a(this, bVar));
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
