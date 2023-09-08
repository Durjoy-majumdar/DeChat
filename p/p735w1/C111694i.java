package p735w1;

import gy3.C87412m;

/* renamed from: w1.i */
public final class C111694i {

    /* renamed from: a */
    public final C111695j f334336a;

    /* renamed from: b */
    public final int f334337b;

    /* renamed from: c */
    public final int f334338c;

    public C111694i(C111695j jVar, int i, int i2) {
        C87412m.m108594g(jVar, "intrinsics");
        this.f334336a = jVar;
        this.f334337b = i;
        this.f334338c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111694i)) {
            return false;
        }
        C111694i iVar = (C111694i) obj;
        return C87412m.m108589b(this.f334336a, iVar.f334336a) && this.f334337b == iVar.f334337b && this.f334338c == iVar.f334338c;
    }

    public int hashCode() {
        return (((this.f334336a.hashCode() * 31) + this.f334337b) * 31) + this.f334338c;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f334336a + ", startIndex=" + this.f334337b + ", endIndex=" + this.f334338c + ')';
    }
}
