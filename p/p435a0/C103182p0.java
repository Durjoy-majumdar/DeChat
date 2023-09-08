package p435a0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p560i2.C108321c;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.p0 */
public final class C103182p0 extends C54172f1 implements C109866r {

    /* renamed from: e */
    public final C103177n0 f304348e;

    /* renamed from: a0.p0$a */
    public static final class C103183a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109854n0 f304349d;

        /* renamed from: e */
        public final /* synthetic */ C109827a0 f304350e;

        /* renamed from: f */
        public final /* synthetic */ C103182p0 f304351f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103183a(C109854n0 n0Var, C109827a0 a0Var, C103182p0 p0Var) {
            super(1);
            this.f304349d = n0Var;
            this.f304350e = a0Var;
            this.f304351f = p0Var;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0 n0Var = this.f304349d;
            C109827a0 a0Var = this.f304350e;
            C109854n0.C109855a.m149304c(aVar, n0Var, a0Var.mo143032M(this.f304351f.f304348e.mo142919a(a0Var.getLayoutDirection())), this.f304350e.mo143032M(this.f304351f.f304348e.mo142922d()), 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103182p0(C103177n0 n0Var, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(n0Var, "paddingValues");
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f304348e = n0Var;
    }

    /* renamed from: E */
    public int mo142876E(C109848k kVar, C109846j jVar, int i) {
        return C109866r.C109867a.m149338b(this, kVar, jVar, i);
    }

    /* renamed from: G */
    public C109899z mo142877G(C109827a0 a0Var, C109893x xVar, long j) {
        C87412m.m108594g(a0Var, "$this$measure");
        C87412m.m108594g(xVar, "measurable");
        boolean z = false;
        float f = (float) 0;
        if (Float.compare(this.f304348e.mo142919a(a0Var.getLayoutDirection()), f) >= 0 && Float.compare(this.f304348e.mo142922d(), f) >= 0 && Float.compare(this.f304348e.mo142920b(a0Var.getLayoutDirection()), f) >= 0 && Float.compare(this.f304348e.mo142921c(), f) >= 0) {
            z = true;
        }
        if (z) {
            int M = a0Var.mo143032M(this.f304348e.mo142919a(a0Var.getLayoutDirection())) + a0Var.mo143032M(this.f304348e.mo142920b(a0Var.getLayoutDirection()));
            int M2 = a0Var.mo143032M(this.f304348e.mo142922d()) + a0Var.mo143032M(this.f304348e.mo142921c());
            C109854n0 K = xVar.mo161155K(C108321c.m146710g(j, -M, -M2));
            return C109827a0.C109828a.m149247b(a0Var, C108321c.m146708e(j, K.f328779d + M), C108321c.m146707d(j, K.f328780e + M2), (Map) null, new C103183a(K, a0Var, this), 4, (Object) null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
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
        C103182p0 p0Var = obj instanceof C103182p0 ? (C103182p0) obj : null;
        if (p0Var == null) {
            return false;
        }
        return C87412m.m108589b(this.f304348e, p0Var.f304348e);
    }

    public int hashCode() {
        return this.f304348e.hashCode();
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
