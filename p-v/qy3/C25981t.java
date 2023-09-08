package qy3;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ny3.C25238h;
import qy3.C25919e0;
import qy3.C25968n0;
import rx3.C13598b0;
import wy3.C26504r0;

/* renamed from: qy3.t */
public final class C25981t<V> extends C26003z<V> implements C25238h<V> {

    /* renamed from: s */
    public final C25968n0.C25970b<C25982a<V>> f72368s = C25968n0.m33136b(new C25983b(this));

    /* renamed from: qy3.t$a */
    public static final class C25982a<R> extends C25919e0.C25924c<R> implements C32226l {

        /* renamed from: n */
        public final C25981t<R> f72369n;

        public C25982a(C25981t<R> tVar) {
            C87412m.m108594g(tVar, "property");
            this.f72369n = tVar;
        }

        public Object invoke(Object obj) {
            C25982a<V> invoke = this.f72369n.f72368s.invoke();
            C87412m.m108593f(invoke, "_setter()");
            invoke.call(obj);
            return C13598b0.f38549a;
        }

        /* renamed from: r */
        public C25919e0 mo52800r() {
            return this.f72369n;
        }
    }

    /* renamed from: qy3.t$b */
    public static final class C25983b extends C87413o implements C32224a<C25982a<V>> {

        /* renamed from: d */
        public final /* synthetic */ C25981t<V> f72370d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25983b(C25981t<V> tVar) {
            super(0);
            this.f72370d = tVar;
        }

        public Object invoke() {
            return new C25982a(this.f72370d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25981t(C22167o oVar, C26504r0 r0Var) {
        super(oVar, r0Var);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(r0Var, "descriptor");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25981t(C22167o oVar, String str, String str2, Object obj) {
        super(oVar, str, str2, obj);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "signature");
    }
}
