package sl1;

import gy3.C8480h;

/* renamed from: sl1.k */
public final class C13729k {

    /* renamed from: a */
    public boolean f38828a;

    /* renamed from: b */
    public boolean f38829b;

    /* renamed from: c */
    public int f38830c;

    /* renamed from: d */
    public int f38831d;

    /* renamed from: e */
    public boolean f38832e;

    public C13729k() {
        this(false, false, 0, 0, false, 31, (C8480h) null);
    }

    public C13729k(boolean z, boolean z2, int i, int i2, boolean z3, int i3, C8480h hVar) {
        z = (i3 & 1) != 0 ? false : z;
        z2 = (i3 & 2) != 0 ? false : z2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        z3 = (i3 & 16) != 0 ? false : z3;
        this.f38828a = z;
        this.f38829b = z2;
        this.f38830c = i;
        this.f38831d = i2;
        this.f38832e = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13729k)) {
            return false;
        }
        C13729k kVar = (C13729k) obj;
        return this.f38828a == kVar.f38828a && this.f38829b == kVar.f38829b && this.f38830c == kVar.f38830c && this.f38831d == kVar.f38831d && this.f38832e == kVar.f38832e;
    }

    public int hashCode() {
        boolean z = this.f38828a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f38829b;
        if (z3) {
            z3 = true;
        }
        int i2 = (((((i + (z3 ? 1 : 0)) * 31) + this.f38830c) * 31) + this.f38831d) * 31;
        boolean z4 = this.f38832e;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "LotteryUpdateStatus localStatus:" + this.f38830c + ",lotteryStatus:" + this.f38831d + ",statusChange:" + this.f38828a + ",newLottery:" + this.f38829b + ",resumeState:" + this.f38832e;
    }
}
