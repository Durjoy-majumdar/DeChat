package p175j0;

import gy3.C87412m;
import p241t0.C110849h;
import p241t0.C110851h0;
import p241t0.C110856i0;
import p241t0.C110865n;
import p241t0.C110871u;
import rx3.C13598b0;

/* renamed from: j0.d2 */
public class C108494d2<T> implements C110851h0, C110871u<T> {

    /* renamed from: d */
    public final C108497e2<T> f324818d;

    /* renamed from: e */
    public C108495a<T> f324819e;

    /* renamed from: j0.d2$a */
    public static final class C108495a<T> extends C110856i0 {

        /* renamed from: c */
        public T f324820c;

        public C108495a(T t) {
            this.f324820c = t;
        }

        /* renamed from: a */
        public void mo159361a(C110856i0 i0Var) {
            C87412m.m108594g(i0Var, "value");
            this.f324820c = ((C108495a) i0Var).f324820c;
        }

        /* renamed from: b */
        public C110856i0 mo159362b() {
            return new C108495a(this.f324820c);
        }
    }

    public C108494d2(T t, C108497e2<T> e2Var) {
        C87412m.m108594g(e2Var, "policy");
        this.f324818d = e2Var;
        this.f324819e = new C108495a<>(t);
    }

    /* renamed from: d */
    public C108497e2<T> mo159364d() {
        return this.f324818d;
    }

    /* renamed from: f */
    public C110856i0 mo159357f() {
        return this.f324819e;
    }

    public T getValue() {
        return ((C108495a) C110865n.m151154q(this.f324819e, this)).f324820c;
    }

    /* renamed from: i */
    public C110856i0 mo159358i(C110856i0 i0Var, C110856i0 i0Var2, C110856i0 i0Var3) {
        C87412m.m108594g(i0Var, "previous");
        C87412m.m108594g(i0Var2, "current");
        C87412m.m108594g(i0Var3, "applied");
        C108495a aVar = (C108495a) i0Var;
        C108495a aVar2 = (C108495a) i0Var2;
        C108495a aVar3 = (C108495a) i0Var3;
        if (this.f324818d.mo159368a(aVar2.f324820c, aVar3.f324820c)) {
            return i0Var2;
        }
        T b = this.f324818d.mo159369b(aVar.f324820c, aVar2.f324820c, aVar3.f324820c);
        if (b == null) {
            return null;
        }
        C110856i0 b2 = aVar3.mo159362b();
        ((C108495a) b2).f324820c = b;
        return b2;
    }

    /* renamed from: m */
    public void mo159359m(C110856i0 i0Var) {
        C87412m.m108594g(i0Var, "value");
        this.f324819e = (C108495a) i0Var;
    }

    public void setValue(T t) {
        C110849h i;
        C108495a aVar = (C108495a) C110865n.m151145h(this.f324819e, C110865n.m151146i());
        if (!this.f324818d.mo159368a(aVar.f324820c, t)) {
            C108495a<T> aVar2 = this.f324819e;
            synchronized (C110865n.f331651c) {
                i = C110865n.m151146i();
                ((C108495a) C110865n.m151151n(aVar2, this, i, aVar)).f324820c = t;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C110865n.m151150m(i, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((C108495a) C110865n.m151145h(this.f324819e, C110865n.m151146i())).f324820c + ")@" + hashCode();
    }
}
