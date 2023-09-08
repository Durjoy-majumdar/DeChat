package n22;

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

/* renamed from: n22.b */
public class C11113b extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiDownloadGameVideo", "Invoke downloadGameVideo");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject.optString("videoUrl", "");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("videoUrl is null");
            return;
        }
        String optString2 = jSONObject.optString("thumbUrl", "");
        if (Util.isNullOrNil(optString2)) {
            this.f19815f.mo5689a("thumbUrl is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("videoUrl", optString);
        hashMap.put("thumbUrl", optString2);
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 7);
        intent.putExtra("download_game_video_params", hashMap);
        int i = C8846b.f28087o + 1;
        C8846b.f28087o = i;
        C8846b.f28088p.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28087o);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiDownloadGameVideo", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiDownloadGameVideo", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: h */
    public void mo5680h(int i, int i2, Intent intent) {
        if (i != 1137) {
            return;
        }
        if (i2 == -1) {
            String stringExtra = intent.getStringExtra("ret_info");
            if ("0".equals(stringExtra)) {
                this.f19815f.mo5690b();
            } else {
                this.f19815f.mo5689a(stringExtra);
            }
        } else {
            this.f19815f.mo5689a("cancel");
        }
    }
}
