package n04;

import gy3.C24560g0;
import gy3.C87412m;
import ny3.C25235d;
import xy3.C26571h;
import xy3.C26576j;

/* renamed from: n04.n */
public final class C25159n extends C25118e1<C25159n> {

    /* renamed from: a */
    public final C26571h f71608a;

    public C25159n(C26571h hVar) {
        C87412m.m108594g(hVar, "annotations");
        this.f71608a = hVar;
    }

    /* renamed from: a */
    public C25118e1 mo52257a(C25118e1 e1Var) {
        C25159n nVar = (C25159n) e1Var;
        return nVar == null ? this : new C25159n(C26576j.m34374a(this.f71608a, nVar.f71608a));
    }

    /* renamed from: b */
    public C25235d<? extends C25159n> mo52258b() {
        return C24560g0.m30725a(C25159n.class);
    }

    /* renamed from: c */
    public C25118e1 mo52259c(C25118e1 e1Var) {
        if (C87412m.m108589b((C25159n) e1Var, this)) {
            return this;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25159n)) {
            return false;
        }
        return C87412m.m108589b(((C25159n) obj).f71608a, this.f71608a);
    }

    public int hashCode() {
        return this.f71608a.hashCode();
    }
}
