package g04;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Collection;
import java.util.Set;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: g04.a */
public abstract class C20767a implements C20770i {
    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return mo32464i().mo32456a(fVar, bVar);
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return mo32464i().mo32457b(fVar, bVar);
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        return mo32464i().mo32458c();
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        return mo32464i().mo32459d();
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        return mo32464i().mo32460e(dVar, lVar);
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return mo32464i().mo32461f();
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return mo32464i().mo32462g(fVar, bVar);
    }

    /* renamed from: h */
    public final C20770i mo32463h() {
        if (!(mo32464i() instanceof C20767a)) {
            return mo32464i();
        }
        C20770i i = mo32464i();
        C87412m.m108592e(i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C20767a) i).mo32463h();
    }

    /* renamed from: i */
    public abstract C20770i mo32464i();
}
