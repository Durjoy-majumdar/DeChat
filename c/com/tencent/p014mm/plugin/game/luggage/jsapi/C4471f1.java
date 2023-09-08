package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.game.C4443h;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.f1 */
public class C4471f1 extends C43620m2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "quitGameLifeChatroom";
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
            aVar.mo73778c("invalid_params", (JSONObject) null);
            return;
        }
        String optString = jSONObject.optString("chatroom_name");
        if (Util.isNullOrNil(optString)) {
            aVar.mo73778c("invalid_params", (JSONObject) null);
            return;
        }
        Log.m105925i("MicroMsg.JsApiQuitGameLifeChatroom", "chatRoomName:%s", optString);
        Intent intent = new Intent();
        intent.setAction("com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM");
        intent.putExtra("chatroom_name", optString);
        MMApplicationContext.getContext().sendBroadcast(intent, C4443h.f19181a);
        aVar.mo73776a();
        ((GameWebPage) aVar.f148189a).mo67938q(true);
    }
}
