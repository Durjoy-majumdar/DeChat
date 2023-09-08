package t04;

import d04.C24442a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import n04.C25143j0;
import n04.C25176s0;
import t04.C26255f;
import ty3.C22558j;
import ty3.C26336h;
import wy3.C26516w;

/* renamed from: t04.s */
public abstract class C26281s implements C26255f {

    /* renamed from: a */
    public final C32226l<C26336h, C25143j0> f73236a;

    /* renamed from: b */
    public final String f73237b;

    /* renamed from: t04.s$a */
    public static final class C26282a extends C26281s {

        /* renamed from: c */
        public static final C26282a f73238c = new C26282a();

        /* renamed from: t04.s$a$a */
        public static final class C26283a extends C87413o implements C32226l<C26336h, C25143j0> {

            /* renamed from: d */
            public static final C26283a f73239d = new C26283a();

            public C26283a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C26336h hVar = (C26336h) obj;
                C87412m.m108594g(hVar, "$this$null");
                C25176s0 t = hVar.mo53327t(C22558j.BOOLEAN);
                if (t != null) {
                    return t;
                }
                C26336h.m33836a(63);
                throw null;
            }
        }

        public C26282a() {
            super("Boolean", C26283a.f73239d, (C8480h) null);
        }
    }

    /* renamed from: t04.s$b */
    public static final class C26284b extends C26281s {

        /* renamed from: c */
        public static final C26284b f73240c = new C26284b();

        /* renamed from: t04.s$b$a */
        public static final class C26285a extends C87413o implements C32226l<C26336h, C25143j0> {

            /* renamed from: d */
            public static final C26285a f73241d = new C26285a();

            public C26285a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C26336h hVar = (C26336h) obj;
                C87412m.m108594g(hVar, "$this$null");
                C25176s0 t = hVar.mo53327t(C22558j.INT);
                if (t != null) {
                    return t;
                }
                C26336h.m33836a(58);
                throw null;
            }
        }

        public C26284b() {
            super("Int", C26285a.f73241d, (C8480h) null);
        }
    }

    /* renamed from: t04.s$c */
    public static final class C26286c extends C26281s {

        /* renamed from: c */
        public static final C26286c f73242c = new C26286c();

        /* renamed from: t04.s$c$a */
        public static final class C26287a extends C87413o implements C32226l<C26336h, C25143j0> {

            /* renamed from: d */
            public static final C26287a f73243d = new C26287a();

            public C26287a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C26336h hVar = (C26336h) obj;
                C87412m.m108594g(hVar, "$this$null");
                C25176s0 x = hVar.mo53330x();
                C87412m.m108593f(x, "unitType");
                return x;
            }
        }

        public C26286c() {
            super("Unit", C26287a.f73243d, (C8480h) null);
        }
    }

    public C26281s(String str, C32226l lVar, C8480h hVar) {
        this.f73236a = lVar;
        this.f73237b = "must return " + str;
    }

    /* renamed from: a */
    public String mo53156a(C26516w wVar) {
        return C26255f.C26256a.m33748a(this, wVar);
    }

    /* renamed from: b */
    public boolean mo53157b(C26516w wVar) {
        C87412m.m108594g(wVar, "functionDescriptor");
        return C87412m.m108589b(wVar.getReturnType(), this.f73236a.invoke(C24442a.m30538e(wVar)));
    }

    public String getDescription() {
        return this.f73237b;
    }
}
