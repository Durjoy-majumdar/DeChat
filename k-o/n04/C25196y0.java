package n04;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o04.C25323e;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import wy3.C26446d1;

/* renamed from: n04.y0 */
public final class C25196y0 extends C25161n1 {

    /* renamed from: a */
    public final C26446d1 f71651a;

    /* renamed from: b */
    public final C13601g f71652b = C36568h.m40986b(C13602i.PUBLICATION, new C25197a(this));

    /* renamed from: n04.y0$a */
    public static final class C25197a extends C87413o implements C32224a<C25143j0> {

        /* renamed from: d */
        public final /* synthetic */ C25196y0 f71653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25197a(C25196y0 y0Var) {
            super(0);
            this.f71653d = y0Var;
        }

        public Object invoke() {
            return C25200z0.m32144b(this.f71653d.f71651a);
        }
    }

    public C25196y0(C26446d1 d1Var) {
        C87412m.m108594g(d1Var, "typeParameter");
        this.f71651a = d1Var;
    }

    /* renamed from: a */
    public C25202z1 mo52295a() {
        return C25202z1.OUT_VARIANCE;
    }

    /* renamed from: b */
    public boolean mo52296b() {
        return true;
    }

    public C25143j0 getType() {
        return (C25143j0) this.f71652b.getValue();
    }

    /* renamed from: n */
    public C25158m1 mo52298n(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this;
    }
}
