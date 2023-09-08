package wy3;

import d04.C24442a;
import fy3.C32226l;
import g04.C20770i;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m04.C24959e;
import m04.C24975g;
import m04.C24980n;
import my3.C61594j;
import my3.C61595o;
import n04.C25144j1;
import n04.C25165p;
import n04.C25176s0;
import n04.C25202z1;
import o04.C25323e;
import sx3.C110818d0;
import sx3.C22415w0;
import sx3.C36904l0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64187h0;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import xy3.C26571h;
import zy3.C26752j;
import zy3.C26763o0;
import zy3.C26764p;

/* renamed from: wy3.h0 */
public final class C26458h0 {

    /* renamed from: a */
    public final C24980n f73751a;

    /* renamed from: b */
    public final C26448e0 f73752b;

    /* renamed from: c */
    public final C24975g<C22826c, C26465i0> f73753c;

    /* renamed from: d */
    public final C24975g<C26462a, C26447e> f73754d;

    /* renamed from: wy3.h0$b */
    public static final class C26459b extends C26752j {

        /* renamed from: n */
        public final boolean f73755n;

        /* renamed from: o */
        public final List<C26446d1> f73756o;

        /* renamed from: p */
        public final C25165p f73757p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26459b(C24980n nVar, C26469k kVar, C22830f fVar, boolean z, int i) {
            super(nVar, kVar, fVar, C26521y0.f73808a, false);
            C87412m.m108594g(nVar, "storageManager");
            C87412m.m108594g(kVar, "container");
            C87412m.m108594g(fVar, "name");
            this.f73755n = z;
            C61594j i2 = C61595o.m72301i(0, i);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(i2, 10));
            Iterator it = i2.iterator();
            while (it.hasNext()) {
                int a = ((C36904l0) it).mo59695a();
                int i3 = C26571h.f73936P0;
                C26571h hVar = C26571h.C26572a.f73937a;
                C25202z1 z1Var = C25202z1.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(a);
                arrayList.add(C26763o0.m35033N0(this, hVar, false, z1Var, C22830f.m26794f(sb.toString()), a, nVar));
            }
            this.f73756o = arrayList;
            this.f73757p = new C25165p(this, C26449e1.m34100b(this), C22415w0.m26092a(C24442a.m30543j(this).mo52623m().mo53314f()), nVar);
        }

        /* renamed from: A0 */
        public C26447e mo51787A0() {
            return null;
        }

        /* renamed from: K */
        public C26455f1<C25176s0> mo51789K() {
            return null;
        }

        /* renamed from: N */
        public C20770i mo51790N(C25323e eVar) {
            C87412m.m108594g(eVar, "kotlinTypeRefiner");
            return C20770i.C20773b.f58684b;
        }

        /* renamed from: O */
        public boolean mo51791O() {
            return false;
        }

        /* renamed from: P */
        public boolean mo51792P() {
            return false;
        }

        /* renamed from: Q */
        public C20770i mo51793Q() {
            return C20770i.C20773b.f58684b;
        }

        /* renamed from: W */
        public boolean mo51794W() {
            return false;
        }

        /* renamed from: Y */
        public boolean mo51795Y() {
            return this.f73755n;
        }

        /* renamed from: f */
        public C26453f mo51796f() {
            return C26453f.CLASS;
        }

        public C26571h getAnnotations() {
            int i = C26571h.f73936P0;
            return C26571h.C26572a.f73937a;
        }

