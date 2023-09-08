package g04;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import sx3.C64186f0;
import vz3.C22830f;
import w04.C37951d;
import wy3.C22935h;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: g04.j */
public abstract class C24538j implements C20770i {
    /* renamed from: a */
    public Collection<? extends C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return C64186f0.f181907d;
    }

    /* renamed from: b */
    public Collection<? extends C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return C64186f0.f181907d;
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        Collection<C26469k> e = mo32460e(C24531d.f70107p, C37951d.f100405a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : e) {
            if (next instanceof C26520x0) {
                C22830f name = ((C26520x0) next).getName();
                C87412m.m108593f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        Collection<C26469k> e = mo32460e(C24531d.f70108q, C37951d.f100405a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : e) {
            if (next instanceof C26520x0) {
                C22830f name = ((C26520x0) next).getName();
                C87412m.m108593f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        return C64186f0.f181907d;
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return null;
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return null;
    }
}
