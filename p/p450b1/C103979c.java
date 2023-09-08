package p450b1;

import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: b1.c */
public abstract class C103979c {

    /* renamed from: a */
    public final String f307535a;

    /* renamed from: b */
    public final long f307536b;

    /* renamed from: c */
    public final int f307537c;

    public C103979c(String str, long j, int i, C8480h hVar) {
        this.f307535a = str;
        this.f307536b = j;
        this.f307537c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* renamed from: a */
    public abstract float[] mo145584a(float[] fArr);

    /* renamed from: b */
    public abstract float mo145585b(int i);

    /* renamed from: c */
    public abstract float mo145586c(int i);

    /* renamed from: d */
    public boolean mo145587d() {
        return false;
    }

    /* renamed from: e */
    public abstract float[] mo145588e(float[] fArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C87412m.m108589b(C24560g0.m30725a(getClass()), C24560g0.m30725a(obj.getClass()))) {
            return false;
        }
        C103979c cVar = (C103979c) obj;
        if (this.f307537c == cVar.f307537c && C87412m.m108589b(this.f307535a, cVar.f307535a)) {
            return C103978b.m138706a(this.f307536b, cVar.f307536b);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f307536b;
        int i = C103978b.f307534e;
        return (((this.f307535a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f307537c;
    }

    public String toString() {
        return this.f307535a + " (id=" + this.f307537c + ", model=" + C103978b.m138707b(this.f307536b) + ')';
    }
}
