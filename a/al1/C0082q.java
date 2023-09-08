package al1;

import gy3.C8480h;
import gy3.C87412m;
import o40.C61937h;
import te3.C52204z21;

/* renamed from: al1.q */
public final class C0082q {

    /* renamed from: a */
    public int f506a;

    /* renamed from: b */
    public int f507b;

    /* renamed from: c */
    public boolean f508c;

    /* renamed from: d */
    public C52204z21 f509d;

    /* renamed from: e */
    public boolean f510e;

    /* renamed from: f */
    public boolean f511f;

    /* renamed from: g */
    public boolean f512g;

    public C0082q() {
        this(0, 0, false, (C52204z21) null, false, false, false, 127, (C8480h) null);
    }

    public C0082q(int i, int i2, boolean z, C52204z21 z212, boolean z2, boolean z3, boolean z4, int i3, C8480h hVar) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? -1 : i2;
        z = (i3 & 4) != 0 ? false : z;
        z212 = (i3 & 8) != 0 ? null : z212;
        z2 = (i3 & 16) != 0 ? false : z2;
        z3 = (i3 & 32) != 0 ? false : z3;
        z4 = (i3 & 64) != 0 ? false : z4;
        this.f506a = i;
        this.f507b = i2;
        this.f508c = z;
        this.f509d = z212;
        this.f510e = z2;
        this.f511f = z3;
        this.f512g = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0082q)) {
            return false;
        }
        C0082q qVar = (C0082q) obj;
        return this.f506a == qVar.f506a && this.f507b == qVar.f507b && this.f508c == qVar.f508c && C87412m.m108589b(this.f509d, qVar.f509d) && this.f510e == qVar.f510e && this.f511f == qVar.f511f && this.f512g == qVar.f512g;
    }

    public int hashCode() {
        int i = ((this.f506a * 31) + this.f507b) * 31;
        boolean z = this.f508c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        C52204z21 z212 = this.f509d;
        int hashCode = (i2 + (z212 == null ? 0 : z212.hashCode())) * 31;
        boolean z3 = this.f510e;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f511f;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f512g;
        if (!z5) {
            z2 = z5;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("localStatus:");
        sb.append(this.f506a);
        sb.append(",localRemainTime:");
        sb.append(this.f507b);
        sb.append(",haveLottering:");
        sb.append(this.f508c);
        sb.append(", lotteryInfo:");
        Object obj = this.f509d;
        if (obj == null) {
            obj = "";
        }
        sb.append(C61937h.m72709h(obj));
        sb.append(",lastDoneLottery:");
        sb.append(this.f510e);
        sb.append(",cardShowing:");
        sb.append(this.f511f);
        sb.append(",bubbleFinsh:");
        sb.append(this.f512g);
        return sb.toString();
    }
}
