package uy3;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n04.C25143j0;
import n04.C25176s0;
import n04.C25180t1;
import n04.C25202z1;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26234j0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64188i0;
import t04.C26280r;
import ty3.C26335g;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26491r;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26755k0;
import zy3.C26765p0;
import zy3.C26777s;

/* renamed from: uy3.e */
public final class C26375e extends C26755k0 {

    /* renamed from: K */
    public static final C26376a f73575K = new C26376a((C8480h) null);

    /* renamed from: uy3.e$a */
    public static final class C26376a {
        public C26376a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C26375e mo53362a(C26369b bVar, boolean z) {
            String str;
            C26369b bVar2 = bVar;
            C87412m.m108594g(bVar2, "functionClass");
            List<C26446d1> list = bVar2.f73563q;
            C26375e eVar = new C26375e(bVar2, (C26375e) null, C26436b.C26437a.DECLARATION, z);
            C26509u0 o0 = bVar.mo53429o0();
            C64186f0 f0Var = C64186f0.f181907d;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (!(((C26446d1) next).mo53423o() == C25202z1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable E0 = C110818d0.m150906E0(arrayList);
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(E0, 10));
            Iterator it = ((C26234j0) E0).iterator();
            while (it.hasNext()) {
                C64188i0 i0Var = (C64188i0) it.next();
                int i = i0Var.f181909a;
                C26446d1 d1Var = (C26446d1) i0Var.f181910b;
                String b = d1Var.getName().mo35995b();
                C87412m.m108593f(b, "typeParameter.name.asString()");
                if (C87412m.m108589b(b, ExifInterface.GPS_DIRECTION_TRUE)) {
                    str = "instance";
                } else if (C87412m.m108589b(b, ExifInterface.LONGITUDE_EAST)) {
                    str = "receiver";
                } else {
                    str = b.toLowerCase(Locale.ROOT);
                    C87412m.m108593f(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                int i2 = C26571h.f73936P0;
                C26571h hVar = C26571h.C26572a.f73937a;
                C22830f f = C22830f.m26794f(str);
                C25176s0 s = d1Var.mo36111s();
                C87412m.m108593f(s, "typeParameter.defaultType");
                C26765p0 p0Var = r2;
                C26765p0 p0Var2 = new C26765p0(eVar, (C26463h1) null, i, hVar, f, s, false, false, false, (C25143j0) null, C26521y0.f73808a);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(p0Var);
                arrayList2 = arrayList3;
            }
            eVar.mo53735M0((C26509u0) null, o0, f0Var, f0Var, arrayList2, ((C26446d1) C110818d0.m150923U(list)).mo36111s(), C26442c0.ABSTRACT, C26491r.f73782e);
            eVar.f74451D = true;
            return eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26375e(C26469k kVar, C26375e eVar, C26436b.C26437a aVar, boolean z) {
        super(kVar, eVar, C26571h.C26572a.f73937a, C26280r.f73221g, aVar, C26521y0.f73808a);
        int i = C26571h.f73936P0;
        this.f74466s = true;
        this.f74449B = z;
        this.f74450C = false;
    }

    /* renamed from: J0 */
    public C26777s mo51316J0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        C87412m.m108594g(kVar, "newOwner");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(hVar, "annotations");
        C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
        return new C26375e(kVar, (C26375e) wVar, aVar, this.f74449B);
    }

    /* renamed from: K0 */
    public C26516w mo53361K0(C26777s.C26780c cVar) {
        boolean z;
        boolean z2;
        C22830f fVar;
        boolean z3;
        boolean z4;
        C87412m.m108594g(cVar, "configuration");
        C26375e eVar = (C26375e) super.mo53361K0(cVar);
        if (eVar == null) {
            return null;
        }
        List<C26463h1> h = eVar.mo52639h();
        C87412m.m108593f(h, "substituted.valueParameters");
        boolean z5 = true;
        if (!h.isEmpty()) {
            Iterator<T> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C25143j0 type = ((C26463h1) it.next()).getType();
                C87412m.m108593f(type, "it.type");
                if (C26335g.m33817c(type) != null) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return eVar;
        }
        List<C26463h1> h2 = eVar.mo52639h();
        C87412m.m108593f(h2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(h2, 10));
        for (C26463h1 type2 : h2) {
            C25143j0 type3 = type2.getType();
            C87412m.m108593f(type3, "it.type");
            arrayList.add(C26335g.m33817c(type3));
        }
        int size = eVar.mo52639h().size() - arrayList.size();
        if (size == 0) {
            List<C26463h1> h3 = eVar.mo52639h();
            C87412m.m108593f(h3, "valueParameters");
            ArrayList arrayList2 = (ArrayList) C110818d0.m150908F0(arrayList, h3);
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C13604l lVar = (C13604l) it4.next();
                    if (!C87412m.m108589b((C22830f) lVar.f38555d, ((C26463h1) lVar.f38556e).getName())) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3) {
                return eVar;
            }
        }
        List<C26463h1> h4 = eVar.mo52639h();
        C87412m.m108593f(h4, "valueParameters");
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(h4, 10));
        for (C26463h1 h1Var : h4) {
            C22830f name = h1Var.getName();
            C87412m.m108593f(name, "it.name");
            int index = h1Var.getIndex();
            int i = index - size;
            if (i >= 0 && (fVar = (C22830f) arrayList.get(i)) != null) {
                name = fVar;
            }
            arrayList3.add(h1Var.mo53443w(eVar, name, index));
        }
        C26777s.C26780c N0 = eVar.mo53749N0(C25180t1.f71631b);
        if (!arrayList.isEmpty()) {
            Iterator it5 = arrayList.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                if (((C22830f) it5.next()) == null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            N0.f74498v = Boolean.valueOf(z5);
            N0.f74483g = arrayList3;
            N0.f74481e = eVar.m34990a();
            C26516w K0 = super.mo53361K0(N0);
            C87412m.m108591d(K0);
            return K0;
        }
        z5 = false;
        N0.f74498v = Boolean.valueOf(z5);
        N0.f74483g = arrayList3;
        N0.f74481e = eVar.m34990a();
        C26516w K02 = super.mo53361K0(N0);
        C87412m.m108591d(K02);
        return K02;
    }

    /* renamed from: Z */
    public boolean mo51885Z() {
        return false;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }
}
