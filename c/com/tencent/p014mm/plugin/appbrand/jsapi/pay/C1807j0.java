package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import ke3.C88144b;
import kr0.C88267e;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.j0 */
public final class C1807j0 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 976;
    public static final String NAME = "requestPersonalPay";

    /* renamed from: g */
    public final int f11607g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("JsApiRequestPersonalPay", "[invoke JsApiRequestPersonalPay]");
        if (eVar != null) {
            if (eVar.getRuntime() == null) {
                eVar.mo109647a(i, mo115109j("fail:internal error"));
            } else if (jSONObject == null) {
                eVar.mo109647a(i, mo115109j("fail:invalid data"));
            } else {
                String optString = jSONObject.optString("out_prepay_id");
                if (TextUtils.isEmpty(optString)) {
                    eVar.mo109647a(i, mo115109j("fail: out_prepay_id is empty"));
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("key_app_id", eVar.getRuntime().f238147j);
                intent.putExtra("out_prepay_id", optString);
                C89916g.m112446a(eVar.getContext()).mo124232f(new C1804i0(this, new WeakReference(eVar), i));
                C88144b.m109795m(eVar.getContext(), "remittance", ".ui.PersonalPayRemittanceUI", intent, this.f11607g);
            }
        }
    }
}
