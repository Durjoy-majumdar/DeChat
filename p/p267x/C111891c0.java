package p267x;

import p1165z.C112517d;
import p1165z.C112518e;
import p1165z.C112527l;
import p175j0.C60647d0;
import p175j0.C60690y0;

/* renamed from: x.c0 */
public final class C111891c0 implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C60690y0 f334988a;

    /* renamed from: b */
    public final /* synthetic */ C112527l f334989b;

    public C111891c0(C60690y0 y0Var, C112527l lVar) {
        this.f334988a = y0Var;
        this.f334989b = lVar;
    }

    public void dispose() {
        C112517d dVar = (C112517d) this.f334988a.getValue();
        if (dVar != null) {
            C112518e eVar = new C112518e(dVar);
            C112527l lVar = this.f334989b;
            if (lVar != null) {
                lVar.mo164253b(eVar);
            }
            this.f334988a.setValue(null);
        }
    }
}
