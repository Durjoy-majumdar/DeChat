package p175j0;

import fy3.C32224a;
import gy3.C87412m;
import p175j0.C108504h;

/* renamed from: j0.f0 */
public final class C108498f0<T> extends C108499f1<T> {

    /* renamed from: b */
    public final C108497e2<T> f324822b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108498f0(C108497e2<T> e2Var, C32224a<? extends T> aVar) {
        super(aVar);
        C87412m.m108594g(e2Var, "policy");
        C87412m.m108594g(aVar, "defaultFactory");
        this.f324822b = e2Var;
    }

    /* renamed from: a */
    public C60667k2<T> mo85600a(T t, C108504h hVar, int i) {
        hVar.mo51557H(-84026900);
        hVar.mo51557H(-492369756);
        Object q = hVar.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            q = C108500f2.m146995b(t, this.f324822b);
            hVar.mo51553F(q);
        }
        hVar.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        y0Var.setValue(t);
        hVar.mo51565P();
        return y0Var;
    }
}
