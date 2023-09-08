package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p169ib.C87685a;
import p225rc.C89916g;
import p547hb.C87464c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.q0 */
public final class C1821q0 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 285;
    public static final String NAME = "requestVirtualPayment";

    /* renamed from: g */
    public boolean f11619g = false;

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        if (jSONObject == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        Activity o0 = i2Var.mo114344o0();
        if (o0 == null) {
            i2Var.mo109647a(i, mo115109j("fail:internal error invalid android context"));
        } else if (this.f11619g) {
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 2);
            Log.m105921e("MicroMsg.JsApiRequestVirtualPayment", "errCode: %d, errMsg: an order is being paid", 2);
            i2Var.mo109647a(i, mo115112m("fail an order is being paid", hashMap));
        } else {
            this.f11619g = true;
            C1817o0 o0Var = new C1817o0(this, i2Var, i);
            C83780d1 l0 = i2Var.mo114341l0();
            if (l0 != null) {
                C87464c cVar = (C87464c) l0.mo116150E0(C87464c.class);
                if (cVar != null) {
                    cVar.mo111266l(true, true, (C87685a) null);
                }
            } else {
                Log.m105920e("MicroMsg.JsApiRequestVirtualPayment", "hy: associated page view is null!!");
            }
            Intent intent = new Intent();
            Log.m105924i("MicroMsg.JsApiRequestVirtualPayment", "iap payment start ... data : " + jSONObject);
            intent.putExtra("key_appid", i2Var.getAppId());
            intent.putExtra("key_product_id", jSONObject.optString("priceLevel"));
            intent.putExtra("key_price", jSONObject.optString("priceLevel"));
            intent.putExtra("key_currency_type", jSONObject.optString("currencyType", "CNY"));
            intent.putExtra("key_desc", jSONObject.optString("desc"));
            intent.putExtra("key_count", jSONObject.optInt("count", 1));
            intent.putExtra("key_is_mini_program", true);
            intent.putExtra("key_busiid", jSONObject.optString("outTradeNo"));
            intent.putExtra("key_virtual_pay_sign", jSONObject.optString("virtualPaySign"));
            intent.putExtra("key_attach", jSONObject.optString("attach"));
            intent.putExtra("key_extInfo", jSONObject.optString("extInfo"));
            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) i2Var.getRuntime();
            if (!(appBrandRuntimeWC == null || appBrandRuntimeWC.mo121253n1() == null)) {
                intent.putExtra("key_wxAppScene", appBrandRuntimeWC.mo121253n1().f245533f);
                intent.putExtra("key_wxAppRawScene", appBrandRuntimeWC.mo121253n1().f245536i);
            }
            if (l0 != null && l0.mo116167V0()) {
                intent.putExtra("key_request_fullscreen", true);
            }
            C89916g.m112446a(o0).mo124232f(new C1819p0(this, o0Var));
            C88144b.m109795m(o0, "wallet_index", ".ui.WalletIapUI", intent, hashCode() & 65535);
        }
    }
}
