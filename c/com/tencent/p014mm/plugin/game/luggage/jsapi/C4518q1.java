package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.C41948f;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.q1 */
public class C4518q1 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "setGameTab";
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
        Log.m105924i("MicroMsg.JsApiSetGameTab", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetGameTab", "data is null");
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        C41948f fVar = ((GameWebPage) aVar.f148189a).f112972r1;
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiSetGameTab", "is not tab page");
            aVar.mo73778c("not_tab", (JSONObject) null);
            return;
        }
        if (jSONObject.has("isShowTab")) {
            int optInt = jSONObject.optInt("isShowTab", -1);
            Log.m105925i("MicroMsg.JsApiSetGameTab", "isShowTab:%d", Integer.valueOf(optInt));
            C41948f.C41953d dVar = fVar.f112996H1;
            if (dVar != null) {
                dVar.mo65836d(optInt);
            }
        }
        if (jSONObject.has("isSwitchEnable")) {
            int optInt2 = jSONObject.optInt("isSwitchEnable", -1);
            Log.m105925i("MicroMsg.JsApiSetGameTab", "isSwitchEnable:%d", Integer.valueOf(optInt2));
            C41948f.C41953d dVar2 = fVar.f112996H1;
            if (dVar2 != null) {
                dVar2.mo65837e(optInt2);
            }
        }
        aVar.mo73776a();
    }
}