        public C26505s getVisibility() {
            C26505s sVar = C26491r.f73782e;
            C87412m.m108593f(sVar, "PUBLIC");
            return sVar;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        /* renamed from: j */
        public C26442c0 mo51802j() {
            return C26442c0.FINAL;
        }

        /* renamed from: l */
        public C25144j1 mo36110l() {
            return this.f73757p;
        }

        /* renamed from: p0 */
        public Collection<C26447e> mo51803p0() {
            return C64186f0.f181907d;
        }

        /* renamed from: q */
        public Collection<C26444d> mo51804q() {
            return C64187h0.f181908d;
        }

        /* renamed from: t */
        public List<C26446d1> mo51805t() {
            return this.f73756o;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        /* renamed from: v */
        public C26444d mo51807v() {
            return null;
        }

        /* renamed from: v0 */
        public boolean mo51808v0() {
            return false;
        }

        /* renamed from: x0 */
        public boolean mo51809x0() {
            return false;
        }

        /* renamed from: z0 */
        public boolean mo51810z0() {
            return false;
        }
    }

    /* renamed from: wy3.h0$c */
    public static final class C26460c extends C87413o implements C32226l<C26462a, C26447e> {

        /* renamed from: d */
        public final /* synthetic */ C26458h0 f73758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26460c(C26458h0 h0Var) {
            super(1);
            this.f73758d = h0Var;
        }

        public Object invoke(Object obj) {
            C26469k kVar;
            C26462a aVar = (C26462a) obj;
            C87412m.m108594g(aVar, "<name for destructuring parameter 0>");
            C26408b bVar = aVar.f73760a;
            List<Integer> list = aVar.f73761b;
            if (!bVar.f73646c) {
                C26408b g = bVar.mo53391g();
                if (g == null || (kVar = this.f73758d.mo53433a(g, C110818d0.m150907F(list, 1))) == null) {
                    C24975g<C22826c, C26465i0> gVar = this.f73758d.f73753c;
                    C22826c h = bVar.mo53392h();
                    C87412m.m108593f(h, "classId.packageFqName");
                    kVar = (C26456g) ((C24959e.C24972m) gVar).invoke(h);
                }
                C26469k kVar2 = kVar;
                boolean k = bVar.mo53396k();
                C24980n nVar = this.f73758d.f73751a;
                C22830f j = bVar.mo53395j();
                C87412m.m108593f(j, "classId.shortClassName");
                Integer num = (Integer) C110818d0.m150916N(list);
                return new C26459b(nVar, kVar2, j, k, num != null ? num.intValue() : 0);
            }
            throw new UnsupportedOperationException("Unresolved local class: " + bVar);
        }
    }

    /* renamed from: wy3.h0$d */
    public static final class C26461d extends C87413o implements C32226l<C22826c, C26465i0> {

        /* renamed from: d */
        public final /* synthetic */ C26458h0 f73759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26461d(C26458h0 h0Var) {
            super(1);
            this.f73759d = h0Var;
        }

        public Object invoke(Object obj) {
            C22826c cVar = (C22826c) obj;
            C87412m.m108594g(cVar, "fqName");
            return new C26764p(this.f73759d.f73752b, cVar);
        }
    }

    /* renamed from: wy3.h0$a */
    public static final class C26462a {

        /* renamed from: a */
        public final C26408b f73760a;

        /* renamed from: b */
        public final List<Integer> f73761b;

        public C26462a(C26408b bVar, List<Integer> list) {
            C87412m.m108594g(bVar, "classId");
            C87412m.m108594g(list, "typeParametersCount");
            this.f73760a = bVar;
            this.f73761b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26462a)) {
                return false;
            }
            C26462a aVar = (C26462a) obj;
            return C87412m.m108589b(this.f73760a, aVar.f73760a) && C87412m.m108589b(this.f73761b, aVar.f73761b);
        }

        public int hashCode() {
            return (this.f73760a.hashCode() * 31) + this.f73761b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f73760a + ", typeParametersCount=" + this.f73761b + ')';
        }
    }

    public C26458h0(C24980n nVar, C26448e0 e0Var) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(e0Var, "module");
        this.f73751a = nVar;
        this.f73752b = e0Var;
        this.f73753c = nVar.mo52007h(new C26461d(this));
        this.f73754d = nVar.mo52007h(new C26460c(this));
    }

    /* renamed from: a */
    public final C26447e mo53433a(C26408b bVar, List<Integer> list) {
        C87412m.m108594g(bVar, "classId");
        C87412m.m108594g(list, "typeParametersCount");
        return (C26447e) ((C24959e.C24972m) this.f73754d).invoke(new C26462a(bVar, list));
    }
}
