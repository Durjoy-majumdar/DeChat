package p558i0;

import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: i0.m */
public final class C108305m {

    /* renamed from: a */
    public final Map<C108292b, C108306n> f324301a = new LinkedHashMap();

    /* renamed from: b */
    public final Map<C108306n, C108292b> f324302b = new LinkedHashMap();

    /* renamed from: a */
    public final void mo158764a(C108292b bVar) {
        C87412m.m108594g(bVar, "indicationInstance");
        C108306n nVar = (C108306n) ((LinkedHashMap) this.f324301a).get(bVar);
        if (nVar != null) {
            C108292b remove = this.f324302b.remove(nVar);
        }
        this.f324301a.remove(bVar);
    }
}
