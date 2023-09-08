package p267x;

import p1165z.C112521g;
import p1165z.C112522h;
import p1165z.C112527l;
import p175j0.C60647d0;
import p175j0.C60690y0;

/* renamed from: x.w0 */
public final class C111964w0 implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C60690y0 f335193a;

    /* renamed from: b */
    public final /* synthetic */ C112527l f335194b;

    public C111964w0(C60690y0 y0Var, C112527l lVar) {
        this.f335193a = y0Var;
        this.f335194b = lVar;
    }

    public void dispose() {
        C60690y0 y0Var = this.f335193a;
        C112527l lVar = this.f335194b;
        C112521g gVar = (C112521g) y0Var.getValue();
        if (gVar != null) {
            lVar.mo164253b(new C112522h(gVar));
            y0Var.setValue(null);
        }
    }
}
