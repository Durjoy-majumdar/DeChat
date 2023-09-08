package com.tencent.p014mm.plugin.appbrand;

import hp3.C87581a;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.j0 */
public class C81971j0 implements C87581a<Boolean, Void> {

    /* renamed from: a */
    public final /* synthetic */ C81688d0 f240373a;

    public C81971j0(C81688d0 d0Var) {
        this.f240373a = d0Var;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C81688d0 d0Var = this.f240373a;
        C88643g.m110543a(d0Var.mo114032g("ensureXWebPreLoaded").mo123064p(new C83713o0(d0Var)));
        return Boolean.FALSE;
    }
}
