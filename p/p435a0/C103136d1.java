package p435a0;

import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p560i2.C108319b;
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

/* renamed from: a0.d1 */
public final class C103136d1 extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final float f304267e;

    /* renamed from: f */
    public final float f304268f;

    /* renamed from: a0.d1$a */
    public static final class C103137a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f304269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103137a(C109854n0 n0Var) {
            super(1);
            this.f304269d = n0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149306f(aVar, this.f304269d, 0, 0, 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C103136d1(float f, float f2, C32226l lVar, C8480h hVar) {
        super(lVar);
        this.f304267e = f;
        this.f304268f = f2;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        int Y = jVar.mo161158Y(i);
        int M = !C108325f.m146734a(this.f304267e, Float.NaN) ? kVar.mo143032M(this.f304267e) : 0;
        return Y < M ? M : Y;
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        int i;
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        int i2 = 0;
        if (C108325f.m146734a(this.f304267e, Float.NaN) || C108319b.m146699j(j) != 0) {
            i = C108319b.m146699j(j);
        } else {
            i = a0Var.mo143032M(this.f304267e);
            int h = C108319b.m146697h(j);
            if (i > h) {
                i = h;
            }
            if (i < 0) {
                i = 0;
            }
        }
        int h2 = C108319b.m146697h(j);
        if (C108325f.m146734a(this.f304268f, Float.NaN) || C108319b.m146698i(j) != 0) {
            i2 = C108319b.m146698i(j);
        } else {
            int M = a0Var.mo143032M(this.f304268f);
            int g = C108319b.m146696g(j);
            if (M > g) {
                M = g;
            }
            if (M >= 0) {
                i2 = M;
            }
        }
        C109854n0 K = xVar.mo161155K(C108321c.m146704a(i, h2, i2, C108319b.m146696g(j)));
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C103137a(K), 4, (Object) null);
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
        int V = jVar.mo161157V(i);
        int M = !C108325f.m146734a(this.f304268f, Float.NaN) ? kVar.mo143032M(this.f304268f) : 0;
        return V < M ? M : V;
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
        if (!(obj instanceof C103136d1)) {
            return false;
        }
        C103136d1 d1Var = (C103136d1) obj;
        return C108325f.m146734a(this.f304267e, d1Var.f304267e) && C108325f.m146734a(this.f304268f, d1Var.f304268f);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f304267e) * 31) + Float.floatToIntBits(this.f304268f);
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
        int G = jVar.mo161154G(i);
        int M = !C108325f.m146734a(this.f304267e, Float.NaN) ? kVar.mo143032M(this.f304267e) : 0;
        return G < M ? M : G;
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        C87412m.m108594g(kVar, "<this>");
        C87412m.m108594g(jVar, "measurable");
        int S = jVar.mo161156S(i);
        int M = !C108325f.m146734a(this.f304268f, Float.NaN) ? kVar.mo143032M(this.f304268f) : 0;
        return S < M ? M : S;
    }
}
