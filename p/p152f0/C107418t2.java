package p152f0;

import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.Map;
import p009c2.C104256i0;
import p560i2.C108319b;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import p759y.C112218f0;
import rx3.C13598b0;

/* renamed from: f0.t2 */
public final class C107418t2 implements C109866r {

    /* renamed from: d */
    public final C107356k2 f321413d;

    /* renamed from: e */
    public final int f321414e;

    /* renamed from: f */
    public final C104256i0 f321415f;

    /* renamed from: g */
    public final C32224a<C107401q2> f321416g;

    /* renamed from: f0.t2$a */
    public static final class C107419a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109827a0 f321417d;

        /* renamed from: e */
        public final /* synthetic */ C107418t2 f321418e;

        /* renamed from: f */
        public final /* synthetic */ C109854n0 f321419f;

        /* renamed from: g */
        public final /* synthetic */ int f321420g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107419a(C109827a0 a0Var, C107418t2 t2Var, C109854n0 n0Var, int i) {
            super(1);
            this.f321417d = a0Var;
            this.f321418e = t2Var;
            this.f321419f = n0Var;
            this.f321420g = i;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109827a0 a0Var = this.f321417d;
            C107418t2 t2Var = this.f321418e;
            int i = t2Var.f321414e;
            C104256i0 i0Var = t2Var.f321415f;
            C107401q2 invoke = t2Var.f321416g.invoke();
            this.f321418e.f321413d.mo157809b(C112218f0.Vertical, C107354j2.m145488a(a0Var, i, i0Var, invoke != null ? invoke.f321339a : null, false, this.f321419f.f328779d), this.f321420g, this.f321419f.f328780e);
            C109854n0.C109855a.m149306f(aVar, this.f321419f, 0, C60641c.m70921b(-this.f321418e.f321413d.mo157808a()), 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C107418t2(C107356k2 k2Var, int i, C104256i0 i0Var, C32224a<C107401q2> aVar) {
        C87412m.m108594g(k2Var, "scrollerPosition");
        C87412m.m108594g(i0Var, "transformedText");
        C87412m.m108594g(aVar, "textLayoutResultProvider");
        this.f321413d = k2Var;
        this.f321414e = i;
        this.f321415f = i0Var;
        this.f321416g = aVar;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(C108319b.m146690a(j, 0, 0, 0, Integer.MAX_VALUE, 7, (Object) null));
        int min = Math.min(K.f328780e, C108319b.m146696g(j));
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, min, (Map) null, new C107419a(a0Var, this, K, min), 4, (Object) null);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: Y */
    public int mo142878Y(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149339c(this, kVar, jVar, i);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107418t2)) {
            return false;
        }
        C107418t2 t2Var = (C107418t2) obj;
        return C87412m.m108589b(this.f321413d, t2Var.f321413d) && this.f321414e == t2Var.f321414e && C87412m.m108589b(this.f321415f, t2Var.f321415f) && C87412m.m108589b(this.f321416g, t2Var.f321416g);
    }

    public int hashCode() {
        return (((((this.f321413d.hashCode() * 31) + this.f321414e) * 31) + this.f321415f.hashCode()) * 31) + this.f321416g.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: s0 */
    public int mo142882s0(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149340d(this, kVar, jVar, i);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f321413d + ", cursorOffset=" + this.f321414e + ", transformedText=" + this.f321415f + ", textLayoutResultProvider=" + this.f321416g + ')';
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149337a(this, kVar, jVar, i);
    }
}
