package p04;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32226l;
import g04.C20770i;
import g04.C24531d;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import sx3.C22415w0;
import sx3.C64186f0;
import sx3.C64187h0;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: p04.e */
public class C25412e implements C20770i {

    /* renamed from: b */
    public final String f71949b;

    public C25412e(C25413f fVar, String... strArr) {
        C87412m.m108594g(fVar, "kind");
        C87412m.m108594g(strArr, "formatParams");
        String str = fVar.f71957d;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        C87412m.m108593f(format, "format(this, *args)");
        this.f71949b = format;
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        return C64187h0.f181908d;
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        return C64187h0.f181908d;
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        return C64186f0.f181907d;
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return C64187h0.f181908d;
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        String format = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{fVar}, 1));
        C87412m.m108593f(format, "format(this, *args)");
        return new C25407a(C22830f.m26796h(format));
    }

    /* renamed from: h */
    public Set<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C25417j jVar = C25417j.f72000a;
        return C22415w0.m26092a(new C25408b(C25417j.f72002c));
    }

    /* renamed from: i */
    public Set<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C25417j jVar = C25417j.f72000a;
        return C25417j.f72006g;
    }

    public String toString() {
        return "ErrorScope{" + this.f71949b + '}';
    }
}
