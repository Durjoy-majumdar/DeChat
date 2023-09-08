package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.z5 */
public final class C1915z5 extends C82268c<C82554k> {
    @Deprecated
    public static final int CTRL_INDEX = 990;
    @Deprecated
    public static final String NAME = "sendRedCoverAppMsg";

    /* renamed from: g */
    public final String f11780g = "MicroMsg.JsApiSendRedCoverAppMsg";

    /* renamed from: h */
    public final int f11781h = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82554k kVar = (C82554k) fVar;
        C87412m.m108591d(kVar);
        Activity R = kVar.getRuntime().mo113026R();
        if (R == null) {
            kVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            Log.m105920e(this.f11780g, "mmActivity is null, invoke fail!");
            return;
        }
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = jSONObject != null ? jSONObject.optString("receiveuri") : null;
        String str = this.f11780g;
        Log.m105924i(str, "receive uri: " + ((String) f0Var.f27484d));
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", false);
        intent.putExtra("mutil_select_is_ret", false);
        intent.putExtra("scene_from", 12);
        C89916g.m112446a(R).mo124232f(new C1912y5(this, kVar, i, f0Var));
        C88144b.m109802t(R, ".ui.transmit.SelectConversationUI", intent, this.f11781h);
    }
}
