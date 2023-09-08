package p257w;

import gy3.C87412m;
import p257w.C37919o;
import p257w.C37931s1;

/* renamed from: w.y1 */
public final class C37949y1<V extends C37919o> implements C37931s1<V> {

    /* renamed from: a */
    public final int f100401a;

    /* renamed from: b */
    public final int f100402b;

    /* renamed from: c */
    public final C37950z f100403c;

    /* renamed from: d */
    public final C37935t1<V> f100404d;

    public C37949y1(int i, int i2, C37950z zVar) {
        C87412m.m108594g(zVar, "easing");
        this.f100401a = i;
        this.f100402b = i2;
        this.f100403c = zVar;
        this.f100404d = new C37935t1<>((C37894c0) new C37900f0(i, i2, zVar));
    }

    /* renamed from: a */
    public boolean mo61417a() {
        return false;
    }

    /* renamed from: b */
    public V mo61418b(long j, V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        return this.f100404d.mo61418b(j, v, v2, v3);
    }

    /* renamed from: c */
    public V mo61419c(long j, V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        return this.f100404d.mo61419c(j, v, v2, v3);
    }

    /* renamed from: d */
    public long mo61420d(V v, V v2, V v3) {
        return C37931s1.C37932a.m41629a(this, v, v2, v3);
    }

    /* renamed from: e */
    public int mo61431e() {
        return this.f100402b;
    }

    /* renamed from: f */
    public int mo61432f() {
        return this.f100401a;
    }

    /* renamed from: g */
    public V mo61421g(V v, V v2, V v3) {
        C87412m.m108594g(v, "initialValue");
        C87412m.m108594g(v2, "targetValue");
        C87412m.m108594g(v3, "initialVelocity");
        return mo61419c(mo61420d(v, v2, v3), v, v2, v3);
    }
}
