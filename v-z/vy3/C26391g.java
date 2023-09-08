package vy3;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import m04.C21480i;
import m04.C24979m;
import m04.C24980n;
import ny3.C89104m;
import sx3.C110818d0;
import ty3.C26336h;
import wy3.C26448e0;
import yy3.C26640a;
import yy3.C26642b;
import yy3.C26643c;
import zy3.C26729b0;

/* renamed from: vy3.g */
public final class C26391g extends C26336h {

    /* renamed from: h */
    public static final /* synthetic */ C89104m<Object>[] f73615h = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C26391g.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: f */
    public C32224a<C26392b> f73616f;

    /* renamed from: g */
    public final C21480i f73617g;

    /* renamed from: vy3.g$b */
    public static final class C26392b {

        /* renamed from: a */
        public final C26448e0 f73618a;

        /* renamed from: b */
        public final boolean f73619b;

        public C26392b(C26448e0 e0Var, boolean z) {
            C87412m.m108594g(e0Var, "ownerModuleDescriptor");
            this.f73618a = e0Var;
            this.f73619b = z;
        }
    }

    /* renamed from: vy3.g$c */
    public static final class C26393c extends C87413o implements C32224a<C26397j> {

        /* renamed from: d */
        public final /* synthetic */ C26391g f73620d;

        /* renamed from: e */
        public final /* synthetic */ C24980n f73621e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26393c(C26391g gVar, C24980n nVar) {
            super(0);
            this.f73620d = gVar;
            this.f73621e = nVar;
        }

        public Object invoke() {
            C26729b0 l = this.f73620d.mo53320l();
            C87412m.m108593f(l, "builtInsModule");
            return new C26397j(l, this.f73621e, new C26395h(this.f73620d));
        }
    }

    /* renamed from: vy3.g$a */
    public enum C26394a {
        FROM_DEPENDENCIES
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26391g(C24980n nVar, C26394a aVar) {
        super(nVar);
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(aVar, "kind");
        this.f73617g = nVar.mo52006g(new C26393c(this, nVar));
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            mo53312d(false);
        } else if (ordinal == 2) {
            mo53312d(true);
        }
    }

    /* renamed from: M */
    public final C26397j mo53379M() {
        return (C26397j) C24979m.m31587a(this.f73617g, this, f73615h[0]);
    }

    /* renamed from: e */
    public C26640a mo53313e() {
        return mo53379M();
    }

    /* renamed from: m */
    public Iterable mo53321m() {
        Iterable<C26642b> m = super.mo53321m();
        C87412m.m108593f(m, "super.getClassDescriptorFactories()");
        C24980n nVar = this.f73358d;
        if (nVar != null) {
            C26729b0 l = mo53320l();
            C87412m.m108593f(l, "builtInsModule");
            return C110818d0.m150932d0(m, new C26387e(nVar, l, (C32226l) null, 4, (C8480h) null));
        }
        C26336h.m33836a(6);
        throw null;
    }

    /* renamed from: q */
    public C26643c mo53325q() {
        return mo53379M();
    }
}
