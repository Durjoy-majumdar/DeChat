package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.l */
public final class C82736l implements C82732k0.C82734b {

    /* renamed from: d */
    public final C82732k0 f242054d;

    /* renamed from: e */
    public final C82732k0 f242055e;

    public C82736l(C82732k0 k0Var, C82732k0 k0Var2) {
        C87412m.m108594g(k0Var, "ifNotNavigateStrategy");
        C87412m.m108594g(k0Var2, "ifNotOpenNativeStrategy");
        this.f242054d = k0Var;
        this.f242055e = k0Var2;
    }

    /* renamed from: RV */
    public C82732k0 mo115008RV(boolean z, boolean z2) {
        C82732k0 k0Var = C82710f.f242008a;
        if (!z) {
            k0Var = k0Var.mo114993b(this.f242054d);
        }
        return !z2 ? k0Var.mo114993b(this.f242055e) : k0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C82736l(C82732k0 k0Var, C82732k0 k0Var2, int i, C8480h hVar) {
        this((i & 1) != 0 ? C82716g.f242027a : k0Var, (i & 2) != 0 ? C82723i.f242038a : k0Var2);
    }
}
