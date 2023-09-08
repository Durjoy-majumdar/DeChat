package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;
import org.json.JSONObject;
import p169ib.C87685a;
import p547hb.C87464c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.u0 */
public class C1829u0 extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 218;
    public static final String NAME = "sendBizRedPacket";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87464c cVar;
        C88267e eVar = (C88267e) fVar;
        Activity o0 = eVar.mo114344o0();
        if (o0 == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        try {
            jSONObject.put("appId", eVar.getAppId());
            C83928t1 M0 = eVar.mo114341l0();
            if (!(M0 == null || (cVar = (C87464c) M0.mo116150E0(C87464c.class)) == null)) {
                cVar.mo111266l(true, true, (C87685a) null);
            }
            AppBrandJsApiPayService.INSTANCE.sendBizRedPacket(o0, eVar.getRuntime().mo121253n1(), jSONObject, new C1827t0(this, eVar, i));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.JsApiSendBizRedPacket", e.getMessage());
            eVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
