package p869y0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: y0.v */
public final class C112338v extends C54172f1 implements C110096b, C110098d<C112338v> {

    /* renamed from: e */
    public final C32226l<C112333s, C13598b0> f336365e;

    /* renamed from: f */
    public final C60690y0 f336366f = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    /* renamed from: g */
    public final C110100f<C112338v> f336367g = C112335u.f336362a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112338v(C32226l<? super C112333s, C13598b0> lVar, C32226l<? super C103618e1, C13598b0> lVar2) {
        super(lVar2);
        C87412m.m108594g(lVar, "focusPropertiesScope");
        C87412m.m108594g(lVar2, "inspectorInfo");
        this.f336365e = lVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        ((C108494d2) this.f336366f).setValue((C112338v) eVar.mo161499a(C112335u.f336362a));
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final void mo164062b(C112333s sVar) {
        C87412m.m108594g(sVar, "focusProperties");
        this.f336365e.invoke(sVar);
        C112338v vVar = (C112338v) ((C108494d2) this.f336366f).getValue();
        if (vVar != null) {
            vVar.mo164062b(sVar);
        }
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C112338v) && C87412m.m108589b(this.f336365e, ((C112338v) obj).f336365e);
    }

    public C110100f<C112338v> getKey() {
        return this.f336367g;
    }

    public Object getValue() {
        return this;
    }

    public int hashCode() {
        return this.f336365e.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
