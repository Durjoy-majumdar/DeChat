package sz3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import qz3.C26085v;
import qz3.C26090w;
import sx3.C64186f0;

/* renamed from: sz3.h */
public final class C26248h {

    /* renamed from: b */
    public static final C26249a f73183b = new C26249a((C8480h) null);

    /* renamed from: c */
    public static final C26248h f73184c = new C26248h(C64186f0.f181907d);

    /* renamed from: a */
    public final List<C26085v> f73185a;

    /* renamed from: sz3.h$a */
    public static final class C26249a {
        public C26249a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C26248h mo53148a(C26090w wVar) {
            C87412m.m108594g(wVar, "table");
            if (wVar.f72928e.size() == 0) {
                return C26248h.f73184c;
            }
            List<C26085v> list = wVar.f72928e;
            C87412m.m108593f(list, "table.requirementList");
            return new C26248h(list);
        }
    }

    public C26248h(List<C26085v> list) {
        this.f73185a = list;
    }
}
