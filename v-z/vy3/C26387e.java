package vy3;

import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m04.C21480i;
import m04.C24979m;
import m04.C24980n;
import ny3.C89104m;
import sx3.C110818d0;
import sx3.C22415w0;
import sx3.C64187h0;
import ty3.C26331b;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26465i0;
import wy3.C26469k;
import yy3.C26642b;
import zy3.C26754k;

/* renamed from: vy3.e */
public final class C26387e implements C26642b {

    /* renamed from: d */
    public static final C26389b f73604d = new C26389b((C8480h) null);

    /* renamed from: e */
    public static final /* synthetic */ C89104m<Object>[] f73605e = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C26387e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: f */
    public static final C22826c f73606f = C26343l.f73376j;

    /* renamed from: g */
    public static final C22830f f73607g;

    /* renamed from: h */
    public static final C26408b f73608h;

    /* renamed from: a */
    public final C26448e0 f73609a;

    /* renamed from: b */
    public final C32226l<C26448e0, C26469k> f73610b;

    /* renamed from: c */
    public final C21480i f73611c;

    /* renamed from: vy3.e$a */
    public static final class C26388a extends C87413o implements C32226l<C26448e0, C26331b> {

        /* renamed from: d */
        public static final C26388a f73612d = new C26388a();

        public C26388a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26448e0 e0Var = (C26448e0) obj;
            C87412m.m108594g(e0Var, "module");
            List<C26465i0> A = e0Var.mo52620b0(C26387e.f73606f).mo53458A();
            ArrayList arrayList = new ArrayList();
            for (T next : A) {
                if (next instanceof C26331b) {
                    arrayList.add(next);
                }
            }
            return (C26331b) C110818d0.m150914L(arrayList);
        }
    }

    /* renamed from: vy3.e$b */
    public static final class C26389b {
        public C26389b(C8480h hVar) {
        }
    }

    static {
        C22827d dVar = C26343l.C26344a.f73413d;
        C22830f h = dVar.mo35991h();
        C87412m.m108593f(h, "cloneable.shortName()");
        f73607g = h;
        f73608h = C26408b.m33992l(dVar.mo35993i());
    }

    public C26387e(C24980n nVar, C26448e0 e0Var, C32226l<C26448e0, C26469k> lVar, int i, C8480h hVar) {
        lVar = (i & 4) != 0 ? C26388a.f73612d : lVar;
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(e0Var, "moduleDescriptor");
        C87412m.m108594g(lVar, "computeContainingDeclaration");
        this.f73609a = e0Var;
        this.f73610b = lVar;
        this.f73611c = nVar.mo52006g(new C26390f(this, nVar));
    }

    /* renamed from: a */
    public C26447e mo53351a(C26408b bVar) {
        C87412m.m108594g(bVar, "classId");
        if (C87412m.m108589b(bVar, f73608h)) {
            return (C26754k) C24979m.m31587a(this.f73611c, this, f73605e[0]);
        }
        return null;
    }

    /* renamed from: b */
    public Collection<C26447e> mo53352b(C22826c cVar) {
        C87412m.m108594g(cVar, "packageFqName");
        return C87412m.m108589b(cVar, f73606f) ? C22415w0.m26092a((C26754k) C24979m.m31587a(this.f73611c, this, f73605e[0])) : C64187h0.f181908d;
    }

    /* renamed from: c */
    public boolean mo53353c(C22826c cVar, C22830f fVar) {
        C87412m.m108594g(cVar, "packageFqName");
        C87412m.m108594g(fVar, "name");
        return C87412m.m108589b(fVar, f73607g) && C87412m.m108589b(cVar, f73606f);
    }
}
