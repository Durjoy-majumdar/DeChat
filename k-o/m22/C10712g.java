package m22;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import i22.C8846b;
import j20.C117292a;
import k20.C9556a;
import org.json.JSONObject;

/* renamed from: m22.g */
public class C10712g extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiOpenFinderSearchView", "Invoke openFinderSearchView");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String replace = jSONObject.toString().replace("hotwordText", "hotword_text").replace("actionType", "action_type");
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 4);
        intent.putExtra("open_finder_search_view_param", replace);
        int i = C8846b.f28081i + 1;
        C8846b.f28081i = i;
        C8846b.f28082j.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28081i);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/finder/LiteAppJsApiOpenFinderSearchView", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/finder/LiteAppJsApiOpenFinderSearchView", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: k */
    public void mo5683k(boolean z) {
        if (z) {
            this.f19815f.mo5690b();
        } else {
            this.f19815f.mo5689a("fail");
        }
    }
}
