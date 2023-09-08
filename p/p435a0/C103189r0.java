package p435a0;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: a0.r0 */
public final class C103189r0 {

    /* renamed from: a */
    public float f304370a;

    /* renamed from: b */
    public boolean f304371b;

    /* renamed from: c */
    public C103167m f304372c;

    public C103189r0() {
        this(0.0f, false, (C103167m) null, 7, (C8480h) null);
    }

    public C103189r0(float f, boolean z, C103167m mVar, int i, C8480h hVar) {
        f = (i & 1) != 0 ? 0.0f : f;
        z = (i & 2) != 0 ? true : z;
        mVar = (i & 4) != 0 ? null : mVar;
        this.f304370a = f;
        this.f304371b = z;
        this.f304372c = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103189r0)) {
            return false;
        }
        C103189r0 r0Var = (C103189r0) obj;
        return C87412m.m108589b(Float.valueOf(this.f304370a), Float.valueOf(r0Var.f304370a)) && this.f304371b == r0Var.f304371b && C87412m.m108589b(this.f304372c, r0Var.f304372c);
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f304370a) * 31;
        boolean z = this.f304371b;
        if (z) {
            z = true;
        }
        int i = (floatToIntBits + (z ? 1 : 0)) * 31;
        C103167m mVar = this.f304372c;
        return i + (mVar == null ? 0 : mVar.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f304370a + ", fill=" + this.f304371b + ", crossAxisAlignment=" + this.f304372c + ')';
    }
}
