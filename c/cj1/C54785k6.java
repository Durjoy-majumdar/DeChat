package cj1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: cj1.k6 */
public final class C54785k6 {

    /* renamed from: a */
    public String f153566a;

    /* renamed from: b */
    public long f153567b;

    /* renamed from: c */
    public int f153568c;

    /* renamed from: d */
    public boolean f153569d;

    /* renamed from: e */
    public boolean f153570e;

    /* renamed from: f */
    public boolean f153571f;

    /* renamed from: g */
    public boolean f153572g;

    /* renamed from: h */
    public String f153573h;

    public C54785k6(String str, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, C8480h hVar) {
        i = (i2 & 4) != 0 ? 3 : i;
        z = (i2 & 8) != 0 ? false : z;
        z2 = (i2 & 16) != 0 ? true : z2;
        z3 = (i2 & 32) != 0 ? false : z3;
        z4 = (i2 & 64) != 0 ? false : z4;
        str2 = (i2 & 128) != 0 ? null : str2;
        C87412m.m108594g(str, "songName");
        this.f153566a = str;
        this.f153567b = j;
        this.f153568c = i;
        this.f153569d = z;
        this.f153570e = z2;
        this.f153571f = z3;
        this.f153572g = z4;
        this.f153573h = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54785k6)) {
            return false;
        }
        C54785k6 k6Var = (C54785k6) obj;
        return C87412m.m108589b(this.f153566a, k6Var.f153566a) && this.f153567b == k6Var.f153567b && this.f153568c == k6Var.f153568c && this.f153569d == k6Var.f153569d && this.f153570e == k6Var.f153570e && this.f153571f == k6Var.f153571f && this.f153572g == k6Var.f153572g && C87412m.m108589b(this.f153573h, k6Var.f153573h);
    }

    public int hashCode() {
        long j = this.f153567b;
        int hashCode = ((((this.f153566a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f153568c) * 31;
        boolean z = this.f153569d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f153570e;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f153571f;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f153572g;
        if (!z5) {
            z2 = z5;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        String str = this.f153573h;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "songName :" + this.f153566a + ", heat: " + this.f153567b + ", select:" + this.f153569d;
    }
}
