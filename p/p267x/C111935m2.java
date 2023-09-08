package p267x;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import my3.C61595o;
import p1166z0.C112546l;
import p175j0.C108494d2;
import p560i2.C108319b;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import p759y.C112241i0;
import rx3.C13598b0;

/* renamed from: x.m2 */
public final class C111935m2 implements C109866r {

    /* renamed from: d */
    public final C111932l2 f335105d;

    /* renamed from: e */
    public final boolean f335106e;

    /* renamed from: f */
    public final boolean f335107f;

    /* renamed from: g */
    public final C112241i0 f335108g;

    /* renamed from: x.m2$a */
    public static final class C111936a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111935m2 f335109d;

        /* renamed from: e */
        public final /* synthetic */ int f335110e;

        /* renamed from: f */
        public final /* synthetic */ C109854n0 f335111f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111936a(C111935m2 m2Var, int i, C109854n0 n0Var) {
            super(1);
            this.f335109d = m2Var;
            this.f335110e = i;
            this.f335111f = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C111932l2 l2Var = this.f335109d.f335105d;
            int i = this.f335110e;
            ((C108494d2) l2Var.f335097c).setValue(Integer.valueOf(i));
            if (l2Var.mo163632d() > i) {
                ((C108494d2) l2Var.f335095a).setValue(Integer.valueOf(i));
            }
            int e = C61595o.m72297e(this.f335109d.f335105d.mo163632d(), 0, this.f335110e);
            C111935m2 m2Var = this.f335109d;
            int i2 = m2Var.f335106e ? e - this.f335110e : -e;
            boolean z = m2Var.f335107f;
            int i3 = z ? 0 : i2;
            if (!z) {
                i2 = 0;
            }
            C109854n0.C109855a.m149307g(aVar, this.f335111f, i3, i2, 0.0f, (C32226l) null, 12, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C111935m2(C111932l2 l2Var, boolean z, boolean z2, C112241i0 i0Var) {
        C87412m.m108594g(l2Var, "scrollerState");
        C87412m.m108594g(i0Var, "overScrollController");
        this.f335105d = l2Var;
        this.f335106e = z;
        this.f335107f = z2;
        this.f335108g = i0Var;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        return jVar.mo161158Y(i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C111902d2.m152624a(j, this.f335107f);
        C109854n0 K = xVar.mo161155K(C108319b.m146690a(j, 0, this.f335107f ? C108319b.m146697h(j) : Integer.MAX_VALUE, 0, this.f335107f ? Integer.MAX_VALUE : C108319b.m146696g(j), 5, (Object) null));
        int i = K.f328779d;
        int h = C108319b.m146697h(j);
        int i2 = i > h ? h : i;
        int i3 = K.f328780e;
        int g = C108319b.m146696g(j);
        int i4 = i3 > g ? g : i3;
        int i5 = K.f328780e - i4;
        int i6 = K.f328779d - i2;
        if (!this.f335107f) {
            i5 = i6;
        }
        this.f335108g.mo164008g(C112546l.m153761a((float) i2, (float) i4), i5 != 0);
        return C109827a0.C109828a.m149247b(a0Var, i2, i4, (Map) null, new C111936a(this, i5, K), 4, (Object) null);
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: Y */
    public int mo142878Y(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        return jVar.mo161157V(i);
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
        if (!(obj instanceof C111935m2)) {
            return false;
        }
        C111935m2 m2Var = (C111935m2) obj;
        return C87412m.m108589b(this.f335105d, m2Var.f335105d) && this.f335106e == m2Var.f335106e && this.f335107f == m2Var.f335107f && C87412m.m108589b(this.f335108g, m2Var.f335108g);
    }

    public int hashCode() {
        int hashCode = this.f335105d.hashCode() * 31;
        boolean z = this.f335106e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f335107f;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.f335108g.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: s0 */
    public int mo142882s0(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        return jVar.mo161154G(i);
    }

    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f335105d + ", isReversed=" + this.f335106e + ", isVertical=" + this.f335107f + ", overScrollController=" + this.f335108g + ')';
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        return jVar.mo161156S(i);
    }
}
