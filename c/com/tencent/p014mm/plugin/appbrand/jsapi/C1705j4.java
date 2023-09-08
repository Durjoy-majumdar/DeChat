package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.j4 */
public class C1705j4 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 59;
    public static final String NAME = "openCard";

    /* renamed from: g */
    public final int f11410g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Intent intent = new Intent();
        Activity R = i2Var.getRuntime().mo113026R();
        if (R == null) {
            i2Var.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105921e("MicroMsg.JsApiOpenCard", "mmActivity is null, invoke fail! with appId[%s] callbackId[%d]", i2Var.getAppId(), Integer.valueOf(i));
            return;
        }
        String optString = jSONObject.optString("cardList");
        if (Util.isNullOrNil(optString)) {
            i2Var.mo109647a(i, mo115109j("fail"));
            Log.m105920e("MicroMsg.JsApiOpenCard", "cardList is null, invoke fail!");
            return;
        }
        C89916g.m112446a(R).mo124232f(new C1702i4(this, i2Var, i));
        intent.putExtra("key_app_id", i2Var.getAppId());
        intent.putExtra("card_list", optString);
        intent.putExtra("key_from_scene", 26);
        C90988l lVar = (C90988l) i2Var.mo109671p(C90988l.class);
        if (!(lVar == null || lVar.f261072r == null)) {
            intent.putExtra("key_from_appbrand_type", lVar.f261072r.f238585d);
        }
        C88144b.m109795m(R, "card", ".ui.CardViewEntranceUI", intent, this.f11410g);
    }
}
