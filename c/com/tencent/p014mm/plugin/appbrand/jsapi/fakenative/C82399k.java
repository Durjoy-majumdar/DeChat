package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gs0.C87324b;
import gy3.C8480h;
import gy3.C87412m;
import kr0.C88267e;
import nr3.C89059e;
import nr3.C89060f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.k */
public final class C82399k extends C82268c<C88267e> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "saveSplashScreenshot";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.k$a */
    public static final class C82400a {
        public C82400a(C8480h hVar) {
        }
    }

    static {
        new C82400a((C8480h) null);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        AppBrandRuntimeWC N0 = eVar != null ? eVar.getRuntime() : null;
        if (N0 != null) {
            C87412m.m108594g(eVar, "env");
            if (!(C87324b.f253068f.mo58669a() && eVar.getRuntime().mo113210l1().f239373d1)) {
                eVar.mo109647a(i, mo115109j("fail:not supported"));
            } else if (N0.f238154s != null) {
                eVar.mo109647a(i, mo115109j("fail: not ready for screenshot"));
            } else {
                C84072q1.m103586a(eVar.getAppId()).getClass();
                C89059e<Void> a = C89060f.m111322a();
                a.mo11397F(N0);
                a.mo123062e(new C82401l(N0, eVar, i, this)).mo123060U(new C82402o(N0, eVar, i, this)).mo123058O();
            }
        } else if (eVar != null) {
            eVar.mo109647a(i, mo115109j("fail:internal error"));
        }
    }
}
