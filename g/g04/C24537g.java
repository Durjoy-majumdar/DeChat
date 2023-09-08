package g04;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import sx3.C64186f0;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26447e;
import wy3.C26464i;
import wy3.C26469k;

/* renamed from: g04.g */
public final class C24537g extends C24538j {

    /* renamed from: b */
    public final C20770i f70121b;

    public C24537g(C20770i iVar) {
        C87412m.m108594g(iVar, "workerScope");
        this.f70121b = iVar;
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        return this.f70121b.mo32458c();
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        return this.f70121b.mo32459d();
    }

    /* renamed from: e */
    public Collection mo32460e(C24531d dVar, C32226l lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        int i = C24531d.f70103l & dVar.f70112b;
        C24531d dVar2 = i == 0 ? null : new C24531d(i, dVar.f70111a);
        if (dVar2 == null) {
            return C64186f0.f181907d;
        }
        Collection<C26469k> e = this.f70121b.mo32460e(dVar2, lVar);
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (next instanceof C26464i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return this.f70121b.mo32461f();
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C22935h g = this.f70121b.mo32462g(fVar, bVar);
        if (g == null) {
            return null;
        }
        C26447e eVar = g instanceof C26447e ? (C26447e) g : null;
        if (eVar != null) {
            return eVar;
        }
        if (g instanceof C26443c1) {
            return (C26443c1) g;
        }
        return null;
    }

    public String toString() {
        return "Classes from " + this.f70121b;
    }
}
