package gk0;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import org.json.JSONObject;
import p225rc.C89916g;

/* renamed from: gk0.j0 */
public class C8330j0 extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = 402;
    public static final String NAME = "openRealnameAuth";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo data is null");
            d1Var.mo109647a(i, mo115109j("fail:data is null"));
            return;
        }
        Activity R = d1Var.getRuntime().mo113026R();
        if (R == null) {
            d1Var.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenRealnameAuth", "mmActivity is null, invoke fail!");
            return;
        }
        String optString = jSONObject.optString("categoryId", "");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiOpenRealnameAuth", "category_id is null");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 40003);
            d1Var.mo109647a(i, mo115112m("fail:category_id is empty", hashMap));
            return;
        }
        String appId = d1Var.getAppId();
        int optInt = jSONObject.optInt("authType", 1);
        Log.m105925i("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo category_id:%s, appId:%s, authType:%d", optString, appId, Integer.valueOf(optInt));
        Intent intent = new Intent(R, AppBrandIDCardUI.class);
        intent.putExtra("intent_appid", appId);
        intent.putExtra("intent_category_id", optString);
        intent.putExtra("intent_auth_type", optInt);
        intent.putExtra("id_ui_theme", 1);
        C89916g.m112446a(R).mo124236j(intent, new C8329i0(this, d1Var, i));
        C115669n.INSTANCE.mo160131h(14943, appId, 1, "");
    }
}
