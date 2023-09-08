package p435a0;

import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p560i2.C108321c;
import p560i2.C108325f;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.m0 */
public final class C103174m0 extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final float f304328e;

    /* renamed from: f */
    public final float f304329f;

    /* renamed from: g */
    public final float f304330g;

    /* renamed from: h */
    public final float f304331h;

    /* renamed from: i */
    public final boolean f304332i;

    /* renamed from: a0.m0$a */
    public static final class C103175a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103174m0 f304333d;

        /* renamed from: e */
        public final /* synthetic */ C109854n0 f304334e;

        /* renamed from: f */
        public final /* synthetic */ C109827a0 f304335f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103175a(C103174m0 m0Var, C109854n0 n0Var, C109827a0 a0Var) {
            super(1);
            this.f304333d = m0Var;
            this.f304334e = n0Var;
            this.f304335f = a0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C103174m0 m0Var = this.f304333d;
            if (m0Var.f304332i) {
                C109854n0.C109855a.m149306f(aVar, this.f304334e, this.f304335f.mo143032M(m0Var.f304328e), this.f304335f.mo143032M(this.f304333d.f304329f), 0.0f, 4, (Object) null);
            } else {
                C109854n0.C109855a.m149304c(aVar, this.f304334e, this.f304335f.mo143032M(m0Var.f304328e), this.f304335f.mo143032M(this.f304333d.f304329f), 0.0f, 4, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C103174m0(float f, float f2, float f3, float f4, boolean z, C32226l lVar, C8480h hVar) {
        super(lVar);
        this.f304328e = f;
        this.f304329f = f2;
        this.f304330g = f3;
        this.f304331h = f4;
        this.f304332i = z;
        if (!((f >= 0.0f || C108325f.m146734a(f, Float.NaN)) && (f2 >= 0.0f || C108325f.m146734a(f2, Float.NaN)) && ((f3 >= 0.0f || C108325f.m146734a(f3, Float.NaN)) && (f4 >= 0.0f || C108325f.m146734a(f4, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        int M = a0Var.mo143032M(this.f304328e) + a0Var.mo143032M(this.f304330g);
        int M2 = a0Var.mo143032M(this.f304329f) + a0Var.mo143032M(this.f304331h);
        C109854n0 K = xVar.mo161155K(C108321c.m146710g(j, -M, -M2));
        return C109827a0.C109828a.m149247b(a0Var, C108321c.m146708e(j, K.f328779d + M), C108321c.m146707d(j, K.f328780e + M2), (Map) null, new C103175a(this, K, a0Var), 4, (Object) null);
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
        C103174m0 m0Var = obj instanceof C103174m0 ? (C103174m0) obj : null;
        return m0Var != null && C108325f.m146734a(this.f304328e, m0Var.f304328e) && C108325f.m146734a(this.f304329f, m0Var.f304329f) && C108325f.m146734a(this.f304330g, m0Var.f304330g) && C108325f.m146734a(this.f304331h, m0Var.f304331h) && this.f304332i == m0Var.f304332i;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.f304328e) * 31) + Float.floatToIntBits(this.f304329f)) * 31) + Float.floatToIntBits(this.f304330g)) * 31) + Float.floatToIntBits(this.f304331h)) * 31) + (this.f304332i ? 1231 : 1237);
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

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149337a(this, kVar, jVar, i);
    }
}
