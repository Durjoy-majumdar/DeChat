package p257w;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60647d0;
import p175j0.C60651e0;

/* renamed from: w.e1 */
public final class C111638e1 extends C87413o implements C32226l<C60651e0, C60647d0> {

    /* renamed from: d */
    public final /* synthetic */ C111629c1<Object> f334213d;

    /* renamed from: e */
    public final /* synthetic */ C111629c1<Object> f334214e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111638e1(C111629c1<Object> c1Var, C111629c1<Object> c1Var2) {
        super(1);
        this.f334213d = c1Var;
        this.f334214e = c1Var2;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
        C111629c1<Object> c1Var = this.f334213d;
        C111629c1<Object> c1Var2 = this.f334214e;
        c1Var.getClass();
        C87412m.m108594g(c1Var2, "transition");
        c1Var.f334185i.add(c1Var2);
        return new C111637d1(this.f334213d, this.f334214e);
    }
}
