package p631o1;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: o1.h0 */
public final class C61918h0 extends C54172f1 implements C61917g0 {

    /* renamed from: e */
    public final C32226l<C109857o, C13598b0> f176025e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61918h0(C32226l<? super C109857o, C13598b0> lVar, C32226l<? super C103618e1, C13598b0> lVar2) {
        super(lVar2);
        C87412m.m108594g(lVar, "callback");
        C87412m.m108594g(lVar2, "inspectorInfo");
        this.f176025e = lVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: a0 */
    public void mo86834a0(C109857o oVar) {
        C87412m.m108594g(oVar, "coordinates");
        this.f176025e.invoke(oVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61918h0)) {
            return false;
        }
        return C87412m.m108589b(this.f176025e, ((C61918h0) obj).f176025e);
    }

    public int hashCode() {
        return this.f176025e.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
