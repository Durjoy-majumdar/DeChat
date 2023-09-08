package cm1;

import gy3.C8480h;
import gy3.C87412m;
import te3.C48878bm1;

/* renamed from: cm1.h2 */
public final class C0737h2 {

    /* renamed from: a */
    public int f1759a;

    /* renamed from: b */
    public int f1760b;

    /* renamed from: c */
    public C48878bm1 f1761c;

    public C0737h2(int i, int i2, C48878bm1 bm12, int i3, C8480h hVar) {
        bm12 = (i3 & 4) != 0 ? null : bm12;
        this.f1759a = i;
        this.f1760b = i2;
        this.f1761c = bm12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0737h2)) {
            return false;
        }
        C0737h2 h2Var = (C0737h2) obj;
        return this.f1759a == h2Var.f1759a && this.f1760b == h2Var.f1760b && C87412m.m108589b(this.f1761c, h2Var.f1761c);
    }

    public int hashCode() {
        int i = ((this.f1759a * 31) + this.f1760b) * 31;
        C48878bm1 bm12 = this.f1761c;
        return i + (bm12 == null ? 0 : bm12.hashCode());
    }

    public String toString() {
        return "FriendTabLikeTipsState(state=" + this.f1759a + ", position=" + this.f1760b + ", tipsShowInfo=" + this.f1761c + ')';
    }
}
