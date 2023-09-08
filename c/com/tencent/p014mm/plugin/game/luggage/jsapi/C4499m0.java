package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.game.luggage.page.C41972n;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.m0 */
public class C4499m0 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "insertWebView";
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
        JSONObject jSONObject = aVar.f148190b.f129368c;
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("viewId");
        int a = C74942w4.m89784a(MMApplicationContext.getContext(), jSONObject.optInt("left"));
        int a2 = C74942w4.m89784a(MMApplicationContext.getContext(), jSONObject.optInt("top"));
        int a3 = C74942w4.m89784a(MMApplicationContext.getContext(), jSONObject.optInt("width"));
        int a4 = C74942w4.m89784a(MMApplicationContext.getContext(), jSONObject.optInt("height"));
        GameWebPage gameWebPage = (GameWebPage) aVar.f148189a;
        gameWebPage.getClass();
        gameWebPage.mo67933N(new C41972n(gameWebPage, optString, optString2, a3, a4, a, a2));
        aVar.mo73776a();
    }
}
