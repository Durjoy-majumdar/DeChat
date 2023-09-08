package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.o0 */
public class C4506o0 extends C43620m2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.o0$a */
    public class C4507a implements C45544c {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19275a;

        public C4507a(C4506o0 o0Var, C43620m2.C5947b bVar) {
            this.f19275a = bVar;
        }

        /* renamed from: a */
        public void mo5407a() {
            this.f19275a.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "jumpDownloaderWidget";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject jSONObject;
        String str2 = "";
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.JsApiJumpDownloaderWidget", e, str2, new Object[0]);
            jSONObject = null;
        }
        if (jSONObject != null) {
            str2 = jSONObject.optString("appId");
        }
        Intent intent = new Intent();
        intent.putExtra("appId", str2);
        intent.putExtra("view_task", true);
        intent.addFlags(268435456);
        ((C45547h) C86312j.m106911c(C45547h.class)).p30(context, intent, new C4507a(this, bVar));
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
