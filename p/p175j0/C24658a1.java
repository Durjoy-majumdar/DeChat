package p175j0;

import gy3.C87412m;

/* renamed from: j0.a1 */
public final class C24658a1<N> implements C24665d<N> {

    /* renamed from: a */
    public final C24665d<N> f70303a;

    /* renamed from: b */
    public final int f70304b;

    /* renamed from: c */
    public int f70305c;

    public C24658a1(C24665d<N> dVar, int i) {
        C87412m.m108594g(dVar, "applier");
        this.f70303a = dVar;
        this.f70304b = i;
    }

    /* renamed from: a */
    public N mo51484a() {
        return this.f70303a.mo51484a();
    }

    /* renamed from: b */
    public void mo51485b() {
    }

    /* renamed from: c */
    public void mo51486c(int i, N n) {
        this.f70303a.mo51486c(i + (this.f70305c == 0 ? this.f70304b : 0), n);
    }

    public void clear() {
        C24715p.m31027c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    /* renamed from: d */
    public void mo51488d(N n) {
        this.f70305c++;
        this.f70303a.mo51488d(n);
    }

    /* renamed from: e */
    public void mo51489e(int i, int i2) {
        this.f70303a.mo51489e(i + (this.f70305c == 0 ? this.f70304b : 0), i2);
    }

    /* renamed from: f */
    public void mo51490f() {
    }

    /* renamed from: g */
    public void mo51491g(int i, int i2, int i3) {
        int i4 = this.f70305c == 0 ? this.f70304b : 0;
        this.f70303a.mo51491g(i + i4, i2 + i4, i3);
    }

    /* renamed from: h */
    public void mo51492h(int i, N n) {
        this.f70303a.mo51492h(i + (this.f70305c == 0 ? this.f70304b : 0), n);
    }

    /* renamed from: i */
    public void mo51493i() {
        int i = this.f70305c;
        if (i > 0) {
            this.f70305c = i - 1;
            this.f70303a.mo51493i();
            return;
        }
        C24715p.m31027c("OffsetApplier up called with no corresponding down".toString());
        throw null;
    }
}
