package p246u1;

import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ny3.C89104m;

/* renamed from: u1.z */
public final class C111096z<T> {

    /* renamed from: a */
    public final String f332684a;

    /* renamed from: b */
    public final C32227p<T, T, T> f332685b;

    /* renamed from: u1.z$a */
    public static final class C111097a extends C87413o implements C32227p<T, T, T> {

        /* renamed from: d */
        public static final C111097a f332686d = new C111097a();

        public C111097a() {
            super(2);
        }

        public final T invoke(T t, T t2) {
            return t == null ? t2 : t;
        }
    }

    public C111096z(String str, C32227p<? super T, ? super T, ? extends T> pVar) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(pVar, "mergePolicy");
        this.f332684a = str;
        this.f332685b = pVar;
    }

    /* renamed from: a */
    public final void mo162844a(C111064a0 a0Var, C89104m<?> mVar, T t) {
        C87412m.m108594g(a0Var, "thisRef");
        C87412m.m108594g(mVar, "property");
        a0Var.mo162814f(this, t);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f332684a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C111096z(String str, C32227p pVar, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? C111097a.f332686d : pVar);
    }
}
