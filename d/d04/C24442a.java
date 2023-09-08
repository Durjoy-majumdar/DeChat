package d04;

import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import ny3.C109824f;
import o04.C25323e;
import o04.C25325f;
import o04.C25334n;
import sx3.C26236u;
import sx3.C36907w;
import ty3.C26336h;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;
import vz3.C26408b;
import w04.C22843b;
import wy3.C22935h;
import wy3.C26436b;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26463h1;
import wy3.C26464i;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26490q0;
import wy3.C26504r0;
import xy3.C26566c;
import y04.C112345c;
import y04.C112349m;
import y04.C15925h;
import y04.C26618b;
import zz3.C26794h;

/* renamed from: d04.a */
public final class C24442a {

    /* renamed from: a */
    public static final /* synthetic */ int f69893a = 0;

    /* renamed from: d04.a$a */
    public static final class C24443a<N> implements C22843b.C22846c {

        /* renamed from: a */
        public static final C24443a<N> f69894a = new C24443a<>();

        /* renamed from: a */
        public Iterable mo33273a(Object obj) {
            Collection<C26463h1> e = ((C26463h1) obj).mo52633e();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(e, 10));
            for (C26463h1 a : e) {
                arrayList.add(a.mo36109a());
            }
            return arrayList;
        }
    }

    /* renamed from: d04.a$b */
    public /* synthetic */ class C24444b extends C24563k implements C32226l<C26463h1, Boolean> {

        /* renamed from: d */
        public static final C24444b f69895d = new C24444b();

        public C24444b() {
            super(1);
        }

        public final String getName() {
            return "declaresDefaultValue";
        }

        public final C109824f getOwner() {
            return C24560g0.m30725a(C26463h1.class);
        }

        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        public Object invoke(Object obj) {
            C26463h1 h1Var = (C26463h1) obj;
            C87412m.m108594g(h1Var, "p0");
            return Boolean.valueOf(h1Var.mo53442m0());
        }
    }

    static {
        C22830f.m26794f("value");
    }

    /* renamed from: a */
    public static final boolean m30534a(C26463h1 h1Var) {
        C87412m.m108594g(h1Var, "<this>");
        Boolean d = C22843b.m26804d(C26236u.m33719b(h1Var), C24443a.f69894a, C24444b.f69895d);
        C87412m.m108593f(d, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return d.booleanValue();
    }

    /* renamed from: b */
    public static C26436b m30535b(C26436b bVar, boolean z, C32226l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        C87412m.m108594g(bVar, "<this>");
        C87412m.m108594g(lVar, "predicate");
        return (C26436b) C22843b.m26802b(C26236u.m33719b(bVar), new C24445b(z), new C20378c(new C8479f0(), lVar));
    }

    /* renamed from: c */
    public static final C22826c m30536c(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        C22827d h = m30541h(kVar);
        if (!h.mo35989f()) {
            h = null;
        }
        if (h != null) {
            return h.mo35993i();
        }
        return null;
    }

    /* renamed from: d */
    public static final C26447e m30537d(C26566c cVar) {
        C87412m.m108594g(cVar, "<this>");
        C22935h o = cVar.getType().mo37081K0().mo37094o();
        if (o instanceof C26447e) {
            return (C26447e) o;
        }
        return null;
    }

    /* renamed from: e */
    public static final C26336h m30538e(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        return m30543j(kVar).mo52623m();
    }

    /* renamed from: f */
    public static final C26408b m30539f(C22935h hVar) {
        C26469k b;
        C26408b f;
        if (hVar == null || (b = hVar.mo51892b()) == null) {
            return null;
        }
        if (b instanceof C26465i0) {
            return new C26408b(((C26465i0) b).mo53444d(), hVar.getName());
        }
        if (!(b instanceof C26464i) || (f = m30539f((C22935h) b)) == null) {
            return null;
        }
        return f.mo53389d(hVar.getName());
    }

    /* renamed from: g */
    public static final C22826c m30540g(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        C22826c h = C26794h.m35220h(kVar);
        if (h == null) {
            h = C26794h.m35219g(kVar.mo51892b()).mo35985c(kVar.getName()).mo35993i();
        }
        if (h != null) {
            return h;
        }
        C26794h.m35213a(4);
        throw null;
    }

    /* renamed from: h */
    public static final C22827d m30541h(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        C22827d g = C26794h.m35219g(kVar);
        C87412m.m108593f(g, "getFqName(this)");
        return g;
    }

    /* renamed from: i */
    public static final C25323e m30542i(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "<this>");
        C25334n nVar = (C25334n) e0Var.mo52619J(C25325f.f71824a);
        return C25323e.C25324a.f71823a;
    }

    /* renamed from: j */
    public static final C26448e0 m30543j(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        C26448e0 d = C26794h.m35216d(kVar);
        C87412m.m108593f(d, "getContainingModule(this)");
        return d;
    }

    /* renamed from: k */
    public static final C15925h<C26469k> m30544k(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        C15925h d = C112349m.m153281d(kVar, C20379d.f57104d);
        return d instanceof C112345c ? ((C112345c) d).mo53593a(1) : new C26618b(d, 1);
    }

    /* renamed from: l */
    public static final C26436b m30545l(C26436b bVar) {
        C87412m.m108594g(bVar, "<this>");
        if (!(bVar instanceof C26490q0)) {
            return bVar;
        }
        C26504r0 u0 = ((C26490q0) bVar).mo53467u0();
        C87412m.m108593f(u0, "correspondingProperty");
        return u0;
    }
}
