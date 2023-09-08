package wy3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import vz3.C22826c;

/* renamed from: wy3.l0 */
public final class C22940l0 {
    /* renamed from: a */
    public static final void m26959a(C22936j0 j0Var, C22826c cVar, Collection<C26465i0> collection) {
        C87412m.m108594g(j0Var, "<this>");
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(collection, "packageFragments");
        if (j0Var instanceof C22941m0) {
            ((C22941m0) j0Var).mo36115c(cVar, collection);
        } else {
            collection.addAll(j0Var.mo36112a(cVar));
        }
    }

    /* renamed from: b */
    public static final boolean m26960b(C22936j0 j0Var, C22826c cVar) {
        C87412m.m108594g(j0Var, "<this>");
        C87412m.m108594g(cVar, "fqName");
        return j0Var instanceof C22941m0 ? ((C22941m0) j0Var).mo36114b(cVar) : ((ArrayList) m26961c(j0Var, cVar)).isEmpty();
    }

    /* renamed from: c */
    public static final List<C26465i0> m26961c(C22936j0 j0Var, C22826c cVar) {
        C87412m.m108594g(j0Var, "<this>");
        C87412m.m108594g(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        m26959a(j0Var, cVar, arrayList);
        return arrayList;
    }
}
