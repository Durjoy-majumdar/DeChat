package p543h0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.Map;
import p560i2.C108328i;
import p631o1.C109827a0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109866r;
import p631o1.C109893x;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: h0.x */
public final class C107982x implements C109866r {

    /* renamed from: d */
    public final long f323363d;

    /* renamed from: h0.x$a */
    public static final class C107983a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f323364d;

        /* renamed from: e */
        public final /* synthetic */ C109854n0 f323365e;

        /* renamed from: f */
        public final /* synthetic */ int f323366f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107983a(int i, C109854n0 n0Var, int i2) {
            super(1);
            this.f323364d = i;
            this.f323365e = n0Var;
            this.f323366f = i2;
        }

        public Object invoke(Object obj) {
            C109854n0.C109855a aVar = (C109854n0.C109855a) obj;
            C87412m.m108594g(aVar, "$this$layout");
            C109854n0.C109855a.m149304c(aVar, this.f323365e, C60641c.m70921b(((float) (this.f323364d - this.f323365e.f328779d)) / 2.0f), C60641c.m70921b(((float) (this.f323366f - this.f323365e.f328780e)) / 2.0f), 0.0f, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C107982x(long j, C8480h hVar) {
        this.f323363d = j;
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
        int max = Math.max(K.f328779d, a0Var.mo143032M(C108328i.m146741b(this.f323363d)));
        int max2 = Math.max(K.f328780e, a0Var.mo143032M(C108328i.m146740a(this.f323363d)));
        return C109827a0.C109828a.m149247b(a0Var, max, max2, (Map) null, new C107983a(max, K, max2), 4, (Object) null);
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
        C107982x xVar = obj instanceof C107982x ? (C107982x) obj : null;
        if (xVar == null) {
            return false;
        }
        long j = this.f323363d;
        long j2 = xVar.f323363d;
        int i = C108328i.f324352d;
        return j == j2;
    }

    public int hashCode() {
        long j = this.f323363d;
        int i = C108328i.f324352d;
        return (int) (j ^ (j >>> 32));
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
