package p267x;

import a14.C0000n0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ny3.C89104m;
import p246u1.C111063a;
import p246u1.C111064a0;
import p246u1.C111073i;
import p246u1.C111074j;
import p246u1.C111095y;
import rx3.C13598b0;

/* renamed from: x.j2 */
public final class C111922j2 extends C87413o implements C32226l<C111064a0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f335051d;

    /* renamed from: e */
    public final /* synthetic */ boolean f335052e;

    /* renamed from: f */
    public final /* synthetic */ boolean f335053f;

    /* renamed from: g */
    public final /* synthetic */ C111932l2 f335054g;

    /* renamed from: h */
    public final /* synthetic */ C0000n0 f335055h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111922j2(boolean z, boolean z2, boolean z3, C111932l2 l2Var, C0000n0 n0Var) {
        super(1);
        this.f335051d = z;
        this.f335052e = z2;
        this.f335053f = z3;
        this.f335054g = l2Var;
        this.f335055h = n0Var;
    }

    public Object invoke(Object obj) {
        C111064a0 a0Var = (C111064a0) obj;
        C87412m.m108594g(a0Var, "$this$semantics");
        C111073i iVar = new C111073i(new C38421h2(this.f335054g), new C111920i2(this.f335054g), this.f335051d);
        if (this.f335052e) {
            C89104m<Object>[] mVarArr = C111095y.f332674a;
            C111095y.f332677d.mo162844a(a0Var, C111095y.f332674a[6], iVar);
        } else {
            C89104m<Object>[] mVarArr2 = C111095y.f332674a;
            C111095y.f332676c.mo162844a(a0Var, C111095y.f332674a[5], iVar);
        }
        if (this.f335053f) {
            a0Var.mo162814f(C111074j.f332611d, new C111063a((String) null, new C66221g2(this.f335055h, this.f335052e, this.f335054g)));
        }
        return C13598b0.f38549a;
    }
}
