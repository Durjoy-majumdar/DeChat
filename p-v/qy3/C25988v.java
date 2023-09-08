package qy3;

import fy3.C32228q;
import gy3.C87412m;
import qy3.C25919e0;
import qy3.C25968n0;
import rx3.C13598b0;
import wy3.C26504r0;

/* renamed from: qy3.v */
public final class C25988v<D, E, V> extends C25910b0<D, E, V> {

    /* renamed from: s */
    public final C25968n0.C25970b<C25989a<D, E, V>> f72375s = C25968n0.m33136b(new C25990w(this));

    /* renamed from: qy3.v$a */
    public static final class C25989a<D, E, V> extends C25919e0.C25924c<V> implements C32228q {

        /* renamed from: n */
        public final C25988v<D, E, V> f72376n;

        public C25989a(C25988v<D, E, V> vVar) {
            C87412m.m108594g(vVar, "property");
            this.f72376n = vVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C25989a<D, E, V> invoke = this.f72376n.f72375s.invoke();
            C87412m.m108593f(invoke, "_setter()");
            invoke.call(obj, obj2, obj3);
            return C13598b0.f38549a;
        }

        /* renamed from: r */
        public C25919e0 mo52800r() {
            return this.f72376n;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25988v(C22167o oVar, C26504r0 r0Var) {
        super(oVar, r0Var);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(r0Var, "descriptor");
    }
}
