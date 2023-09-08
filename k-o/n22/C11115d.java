package n22;

import android.content.Intent;
import com.tencent.p014mm.plugin.game.C4443h;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p193la.C10480b;

/* renamed from: n22.d */
public class C11115d extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105924i("LiteAppJsApiQuitGameLifeChatroom", "Invoke startGameLifeConversation");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject.optString("chatroom_name");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        Log.m105925i("LiteAppJsApiQuitGameLifeChatroom", "chatRoomName:%s", optString);
        Intent intent = new Intent();
        intent.setAction("com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM");
        intent.putExtra("chatroom_name", optString);
        MMApplicationContext.getContext().sendBroadcast(intent, C4443h.f19181a);
        Intent intent2 = new Intent();
        C10480b bVar = this.f19815f.f19816a;
        LiteAppCenter.closeWindow(bVar.f31713a, bVar.f31715c, intent2);
        this.f19815f.mo5690b();
    }
}
