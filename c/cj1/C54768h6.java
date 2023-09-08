package cj1;

import gy3.C8480h;
import gy3.C87412m;
import te3.C51922x41;

/* renamed from: cj1.h6 */
public final class C54768h6 {

    /* renamed from: a */
    public final C51922x41 f153498a;

    /* renamed from: b */
    public int f153499b;

    /* renamed from: c */
    public int f153500c;

    /* renamed from: d */
    public final int f153501d;

    /* renamed from: e */
    public boolean f153502e;

    public C54768h6(C51922x41 x412, int i, int i2, int i3, boolean z, int i4, C8480h hVar) {
        i3 = (i4 & 8) != 0 ? 2 : i3;
        z = (i4 & 16) != 0 ? false : z;
        C87412m.m108594g(x412, "musicInfo");
        this.f153498a = x412;
        this.f153499b = i;
        this.f153500c = i2;
        this.f153501d = i3;
        this.f153502e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54768h6)) {
            return false;
        }
        C54768h6 h6Var = (C54768h6) obj;
        return C87412m.m108589b(this.f153498a, h6Var.f153498a) && this.f153499b == h6Var.f153499b && this.f153500c == h6Var.f153500c && this.f153501d == h6Var.f153501d && this.f153502e == h6Var.f153502e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f153498a.hashCode() * 31) + this.f153499b) * 31) + this.f153500c) * 31) + this.f153501d) * 31;
        boolean z = this.f153502e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("musicInfo:");
        sb.append(this.f153498a.f144443e);
        sb.append(',');
        sb.append(this.f153498a.f144442d);
        sb.append(",url is empty:");
        String str = this.f153498a.f144449n;
        sb.append(str == null || str.length() == 0);
        sb.append(",playable:");
        sb.append(this.f153498a.f144448j);
        sb.append(",playStatus:");
        sb.append(this.f153499b);
        sb.append(",favState:");
        sb.append(this.f153500c);
        sb.append(", type:");
        sb.append(this.f153501d);
        sb.append(", select:");
        sb.append(this.f153502e);
        return sb.toString();
    }
}
