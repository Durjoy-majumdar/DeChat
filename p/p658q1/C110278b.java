package p658q1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: q1.b */
public final class C110278b {

    /* renamed from: a */
    public final C100973k0<C110301j> f329856a = new C100973k0<>(new C110279a());

    /* renamed from: q1.b$a */
    public static final class C110279a implements Comparator<C110301j> {
        public int compare(Object obj, Object obj2) {
            C110301j jVar = (C110301j) obj;
            C110301j jVar2 = (C110301j) obj2;
            C87412m.m108594g(jVar, "l1");
            C87412m.m108594g(jVar2, "l2");
            int i = C87412m.m108596i(jVar.f329919n, jVar2.f329919n);
            return i != 0 ? i : C87412m.m108596i(jVar.hashCode(), jVar2.hashCode());
        }
    }

    /* renamed from: q1.b$b */
    public static final class C110280b extends C87413o implements C32224a<Map<C110301j, Integer>> {

        /* renamed from: d */
        public static final C110280b f329857d = new C110280b();

        public C110280b() {
            super(0);
        }

        public Object invoke() {
            return new LinkedHashMap();
        }
    }

    public C110278b(boolean z) {
        C36568h.m40986b(C13602i.NONE, C110280b.f329857d);
    }

    /* renamed from: a */
    public final void mo161682a(C110301j jVar) {
        C87412m.m108594g(jVar, "node");
        if (jVar.mo161701A()) {
            this.f329856a.add(jVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final boolean mo161683b(C110301j jVar) {
        C87412m.m108594g(jVar, "node");
        if (jVar.mo161701A()) {
            return this.f329856a.remove(jVar);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String obj = this.f329856a.toString();
        C87412m.m108593f(obj, "set.toString()");
        return obj;
    }
}
