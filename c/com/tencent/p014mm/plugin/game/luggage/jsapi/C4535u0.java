package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.u0 */
public class C4535u0 extends C43620m2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.u0$a */
    public class C4536a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f19289d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f19290e;

        public C4536a(C53096b.C53097a aVar, MMActivity mMActivity) {
            this.f19289d = aVar;
            this.f19290e = mMActivity;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (C4535u0.this.hashCode() & 65535)) {
                if (i2 == -1) {
                    if (intent != null) {
                        String nullAs = Util.nullAs(intent.getStringExtra("gameRegionName"), "");
                        HashMap hashMap = new HashMap();
                        hashMap.put("gameRegionName", nullAs);
                        this.f19289d.mo73779d(hashMap);
                    } else {
                        this.f19289d.mo73778c("fail", (JSONObject) null);
                    }
                } else if (i2 == 1) {
                    this.f19289d.mo73778c("fail", (JSONObject) null);
                } else {
                    this.f19289d.mo73778c("cancel", (JSONObject) null);
                }
                this.f19290e.mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "openGameRegion";
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
        Log.m105924i("MicroMsg.JsApiOpenGameRegion", "invoke");
        MMActivity mMActivity = (MMActivity) ((GameWebPage) aVar.f148189a).f148196d;
        mMActivity.mmSetOnActivityResultCallback(new C4536a(aVar, mMActivity));
        C88144b.m109796n(mMActivity, "game", ".ui.GameRegionSelectUI", (Intent) null, hashCode() & 65535, false);
    }
}
