package uy3;

import g04.C20770i;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m04.C24980n;
import my3.C34690i;
import my3.C61594j;
import n04.C25105b;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25164o1;
import n04.C25176s0;
import n04.C25202z1;
import o04.C25323e;
import rx3.C13598b0;
import rx3.C13603j;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36904l0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import ty3.C26343l;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26439b1;
import wy3.C26442c0;
import wy3.C26444d;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26453f;
import wy3.C26455f1;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26491r;
import wy3.C26505s;
import wy3.C26510v;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26725b;
import zy3.C26763o0;

/* renamed from: uy3.b */
public final class C26369b extends C26725b {

    /* renamed from: r */
    public static final C26408b f73555r = new C26408b(C26343l.f73376j, C22830f.m26794f("Function"));

    /* renamed from: s */
    public static final C26408b f73556s = new C26408b(C26343l.f73373g, C22830f.m26794f("KFunction"));

    /* renamed from: h */
    public final C24980n f73557h;

    /* renamed from: i */
    public final C26465i0 f73558i;

    /* renamed from: j */
    public final C26371c f73559j;

    /* renamed from: n */
    public final int f73560n;

    /* renamed from: o */
    public final C26370a f73561o = new C26370a();

    /* renamed from: p */
    public final C26374d f73562p;

    /* renamed from: q */
    public final List<C26446d1> f73563q;

    /* renamed from: uy3.b$a */
    public final class C26370a extends C25105b {
        public C26370a() {
            super(C26369b.this.f73557h);
        }

        /* renamed from: c */
        public Collection<C25143j0> mo51811c() {
            List<C26408b> list;
            int ordinal = C26369b.this.f73559j.ordinal();
            if (ordinal == 0) {
                list = C26236u.m33719b(C26369b.f73555r);
            } else if (ordinal == 1) {
                list = C26236u.m33719b(C26369b.f73555r);
            } else if (ordinal == 2) {
                list = C64197v.m75537f(C26369b.f73556s, new C26408b(C26343l.f73376j, C26371c.Function.mo53356a(C26369b.this.f73560n)));
            } else if (ordinal == 3) {
                list = C64197v.m75537f(C26369b.f73556s, new C26408b(C26343l.f73370d, C26371c.SuspendFunction.mo53356a(C26369b.this.f73560n)));
            } else {
                throw new C13603j();
            }
            C26448e0 b = C26369b.this.f73558i.mo51892b();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C26408b bVar : list) {
                C26447e a = C26510v.m34216a(b, bVar);
                if (a != null) {
                    List<T> t0 = C110818d0.m150948t0(C26369b.this.f73563q, a.mo36110l().getParameters().size());
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(t0, 10));
                    for (T s : t0) {
                        arrayList2.add(new C25164o1(s.mo36111s()));
                    }
                    C25122g1.f71557e.getClass();
                    arrayList.add(C25146k0.m31959e(C25122g1.f71558f, a, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            return C110818d0.m150953y0(arrayList);
        }

        /* renamed from: f */
        public C26439b1 mo51812f() {
            return C26439b1.C26440a.f73729a;
        }

        public List<C26446d1> getParameters() {
            return C26369b.this.f73563q;
        }

        /* renamed from: k */
        public C26447e mo51813k() {
            return C26369b.this;
        }

        /* renamed from: o */
        public C22935h mo37094o() {
            return C26369b.this;
        }

        /* renamed from: p */
        public boolean mo37095p() {
            return true;
        }

        public String toString() {
            return C26369b.this.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26369b(C24980n nVar, C26465i0 i0Var, C26371c cVar, int i) {
        super(nVar, cVar.mo53356a(i));
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(i0Var, "containingDeclaration");
        C87412m.m108594g(cVar, "functionKind");
        this.f73557h = nVar;
        this.f73558i = i0Var;
        this.f73559j = cVar;
        this.f73560n = i;
        this.f73562p = new C26374d(nVar, this);
        ArrayList arrayList = new ArrayList();
        C61594j jVar = new C61594j(1, i);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(jVar, 10));
        C36904l0 i2 = jVar.iterator();
        while (((C34690i) i2).f93287f) {
            int a = i2.mo59695a();
            C25202z1 z1Var = C25202z1.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(a);
            String sb4 = sb.toString();
            arrayList.add(C26763o0.m35033N0(this, C26571h.C26572a.f73937a, false, z1Var, C22830f.m26794f(sb4), arrayList.size(), this.f73557h));
            arrayList2.add(C13598b0.f38549a);
        }
        arrayList.add(C26763o0.m35033N0(this, C26571h.C26572a.f73937a, false, C25202z1.OUT_VARIANCE, C22830f.m26794f("R"), arrayList.size(), this.f73557h));
        this.f73563q = C110818d0.m150953y0(arrayList);
    }

    /* renamed from: A0 */
    public /* bridge */ /* synthetic */ C26447e mo51787A0() {
        return null;
    }

    /* renamed from: K */
    public C26455f1<C25176s0> mo51789K() {
        return null;
    }

    /* renamed from: N */
    public C20770i mo51790N(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this.f73562p;
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
        return false;
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        return this.f73558i;
    }

    /* renamed from: f */
    public C26453f mo51796f() {
        return C26453f.INTERFACE;
    }

    public C26571h getAnnotations() {
        int i = C26571h.f73936P0;
        return C26571h.C26572a.f73937a;
    }

    public C26521y0 getSource() {
        return C26521y0.f73808a;
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
        return C26442c0.ABSTRACT;
    }

    /* renamed from: l */
    public C25144j1 mo36110l() {
        return this.f73561o;
    }

    /* renamed from: p0 */
    public /* bridge */ /* synthetic */ Collection mo51803p0() {
        return C64186f0.f181907d;
    }

    /* renamed from: q */
    public /* bridge */ /* synthetic */ Collection mo51804q() {
        return C64186f0.f181907d;
    }

    /* renamed from: t */
    public List<C26446d1> mo51805t() {
        return this.f73563q;
    }

    public String toString() {
        String b = getName().mo35995b();
        C87412m.m108593f(b, "name.asString()");
        return b;
    }

    /* renamed from: v */
    public /* bridge */ /* synthetic */ C26444d mo51807v() {
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
