package l04;

import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import rx3.C13598b0;
import wy3.C22942t;
import wy3.C26436b;
import zy3.C26777s;
import zz3.C26800l;
import zz3.C26802n;

/* renamed from: l04.e */
public final class C24891e extends C26800l {

    /* renamed from: a */
    public final /* synthetic */ List<C26436b> f70928a;

    public C24891e(List<C26436b> list) {
        this.f70928a = list;
    }

    /* renamed from: a */
    public void mo51218a(C26436b bVar) {
        C87412m.m108594g(bVar, "fakeOverride");
        C26802n.m35263r(bVar, (C32226l<C26436b, C13598b0>) null);
        this.f70928a.add(bVar);
    }

    /* renamed from: e */
    public void mo51219e(C26436b bVar, C26436b bVar2) {
        C87412m.m108594g(bVar, "fromSuper");
        C87412m.m108594g(bVar2, "fromCurrent");
        if (bVar2 instanceof C26777s) {
            ((C26777s) bVar2).mo53750O0(C22942t.f65913a, bVar);
        }
    }
}
