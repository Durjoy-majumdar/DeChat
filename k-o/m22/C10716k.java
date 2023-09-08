package m22;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppApiProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import i22.C8846b;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lm22/k;", "Lcom/tencent/mm/plugin/lite/api/c;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: m22.k */
public final class C10716k extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiRequestVerifyPwd", "invoke requestVerifyPwd");
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClass(MMApplicationContext.getContext(), WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 6);
        int i = C8846b.f28085m + 1;
        C8846b.f28085m = i;
        C8846b.f28086n.put(Integer.valueOf(i), this);
        intent.putExtra("callback_id", C8846b.f28085m);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/lite/jsapi/finder/LiteAppJsApiRequestVerifyPwd", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/lite/jsapi/finder/LiteAppJsApiRequestVerifyPwd", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: n */
    public void mo5686n(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("LiteAppJsApiRequestVerifyPwd onActivityResult requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        sb.append(", data: ");
        sb.append(intent == null);
        Log.m105918d("LiteAppJsApiRequestVerifyPwd", sb.toString());
        if (i2 == -1 && intent != null && i == 1000) {
            String stringExtra = intent.getStringExtra("key_ticket");
            HashMap hashMap = new HashMap();
            if (stringExtra == null) {
                stringExtra = "";
            }
            hashMap.put("ticket", stringExtra);
            hashMap.put("sucessful", "true");
            this.f19815f.mo5691c(hashMap);
            return;
        }
        this.f19815f.mo5689a("fail");
    }
}
