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
import p560i2.C33183o;
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

/* renamed from: f0.i0 */
public final class C107349i0 implements C109866r {

    /* renamed from: d */
    public final C107356k2 f321179d;

    /* renamed from: e */
    public final int f321180e;

    /* renamed from: f */
    public final C104256i0 f321181f;

    /* renamed from: g */
    public final C32224a<C107401q2> f321182g;

    /* renamed from: f0.i0$a */
    public static final class C107350a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109827a0 f321183d;

        /* renamed from: e */
        public final /* synthetic */ C107349i0 f321184e;

        /* renamed from: f */
        public final /* synthetic */ C109854n0 f321185f;

        /* renamed from: g */
        public final /* synthetic */ int f321186g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107350a(C109827a0 a0Var, C107349i0 i0Var, C109854n0 n0Var, int i) {
            super(1);
            this.f321183d = a0Var;
            this.f321184e = i0Var;
            this.f321185f = n0Var;
            this.f321186g = i;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109827a0 a0Var = this.f321183d;
            C107349i0 i0Var = this.f321184e;
            int i = i0Var.f321180e;
            C104256i0 i0Var2 = i0Var.f321181f;
            C107401q2 invoke = i0Var.f321182g.invoke();
            this.f321184e.f321179d.mo157809b(C112218f0.Horizontal, C107354j2.m145488a(a0Var, i, i0Var2, invoke != null ? invoke.f321339a : null, this.f321183d.getLayoutDirection() == C33183o.Rtl, this.f321185f.f328779d), this.f321186g, this.f321185f.f328779d);
            C109854n0.C109855a.m149306f(aVar, this.f321185f, C60641c.m70921b(-this.f321184e.f321179d.mo157808a()), 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C107349i0(C107356k2 k2Var, int i, C104256i0 i0Var, C32224a<C107401q2> aVar) {
        C87412m.m108594g(k2Var, "scrollerPosition");
        C87412m.m108594g(i0Var, "transformedText");
        C87412m.m108594g(aVar, "textLayoutResultProvider");
        this.f321179d = k2Var;
        this.f321180e = i;
        this.f321181f = i0Var;
        this.f321182g = aVar;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(xVar.mo161158Y(C108319b.m146696g(j)) < C108319b.m146697h(j) ? j : C108319b.m146690a(j, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null));
        int min = Math.min(K.f328779d, C108319b.m146697h(j));
        return C109827a0.C109828a.m149247b(a0Var, min, K.f328780e, (Map) null, new C107350a(a0Var, this, K, min), 4, (Object) null);
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
        if (!(obj instanceof C107349i0)) {
            return false;
        }
        C107349i0 i0Var = (C107349i0) obj;
        return C87412m.m108589b(this.f321179d, i0Var.f321179d) && this.f321180e == i0Var.f321180e && C87412m.m108589b(this.f321181f, i0Var.f321181f) && C87412m.m108589b(this.f321182g, i0Var.f321182g);
    }

    public int hashCode() {
        return (((((this.f321179d.hashCode() * 31) + this.f321180e) * 31) + this.f321181f.hashCode()) * 31) + this.f321182g.hashCode();
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f321179d + ", cursorOffset=" + this.f321180e + ", transformedText=" + this.f321181f + ", textLayoutResultProvider=" + this.f321182g + ')';
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149337a(this, kVar, jVar, i);
    }
}
