package qy3;

import fy3.C32227p;
import gy3.C87412m;
import qy3.C25919e0;
import qy3.C25968n0;
import rx3.C13602i;
import rx3.C36568h;
import wy3.C26504r0;

/* renamed from: qy3.b0 */
public class C25910b0<D, E, V> extends C25919e0<V> implements C32227p {

    /* renamed from: r */
    public final C25968n0.C25970b<C25911a<D, E, V>> f72253r = C25968n0.m33136b(new C25912c0(this));

    /* renamed from: qy3.b0$a */
    public static final class C25911a<D, E, V> extends C25919e0.C25921b<V> implements C32227p {

        /* renamed from: n */
        public final C25910b0<D, E, V> f72254n;

        public C25911a(C25910b0<D, E, ? extends V> b0Var) {
            C87412m.m108594g(b0Var, "property");
            this.f72254n = b0Var;
        }

        public V invoke(D d, E e) {
            C25911a<D, E, V> invoke = this.f72254n.f72253r.invoke();
            C87412m.m108593f(invoke, "_getter()");
            return invoke.call(d, e);
        }

        /* renamed from: r */
        public C25919e0 mo52800r() {
            return this.f72254n;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25910b0(C22167o oVar, C26504r0 r0Var) {
        super(oVar, r0Var);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(r0Var, "descriptor");
        C36568h.m40986b(C13602i.PUBLICATION, new C25913d0(this));
    }

    public V invoke(D d, E e) {
        C25911a<D, E, V> invoke = this.f72253r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke.call(d, e);
    }

    /* renamed from: s */
    public C25919e0.C25921b mo52799s() {
        C25911a<D, E, V> invoke = this.f72253r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke;
    }
}
