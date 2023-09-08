package p435a0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p560i2.C108322d;
import p631o1.C109852m0;
import p721v0.C111294a;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.e */
public final class C103138e extends C54172f1 implements C109852m0 {

    /* renamed from: e */
    public C111294a f304270e;

    /* renamed from: f */
    public boolean f304271f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103138e(C111294a aVar, boolean z, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(aVar, "alignment");
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f304270e = aVar;
        this.f304271f = z;
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
        C103138e eVar = obj instanceof C103138e ? (C103138e) obj : null;
        return eVar != null && C87412m.m108589b(this.f304270e, eVar.f304270e) && this.f304271f == eVar.f304271f;
    }

    public int hashCode() {
        return (this.f304270e.hashCode() * 31) + (this.f304271f ? 1231 : 1237);
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: j0 */
    public Object mo142900j0(C108322d dVar, Object obj) {
        C87412m.m108594g(dVar, "<this>");
        return this;
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.f304270e + ", matchParentSize=" + this.f304271f + ')';
    }
}
