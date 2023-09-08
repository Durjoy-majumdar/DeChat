package p257w;

import gy3.C87412m;
import my3.C61595o;
import p257w.C111636d;
import p257w.C37919o;

/* renamed from: w.u */
public final class C37937u<T, V extends C37919o> implements C111636d<T, V> {

    /* renamed from: a */
    public final C37928r1<V> f100363a;

    /* renamed from: b */
    public final C37906k1<T, V> f100364b;

    /* renamed from: c */
    public final T f100365c;

    /* renamed from: d */
    public final V f100366d;

    /* renamed from: e */
    public final V f100367e;

    /* renamed from: f */
    public final V f100368f;

    /* renamed from: g */
    public final T f100369g;

    /* renamed from: h */
    public final long f100370h;

    public C37937u(C37940v<T> vVar, C37906k1<T, V> k1Var, T t, V v) {
        C87412m.m108594g(vVar, "animationSpec");
        C87412m.m108594g(k1Var, "typeConverter");
        C87412m.m108594g(v, "initialVelocityVector");
        C37928r1<V> a = vVar.mo61435a(k1Var);
        C87412m.m108594g(a, "animationSpec");
        this.f100363a = a;
        this.f100364b = k1Var;
        this.f100365c = t;
        V v2 = (C37919o) k1Var.mo61399a().invoke(t);
        this.f100366d = v2;
        this.f100367e = C37921p.m41619a(v);
        this.f100369g = k1Var.mo61400b().invoke(a.mo61429d(v2, v));
        long c = a.mo61428c(v2, v);
        this.f100370h = c;
        V a2 = C37921p.m41619a(a.mo61427b(c, v2, v));
        this.f100368f = a2;
        int b = a2.mo61402b();
        for (int i = 0; i < b; i++) {
            V v3 = this.f100368f;
            v3.mo61405e(i, C61595o.m72296d(v3.mo61401a(i), -this.f100363a.mo61426a(), this.f100363a.mo61426a()));
        }
    }

    /* renamed from: a */
    public boolean mo61381a() {
        return false;
    }

    /* renamed from: b */
    public long mo61382b() {
        return this.f100370h;
    }

    /* renamed from: c */
    public boolean mo61383c(long j) {
        return C111636d.C37895a.m41575a(this, j);
    }

    /* renamed from: d */
    public C37906k1<T, V> mo61384d() {
        return this.f100364b;
    }

    /* renamed from: e */
    public T mo61385e(long j) {
        return !C111636d.C37895a.m41575a(this, j) ? this.f100364b.mo61400b().invoke(this.f100363a.mo61430e(j, this.f100366d, this.f100367e)) : this.f100369g;
    }

    /* renamed from: f */
    public T mo61386f() {
        return this.f100369g;
    }

    /* renamed from: g */
    public V mo61387g(long j) {
        return !C111636d.C37895a.m41575a(this, j) ? this.f100363a.mo61427b(j, this.f100366d, this.f100367e) : this.f100368f;
    }
}
