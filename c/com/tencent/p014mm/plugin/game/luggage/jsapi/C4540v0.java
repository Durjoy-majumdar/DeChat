package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.game.luggage.C41901e;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.v0 */
public class C4540v0 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "openGameTabHome";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.JsApiOpenGameTabHome", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
        } else if (C41901e.m45449b(context)) {
            bVar.mo6945a("exist_tab", (JSONObject) null);
        } else {
            String optString = e.optString("tabKey");
            Log.m105925i("MicroMsg.JsApiOpenGameTabHome", "tabKey:[%s]", optString);
            long optLong = e.optLong("sourceid", 0);
            long optLong2 = e.optLong(TPDownloadProxyEnum.USER_SSID, 0);
            Intent intent = new Intent();
            intent.putExtra("from_find_more_friend", false);
            intent.putExtra("game_report_from_scene", 5);
            intent.putExtra("start_time", System.currentTimeMillis());
            intent.putExtra("default_game_tab_key", optString);
            intent.putExtra("disable_game_page_swipe", true);
            intent.putExtra("game_report_sourceid", optLong);
            intent.putExtra("game_report_ssid", optLong2);
            C88144b.m109791i(context, "game", ".ui.GameCenterUI", intent, (Bundle) null);
            bVar.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
