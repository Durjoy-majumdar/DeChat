package p004b0;

import androidx.compose.foundation.lazy.layout.C103598t;
import androidx.compose.foundation.lazy.layout.C103600u;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p004b0.C103943h;
import p1140p1.C110098d;
import p1140p1.C110100f;
import p631o1.C109862p0;
import p721v0.C65503j;

/* renamed from: b0.b0 */
public final class C103932b0 implements C110098d<C103598t>, C103598t {

    /* renamed from: f */
    public static final C103933a f307323f = new C103933a();

    /* renamed from: d */
    public final C103953l0 f307324d;

    /* renamed from: e */
    public final C103943h f307325e;

    /* renamed from: b0.b0$a */
    public static final class C103933a implements C103598t.C103599a {
        /* renamed from: a */
        public void mo144578a() {
        }
    }

    /* renamed from: b0.b0$b */
    public static final class C103934b implements C103598t.C103599a {

        /* renamed from: a */
        public final C103943h.C103944a f307326a;

        /* renamed from: b */
        public final /* synthetic */ C103943h f307327b;

        /* renamed from: c */
        public final /* synthetic */ C103932b0 f307328c;

        public C103934b(C103943h hVar, C103932b0 b0Var) {
            this.f307327b = hVar;
            this.f307328c = b0Var;
            C103943h.C103944a aVar = new C103943h.C103944a(hVar.mo145562b(), hVar.mo145561a());
            hVar.f307370a.mo159860b(aVar);
            this.f307326a = aVar;
        }

        /* renamed from: a */
        public void mo144578a() {
            C103943h hVar = this.f307327b;
            C103943h.C103944a aVar = this.f307326a;
            hVar.getClass();
            C87412m.m108594g(aVar, "interval");
            hVar.f307370a.mo159869k(aVar);
            C109862p0 p0Var = this.f307328c.f307324d.f307426k;
            if (p0Var != null) {
                p0Var.mo161184f();
            }
        }
    }

    public C103932b0(C103953l0 l0Var, C103943h hVar) {
        C87412m.m108594g(l0Var, "state");
        C87412m.m108594g(hVar, "beyondBoundsInfo");
        this.f307324d = l0Var;
        this.f307325e = hVar;
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

    /* renamed from: b */
    public C103598t.C103599a mo144577b() {
        return !this.f307325e.f307370a.mo159868j() ? f307323f : new C103934b(this.f307325e, this);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public C110100f<C103598t> getKey() {
        return C103600u.f305945a;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
