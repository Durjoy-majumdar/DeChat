package p267x;

import p1165z.C112527l;
import p1165z.C112529n;
import p1165z.C112530o;
import p175j0.C60647d0;
import p175j0.C60690y0;

/* renamed from: x.n */
public final class C111937n implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C60690y0 f335112a;

    /* renamed from: b */
    public final /* synthetic */ C112527l f335113b;

    public C111937n(C60690y0 y0Var, C112527l lVar) {
        this.f335112a = y0Var;
        this.f335113b = lVar;
    }

    public void dispose() {
        C112530o oVar = (C112530o) this.f335112a.getValue();
        if (oVar != null) {
            this.f335113b.mo164253b(new C112529n(oVar));
            this.f335112a.setValue(null);
        }
    }
}
