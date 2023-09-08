package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.lang.ref.WeakReference;
import ke3.C88144b;
import kr0.C88267e;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.a0 */
public final class C1791a0 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 820;
    public static final String NAME = "requestFacetoFacePayment";

    /* renamed from: g */
    public final int f11586g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (eVar != null) {
            if (eVar.getRuntime() == null) {
                eVar.mo109647a(i, mo115109j("fail:internal error"));
            } else if (jSONObject == null) {
                eVar.mo109647a(i, mo115109j("fail:invalid data"));
            } else {
                String optString = jSONObject.optString("confirm_token");
                if (TextUtils.isEmpty(optString)) {
                    eVar.mo109647a(i, mo115109j("fail:confirm_token is empty"));
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("key_app_id", eVar.getRuntime().f238147j);
                intent.putExtra("key_confirm_id", optString);
                C89916g.m112446a(eVar.getContext()).mo124232f(new C1836z(this, new WeakReference(eVar), i));
                C88144b.m109795m(eVar.getContext(), "remittance", ".ui.F2FAppBrandRemittanceUI", intent, this.f11586g);
            }
        }
    }
}
