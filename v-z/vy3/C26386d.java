package vy3;

import d04.C24442a;
import gy3.C87412m;
import ty3.C26336h;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26447e;
import zz3.C26794h;

/* renamed from: vy3.d */
public final class C26386d {

    /* renamed from: a */
    public static final C26386d f73603a = new C26386d();

    /* renamed from: b */
    public static C26447e m33970b(C26386d dVar, C22826c cVar, C26336h hVar, Integer num, int i, Object obj) {
        C26408b bVar;
        if ((i & 4) != 0) {
            num = null;
        }
        dVar.getClass();
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(hVar, "builtIns");
        if (num == null || !C87412m.m108589b(cVar, C26384c.f73591g)) {
            bVar = C26384c.f73585a.mo53373f(cVar);
        } else {
            int intValue = num.intValue();
            bVar = new C26408b(C26343l.f73376j, C22830f.m26794f("Function" + intValue));
        }
        if (bVar != null) {
            return hVar.mo53318j(bVar.mo53387b());
        }
        return null;
    }

    /* renamed from: a */
    public final C26447e mo53378a(C26447e eVar) {
        C87412m.m108594g(eVar, "readOnly");
        C22827d g = C26794h.m35219g(eVar);
        C26384c cVar = C26384c.f73585a;
        C22826c cVar2 = C26384c.f73596l.get(g);
        if (cVar2 != null) {
            C26447e j = C24442a.m30538e(eVar).mo53318j(cVar2);
            C87412m.m108593f(j, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return j;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "read-only" + " collection");
    }
}
