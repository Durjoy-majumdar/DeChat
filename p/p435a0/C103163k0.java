package p435a0;

import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
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

/* renamed from: a0.k0 */
public final class C103163k0 extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final float f304315e;

    /* renamed from: f */
    public final float f304316f;

    /* renamed from: g */
    public final boolean f304317g;

    /* renamed from: a0.k0$a */
    public static final class C103164a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103163k0 f304318d;

        /* renamed from: e */
        public final /* synthetic */ C109854n0 f304319e;

        /* renamed from: f */
        public final /* synthetic */ C109827a0 f304320f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103164a(C103163k0 k0Var, C109854n0 n0Var, C109827a0 a0Var) {
            super(1);
            this.f304318d = k0Var;
            this.f304319e = n0Var;
            this.f304320f = a0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C103163k0 k0Var = this.f304318d;
            if (k0Var.f304317g) {
                C109854n0.C109855a.m149306f(aVar, this.f304319e, this.f304320f.mo143032M(k0Var.f304315e), this.f304320f.mo143032M(this.f304318d.f304316f), 0.0f, 4, (Object) null);
            } else {
                C109854n0.C109855a.m149304c(aVar, this.f304319e, this.f304320f.mo143032M(k0Var.f304315e), this.f304320f.mo143032M(this.f304318d.f304316f), 0.0f, 4, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C103163k0(float f, float f2, boolean z, C32226l lVar, C8480h hVar) {
        super(lVar);
        this.f304315e = f;
        this.f304316f = f2;
        this.f304317g = z;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        C109854n0 K = xVar.mo161155K(j);
        return C109827a0.C109828a.m149247b(a0Var, K.f328779d, K.f328780e, (Map) null, new C103164a(this, K, a0Var), 4, (Object) null);
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
        C103163k0 k0Var = obj instanceof C103163k0 ? (C103163k0) obj : null;
        return k0Var != null && C108325f.m146734a(this.f304315e, k0Var.f304315e) && C108325f.m146734a(this.f304316f, k0Var.f304316f) && this.f304317g == k0Var.f304317g;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f304315e) * 31) + Float.floatToIntBits(this.f304316f)) * 31) + (this.f304317g ? 1231 : 1237);
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
        return "OffsetModifier(x=" + C108325f.m146735b(this.f304315e) + ", y=" + C108325f.m146735b(this.f304316f) + ", rtlAware=" + this.f304317g + ')';
    }

    /* renamed from: v */
    public int mo142883v(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149337a(this, kVar, jVar, i);
    }
}
