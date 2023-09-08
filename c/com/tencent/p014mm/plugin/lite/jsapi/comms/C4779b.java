package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import i22.C8846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.b */
public class C4779b extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiBatchAddCard", "Invoke batchAddCard");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject.optString("card_list");
        String optString2 = jSONObject.optString("srcUsername");
        String optString3 = jSONObject.optString("url");
        String optString4 = jSONObject.optString("consumedCardId");
        String optString5 = jSONObject.optString("template_id");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("fail: cardlist is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("card_list", optString);
        hashMap.put("srcUsername", optString2);
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(7));
        hashMap.put("url", optString3);
        hashMap.put("consumedCardId", optString4);
        hashMap.put("template_id", optString5);
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 1);
        intent.putExtra("batch_add_card_params", hashMap);
        int i = C8846b.f28075c + 1;
        C8846b.f28075c = i;
        C8846b.f28076d.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28075c);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBatchAddCard", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBatchAddCard", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: f */
    public void mo5678f(int i, int i2, Intent intent) {
        if (i == 1) {
            HashMap hashMap = new HashMap();
            if (intent != null) {
                hashMap.put("card_list", Util.nullAs(intent.getStringExtra("card_list"), ""));
            }
            if (i2 == -1) {
                this.f19815f.mo5691c(hashMap);
                return;
            }
            if ((intent != null ? intent.getIntExtra("result_code", 2) : 2) == 2) {
                this.f19815f.mo5689a("fail");
            } else {
                this.f19815f.mo5689a("cancel");
            }
        }
    }
}
