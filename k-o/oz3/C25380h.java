package oz3;

import gy3.C87412m;
import j04.C24747g;
import j04.C24755h;
import vz3.C26408b;

/* renamed from: oz3.h */
public final class C25380h implements C24755h {

    /* renamed from: a */
    public final C25390o f71921a;

    /* renamed from: b */
    public final C25378g f71922b;

    public C25380h(C25390o oVar, C25378g gVar) {
        C87412m.m108594g(oVar, "kotlinClassFinder");
        C87412m.m108594g(gVar, "deserializedDescriptorResolver");
        this.f71921a = oVar;
        this.f71922b = gVar;
    }

    /* renamed from: a */
    public C24747g mo51710a(C26408b bVar) {
        C87412m.m108594g(bVar, "classId");
        C25395q a = C25394p.m32569a(this.f71921a, bVar);
        if (a == null) {
            return null;
        }
        C87412m.m108589b(a.mo37228f(), bVar);
        return this.f71922b.mo52577f(a);
    }
}
