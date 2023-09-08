package vp1;

import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import te3.C50140kk0;

/* renamed from: vp1.k */
public final class C14934k extends C87413o implements C32226l<C50140kk0, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C50140kk0, Boolean> f40967d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f40968e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14934k(C32226l<? super C50140kk0, Boolean> lVar, C8477a0 a0Var) {
        super(1);
        this.f40967d = lVar;
        this.f40968e = a0Var;
    }

    public Object invoke(Object obj) {
        C50140kk0 kk02 = (C50140kk0) obj;
        C87412m.m108594g(kk02, "item");
        boolean booleanValue = this.f40967d.invoke(kk02).booleanValue();
        if (booleanValue) {
            this.f40968e.f27482d = true;
        }
        return Boolean.valueOf(booleanValue);
    }
}
