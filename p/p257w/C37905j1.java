package p257w;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: w.j1 */
public final class C37905j1<T> implements C37948y<T> {

    /* renamed from: a */
    public final int f100318a;

    /* renamed from: b */
    public final int f100319b;

    /* renamed from: c */
    public final C37950z f100320c;

    public C37905j1() {
        this(0, 0, (C37950z) null, 7, (C8480h) null);
    }

    public C37905j1(int i, int i2, C37950z zVar) {
        C87412m.m108594g(zVar, "easing");
        this.f100318a = i;
        this.f100319b = i2;
        this.f100320c = zVar;
    }

    /* renamed from: a */
    public C37918n1 mo61393a(C37906k1 k1Var) {
        C87412m.m108594g(k1Var, "converter");
        return new C37949y1(this.f100318a, this.f100319b, this.f100320c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C37905j1)) {
            return false;
        }
        C37905j1 j1Var = (C37905j1) obj;
        return j1Var.f100318a == this.f100318a && j1Var.f100319b == this.f100319b && C87412m.m108589b(j1Var.f100320c, this.f100320c);
    }

    public int hashCode() {
        return (((this.f100318a * 31) + this.f100320c.hashCode()) * 31) + this.f100319b;
    }

    /* renamed from: a */
    public C37931s1 m41597a(C37906k1 k1Var) {
        C87412m.m108594g(k1Var, "converter");
        return new C37949y1(this.f100318a, this.f100319b, this.f100320c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37905j1(int i, int i2, C37950z zVar, int i3, C8480h hVar) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C37890a0.f100293a : zVar);
    }
}
