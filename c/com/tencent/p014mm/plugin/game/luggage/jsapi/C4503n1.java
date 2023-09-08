package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import xy1.C15913g;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.n1 */
public class C4503n1 extends C5954n2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.n1$a */
    public class C4504a implements C15913g.C15915b {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19274a;

        public C4504a(C4503n1 n1Var, C43620m2.C5947b bVar) {
            this.f19274a = bVar;
        }

        /* renamed from: a */
        public void mo5406a(boolean z) {
            if (z) {
                this.f19274a.mo6945a((String) null, (JSONObject) null);
            } else {
                this.f19274a.mo6945a("setBlackList error", (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "setBlackList";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.GameLife.JsApiSetBlackList", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        String optString = e.optString("userName");
        Log.m105925i("MicroMsg.GameLife.JsApiSetBlackList", "userName:[%s]", optString);
        if (Util.isNullOrNil(optString)) {
            bVar.mo6945a("null_data", (JSONObject) null);
        } else if (!e.has(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH)) {
            bVar.mo6945a("switch_null", (JSONObject) null);
        } else {
            try {
                boolean z = e.getBoolean(TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH);
                boolean optBoolean = e.optBoolean("associateWxGameAccount", false);
                Log.m105925i("MicroMsg.GameLife.JsApiSetBlackList", "JsApiSetBlackList setBlack:%b,associateWxGameAccount:%b", Boolean.valueOf(z), Boolean.valueOf(optBoolean));
                ((C15913g) C86312j.m106911c(C15913g.class)).mo437Pj(optString, z, optBoolean, new C4504a(this, bVar));
            } catch (JSONException unused) {
                bVar.mo6945a("switch_error", (JSONObject) null);
            }
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
