package p658q1;

import gy3.C87412m;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p631o1.C109895y;

/* renamed from: q1.i */
public final class C110299i {

    /* renamed from: a */
    public final C110301j f329879a;

    /* renamed from: b */
    public C60690y0<C109895y> f329880b;

    /* renamed from: c */
    public C109895y f329881c;

    public C110299i(C110301j jVar) {
        C87412m.m108594g(jVar, "layoutNode");
        this.f329879a = jVar;
    }

    /* renamed from: a */
    public final C109895y mo161700a() {
        C60690y0<C109895y> y0Var = this.f329880b;
        if (y0Var == null) {
            C109895y yVar = this.f329881c;
            if (yVar != null) {
                y0Var = C108500f2.m146996c(yVar, (C108497e2) null, 2, (Object) null);
            } else {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
        }
        this.f329880b = y0Var;
        return y0Var.getValue();
    }
}
