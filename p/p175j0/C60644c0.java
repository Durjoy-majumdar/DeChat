package p175j0;

import fy3.C32226l;
import gy3.C87412m;

/* renamed from: j0.c0 */
public final class C60644c0 implements C24725u1 {

    /* renamed from: d */
    public final C32226l<C60651e0, C60647d0> f172749d;

    /* renamed from: e */
    public C60647d0 f172750e;

    public C60644c0(C32226l<? super C60651e0, ? extends C60647d0> lVar) {
        C87412m.m108594g(lVar, "effect");
        this.f172749d = lVar;
    }

    /* renamed from: b */
    public void mo51625b() {
    }

    /* renamed from: c */
    public void mo51626c() {
        this.f172750e = this.f172749d.invoke(C60655g0.f172771a);
    }

    /* renamed from: d */
    public void mo51627d() {
        C60647d0 d0Var = this.f172750e;
        if (d0Var != null) {
            d0Var.dispose();
        }
        this.f172750e = null;
    }
}
