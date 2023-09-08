package qy3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ny3.C89102i;
import qy3.C25919e0;
import qy3.C25968n0;
import rx3.C13598b0;
import wy3.C26504r0;

/* renamed from: qy3.u */
public final class C25984u<T, V> extends C25906a0<T, V> implements C89102i<T, V> {

    /* renamed from: s */
    public final C25968n0.C25970b<C25985a<T, V>> f72371s = C25968n0.m33136b(new C25986b(this));

    /* renamed from: qy3.u$a */
    public static final class C25985a<T, V> extends C25919e0.C25924c<V> implements C89102i.C89103a<T, V> {

        /* renamed from: n */
        public final C25984u<T, V> f72372n;

        public C25985a(C25984u<T, V> uVar) {
            C87412m.m108594g(uVar, "property");
            this.f72372n = uVar;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f72372n.mo51289J(obj, obj2);
            return C13598b0.f38549a;
        }

        /* renamed from: r */
        public C25919e0 mo52800r() {
            return this.f72372n;
        }
    }

    /* renamed from: qy3.u$b */
    public static final class C25986b extends C87413o implements C32224a<C25985a<T, V>> {

        /* renamed from: d */
        public final /* synthetic */ C25984u<T, V> f72373d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25986b(C25984u<T, V> uVar) {
            super(0);
            this.f72373d = uVar;
        }

        public Object invoke() {
            return new C25985a(this.f72373d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25984u(C22167o oVar, String str, String str2, Object obj) {
        super(oVar, str, str2, obj);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "signature");
    }

    /* renamed from: J */
    public void mo51289J(T t, V v) {
        C25985a<T, V> invoke = this.f72371s.invoke();
        C87412m.m108593f(invoke, "_setter()");
        invoke.call(t, v);
    }

    /* renamed from: i */
    public C89102i.C89103a mo51288i() {
        C25985a<T, V> invoke = this.f72371s.invoke();
        C87412m.m108593f(invoke, "_setter()");
        return invoke;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25984u(C22167o oVar, C26504r0 r0Var) {
        super(oVar, r0Var);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(r0Var, "descriptor");
    }
}
