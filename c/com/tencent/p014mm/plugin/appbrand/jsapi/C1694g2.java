package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.g2 */
public class C1694g2 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 501;
    public static final String NAME = "chooseInvoice";

    /* renamed from: g */
    public final int f11387g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        Activity o0 = i2Var.mo114344o0();
        if (o0 == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiChooseInvoice", "mmActivity is null, invoke fail!");
            return;
        }
        int optInt = jSONObject.optInt("timeStamp");
        String optString = jSONObject.optString("nonceStr");
        String optString2 = jSONObject.optString("signType");
        String optString3 = jSONObject.optString("cardSign");
        Intent intent = new Intent();
        intent.putExtra("app_id", i2Var.getAppId());
        intent.putExtra("sign_type", optString2);
        intent.putExtra("card_sign", optString3);
        intent.putExtra("time_stamp", optInt);
        intent.putExtra("nonce_str", optString);
        intent.putExtra("can_multi_select", 1);
        intent.putExtra("card_type", "INVOICE");
        intent.putExtra("key_from_scene", 7);
        C89916g.m112446a(o0).mo124232f(new C1677f2(this, i2Var, i));
        C88144b.m109796n(o0, "card", ".ui.CardListSelectedUI", intent, this.f11387g, false);
    }
}
