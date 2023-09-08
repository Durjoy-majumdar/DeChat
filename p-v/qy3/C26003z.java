package qy3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import ny3.C25241k;
import oy3.C117905b;
import qy3.C25919e0;
import qy3.C25968n0;
import rx3.C13602i;
import rx3.C36568h;
import ry3.C26150i;
import wy3.C26504r0;

/* renamed from: qy3.z */
public class C26003z<V> extends C25919e0<V> implements C25241k<V> {

    /* renamed from: r */
    public final C25968n0.C25970b<C26004a<V>> f72401r = C25968n0.m33136b(new C26005b(this));

    /* renamed from: qy3.z$a */
    public static final class C26004a<R> extends C25919e0.C25921b<R> implements C25241k.C25242a<R> {

        /* renamed from: n */
        public final C26003z<R> f72402n;

        public C26004a(C26003z<? extends R> zVar) {
            C87412m.m108594g(zVar, "property");
            this.f72402n = zVar;
        }

        public R invoke() {
            return this.f72402n.get();
        }

        /* renamed from: r */
        public C25919e0 mo52800r() {
            return this.f72402n;
        }
    }

    /* renamed from: qy3.z$b */
    public static final class C26005b extends C87413o implements C32224a<C26004a<? extends V>> {

        /* renamed from: d */
        public final /* synthetic */ C26003z<V> f72403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26005b(C26003z<? extends V> zVar) {
            super(0);
            this.f72403d = zVar;
        }

        public Object invoke() {
            return new C26004a(this.f72403d);
        }
    }

    /* renamed from: qy3.z$c */
    public static final class C26006c extends C87413o implements C32224a<Object> {

        /* renamed from: d */
        public final /* synthetic */ C26003z<V> f72404d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26006c(C26003z<? extends V> zVar) {
            super(0);
            this.f72404d = zVar;
        }

        public final Object invoke() {
            C26003z<V> zVar = this.f72404d;
            Member q = zVar.mo52810q();
            try {
                Object obj = C25919e0.f72265q;
                Object a = zVar.mo52807p() ? C26150i.m33565a(zVar.f72269n, zVar.mo52805n()) : null;
                if (!(a != obj)) {
                    a = null;
                }
                zVar.mo52807p();
                if (q == null) {
                    return null;
                }
                if (q instanceof Field) {
                    return ((Field) q).get(a);
                }
                if (q instanceof Method) {
                    int length = ((Method) q).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) q).invoke((Object) null, new Object[0]);
                    }
                    if (length == 1) {
                        Method method = (Method) q;
                        Object[] objArr = new Object[1];
                        if (a == null) {
                            Class cls = ((Method) q).getParameterTypes()[0];
                            C87412m.m108593f(cls, "fieldOrMethod.parameterTypes[0]");
                            a = C25987u0.m33172c(cls);
                        }
                        objArr[0] = a;
                        return method.invoke((Object) null, objArr);
                    } else if (length == 2) {
                        Class cls2 = ((Method) q).getParameterTypes()[1];
                        C87412m.m108593f(cls2, "fieldOrMethod.parameterTypes[1]");
                        return ((Method) q).invoke((Object) null, new Object[]{a, C25987u0.m33172c(cls2)});
                    } else {
                        throw new AssertionError("delegate method " + q + " should take 0, 1, or 2 parameters");
                    }
                } else {
                    throw new AssertionError("delegate field/method " + q + " neither field nor method");
                }
            } catch (IllegalAccessException e) {
                throw new C117905b(e);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26003z(C22167o oVar, C26504r0 r0Var) {
        super(oVar, r0Var);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(r0Var, "descriptor");
        C36568h.m40986b(C13602i.PUBLICATION, new C26006c(this));
    }

    /* renamed from: g */
    public C25241k.C25242a mo51285g() {
        C26004a<V> invoke = this.f72401r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke;
    }

    public V get() {
        C26004a<V> invoke = this.f72401r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke.call(new Object[0]);
    }

    public V invoke() {
        return get();
    }

    /* renamed from: s */
    public C25919e0.C25921b mo52799s() {
        C26004a<V> invoke = this.f72401r.invoke();
        C87412m.m108593f(invoke, "_getter()");
        return invoke;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26003z(C22167o oVar, String str, String str2, Object obj) {
        super(oVar, str, str2, obj);
        C87412m.m108594g(oVar, "container");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "signature");
        C36568h.m40986b(C13602i.PUBLICATION, new C26006c(this));
    }
}
