package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82543i5;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import kr0.C88262c1;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.a1 */
public final class C4454a1 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return C82543i5.NAME;
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (bVar != null) {
            JSONObject e = C6013c.m5893e(str);
            if (e == null) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            String optString = e.optString("username");
            String optString2 = e.optString("appId");
            boolean z = true;
            if (optString == null || optString.length() == 0) {
                if (!(optString2 == null || optString2.length() == 0)) {
                    z = false;
                }
                if (z) {
                    bVar.mo6945a("invalid_params", (JSONObject) null);
                    return;
                }
            }
            String optString3 = e.optString("path");
            int optInt = e.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            Log.m105924i("MicroMsg.JsApiPreloadMiniProgramEnv", "preDownload.");
            ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113581Re(optString, optString2, optString3, optInt);
            bVar.mo6945a("", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
