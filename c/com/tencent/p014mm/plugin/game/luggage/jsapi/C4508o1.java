package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.C41954g;
import com.tencent.p014mm.plugin.game.luggage.page.C4564h;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p828wa.C53096b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.o1 */
public class C4508o1 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "setDownloadWidgetEntrance";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
        Log.m105924i("MicroMsg.JsApiSetDownloadWidgetEntrance", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetDownloadWidgetEntrance", "data is null");
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("show", false);
        Log.m105925i("MicroMsg.JsApiSetDownloadWidgetEntrance", "download widget show:%b", Boolean.valueOf(optBoolean));
        C43661n0 n0Var = ((GameWebPage) aVar.f148189a).f117951u;
        if (n0Var instanceof C41954g) {
            C41954g gVar = (C41954g) n0Var;
            gVar.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C4564h(gVar, optBoolean));
        }
        aVar.mo73776a();
    }
}
