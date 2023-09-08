package xa0;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: xa0.e */
public final class C66241e {

    /* renamed from: a */
    public static final C32227p<C66244k, C66245l, Integer> f190296a = C66243b.f190299d;

    /* renamed from: b */
    public static final C32227p<C66244k, C66245l, Integer> f190297b = C66242a.f190298d;

    /* renamed from: xa0.e$a */
    public static final class C66242a extends C87413o implements C32227p<C66244k, C66245l, Integer> {

        /* renamed from: d */
        public static final C66242a f190298d = new C66242a();

        public C66242a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C66244k kVar = (C66244k) obj;
            C66245l lVar = (C66245l) obj2;
            C87412m.m108594g(kVar, "layout");
            C87412m.m108594g(lVar, "item");
            return Integer.valueOf(kVar.mo90336g() + (((kVar.mo90335f() - kVar.mo90336g()) - lVar.mo90340c()) / 2));
        }
    }

    /* renamed from: xa0.e$b */
    public static final class C66243b extends C87413o implements C32227p<C66244k, C66245l, Integer> {

        /* renamed from: d */
        public static final C66243b f190299d = new C66243b();

        public C66243b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C66244k kVar = (C66244k) obj;
            C87412m.m108594g(kVar, "layout");
            C87412m.m108594g((C66245l) obj2, "<anonymous parameter 1>");
            return Integer.valueOf(kVar.mo90336g());
        }
    }
}
