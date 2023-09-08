package p267x;

import androidx.compose.foundation.lazy.layout.C103598t;
import androidx.compose.foundation.lazy.layout.C103600u;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110099e;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: x.y1 */
public final class C111971y1 implements C110096b {

    /* renamed from: d */
    public final C32226l<C103598t, C13598b0> f335217d;

    public C111971y1(C32226l<? super C103598t, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onPinnableParentAvailable");
        this.f335217d = lVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        this.f335217d.invoke(eVar.mo161499a(C103600u.f305945a));
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C111971y1) && C87412m.m108589b(((C111971y1) obj).f335217d, this.f335217d);
    }

    public int hashCode() {
        return this.f335217d.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
