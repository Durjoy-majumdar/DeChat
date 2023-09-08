package p1166z0;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: z0.i */
public final class C112543i {

    /* renamed from: a */
    public final float f336965a;

    /* renamed from: b */
    public final float f336966b;

    /* renamed from: c */
    public final float f336967c;

    /* renamed from: d */
    public final float f336968d;

    /* renamed from: e */
    public final long f336969e;

    /* renamed from: f */
    public final long f336970f;

    /* renamed from: g */
    public final long f336971g;

    /* renamed from: h */
    public final long f336972h;

    static {
        int i = C112535a.f336950b;
        C112544j.m153753a(0.0f, 0.0f, 0.0f, 0.0f, C112535a.f336949a);
    }

    public C112543i(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, C8480h hVar) {
        this.f336965a = f;
        this.f336966b = f2;
        this.f336967c = f3;
        this.f336968d = f4;
        this.f336969e = j;
        this.f336970f = j2;
        this.f336971g = j3;
        this.f336972h = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112543i)) {
            return false;
        }
        C112543i iVar = (C112543i) obj;
        return C87412m.m108589b(Float.valueOf(this.f336965a), Float.valueOf(iVar.f336965a)) && C87412m.m108589b(Float.valueOf(this.f336966b), Float.valueOf(iVar.f336966b)) && C87412m.m108589b(Float.valueOf(this.f336967c), Float.valueOf(iVar.f336967c)) && C87412m.m108589b(Float.valueOf(this.f336968d), Float.valueOf(iVar.f336968d)) && C112535a.m153727a(this.f336969e, iVar.f336969e) && C112535a.m153727a(this.f336970f, iVar.f336970f) && C112535a.m153727a(this.f336971g, iVar.f336971g) && C112535a.m153727a(this.f336972h, iVar.f336972h);
    }

    public int hashCode() {
        long j = this.f336969e;
        long j2 = this.f336970f;
        long j3 = this.f336971g;
        long j4 = this.f336972h;
        return (((((((((((((Float.floatToIntBits(this.f336965a) * 31) + Float.floatToIntBits(this.f336966b)) * 31) + Float.floatToIntBits(this.f336967c)) * 31) + Float.floatToIntBits(this.f336968d)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        long j = this.f336969e;
        long j2 = this.f336970f;
        long j3 = this.f336971g;
        long j4 = this.f336972h;
        String str = C112537c.m153733a(this.f336965a, 1) + ", " + C112537c.m153733a(this.f336966b, 1) + ", " + C112537c.m153733a(this.f336967c, 1) + ", " + C112537c.m153733a(this.f336968d, 1);
        if (!C112535a.m153727a(j, j2) || !C112535a.m153727a(j2, j3) || !C112535a.m153727a(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + C112535a.m153730d(j) + ", topRight=" + C112535a.m153730d(j2) + ", bottomRight=" + C112535a.m153730d(j3) + ", bottomLeft=" + C112535a.m153730d(j4) + ')';
        }
        if (C112535a.m153728b(j) == C112535a.m153729c(j)) {
            return "RoundRect(rect=" + str + ", radius=" + C112537c.m153733a(C112535a.m153728b(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + C112537c.m153733a(C112535a.m153728b(j), 1) + ", y=" + C112537c.m153733a(C112535a.m153729c(j), 1) + ')';
    }
}
