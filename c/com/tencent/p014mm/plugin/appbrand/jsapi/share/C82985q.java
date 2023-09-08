package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.q */
public class C82985q extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 202;
    public static final String NAME = "showShareMenuWithShareTicket";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.JsApiShowShareMenuWithShareTicket", "invoke");
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 != null) {
            l0.mo116204x0(3, false);
            C83699y J0 = l0.mo116155J0(3);
            if (J0 == null) {
                i2Var.mo109647a(i, mo115109j("fail:menu item do not exist"));
                return;
            }
            J0.f244320d.mo120962i("enable_share_with_share_ticket", Boolean.TRUE);
            i2Var.mo109647a(i, mo115109j("ok"));
            return;
        }
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
