package wn3;

import gy3.C87412m;

/* renamed from: wn3.a */
public final class C15568a {

    /* renamed from: a */
    public final CharSequence f42172a;

    /* renamed from: b */
    public final int f42173b;

    /* renamed from: c */
    public final int f42174c;

    /* renamed from: d */
    public final int f42175d;

    /* renamed from: e */
    public final float f42176e;

    public C15568a(CharSequence charSequence, int i, int i2, int i3, float f) {
        this.f42172a = charSequence;
        this.f42173b = i;
        this.f42174c = i2;
        this.f42175d = i3;
        this.f42176e = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15568a)) {
            return false;
        }
        C15568a aVar = (C15568a) obj;
        return C87412m.m108589b(this.f42172a, aVar.f42172a) && this.f42173b == aVar.f42173b && this.f42174c == aVar.f42174c && this.f42175d == aVar.f42175d && C87412m.m108589b(Float.valueOf(this.f42176e), Float.valueOf(aVar.f42176e));
    }

    public int hashCode() {
        CharSequence charSequence = this.f42172a;
        return ((((((((charSequence == null ? 0 : charSequence.hashCode()) * 31) + this.f42173b) * 31) + this.f42174c) * 31) + this.f42175d) * 31) + Float.floatToIntBits(this.f42176e);
    }

    public String toString() {
        return "VasActionBarData(title=" + this.f42172a + ", mapBackBtnIconColor=" + this.f42173b + ", backColor=" + this.f42174c + ", textColor=" + this.f42175d + ", titleTextSize=" + this.f42176e + ')';
    }
}
