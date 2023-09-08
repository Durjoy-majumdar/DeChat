package p631o1;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import p560i2.C108319b;
import p631o1.C109866r;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: o1.s */
public final class C109872s extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final C32228q<C109827a0, C109893x, C108319b, C109899z> f328794e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109872s(C32228q<? super C109827a0, ? super C109893x, ? super C108319b, ? extends C109899z> qVar, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(qVar, "measureBlock");
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f328794e = qVar;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        return this.f328794e.invoke(a0Var, xVar, new C108319b(j));
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: Y */
    public int mo142878Y(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149339c(this, kVar, jVar, i);
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
        C109872s sVar = obj instanceof C109872s ? (C109872s) obj : null;
        if (sVar == null) {
            return false;
        }
        return C87412m.m108589b(this.f328794e, sVar.f328794e);
    }

    public int hashCode() {
        return this.f328794e.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: s0 */
    public int mo142882s0(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149340d(this, kVar, jVar, i);
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f328794e + ')';
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149337a(this, kVar, jVar, i);
    }
}
