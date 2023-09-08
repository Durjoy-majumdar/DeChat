package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import i22.C8846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C64468jf3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/d;", "Lcom/tencent/mm/plugin/lite/api/c;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.d */
public final class C4782d extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiChooseChatRoomMember", "Invoke chooseChatRoomMember");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        String optString2 = jSONObject.optString("chatRoomUserName", "");
        String optString3 = jSONObject.optString("selectedUserNameList");
        String optString4 = jSONObject.optString("allUserNameList");
        HashMap hashMap = new HashMap();
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, optString);
        hashMap.put("chatRoomUserName", optString2);
        hashMap.put("selectedUserNameList", optString3);
        hashMap.put("allUserNameList", optString4);
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 9);
        intent.putExtra("choose_chat_room_member_params", hashMap);
        int i = C8846b.f28091s + 1;
        C8846b.f28091s = i;
        C8846b.f28092t.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28091s);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiChooseChatRoomMember", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiChooseChatRoomMember", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: g */
    public void mo5679g(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        HashMap hashMap = new HashMap();
        int i3 = -1;
        if (i2 == -1) {
            i3 = 0;
        }
        hashMap.put("errCode", Integer.valueOf(i3));
        hashMap.put("action", Integer.valueOf(i3));
        C64468jf3 jf32 = new C64468jf3();
        if (!(intent == null || (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) == null)) {
            try {
                jf32.parseFrom(byteArrayExtra);
            } catch (Throwable th) {
                Log.m105920e("LiteAppJsApiChooseChatRoomMember", th.getMessage());
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        JSONArray optJSONArray = jf32.toJSON().optJSONArray("dataList");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        hashMap.put("dataList", optJSONArray);
        if (i3 == 0) {
            this.f19815f.mo5691c(hashMap);
        } else {
            this.f19815f.mo5689a(hashMap.toString());
        }
    }
}
