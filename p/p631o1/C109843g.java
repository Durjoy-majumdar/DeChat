package p631o1;

import gy3.C87412m;
import p560i2.C108319b;

/* renamed from: o1.g */
public final class C109843g implements C109893x {

    /* renamed from: d */
    public final C109846j f328769d;

    /* renamed from: e */
    public final C35082l f328770e;

    /* renamed from: f */
    public final C109851m f328771f;

    public C109843g(C109846j jVar, C35082l lVar, C109851m mVar) {
        C87412m.m108594g(jVar, "measurable");
        C87412m.m108594g(lVar, "minMax");
        C87412m.m108594g(mVar, "widthHeight");
        this.f328769d = jVar;
        this.f328770e = lVar;
        this.f328771f = mVar;
    }

    /* renamed from: G */
    public int mo161154G(int i) {
        return this.f328769d.mo161154G(i);
    }

    /* renamed from: K */
    public C109854n0 mo161155K(long j) {
        C35082l lVar = C35082l.Max;
        if (this.f328771f == C109851m.Width) {
            return new C109844h(this.f328770e == lVar ? this.f328769d.mo161158Y(C108319b.m146696g(j)) : this.f328769d.mo161154G(C108319b.m146696g(j)), C108319b.m146696g(j));
        }
        return new C109844h(C108319b.m146697h(j), this.f328770e == lVar ? this.f328769d.mo161156S(C108319b.m146697h(j)) : this.f328769d.mo161157V(C108319b.m146697h(j)));
    }

    /* renamed from: S */
    public int mo161156S(int i) {
        return this.f328769d.mo161156S(i);
    }

    /* renamed from: V */
    public int mo161157V(int i) {
        return this.f328769d.mo161157V(i);
    }

    /* renamed from: Y */
    public int mo161158Y(int i) {
        return this.f328769d.mo161158Y(i);
    }

    /* renamed from: c */
    public Object mo161159c() {
        return this.f328769d.mo161159c();
    }
}
