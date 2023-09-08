package ch1;

import fj1.C45795b;
import gy3.C87412m;
import java.util.List;
import sx3.C26236u;
import yg1.C16006g;
import yg1.C39014a;
import yg1.C66639f;
import zg1.C16170e;

/* renamed from: ch1.f */
public final class C0503f extends C66639f {

    /* renamed from: a */
    public final List<C16006g> f1229a;

    public C0503f(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f1229a = C26236u.m33719b(new C16170e(bVar));
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C87412m.m108594g(aVar, "respWrapper");
        for (C16006g b : this.f1229a) {
            b.mo49b(aVar);
        }
        return true;
    }
}
