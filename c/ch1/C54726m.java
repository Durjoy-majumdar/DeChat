package ch1;

import ah1.C54031b;
import ah1.C54032c;
import fj1.C45795b;
import gy3.C87412m;
import java.util.List;
import sx3.C64197v;
import yg1.C39014a;
import yg1.C66639f;
import yg1.C66640h;

/* renamed from: ch1.m */
public final class C54726m extends C66639f {

    /* renamed from: a */
    public final List<C66640h> f153368a;

    public C54726m(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153368a = C64197v.m75537f(new C54031b(bVar), new C54032c(bVar));
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C87412m.m108594g(aVar, "respWrapper");
        for (C66640h b : this.f153368a) {
            b.mo49b(aVar);
        }
        return true;
    }
}
