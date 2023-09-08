package qy3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Member;
import ny3.C25243l;
import qy3.C25919e0;
import qy3.C25968n0;
import rx3.C13602i;
import rx3.C36568h;
import wy3.C26504r0;

/* renamed from: qy3.a0 */
public class C25906a0<T, V> extends C25919e0<V> implements C25243l<T, V> {

    /* renamed from: r */
    public final C25968n0.C25970b<C25907a<T, V>> f72249r = C25968n0.m33136b(new C25908b(this));

    /* renamed from: qy3.a0$a */
    public static final class C25907a<T, V> extends C25919e0.C25921b<V> implements C25243l.C25244a<T, V> {

        /* renamed from: n */
        public final C25906a0<T, V> f72250n;

        public C25907a(C25906a0<T, ? extends V> a0Var) {
            C87412m.m108594g(a0Var, "property");
            this.f72250n = a0Var;
        }

        public V invoke(T t) {
            return this.f72250n.get(t);
        }

        /* renamed from: r */
        public C25919e0 mo52800r() {
            return this.f72250n;
        }
    }

    /* renamed from: qy3.a0$b */
    public static final class C25908b extends C87413o implements C32224a<C25907a<T, ? extends V>> {

        /* renamed from: d */
        public final /* synthetic */ C25906a0<T, V> f72251d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25908b(C25906a0<T, ? extends V> a0Var) {
            super(0);
            this.f72251d = a0Var;
        }

        public Object invoke() {
            return new C25907a(this.f72251d);
        }
    }

    /* renamed from: qy3.a0$c */
    public static final class C25909c extends C87413o implements C32224a<Member> {

        /* renamed from: d */
        public final /* synthetic */ C25906a0<T, V> f72252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25909c(C25906a0<T, ? extends V> a0Var) {
            super(0);
            this.f72252d = a0Var;
        }

        public Object invoke() {
            return this.f72252d.mo52810q();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25906a0(C22167o oVar, String str, String str2, Object obj) {
        super(oVar, str, str2, obj);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "signature");
        C36568h.m40986b(C13602i.PUBLICATION, new C25909c(this));
    }

    /* renamed from: g */
    public C25243l.C25244a mo51287g() {
        C25907a<T, V> invoke = this.f72249r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke;
    }

    public V get(T t) {
        C25907a<T, V> invoke = this.f72249r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke.call(t);
    }

    public V invoke(T t) {
        return get(t);
    }

    /* renamed from: s */
    public C25919e0.C25921b mo52799s() {
        C25907a<T, V> invoke = this.f72249r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25906a0(C22167o oVar, C26504r0 r0Var) {
        super(oVar, r0Var);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(r0Var, "descriptor");
        C36568h.m40986b(C13602i.PUBLICATION, new C25909c(this));
    }
}
