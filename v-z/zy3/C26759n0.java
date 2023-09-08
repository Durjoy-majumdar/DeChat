package zy3;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import m04.C24976j;
import m04.C24980n;
import n04.C25143j0;
import n04.C25180t1;
import ny3.C89104m;
import sx3.C36907w;
import vz3.C22830f;
import vz3.C26409h;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26443c1;
import wy3.C26444d;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26464i;
import wy3.C26469k;
import wy3.C26505s;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26777s;

/* renamed from: zy3.n0 */
public final class C26759n0 extends C26777s implements C26757m0 {

    /* renamed from: P */
    public static final C26760a f74412P = new C26760a((C8480h) null);

    /* renamed from: Q */
    public static final /* synthetic */ C89104m<Object>[] f74413Q = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C26759n0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: K */
    public final C24980n f74414K;

    /* renamed from: L */
    public final C26443c1 f74415L;

    /* renamed from: M */
    public final C24976j f74416M;

    /* renamed from: N */
    public C26444d f74417N;

    /* renamed from: zy3.n0$a */
    public static final class C26760a {
        public C26760a(C8480h hVar) {
        }
    }

    /* renamed from: zy3.n0$b */
    public static final class C26761b extends C87413o implements C32224a<C26759n0> {

        /* renamed from: d */
        public final /* synthetic */ C26759n0 f74418d;

        /* renamed from: e */
        public final /* synthetic */ C26444d f74419e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26761b(C26759n0 n0Var, C26444d dVar) {
            super(0);
            this.f74418d = n0Var;
            this.f74419e = dVar;
        }

        public Object invoke() {
            C26759n0 n0Var = this.f74418d;
            C24980n nVar = n0Var.f74414K;
            C26443c1 c1Var = n0Var.f74415L;
            C26444d dVar = this.f74419e;
            C26571h annotations = dVar.getAnnotations();
            C26436b.C26437a f = this.f74419e.mo52634f();
            C87412m.m108593f(f, "underlyingConstructorDescriptor.kind");
            C26521y0 source = this.f74418d.f74415L.getSource();
            C87412m.m108593f(source, "typeAliasDescriptor.source");
            C26759n0 n0Var2 = new C26759n0(nVar, c1Var, dVar, n0Var, annotations, f, source);
            C26759n0 n0Var3 = this.f74418d;
            C26444d dVar2 = this.f74419e;
            C26760a aVar = C26759n0.f74412P;
            C26443c1 c1Var2 = n0Var3.f74415L;
            aVar.getClass();
            C26509u0 u0Var = null;
            C25180t1 d = c1Var2.mo51922k() == null ? null : C25180t1.m32043d(c1Var2.mo51918E());
            if (d == null) {
                return null;
            }
            C26509u0 H = dVar2.mo52626H();
            if (H != null) {
                u0Var = H.mo51921c(d);
            }
            List<C26509u0> T = dVar2.mo52629T();
            C87412m.m108593f(T, "underlyingConstructorDes…contextReceiverParameters");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(T, 10));
            for (C26509u0 c : T) {
                arrayList.add(c.mo51921c(d));
            }
            List<C26446d1> t = n0Var3.f74415L.mo51805t();
            List<C26463h1> h = n0Var3.mo52639h();
            C25143j0 j0Var = n0Var3.f74460j;
            C87412m.m108591d(j0Var);
            n0Var2.mo53735M0((C26509u0) null, u0Var, arrayList, t, h, j0Var, C26442c0.FINAL, n0Var3.f74415L.getVisibility());
            return n0Var2;
        }
    }

    public C26759n0(C24980n nVar, C26443c1 c1Var, C26444d dVar, C26757m0 m0Var, C26571h hVar, C26436b.C26437a aVar, C26521y0 y0Var) {
        super(c1Var, m0Var, hVar, C26409h.f73651e, aVar, y0Var);
        this.f74414K = nVar;
        this.f74415L = c1Var;
        this.f74472y = c1Var.mo51808v0();
        this.f74416M = nVar.mo52005f(new C26761b(this, dVar));
        this.f74417N = dVar;
    }

    /* renamed from: J0 */
    public C26777s mo51316J0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        C87412m.m108594g(kVar, "newOwner");
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(hVar, "annotations");
        C87412m.m108594g(y0Var, FirebaseAnalytics.C113379b.SOURCE);
        return new C26759n0(this.f74414K, this.f74415L, this.f74417N, this, hVar, C26436b.C26437a.DECLARATION, y0Var);
    }

    /* renamed from: L */
    public boolean mo53445L() {
        return this.f74417N.mo53445L();
    }

    /* renamed from: S0 */
    public C26757m0 mo52598y(C26469k kVar, C26442c0 c0Var, C26505s sVar, C26436b.C26437a aVar, boolean z) {
        C87412m.m108594g(kVar, "newOwner");
        C87412m.m108594g(c0Var, "modality");
        C87412m.m108594g(sVar, "visibility");
        C87412m.m108594g(aVar, "kind");
        C26777s.C26780c cVar = (C26777s.C26780c) mo52597p();
        cVar.mo52603d(kVar);
        cVar.mo52606g(c0Var);
        cVar.mo52613n(sVar);
        cVar.mo52609j(aVar);
        cVar.mo52608i(z);
        C26516w build = cVar.build();
        C87412m.m108592e(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (C26757m0) build;
    }

    /* renamed from: T0 */
    public C26757m0 m35010a() {
        C26516w a = super.m35121a();
        C87412m.m108592e(a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (C26757m0) a;
    }

    /* renamed from: U0 */
    public C26757m0 m35015c(C25180t1 t1Var) {
        C87412m.m108594g(t1Var, "substitutor");
        C26516w c = super.mo51921c(t1Var);
        C87412m.m108592e(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C26759n0 n0Var = (C26759n0) c;
        C25143j0 j0Var = n0Var.f74460j;
        C87412m.m108591d(j0Var);
        C26444d c2 = this.f74417N.mo36109a().mo51921c(C25180t1.m32043d(j0Var));
        if (c2 == null) {
            return null;
        }
        n0Var.f74417N = c2;
        return n0Var;
    }

    /* renamed from: b */
    public C26464i mo51892b() {
        return this.f74415L;
    }

    /* renamed from: e0 */
    public C26444d mo53739e0() {
        return this.f74417N;
    }

    public C25143j0 getReturnType() {
        C25143j0 j0Var = this.f74460j;
        C87412m.m108591d(j0Var);
        return j0Var;
    }

    /* renamed from: j0 */
    public C26447e mo53446j0() {
        C26447e j0 = this.f74417N.mo53446j0();
        C87412m.m108593f(j0, "underlyingConstructorDescriptor.constructedClass");
        return j0;
    }

    /* renamed from: b */
    public C26469k m35012b() {
        return this.f74415L;
    }
}
