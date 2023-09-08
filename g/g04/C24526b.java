package g04;

import com.google.android.gms.common.internal.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32226l;
import g04.C20770i;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import sx3.C110823p;
import sx3.C64175a0;
import sx3.C64186f0;
import sx3.C64187h0;
import v04.C26381a;
import vz3.C22830f;
import w04.C26413e;
import wy3.C22935h;
import wy3.C26464i;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: g04.b */
public final class C24526b implements C20770i {

    /* renamed from: d */
    public static final C24527a f70088d = new C24527a((C8480h) null);

    /* renamed from: b */
    public final String f70089b;

    /* renamed from: c */
    public final C20770i[] f70090c;

    /* renamed from: g04.b$a */
    public static final class C24527a {
        public C24527a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C20770i mo51210a(String str, Iterable<? extends C20770i> iterable) {
            C87412m.m108594g(str, "debugName");
            C87412m.m108594g(iterable, Constants.KEY_SCOPES);
            C26413e eVar = new C26413e();
            for (C20770i iVar : iterable) {
                if (iVar != C20770i.C20773b.f58684b) {
                    if (iVar instanceof C24526b) {
                        C64175a0.m75509q(eVar, ((C24526b) iVar).f70090c);
                    } else {
                        eVar.add(iVar);
                    }
                }
            }
            int size = eVar.size();
            if (size == 0) {
                return C20770i.C20773b.f58684b;
            }
            if (size == 1) {
                return (C20770i) eVar.get(0);
            }
            Object[] array = eVar.toArray(new C20770i[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new C24526b(str, (C20770i[]) array, (C8480h) null);
        }
    }

    public C24526b(String str, C20770i[] iVarArr, C8480h hVar) {
        this.f70089b = str;
        this.f70090c = iVarArr;
    }

    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C20770i[] iVarArr = this.f70090c;
        int length = iVarArr.length;
        if (length == 0) {
            return C64186f0.f181907d;
        }
        if (length == 1) {
            return iVarArr[0].mo32456a(fVar, bVar);
        }
        Collection<C26520x0> collection = null;
        for (C20770i a : iVarArr) {
            collection = C26381a.m33959a(collection, a.mo32456a(fVar, bVar));
        }
        return collection == null ? C64187h0.f181908d : collection;
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C20770i[] iVarArr = this.f70090c;
        int length = iVarArr.length;
        if (length == 0) {
            return C64186f0.f181907d;
        }
        if (length == 1) {
            return iVarArr[0].mo32457b(fVar, bVar);
        }
        Collection<C26504r0> collection = null;
        for (C20770i b : iVarArr) {
            collection = C26381a.m33959a(collection, b.mo32457b(fVar, bVar));
        }
        return collection == null ? C64187h0.f181908d : collection;
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        C20770i[] iVarArr = this.f70090c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C20770i c : iVarArr) {
            C64175a0.m75508p(linkedHashSet, c.mo32458c());
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        C20770i[] iVarArr = this.f70090c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C20770i d : iVarArr) {
            C64175a0.m75508p(linkedHashSet, d.mo32459d());
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        C20770i[] iVarArr = this.f70090c;
        int length = iVarArr.length;
        if (length == 0) {
            return C64186f0.f181907d;
        }
        if (length == 1) {
            return iVarArr[0].mo32460e(dVar, lVar);
        }
        Collection<C26469k> collection = null;
        for (C20770i e : iVarArr) {
            collection = C26381a.m33959a(collection, e.mo32460e(dVar, lVar));
        }
        return collection == null ? C64187h0.f181908d : collection;
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return C107692k.m145868a(C110823p.m151005u(this.f70090c));
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C22935h hVar = null;
        for (C20770i g : this.f70090c) {
            C22935h g2 = g.mo32462g(fVar, bVar);
            if (g2 != null) {
                if (!(g2 instanceof C26464i) || !((C26464i) g2).mo51792P()) {
                    return g2;
                }
                if (hVar == null) {
                    hVar = g2;
                }
            }
        }
        return hVar;
    }

    public String toString() {
        return this.f70089b;
    }
}
