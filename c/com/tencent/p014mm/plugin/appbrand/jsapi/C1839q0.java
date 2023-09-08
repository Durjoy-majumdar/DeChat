package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.q0 */
public class C1839q0 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 58;
    public static final String NAME = "addCard";

    /* renamed from: g */
    public final int f11646g = C87687a.m109085a(this);

    /* renamed from: h */
    public int f11647h;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105921e("MicroMsg.JsApiAddCard", "mmActivity is null, invoke fail! with appId[%s] callbackId[%d]", kVar.getAppId(), Integer.valueOf(i));
            return;
        }
        Intent intent = new Intent();
        String optString = jSONObject.optString("cardList");
        if (Util.isNullOrNil(optString)) {
            kVar.mo109647a(i, mo115109j("fail:invalid data"));
            Log.m105920e("MicroMsg.JsApiAddCard", "cardList is null, invoke fail!");
            return;
        }
        this.f11647h = i;
        C89916g.m112446a(R).mo124232f(new C1768p0(this, kVar));
        intent.putExtra("key_in_card_list", optString);
        intent.putExtra("key_from_scene", 26);
        C90988l d0 = kVar.getRuntime().mo113051d0();
        if (!(d0 == null || d0.f261072r == null)) {
            intent.putExtra("key_from_appbrand_type", d0.f261072r.f238585d);
        }
        C88144b.m109795m(R, "card", ".ui.CardAddEntranceUI", intent, this.f11646g);
    }
}
