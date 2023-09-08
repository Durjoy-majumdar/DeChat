package com.tencent.p014mm.plugin.appbrand.appusage;

import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.x1 */
public final class C81543x1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C81538w1 f239157d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81543x1(C81538w1 w1Var) {
        super(0);
        this.f239157d = w1Var;
    }

    public Object invoke() {
        if (this.f239157d.f239151h.getAndSet(false) && !this.f239157d.f239149f) {
            C81538w1 w1Var = this.f239157d;
            if (w1Var.f239150g) {
                w1Var.f239150g = false;
                C61926c.m72661F(w1Var.f239148e, new C81544y1(w1Var));
            }
        }
        return C13598b0.f38549a;
    }
}
