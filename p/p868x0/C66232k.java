package p868x0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p721v0.C65503j;
import p835c1.C54601d;
import rx3.C13598b0;

/* renamed from: x0.k */
public final class C66232k extends C54172f1 implements C111982h {

    /* renamed from: e */
    public final C32226l<C54601d, C13598b0> f190288e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66232k(C32226l<? super C54601d, C13598b0> lVar, C32226l<? super C103618e1, C13598b0> lVar2) {
        super(lVar2);
        C87412m.m108594g(lVar, "onDraw");
        C87412m.m108594g(lVar2, "inspectorInfo");
        this.f190288e = lVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: V */
    public void mo90316V(C54601d dVar) {
        C87412m.m108594g(dVar, "<this>");
        this.f190288e.invoke(dVar);
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66232k)) {
            return false;
        }
        return C87412m.m108589b(this.f190288e, ((C66232k) obj).f190288e);
    }

    public int hashCode() {
        return this.f190288e.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
