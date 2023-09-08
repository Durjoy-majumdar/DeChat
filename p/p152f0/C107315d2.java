package p152f0;

import p1165z.C112527l;
import p1165z.C112529n;
import p1165z.C112530o;
import p175j0.C60647d0;
import p175j0.C60690y0;

/* renamed from: f0.d2 */
public final class C107315d2 implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C60690y0 f321069a;

    /* renamed from: b */
    public final /* synthetic */ C112527l f321070b;

    public C107315d2(C60690y0 y0Var, C112527l lVar) {
        this.f321069a = y0Var;
        this.f321070b = lVar;
    }

    public void dispose() {
        C112530o oVar = (C112530o) this.f321069a.getValue();
        if (oVar != null) {
            C112529n nVar = new C112529n(oVar);
            C112527l lVar = this.f321070b;
            if (lVar != null) {
                lVar.mo164253b(nVar);
            }
            this.f321069a.setValue(null);
        }
    }
}
