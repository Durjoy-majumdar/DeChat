package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Map;
import org.json.JSONObject;
import p828wa.C53096b;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.l0 */
public class C4496l0 extends C5954n2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.l0$a */
    public class C4497a implements C15913g.C15916c {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19269a;

        public C4497a(C4496l0 l0Var, C43620m2.C5947b bVar) {
            this.f19269a = bVar;
        }

        /* renamed from: a */
        public void mo445a(Map<String, C15912f> map) {
            this.f19269a.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "initGameLifeContact";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.GameLife.JsApiInitGameLifeContact", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        String optString = e.optString("userName");
        Log.m105925i("MicroMsg.GameLife.JsApiInitGameLifeContact", "userName:[%s]", optString);
        if (Util.isNullOrNil(optString)) {
            bVar.mo6945a("null_data", (JSONObject) null);
        } else {
            ((C15913g) C86312j.m106911c(C15913g.class)).xt0(optString, new C4497a(this, bVar));
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
