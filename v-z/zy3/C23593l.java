package zy3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import sx3.C110818d0;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C22936j0;
import wy3.C22940l0;
import wy3.C22941m0;
import wy3.C26465i0;

/* renamed from: zy3.l */
public final class C23593l implements C22941m0 {

    /* renamed from: a */
    public final List<C22936j0> f67730a;

    /* renamed from: b */
    public final String f67731b;

    public C23593l(List<? extends C22936j0> list, String str) {
        C87412m.m108594g(list, "providers");
        C87412m.m108594g(str, "debugName");
        this.f67730a = list;
        this.f67731b = str;
        list.size();
        C110818d0.m150904D0(list).size();
    }

    /* renamed from: a */
    public List<C26465i0> mo36112a(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C22936j0 a : this.f67730a) {
            C22940l0.m26959a(a, cVar, arrayList);
        }
        return C110818d0.m150953y0(arrayList);
    }

    /* renamed from: b */
    public boolean mo36114b(C22826c cVar) {
        C87412m.m108594g(cVar, "fqName");
        List<C22936j0> list = this.f67730a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C22936j0 b : list) {
            if (!C22940l0.m26960b(b, cVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo36115c(C22826c cVar, Collection<C26465i0> collection) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(collection, "packageFragments");
        for (C22936j0 a : this.f67730a) {
            C22940l0.m26959a(a, cVar, collection);
        }
    }

    /* renamed from: r */
    public Collection<C22826c> mo36113r(C22826c cVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C22936j0 r : this.f67730a) {
            hashSet.addAll(r.mo36113r(cVar, lVar));
        }
        return hashSet;
    }

    public String toString() {
        return this.f67731b;
    }
}
