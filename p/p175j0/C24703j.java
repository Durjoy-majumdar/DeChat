package p175j0;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: j0.j */
public final class C24703j extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Object f70456d;

    /* renamed from: e */
    public final /* synthetic */ int f70457e;

    /* renamed from: f */
    public final /* synthetic */ int f70458f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24703j(Object obj, int i, int i2) {
        super(3);
        this.f70456d = obj;
        this.f70457e = i;
        this.f70458f = i2;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C24661b2 b2Var = (C24661b2) obj2;
        C24724t1 t1Var = (C24724t1) obj3;
        C87412m.m108594g((C24665d) obj, "<anonymous parameter 0>");
        C87412m.m108594g(b2Var, "slots");
        C87412m.m108594g(t1Var, "rememberManager");
        if (C87412m.m108589b(this.f70456d, b2Var.mo51503H(this.f70457e, this.f70458f))) {
            t1Var.mo51683b((C24725u1) this.f70456d);
            int i = this.f70458f;
            int i2 = C108504h.f324828a;
            b2Var.mo51500E(i, C108504h.C60656a.f172772a);
            return C13598b0.f38549a;
        }
        C24715p.m31027c("Slot table is out of sync".toString());
        throw null;
    }
}
