package p257w;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: w.w0 */
public final class C37944w0<T> implements C37892b0<T> {

    /* renamed from: a */
    public final float f100392a;

    /* renamed from: b */
    public final float f100393b;

    /* renamed from: c */
    public final T f100394c;

    public C37944w0() {
        this(0.0f, 0.0f, (Object) null, 7, (C8480h) null);
    }

    public C37944w0(float f, float f2, T t) {
        this.f100392a = f;
        this.f100393b = f2;
        this.f100394c = t;
    }

    /* renamed from: a */
    public C37918n1 mo61393a(C37906k1 k1Var) {
        C87412m.m108594g(k1Var, "converter");
        float f = this.f100392a;
        float f2 = this.f100393b;
        T t = this.f100394c;
        return new C37947x1(f, f2, t == null ? null : (C37919o) k1Var.mo61399a().invoke(t));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C37944w0) {
            C37944w0 w0Var = (C37944w0) obj;
            if (w0Var.f100392a == this.f100392a) {
                return ((w0Var.f100393b > this.f100393b ? 1 : (w0Var.f100393b == this.f100393b ? 0 : -1)) == 0) && C87412m.m108589b(w0Var.f100394c, this.f100394c);
            }
        }
    }

    public int hashCode() {
        T t = this.f100394c;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.floatToIntBits(this.f100392a)) * 31) + Float.floatToIntBits(this.f100393b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37944w0(float f, float f2, Object obj, int i, C8480h hVar) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
