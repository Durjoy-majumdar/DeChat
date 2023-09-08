package p759y;

import p1165z.C112514a;
import p1165z.C112515b;
import p1165z.C112527l;
import p175j0.C60647d0;
import p175j0.C60690y0;

/* renamed from: y.t */
public final class C112284t implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C60690y0 f336223a;

    /* renamed from: b */
    public final /* synthetic */ C112527l f336224b;

    public C112284t(C60690y0 y0Var, C112527l lVar) {
        this.f336223a = y0Var;
        this.f336224b = lVar;
    }

    public void dispose() {
        C112515b bVar = (C112515b) this.f336223a.getValue();
        if (bVar != null) {
            C112527l lVar = this.f336224b;
            if (lVar != null) {
                lVar.mo164253b(new C112514a(bVar));
            }
            this.f336223a.setValue(null);
        }
    }
}
