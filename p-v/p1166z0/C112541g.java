package p1166z0;

import gy3.C87412m;

/* renamed from: z0.g */
public final class C112541g {

    /* renamed from: e */
    public static final C112541g f336960e = new C112541g(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public final float f336961a;

    /* renamed from: b */
    public final float f336962b;

    /* renamed from: c */
    public final float f336963c;

    /* renamed from: d */
    public final float f336964d;

    public C112541g(float f, float f2, float f3, float f4) {
        this.f336961a = f;
        this.f336962b = f2;
        this.f336963c = f3;
        this.f336964d = f4;
    }

    /* renamed from: a */
    public final long mo164260a() {
        float f = this.f336961a;
        float f2 = f + ((this.f336963c - f) / 2.0f);
        float f3 = this.f336962b;
        return C112540f.m153745a(f2, f3 + ((this.f336964d - f3) / 2.0f));
    }

    /* renamed from: b */
    public final boolean mo164261b(C112541g gVar) {
        C87412m.m108594g(gVar, "other");
        return this.f336963c > gVar.f336961a && gVar.f336963c > this.f336961a && this.f336964d > gVar.f336962b && gVar.f336964d > this.f336962b;
    }

    /* renamed from: c */
    public final C112541g mo164262c(float f, float f2) {
        return new C112541g(this.f336961a + f, this.f336962b + f2, this.f336963c + f, this.f336964d + f2);
    }

    /* renamed from: d */
    public final C112541g mo164263d(long j) {
        return new C112541g(this.f336961a + C112539e.m153738c(j), this.f336962b + C112539e.m153739d(j), this.f336963c + C112539e.m153738c(j), this.f336964d + C112539e.m153739d(j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112541g)) {
            return false;
        }
        C112541g gVar = (C112541g) obj;
        return C87412m.m108589b(Float.valueOf(this.f336961a), Float.valueOf(gVar.f336961a)) && C87412m.m108589b(Float.valueOf(this.f336962b), Float.valueOf(gVar.f336962b)) && C87412m.m108589b(Float.valueOf(this.f336963c), Float.valueOf(gVar.f336963c)) && C87412m.m108589b(Float.valueOf(this.f336964d), Float.valueOf(gVar.f336964d));
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f336961a) * 31) + Float.floatToIntBits(this.f336962b)) * 31) + Float.floatToIntBits(this.f336963c)) * 31) + Float.floatToIntBits(this.f336964d);
    }

    public String toString() {
        return "Rect.fromLTRB(" + C112537c.m153733a(this.f336961a, 1) + ", " + C112537c.m153733a(this.f336962b, 1) + ", " + C112537c.m153733a(this.f336963c, 1) + ", " + C112537c.m153733a(this.f336964d, 1) + ')';
    }
}
