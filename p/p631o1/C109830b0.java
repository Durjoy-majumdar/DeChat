package p631o1;

import gy3.C87412m;
import p560i2.C108319b;

/* renamed from: o1.b0 */
public final class C109830b0 implements C109893x {

    /* renamed from: d */
    public final C109846j f328756d;

    /* renamed from: e */
    public final C35081d0 f328757e;

    /* renamed from: f */
    public final C109835e0 f328758f;

    public C109830b0(C109846j jVar, C35081d0 d0Var, C109835e0 e0Var) {
        C87412m.m108594g(jVar, "measurable");
        C87412m.m108594g(d0Var, "minMax");
        C87412m.m108594g(e0Var, "widthHeight");
        this.f328756d = jVar;
        this.f328757e = d0Var;
        this.f328758f = e0Var;
    }

    /* renamed from: G */
    public int mo161154G(int i) {
        return this.f328756d.mo161154G(i);
    }

    /* renamed from: K */
    public C109854n0 mo161155K(long j) {
        C35081d0 d0Var = C35081d0.Max;
        if (this.f328758f == C109835e0.Width) {
            return new C109833c0(this.f328757e == d0Var ? this.f328756d.mo161158Y(C108319b.m146696g(j)) : this.f328756d.mo161154G(C108319b.m146696g(j)), C108319b.m146696g(j));
        }
        return new C109833c0(C108319b.m146697h(j), this.f328757e == d0Var ? this.f328756d.mo161156S(C108319b.m146697h(j)) : this.f328756d.mo161157V(C108319b.m146697h(j)));
    }

    /* renamed from: S */
    public int mo161156S(int i) {
        return this.f328756d.mo161156S(i);
    }

    /* renamed from: V */
    public int mo161157V(int i) {
        return this.f328756d.mo161157V(i);
    }

    /* renamed from: Y */
    public int mo161158Y(int i) {
        return this.f328756d.mo161158Y(i);
    }

    /* renamed from: c */
    public Object mo161159c() {
        return this.f328756d.mo161159c();
    }
}
