package e04;

import ez3.C24476d;
import g04.C20770i;
import gy3.C87412m;
import gz3.C24588g;
import iz3.C24649g;
import jz3.C24821j;
import jz3.C24825k;
import mz3.C21579b0;
import mz3.C25055g;
import sx3.C110818d0;
import vz3.C22826c;
import wy3.C26447e;
import wy3.C26483n;

/* renamed from: e04.c */
public final class C24468c {

    /* renamed from: a */
    public final C24649g f69984a;

    /* renamed from: b */
    public final C24588g f69985b;

    public C24468c(C24649g gVar, C24588g gVar2) {
        C87412m.m108594g(gVar, "packageFragmentProvider");
        C87412m.m108594g(gVar2, "javaResolverCache");
        this.f69984a = gVar;
        this.f69985b = gVar2;
    }

    /* renamed from: a */
    public final C26447e mo51170a(C25055g gVar) {
        C87412m.m108594g(gVar, "javaClass");
        C22826c d = gVar.mo51084d();
        if (d == null || gVar.mo51092u() != C21579b0.SOURCE) {
            C25055g s = gVar.mo51089s();
            if (s != null) {
                C26447e a = mo51170a(s);
                C20770i f0 = a != null ? a.mo51797f0() : null;
                C26483n g = f0 != null ? f0.mo32462g(gVar.getName(), C24476d.FROM_JAVA_LOADER) : null;
                if (g instanceof C26447e) {
                    return (C26447e) g;
                }
                return null;
            } else if (d == null) {
                return null;
            } else {
                C24649g gVar2 = this.f69984a;
                C22826c e = d.mo35976e();
                C87412m.m108593f(e, "fqName.parent()");
                C24821j jVar = (C24821j) C110818d0.m150916N(gVar2.mo36112a(e));
                if (jVar == null) {
                    return null;
                }
                C24825k kVar = jVar.f70776p.f70715d;
                kVar.getClass();
                return kVar.mo51846v(gVar.getName(), gVar);
            }
        } else {
            ((C24588g.C24589a) this.f69985b).getClass();
            return null;
        }
    }
}
