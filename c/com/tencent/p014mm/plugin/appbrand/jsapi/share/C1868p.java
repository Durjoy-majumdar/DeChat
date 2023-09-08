package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.p */
public class C1868p extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 146;
    public static final String NAME = "showShareMenu";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        C83780d1 l0 = i2Var.mo114341l0();
        if (l0 != null) {
            l0.mo116204x0(3, false);
        }
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
