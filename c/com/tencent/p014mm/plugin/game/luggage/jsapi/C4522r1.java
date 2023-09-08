package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.r1 */
public class C4522r1 extends C5954n2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.r1$a */
    public class C4523a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f19281d;

        /* renamed from: e */
        public final /* synthetic */ GameWebPage f19282e;

        public C4523a(C4522r1 r1Var, boolean z, GameWebPage gameWebPage) {
            this.f19281d = z;
            this.f19282e = gameWebPage;
        }

        public void run() {
            if (this.f19281d) {
                this.f19282e.f117951u.setVisibility(8);
            } else {
                this.f19282e.f117951u.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "setNavigationBarStatus";
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
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.setNavigationBarStatus", "data is null");
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        GameWebPage gameWebPage = (GameWebPage) aVar.f148189a;
        if (gameWebPage == null) {
            Log.m105920e("MicroMsg.setNavigationBarStatus", "no page");
            aVar.mo73778c("no_page", (JSONObject) null);
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("navigationBarHidden", false);
        Log.m105925i("MicroMsg.setNavigationBarStatus", "gamelog.jsapi, WebView, invokeInOwn,set navigationBarHidden %b", Boolean.valueOf(optBoolean));
        C2039g2.m1988b(new C4523a(this, optBoolean, gameWebPage));
        aVar.mo73776a();
    }
}
