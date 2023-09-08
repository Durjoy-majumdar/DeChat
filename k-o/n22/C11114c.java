package n22;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import i22.C8846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import org.json.JSONObject;

/* renamed from: n22.c */
public class C11114c extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        Log.m105924i("LiteAppJsApiOpenGameLifeChatroom", "Invoke openGameLifeChatroom");
        if (jSONObject2 == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject2.optString("chatroom_name");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString2 = jSONObject2.optString("chatroom_icon");
        boolean optBoolean = jSONObject2.optBoolean("is_auto_join", false);
        long optLong = jSONObject2.optLong("sourceid", 0);
        long optLong2 = jSONObject2.optLong(TPDownloadProxyEnum.USER_SSID, 0);
        boolean optBoolean2 = jSONObject2.optBoolean("backToRoomList", false);
        int optInt = jSONObject2.optInt("targetChannelId", -1);
        long optLong3 = jSONObject2.optLong("targetSeq", -1);
        Log.m105925i("LiteAppJsApiOpenGameLifeChatroom", "chatRoomName:%s, iconUrl:%s, isAutoJoin:%b, sourceId:%d, ssid:%d, backToRoomList:%b, targetChannelId:%s, targetSeq:%s", optString, optString2, Boolean.valueOf(optBoolean), Long.valueOf(optLong), Long.valueOf(optLong2), Boolean.valueOf(optBoolean2), Integer.valueOf(optInt), Long.valueOf(optLong3));
        HashMap hashMap = new HashMap();
        hashMap.put("chatroom_name", optString);
        hashMap.put("chatroom_icon", optString2);
        hashMap.put("is_auto_join", String.valueOf(optBoolean));
        hashMap.put("sourceid", String.valueOf(optLong));
        hashMap.put(TPDownloadProxyEnum.USER_SSID, String.valueOf(optLong2));
        hashMap.put("backToRoomList", String.valueOf(optBoolean2));
        hashMap.put("targetChannelId", String.valueOf(optInt));
        Object obj = "targetSeq";
        hashMap.put(obj, String.valueOf(optLong3));
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 8);
        intent.putExtra("open_game_life_chatroom_params", hashMap);
        int i = C8846b.f28089q + 1;
        C8846b.f28089q = i;
        C8846b.f28090r.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28089q);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiOpenGameLifeChatroom", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiOpenGameLifeChatroom", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: m */
    public void mo5685m() {
        this.f19815f.mo5690b();
    }
}
