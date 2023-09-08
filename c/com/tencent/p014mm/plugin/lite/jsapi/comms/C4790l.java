package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import i22.C8846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.l */
public class C4790l extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        Log.m105918d("LiteAppJsApiJumpToBizProfile", "Invoke jumpToBizProfile");
        if (jSONObject2 == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString = jSONObject2.optString("tousername");
        String optString2 = jSONObject2.optString("extmsg");
        Log.m105919d("LiteAppJsApiJumpToBizProfile", "doJumpToBizProfile %s, %s", optString, optString2);
        String optString3 = jSONObject2.optString("url");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("fail: username is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tousername", optString);
        hashMap.put("extmsg", optString2);
        hashMap.put("url", optString3);
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 3);
        intent.putExtra("jump_to_biz_profile_params", hashMap);
        int i = C8846b.f28079g + 1;
        C8846b.f28079g = i;
        C8846b.f28080h.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28079g);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiJumpToBizProfile", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiJumpToBizProfile", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: j */
    public void mo5682j(int i, int i2, Intent intent) {
        if (i != 3) {
            return;
        }
        if (i2 == -1) {
            this.f19815f.mo5690b();
        } else if (i2 == 0) {
            this.f19815f.mo5689a("canceled");
        } else if (i2 == 2 || i2 == 3) {
            this.f19815f.mo5689a("check_fail");
        } else {
            this.f19815f.mo5689a("fail");
            Log.m105920e("LiteAppJsApiJumpToBizProfile", "unknown resultCode");
        }
    }
}
