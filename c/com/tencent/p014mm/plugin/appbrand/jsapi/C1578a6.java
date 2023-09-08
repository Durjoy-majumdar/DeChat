package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.regex.Pattern;
import k20.C9556a;
import org.json.JSONObject;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.a6 */
public final class C1578a6 extends C82268c<C81925i2> {
    @Deprecated
    private static final int CTRL_INDEX = 1129;
    @Deprecated
    private static final String NAME = "sendSms";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C81925i2 i2Var = (C81925i2) fVar;
        if (i2Var != null && jSONObject2 != null) {
            String optString = jSONObject2.optString("content", "");
            int length = optString.length();
            Pattern compile = Pattern.compile("[\\x00-\\x7f]+");
            C87412m.m108593f(compile, "compile(pattern)");
            boolean matches = compile.matcher(optString).matches();
            if ((!matches || length <= 160) && (matches || length <= 70)) {
                String a = C117627q.m165908a(jSONObject2.optString("phoneNumber", ""));
                Context context = i2Var.getContext();
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + a));
                intent.putExtra("sms_body", optString);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/JsApiSendSms", "invoke", "(Lcom/tencent/mm/plugin/appbrand/AppBrandService;Lorg/json/JSONObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/jsapi/JsApiSendSms", "invoke", "(Lcom/tencent/mm/plugin/appbrand/AppBrandService;Lorg/json/JSONObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                i2Var.mo109647a(i2, mo115115p("ok", jSONObject3));
                return;
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1517001, "fail:the content of the text message exceeds the limit");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 1517001);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            i2Var.mo109647a(i2, mo115115p("fail:the content of the text message exceeds the limit", jSONObject4));
        }
    }
}
