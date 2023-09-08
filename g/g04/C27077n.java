package g04;

import a04.C23607d;
import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32224a;
import fy3.C32226l;
import g04.C20774l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import n04.C25167p1;
import n04.C25180t1;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;
import wy3.C27701a1;

/* renamed from: g04.n */
public final class C27077n implements C20770i {

    /* renamed from: b */
    public final C20770i f75280b;

    /* renamed from: c */
    public final C25180t1 f75281c;

    /* renamed from: d */
    public Map<C26469k, C26469k> f75282d;

    /* renamed from: e */
    public final C13601g f75283e = C36568h.m40985a(new C27078a(this));

    /* renamed from: g04.n$a */
    public static final class C27078a extends C87413o implements C32224a<Collection<? extends C26469k>> {

        /* renamed from: d */
        public final /* synthetic */ C27077n f75284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27078a(C27077n nVar) {
            super(0);
            this.f75284d = nVar;
        }

        public Object invoke() {
            C27077n nVar = this.f75284d;
            return nVar.mo54578h(C20774l.C20775a.m22732a(nVar.f75280b, (C24531d) null, (C32226l) null, 3, (Object) null));
        }
    }

    public C27077n(C20770i iVar, C25180t1 t1Var) {
        C87412m.m108594g(iVar, "workerScope");
        C87412m.m108594g(t1Var, "givenSubstitutor");
        this.f75280b = iVar;
        C25167p1 g = t1Var.mo52311g();
        C87412m.m108593f(g, "givenSubstitutor.substitution");
        this.f75281c = C25180t1.m32044e(C23607d.m28201b(g, false, 1, (Object) null));
    }

    /* renamed from: a */
    public Collection<? extends C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return mo54578h(this.f75280b.mo32456a(fVar, bVar));
    }

    /* renamed from: b */
    public Collection<? extends C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return mo54578h(this.f75280b.mo32457b(fVar, bVar));
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        return this.f75280b.mo32458c();
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        return this.f75280b.mo32459d();
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        return (Collection) ((C36570n) this.f75283e).getValue();
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return this.f75280b.mo32461f();
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C22935h g = this.f75280b.mo32462g(fVar, bVar);
        if (g != null) {
            return (C22935h) mo54579i(g);
        }
        return null;
    }

    /* renamed from: h */
    public final <D extends C26469k> Collection<D> mo54578h(Collection<? extends D> collection) {
        if (this.f75281c.mo52312h() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i = 3;
        if (size >= 3) {
            i = size + (size / 3) + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(mo54579i((C26469k) it.next()));
        }
        return linkedHashSet;
    }

    /* renamed from: i */
    public final <D extends C26469k> D mo54579i(D d) {
        if (this.f75281c.mo52312h()) {
            return d;
        }
        if (this.f75282d == null) {
            this.f75282d = new HashMap();
        }
        Map<C26469k, C26469k> map = this.f75282d;
        C87412m.m108591d(map);
        D d2 = map.get(d);
        if (d2 == null) {
            if (d instanceof C27701a1) {
                d2 = ((C27701a1) d).mo51921c(this.f75281c);
                if (d2 != null) {
                    map.put(d, d2);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
        }
        return (C26469k) d2;
    }
}
