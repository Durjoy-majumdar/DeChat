package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import ke3.C88144b;
import org.json.JSONObject;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i2 */
public class C1701i2 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 286;
    public static final String NAME = "chooseInvoiceTitle";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        Intent intent = new Intent();
        intent.putExtra("req_scene", 0);
        intent.putExtra("launch_from_appbrand", true);
        Activity o0 = i2Var.mo114344o0();
        if (o0 == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        C89916g.m112446a(o0).mo124232f(new C1697h2(this, i2Var, i));
        C88144b.m109796n(o0, "address", ".ui.InvoiceListUI", intent, hashCode() & 65535, false);
    }
}
