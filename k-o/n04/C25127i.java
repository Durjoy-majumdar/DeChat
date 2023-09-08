package n04;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m04.C21480i;
import m04.C24980n;
import o04.C25323e;
import o04.C25325f;
import o04.C25334n;
import p04.C25417j;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64186f0;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26439b1;
import wy3.C26445d0;
import wy3.C26446d1;

/* renamed from: n04.i */
public abstract class C25127i extends C25169q {

    /* renamed from: b */
    public final C21480i<C25130b> f71564b;

    /* renamed from: n04.i$a */
    public final class C25128a implements C25144j1 {

        /* renamed from: a */
        public final C25323e f71565a;

        /* renamed from: b */
        public final C13601g f71566b;

        /* renamed from: c */
        public final /* synthetic */ C25127i f71567c;

        /* renamed from: n04.i$a$a */
        public static final class C25129a extends C87413o implements C32224a<List<? extends C25143j0>> {

            /* renamed from: d */
            public final /* synthetic */ C25128a f71568d;

            /* renamed from: e */
            public final /* synthetic */ C25127i f71569e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25129a(C25128a aVar, C25127i iVar) {
                super(0);
                this.f71568d = aVar;
                this.f71569e = iVar;
            }

            public Object invoke() {
                C25323e eVar = this.f71568d.f71565a;
                List<C25143j0> g = this.f71569e.mo37096r();
                C26445d0<C25334n<Object>> d0Var = C25325f.f71824a;
                C87412m.m108594g(eVar, "<this>");
                C87412m.m108594g(g, "types");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(g, 10));
                for (C25143j0 h : g) {
                    arrayList.add(eVar.mo52414h(h));
                }
                return arrayList;
            }
        }

        public C25128a(C25127i iVar, C25323e eVar) {
            C87412m.m108594g(eVar, "kotlinTypeRefiner");
            this.f71567c = iVar;
            this.f71565a = eVar;
            this.f71566b = C36568h.m40986b(C13602i.PUBLICATION, new C25129a(this, iVar));
        }

        public boolean equals(Object obj) {
            return this.f71567c.equals(obj);
        }

        public List<C26446d1> getParameters() {
            List<C26446d1> parameters = this.f71567c.getParameters();
            C87412m.m108593f(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f71567c.hashCode();
        }

        /* renamed from: m */
        public C26336h mo37092m() {
            C26336h m = this.f71567c.mo37092m();
            C87412m.m108593f(m, "this@AbstractTypeConstructor.builtIns");
            return m;
        }

        /* renamed from: n */
        public C25144j1 mo37093n(C25323e eVar) {
            C87412m.m108594g(eVar, "kotlinTypeRefiner");
            return this.f71567c.mo37093n(eVar);
        }

        /* renamed from: o */
        public C22935h mo37094o() {
            return this.f71567c.mo37094o();
        }

        /* renamed from: p */
        public boolean mo37095p() {
            return this.f71567c.mo37095p();
        }

        /* renamed from: r */
        public Collection mo37096r() {
            return (List) this.f71566b.getValue();
        }

        public String toString() {
            return this.f71567c.toString();
        }
    }

    /* renamed from: n04.i$b */
    public static final class C25130b {

        /* renamed from: a */
        public final Collection<C25143j0> f71570a;

        /* renamed from: b */
        public List<? extends C25143j0> f71571b = C26236u.m33719b(C25417j.f72003d);

        public C25130b(Collection<? extends C25143j0> collection) {
            C87412m.m108594g(collection, "allSupertypes");
            this.f71570a = collection;
            C25417j jVar = C25417j.f72000a;
        }
    }

    /* renamed from: n04.i$c */
    public static final class C25131c extends C87413o implements C32224a<C25130b> {

        /* renamed from: d */
        public final /* synthetic */ C25127i f71572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25131c(C25127i iVar) {
            super(0);
            this.f71572d = iVar;
        }

        public Object invoke() {
            return new C25130b(this.f71572d.mo51811c());
        }
    }

    /* renamed from: n04.i$d */
    public static final class C25132d extends C87413o implements C32226l<Boolean, C25130b> {

        /* renamed from: d */
        public static final C25132d f71573d = new C25132d();

        public C25132d() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return new C25130b(C26236u.m33719b(C25417j.f72003d));
        }
    }

    /* renamed from: n04.i$e */
    public static final class C25133e extends C87413o implements C32226l<C25130b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C25127i f71574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25133e(C25127i iVar) {
            super(1);
            this.f71574d = iVar;
        }

        public Object invoke(Object obj) {
            C25130b bVar = (C25130b) obj;
            C87412m.m108594g(bVar, "supertypes");
            C26439b1 f = this.f71574d.mo51812f();
            C25127i iVar = this.f71574d;
            Collection<C25143j0> a = f.mo53420a(iVar, bVar.f71570a, new C25142j(iVar), new C25145k(this.f71574d));
            List<T> list = null;
            if (a.isEmpty()) {
                C25143j0 d = this.f71574d.mo52234d();
                a = d != null ? C26236u.m33719b(d) : null;
                if (a == null) {
                    a = C64186f0.f181907d;
                }
            }
            this.f71574d.getClass();
            C25127i iVar2 = this.f71574d;
            if (a instanceof List) {
                list = a;
            }
            if (list == null) {
                list = C110818d0.m150953y0(a);
            }
            List<C25143j0> h = iVar2.mo52276h(list);
            C87412m.m108594g(h, "<set-?>");
            bVar.f71571b = h;
            return C13598b0.f38549a;
        }
    }

    public C25127i(C24980n nVar) {
        C87412m.m108594g(nVar, "storageManager");
        this.f71564b = nVar.mo52000a(new C25131c(this), C25132d.f71573d, new C25133e(this));
    }

    /* renamed from: c */
    public abstract Collection<C25143j0> mo51811c();

    /* renamed from: d */
    public C25143j0 mo52234d() {
        return null;
    }

    /* renamed from: e */
    public Collection<C25143j0> mo52235e(boolean z) {
        return C64186f0.f181907d;
    }

    /* renamed from: f */
    public abstract C26439b1 mo51812f();

    /* renamed from: g */
    public List<C25143j0> mo37096r() {
        return ((C25130b) this.f71564b.invoke()).f71571b;
    }

    /* renamed from: h */
    public List<C25143j0> mo52276h(List<C25143j0> list) {
        C87412m.m108594g(list, "supertypes");
        return list;
    }

    /* renamed from: i */
    public void mo52277i(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "type");
    }

    /* renamed from: n */
    public C25144j1 mo37093n(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return new C25128a(this, eVar);
    }
}
