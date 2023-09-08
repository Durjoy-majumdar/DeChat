package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.e */
public final class C82706e implements C82732k0 {

    /* renamed from: a */
    public final C82732k0 f242003a;

    /* renamed from: b */
    public final C82732k0 f242004b;

    public C82706e(C82732k0 k0Var, C82732k0 k0Var2) {
        C87412m.m108594g(k0Var, "left");
        C87412m.m108594g(k0Var2, "right");
        this.f242003a = k0Var;
        this.f242004b = k0Var2;
    }

    /* renamed from: a */
    public boolean mo114992a(C82381f fVar, C83231l.C83235e eVar) {
        C87412m.m108594g(eVar, "appPauseType");
        return this.f242003a.mo114992a(fVar, eVar) && this.f242004b.mo114992a(fVar, eVar);
    }

    /* renamed from: b */
    public C82732k0 mo114993b(C82732k0 k0Var) {
        return C82732k0.C82733a.m101507a(this, k0Var);
    }

    public String toString() {
        return "AutoPauseCombinedStrategy(left=" + this.f242003a + ", right=" + this.f242004b + ')';
    }
}
