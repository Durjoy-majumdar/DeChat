package zy3;

import fy3.C32226l;
import g04.C24528c;
import g04.C24531d;
import g04.C24538j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import sx3.C64186f0;
import sx3.C64187h0;
import vz3.C22826c;
import vz3.C22830f;
import w04.C26412a;
import wy3.C26448e0;
import wy3.C26469k;
import wy3.C26484n0;

/* renamed from: zy3.l0 */
public class C26756l0 extends C24538j {

    /* renamed from: b */
    public final C26448e0 f74408b;

    /* renamed from: c */
    public final C22826c f74409c;

    public C26756l0(C26448e0 e0Var, C22826c cVar) {
        C87412m.m108594g(e0Var, "moduleDescriptor");
        C87412m.m108594g(cVar, "fqName");
        this.f74408b = e0Var;
        this.f74409c = cVar;
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        C24531d.C24532a aVar = C24531d.f70094c;
        if (!dVar.mo51213a(C24531d.f70099h)) {
            return C64186f0.f181907d;
        }
        if (this.f74409c.mo35975d() && dVar.f70111a.contains(C24528c.C24530b.f70093a)) {
            return C64186f0.f181907d;
        }
        Collection<C22826c> r = this.f74408b.mo52624r(this.f74409c, lVar);
        ArrayList arrayList = new ArrayList(r.size());
        for (C22826c f : r) {
            C22830f f2 = f.mo35978f();
            C87412m.m108593f(f2, "subFqName.shortName()");
            if (lVar.invoke(f2).booleanValue()) {
                C26484n0 n0Var = null;
                if (!f2.f65638e) {
                    C26484n0 b0 = this.f74408b.mo52620b0(this.f74409c.mo35974c(f2));
                    if (!b0.isEmpty()) {
                        n0Var = b0;
                    }
                }
                C26412a.m34008a(arrayList, n0Var);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return C64187h0.f181908d;
    }

    public String toString() {
        return "subpackages of " + this.f74409c + " from " + this.f74408b;
    }
}
