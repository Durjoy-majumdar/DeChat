package com.tencent.p014mm.plugin.appbrand;

import hp3.C87581a;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.l0 */
public class C83236l0 implements C87581a<Boolean, Void> {

    /* renamed from: a */
    public final /* synthetic */ C81688d0 f243101a;

    public C83236l0(C81688d0 d0Var) {
        this.f243101a = d0Var;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C81688d0 d0Var = this.f243101a;
        C88643g.m110543a(d0Var.mo114032g("ensureXWebPreLoaded").mo123064p(new C83713o0(d0Var)));
        return Boolean.FALSE;
    }
}
