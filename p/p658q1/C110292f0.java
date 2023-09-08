package p658q1;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p241t0.C110879z;
import rx3.C13598b0;

/* renamed from: q1.f0 */
public final class C110292f0 {

    /* renamed from: a */
    public final C110879z f329869a;

    /* renamed from: b */
    public final C32226l<C110301j, C13598b0> f329870b = C110295c.f329875d;

    /* renamed from: c */
    public final C32226l<C110301j, C13598b0> f329871c = C110293a.f329873d;

    /* renamed from: d */
    public final C32226l<C110301j, C13598b0> f329872d = C110294b.f329874d;

    /* renamed from: q1.f0$a */
    public static final class C110293a extends C87413o implements C32226l<C110301j, C13598b0> {

        /* renamed from: d */
        public static final C110293a f329873d = new C110293a();

        public C110293a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, "layoutNode");
            if (jVar.mo161701A()) {
                jVar.mo161711M(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.f0$b */
    public static final class C110294b extends C87413o implements C32226l<C110301j, C13598b0> {

        /* renamed from: d */
        public static final C110294b f329874d = new C110294b();

        public C110294b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, "layoutNode");
            if (jVar.mo161701A()) {
                jVar.mo161711M(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.f0$c */
    public static final class C110295c extends C87413o implements C32226l<C110301j, C13598b0> {

        /* renamed from: d */
        public static final C110295c f329875d = new C110295c();

        public C110295c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110301j jVar = (C110301j) obj;
            C87412m.m108594g(jVar, "layoutNode");
            if (jVar.mo161701A()) {
                jVar.mo161712N(false);
            }
            return C13598b0.f38549a;
        }
    }

    public C110292f0(C32226l<? super C32224a<C13598b0>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onChangedExecutor");
        this.f329869a = new C110879z(lVar);
    }

    /* renamed from: a */
    public final <T extends C110289d0> void mo161693a(T t, C32226l<? super T, C13598b0> lVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(t, "target");
        C87412m.m108594g(lVar, "onChanged");
        C87412m.m108594g(aVar, "block");
        this.f329869a.mo162585b(t, lVar, aVar);
    }
}
