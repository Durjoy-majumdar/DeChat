package com.tencent.p014mm.plugin.lite.jsapi.comms;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import i22.C8846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.u */
public class C4801u extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 11);
        int i = C8846b.f28095w + 1;
        C8846b.f28095w = i;
        C8846b.f28096x.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28095w);
        Context d = mo5676d();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context = d;
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSelectBank", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        d.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSelectBank", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: o */
    public void mo5687o(int i, int i2, Intent intent) {
        if (intent == null) {
            this.f19815f.mo5689a("cancel");
            return;
        }
        String stringExtra = intent.getStringExtra("bank_name");
        String stringExtra2 = intent.getStringExtra("bank_icon");
        String stringExtra3 = intent.getStringExtra("bank_type");
        HashMap hashMap = new HashMap();
        hashMap.put("bankType", stringExtra3);
        hashMap.put("bankName", stringExtra);
        hashMap.put("bankIcon", stringExtra2);
        this.f19815f.mo5691c(hashMap);
    }
}
