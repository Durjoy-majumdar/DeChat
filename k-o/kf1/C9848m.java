package kf1;

import cm1.C0740i2;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import on1.C11520f0;
import on1.C11530i0;
import rx3.C13598b0;

/* renamed from: kf1.m */
public final class C9848m extends C87413o implements C32226l<C11520f0<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11530i0<C0740i2> f30425d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9848m(C11530i0<C0740i2> i0Var) {
        super(1);
        this.f30425d = i0Var;
    }

    public Object invoke(Object obj) {
        C11520f0 f0Var = (C11520f0) obj;
        C87412m.m108594g(f0Var, "state");
        C11530i0<C0740i2> i0Var = this.f30425d;
        i0Var.getClass();
        if (f0Var instanceof C11520f0.C11523c) {
            i0Var.f33851d.onPreFinishRefresh(((C11520f0.C11523c) f0Var).f33841a.mo11463a());
        } else if (f0Var instanceof C11520f0.C11522b) {
            if (i0Var.f33852e) {
                i0Var.f33851d.onPreFinishLoadMoreSmooth(((C11520f0.C11522b) f0Var).f33840a.mo11463a());
            } else {
                i0Var.f33851d.onPreFinishLoadMore(((C11520f0.C11522b) f0Var).f33840a.mo11463a());
            }
        }
        return C13598b0.f38549a;
    }
}
