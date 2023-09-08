package dy1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.game.luggage.C41901e;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import ke3.C88144b;
import org.json.JSONObject;

/* renamed from: dy1.m */
public class C7559m extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            this.f19815f.mo5689a("invalid_params");
            return;
        }
        Context context = MMApplicationContext.getContext();
        if (C41901e.m45449b(context)) {
            this.f19815f.mo5689a("exist_tab");
            return;
        }
        String optString = jSONObject.optString("tabKey");
        Log.m105925i("LiteAppJsApiOpenGameTabHome", "tabKey:[%s]", optString);
        long optLong = jSONObject.optLong("sourceid", 0);
        long optLong2 = jSONObject.optLong(TPDownloadProxyEnum.USER_SSID, 0);
        Intent intent = new Intent();
        intent.putExtra("from_find_more_friend", false);
        intent.putExtra("game_report_from_scene", 5);
        intent.putExtra("start_time", System.currentTimeMillis());
        intent.putExtra("has_game_life_chat_msg", false);
        intent.putExtra("default_game_tab_key", optString);
        intent.putExtra("disable_game_page_swipe", true);
        intent.putExtra("game_report_sourceid", optLong);
        intent.putExtra("game_report_ssid", optLong2);
        C88144b.m109791i(context, "game", ".ui.GameCenterUI", intent, (Bundle) null);
        this.f19815f.mo5690b();
    }
}
