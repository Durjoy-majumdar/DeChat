package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n4 */
public class C82839n4 extends C82268c<C83780d1> {
    public static final int CTRL_INDEX = 0;
    public static final String NAME = "openLink";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83780d1 d1Var = (C83780d1) fVar;
        String optString = jSONObject.optString("url");
        if (Util.isNullOrNil(optString)) {
            d1Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        C40469j0.C40470a aVar = new C40469j0.C40470a();
        aVar.f108759c = d1Var;
        ((C40469j0) d1Var.mo109668l(C40469j0.class)).mo56167JF(d1Var.getContext(), optString, "", aVar);
        d1Var.mo109647a(i, mo115109j("ok"));
    }
}
