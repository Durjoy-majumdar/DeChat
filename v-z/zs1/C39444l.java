package zs1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: zs1.l */
public final class C39444l {

    /* renamed from: a */
    public final int f105948a;

    /* renamed from: b */
    public final float f105949b;

    /* renamed from: c */
    public final boolean f105950c;

    public C39444l() {
        this(0, 0.0f, false, 7, (C8480h) null);
    }

    public C39444l(int i, float f, boolean z, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? 1 : i;
        f = (i2 & 2) != 0 ? 0.75f : f;
        z = (i2 & 4) != 0 ? true : z;
        this.f105948a = i;
        this.f105949b = f;
        this.f105950c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39444l)) {
            return false;
        }
        C39444l lVar = (C39444l) obj;
        return this.f105948a == lVar.f105948a && C87412m.m108589b(Float.valueOf(this.f105949b), Float.valueOf(lVar.f105949b)) && this.f105950c == lVar.f105950c;
    }

    public int hashCode() {
        int floatToIntBits = ((this.f105948a * 31) + Float.floatToIntBits(this.f105949b)) * 31;
        boolean z = this.f105950c;
        if (z) {
            z = true;
        }
        return floatToIntBits + (z ? 1 : 0);
    }

    public String toString() {
        return "ScConfig(style=" + this.f105948a + ", peekRatio=" + this.f105949b + ", expandable=" + this.f105950c + ')';
    }
}
