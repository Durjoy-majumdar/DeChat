package wk1;

import gy3.C87412m;

/* renamed from: wk1.s */
public final class C15477s {

    /* renamed from: a */
    public float f41981a;

    /* renamed from: b */
    public final int f41982b;

    /* renamed from: c */
    public final int f41983c;

    /* renamed from: d */
    public final int f41984d;

    /* renamed from: e */
    public final int f41985e;

    /* renamed from: f */
    public final float f41986f;

    public C15477s(float f, int i, int i2, int i3, int i4, float f2) {
        this.f41981a = f;
        this.f41982b = i;
        this.f41983c = i2;
        this.f41984d = i3;
        this.f41985e = i4;
        this.f41986f = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15477s)) {
            return false;
        }
        C15477s sVar = (C15477s) obj;
        return C87412m.m108589b(Float.valueOf(this.f41981a), Float.valueOf(sVar.f41981a)) && this.f41982b == sVar.f41982b && this.f41983c == sVar.f41983c && this.f41984d == sVar.f41984d && this.f41985e == sVar.f41985e && C87412m.m108589b(Float.valueOf(this.f41986f), Float.valueOf(sVar.f41986f));
    }

    public int hashCode() {
        return (((((((((Float.floatToIntBits(this.f41981a) * 31) + this.f41982b) * 31) + this.f41983c) * 31) + this.f41984d) * 31) + this.f41985e) * 31) + Float.floatToIntBits(this.f41986f);
    }

    public String toString() {
        return "BgParams(bgRadius=" + this.f41981a + ", bgLeftTopColor=" + this.f41982b + ", bgRightBottomColor=" + this.f41983c + ", bgMaskColor=" + this.f41984d + ", borderColor=" + this.f41985e + ", borderWidth=" + this.f41986f + ')';
    }
}
