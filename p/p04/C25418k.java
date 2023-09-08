package p04;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32226l;
import g04.C24531d;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: p04.k */
public final class C25418k extends C25412e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25418k(C25413f fVar, String... strArr) {
        super(fVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        C87412m.m108594g(fVar, "kind");
        C87412m.m108594g(strArr, "formatParams");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Collection mo32456a(C22830f fVar, C24473b bVar) {
        mo52643h(fVar, bVar);
        throw null;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Collection mo32457b(C22830f fVar, C24473b bVar) {
        mo52644i(fVar, bVar);
        throw null;
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        throw new IllegalStateException(this.f71949b);
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        throw new IllegalStateException(this.f71949b + ", required name: " + fVar);
    }

    /* renamed from: h */
    public Set<C26520x0> mo52643h(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        throw new IllegalStateException(this.f71949b + ", required name: " + fVar);
    }

    /* renamed from: i */
    public Set<C26504r0> mo52644i(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        throw new IllegalStateException(this.f71949b + ", required name: " + fVar);
    }

    public String toString() {
        return "ThrowingScope{" + this.f71949b + '}';
    }
}
