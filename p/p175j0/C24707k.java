package p175j0;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: j0.k */
public final class C24707k extends C87413o implements C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Object f70471d;

    /* renamed from: e */
    public final /* synthetic */ int f70472e;

    /* renamed from: f */
    public final /* synthetic */ int f70473f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24707k(Object obj, int i, int i2) {
        super(3);
        this.f70471d = obj;
        this.f70472e = i;
        this.f70473f = i2;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C24661b2 b2Var = (C24661b2) obj2;
        C87412m.m108594g((C24665d) obj, "<anonymous parameter 0>");
        C87412m.m108594g(b2Var, "slots");
        C87412m.m108594g((C24724t1) obj3, "<anonymous parameter 2>");
        if (C87412m.m108589b(this.f70471d, b2Var.mo51503H(this.f70472e, this.f70473f))) {
            int i = this.f70473f;
            int i2 = C108504h.f324828a;
            b2Var.mo51500E(i, C108504h.C60656a.f172772a);
            return C13598b0.f38549a;
        }
        C24715p.m31027c("Slot table is out of sync".toString());
        throw null;
    }
}
