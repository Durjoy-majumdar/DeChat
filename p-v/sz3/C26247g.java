package sz3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import qz3.C26065q;
import qz3.C26079t;
import sx3.C36907w;
import sx3.C64197v;
import xz3.C26611v;

/* renamed from: sz3.g */
public final class C26247g {

    /* renamed from: a */
    public final List<C26065q> f73182a;

    public C26247g(C26079t tVar) {
        C87412m.m108594g(tVar, "typeTable");
        List<C26065q> list = tVar.f72870f;
        int i = 0;
        if ((tVar.f72869e & 1) == 1) {
            int i2 = tVar.f72871g;
            C87412m.m108593f(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (T next : list) {
                int i3 = i + 1;
                if (i >= 0) {
                    C26065q qVar = (C26065q) next;
                    if (i >= i2) {
                        qVar.getClass();
                        C26065q.C26071c n = C26065q.m33342n(qVar);
                        n.f72801g |= 2;
                        n.f72803i = true;
                        qVar = n.mo52925f();
                        if (!qVar.isInitialized()) {
                            throw new C26611v(qVar);
                        }
                    }
                    arrayList.add(qVar);
                    i = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            list = arrayList;
        }
        C87412m.m108593f(list, "run {\n        val origin… else originalTypes\n    }");
        this.f73182a = list;
    }

    /* renamed from: a */
    public final C26065q mo53147a(int i) {
        return this.f73182a.get(i);
    }
}
