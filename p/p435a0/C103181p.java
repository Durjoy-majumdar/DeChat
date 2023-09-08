package p435a0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import p435a0.C103167m;
import p560i2.C108322d;
import p631o1.C109852m0;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.p */
public final class C103181p extends C54172f1 implements C109852m0 {

    /* renamed from: e */
    public final C111294a.C37633b f304347e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103181p(C111294a.C37633b bVar, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(bVar, "horizontal");
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f304347e = bVar;
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

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C103181p pVar = obj instanceof C103181p ? (C103181p) obj : null;
        if (pVar == null) {
            return false;
        }
        return C87412m.m108589b(this.f304347e, pVar.f304347e);
    }

    public int hashCode() {
        return this.f304347e.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: j0 */
    public Object mo142900j0(C108322d dVar, Object obj) {
        C87412m.m108594g(dVar, "<this>");
        C103189r0 r0Var = obj instanceof C103189r0 ? (C103189r0) obj : null;
        if (r0Var == null) {
            r0Var = new C103189r0(0.0f, false, (C103167m) null, 7, (C8480h) null);
        }
        int i = C103167m.f304322a;
        C111294a.C37633b bVar = this.f304347e;
        C87412m.m108594g(bVar, "horizontal");
        r0Var.f304372c = new C103167m.C103171d(bVar);
        return r0Var;
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f304347e + ')';
    }
}
