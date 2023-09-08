package nf2;

import gy3.C87412m;

/* renamed from: nf2.i */
public final class C34825i {

    /* renamed from: a */
    public final float f93582a;

    /* renamed from: b */
    public final boolean f93583b;

    /* renamed from: c */
    public final boolean f93584c;

    public C34825i(float f, boolean z, boolean z2) {
        this.f93582a = f;
        this.f93583b = z;
        this.f93584c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34825i)) {
            return false;
        }
        C34825i iVar = (C34825i) obj;
        return C87412m.m108589b(Float.valueOf(this.f93582a), Float.valueOf(iVar.f93582a)) && this.f93583b == iVar.f93583b && this.f93584c == iVar.f93584c;
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f93582a) * 31;
        boolean z = this.f93583b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (floatToIntBits + (z ? 1 : 0)) * 31;
        boolean z3 = this.f93584c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "ImageRadiusInfo(radius=" + this.f93582a + ", topRound=" + this.f93583b + ", bottomRound=" + this.f93584c + ')';
    }
}
