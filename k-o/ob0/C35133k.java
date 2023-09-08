package ob0;

import java.util.concurrent.ConcurrentHashMap;
import p261wl.C38166b;
import p261wl.C38174i;
import te3.C50694ok;

/* renamed from: ob0.k */
public interface C35133k {

    /* renamed from: ob0.k$a */
    public static class C11383a {

        /* renamed from: a */
        public static ConcurrentHashMap<Long, C35133k> f33513a = new ConcurrentHashMap<>();

        /* renamed from: a */
        public static C35133k m11204a(long j) {
            C35133k kVar = f33513a.get(Long.valueOf(j));
            if (kVar != null) {
                return kVar;
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C11386s.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (iVar.hasKey(Long.valueOf(j))) {
                    return (C35133k) iVar.get();
                }
            }
            return null;
        }
    }

    /* renamed from: ob0.k$b */
    public static class C35134b {

        /* renamed from: a */
        public C50694ok f94240a;

        /* renamed from: b */
        public String f94241b;
    }

    /* renamed from: d */
    void mo12406d(C50694ok okVar);

    /* renamed from: q */
    void mo12407q(int i, C35134b bVar);
}
