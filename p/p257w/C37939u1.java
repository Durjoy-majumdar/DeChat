package p257w;

import gy3.C87412m;
import p257w.C37919o;

/* renamed from: w.u1 */
public final class C37939u1<V extends C37919o> implements C37928r1<V> {

    /* renamed from: a */
    public final C37896d0 f100375a;

    /* renamed from: b */
    public V f100376b;

    /* renamed from: c */
    public V f100377c;

    /* renamed from: d */
    public V f100378d;

    /* renamed from: e */
    public final float f100379e;

    public C37939u1(C37896d0 d0Var) {
        C87412m.m108594g(d0Var, "floatDecaySpec");
        this.f100375a = d0Var;
        this.f100379e = d0Var.mo61249a();
    }

    /* renamed from: a */
    public float mo61426a() {
        return this.f100379e;
    }

    /* renamed from: b */
    public V mo61427b(long j, V v, V v2) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "initialVelocity");
        if (this.f100377c == null) {
            this.f100377c = v.mo61403c();
        }
        int i = 0;
        V v3 = this.f100377c;
        if (v3 != null) {
            int b = v3.mo61402b();
            while (i < b) {
                V v4 = this.f100377c;
                if (v4 != null) {
                    v4.mo61405e(i, this.f100375a.mo61252d(j, v.mo61401a(i), v2.mo61401a(i)));
                    i++;
                } else {
                    C87412m.m108603p("velocityVector");
                    throw null;
                }
            }
            V v5 = this.f100377c;
            if (v5 != null) {
                return v5;
            }
            C87412m.m108603p("velocityVector");
            throw null;
        }
        C87412m.m108603p("velocityVector");
        throw null;
    }

    /* renamed from: c */
    public long mo61428c(V v, V v2) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "initialVelocity");
        if (this.f100377c == null) {
            this.f100377c = v.mo61403c();
        }
        V v3 = this.f100377c;
        if (v3 != null) {
            int b = v3.mo61402b();
            long j = 0;
            for (int i = 0; i < b; i++) {
                j = Math.max(j, this.f100375a.mo61253e(v.mo61401a(i), v2.mo61401a(i)));
            }
            return j;
        }
        C87412m.m108603p("velocityVector");
        throw null;
    }

    /* renamed from: d */
    public V mo61429d(V v, V v2) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "initialVelocity");
        if (this.f100378d == null) {
            this.f100378d = v.mo61403c();
        }
        int i = 0;
        V v3 = this.f100378d;
        if (v3 != null) {
            int b = v3.mo61402b();
            while (i < b) {
                V v4 = this.f100378d;
                if (v4 != null) {
                    v4.mo61405e(i, this.f100375a.mo61250b(v.mo61401a(i), v2.mo61401a(i)));
                    i++;
                } else {
                    C87412m.m108603p("targetVector");
                    throw null;
                }
            }
            V v5 = this.f100378d;
            if (v5 != null) {
                return v5;
            }
            C87412m.m108603p("targetVector");
            throw null;
        }
        C87412m.m108603p("targetVector");
        throw null;
    }

    /* renamed from: e */
    public V mo61430e(long j, V v, V v2) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "initialVelocity");
        if (this.f100376b == null) {
            this.f100376b = v.mo61403c();
        }
        int i = 0;
        V v3 = this.f100376b;
        if (v3 != null) {
            int b = v3.mo61402b();
            while (i < b) {
                V v4 = this.f100376b;
                if (v4 != null) {
                    v4.mo61405e(i, this.f100375a.mo61251c(j, v.mo61401a(i), v2.mo61401a(i)));
                    i++;
                } else {
                    C87412m.m108603p("valueVector");
                    throw null;
                }
            }
            V v5 = this.f100376b;
            if (v5 != null) {
                return v5;
            }
            C87412m.m108603p("valueVector");
            throw null;
        }
        C87412m.m108603p("valueVector");
        throw null;
    }
}
