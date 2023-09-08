package bz3;

import gy3.C87412m;
import j04.C21150r;
import java.util.List;
import wy3.C26436b;
import wy3.C26447e;

/* renamed from: bz3.i */
public final class C16831i implements C21150r {

    /* renamed from: b */
    public static final C16831i f45472b = new C16831i();

    /* renamed from: a */
    public void mo17871a(C26436b bVar) {
        C87412m.m108594g(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    /* renamed from: b */
    public void mo17872b(C26447e eVar, List<String> list) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
