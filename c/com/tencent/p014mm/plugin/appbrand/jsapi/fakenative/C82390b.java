package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import kr0.C88267e;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.b */
public final class C82390b extends C82268c<C88267e> {
    public static final int CTRL_INDEX = -1;
    public static final String NAME = "hideSplashScreenshot";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        AppBrandRuntimeWC N0 = eVar != null ? eVar.getRuntime() : null;
        if (N0 != null) {
            N0.mo113024P0(new C82389a(N0, eVar, i, this));
        } else if (eVar != null) {
            eVar.mo109647a(i, mo115109j("fail:internal error"));
        }
    }
}
