package p631o1;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p560i2.C108329n;
import p560i2.C33181m;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: o1.l0 */
public final class C109850l0 extends C54172f1 implements C109849k0 {

    /* renamed from: e */
    public final C32226l<C33181m, C13598b0> f328772e;

    /* renamed from: f */
    public long f328773f = C108329n.m146743a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109850l0(C32226l<? super C33181m, C13598b0> lVar, C32226l<? super C103618e1, C13598b0> lVar2) {
        super(lVar2);
        C87412m.m108594g(lVar, "onSizeChanged");
        C87412m.m108594g(lVar2, "inspectorInfo");
        this.f328772e = lVar;
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
        if (!(obj instanceof C109850l0)) {
            return false;
        }
        return C87412m.m108589b(this.f328772e, ((C109850l0) obj).f328772e);
    }

    public int hashCode() {
        return this.f328772e.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: k0 */
    public void mo161162k0(long j) {
        if (!C33181m.m39965a(this.f328773f, j)) {
            this.f328772e.invoke(new C33181m(j));
            this.f328773f = j;
        }
    }
}
