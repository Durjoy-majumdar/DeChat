package p267x;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p560i2.C108322d;

/* renamed from: x.q1 */
public final class C111951q1 extends C87413o implements C32224a<C112539e> {

    /* renamed from: d */
    public final /* synthetic */ C108322d f335144d;

    /* renamed from: e */
    public final /* synthetic */ C60667k2<C32226l<C108322d, C112539e>> f335145e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C112539e> f335146f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111951q1(C108322d dVar, C60667k2<? extends C32226l<? super C108322d, C112539e>> k2Var, C60690y0<C112539e> y0Var) {
        super(0);
        this.f335144d = dVar;
        this.f335145e = k2Var;
        this.f335146f = y0Var;
    }

    public Object invoke() {
        long j = ((C112539e) this.f335145e.getValue().invoke(this.f335144d)).f336959a;
        return new C112539e((!C112540f.m153747c(this.f335146f.getValue().f336959a) || !C112540f.m153747c(j)) ? C112539e.f336957d : C112539e.m153742g(this.f335146f.getValue().f336959a, j));
    }
}
