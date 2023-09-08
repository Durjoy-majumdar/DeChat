package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.C41954g;
import com.tencent.p014mm.plugin.game.luggage.page.C41960i;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.m */
public class C41916m extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "configLiveBrandName";
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
        Log.m105924i("MicroMsg.JsApiConfigLiveBrandName", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiConfigLiveBrandName", "data is null");
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        String optString = jSONObject.optString("userName");
        if (Util.isNullOrNil(optString)) {
            aVar.mo73778c("userName is null", (JSONObject) null);
            return;
        }
        String optString2 = jSONObject.optString("reportStr");
        int optInt = jSONObject.optInt("bizType", 1);
        String optString3 = jSONObject.optString("byPass");
        GameWebPage gameWebPage = (GameWebPage) aVar.f148189a;
        gameWebPage.f112980z1 = optString;
        if (gameWebPage.f117951u instanceof C41954g) {
            gameWebPage.mo65791Z();
            String string = gameWebPage.f148261n.getString("rawUrl");
            C41954g gVar = (C41954g) gameWebPage.f117951u;
            gVar.f113020R = optString;
            gVar.f113021S = optString2;
            gVar.f113022T = optInt;
            gVar.f113023U = string;
            gVar.f113024V = optString3;
            gVar.post(new C41960i(gVar));
        }
        aVar.mo73776a();
    }
}
