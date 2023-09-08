package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import kr0.C88267e;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.u */
public class C1828u extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 714;
    public static final String NAME = "requestBizSplitBillPayment";

    /* renamed from: g */
    public final int f11634g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "invoke JsApiRequestBizSplitBillPayment!");
        if (eVar == null) {
            Log.m105920e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:component is null");
            return;
        }
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            Log.m105920e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:context is null");
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        String optString = jSONObject.optString("orderNo");
        Log.m105925i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "pfOrderNo:%s", Util.nullAs(optString, ""));
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "fail:context is null");
            eVar.mo109647a(i, mo115109j("fail"));
            return;
        }
        C89916g.m112446a(o0).mo124232f(new C1826t(this, eVar, i));
        Intent intent = new Intent();
        intent.putExtra("pfOrderNo", optString);
        intent.putExtra("appid", eVar.getAppId());
        C88144b.m109802t(o0, ".plugin.aa.ui.LaunchAABeforeUI", intent, this.f11634g);
    }
}
