package p152f0;

import gy3.C8480h;
import p009c2.C104260k;
import p009c2.C104267q;
import p009c2.C104268r;

/* renamed from: f0.s0 */
public final class C107409s0 {

    /* renamed from: e */
    public static final C107409s0 f321374e = new C107409s0(0, false, 0, 0, 15, (C8480h) null);

    /* renamed from: a */
    public final int f321375a;

    /* renamed from: b */
    public final boolean f321376b;

    /* renamed from: c */
    public final int f321377c;

    /* renamed from: d */
    public final int f321378d;

    public C107409s0(int i, boolean z, int i2, int i3, int i4, C8480h hVar) {
        i = (i4 & 1) != 0 ? 0 : i;
        z = (i4 & 2) != 0 ? true : z;
        i2 = (i4 & 4) != 0 ? 1 : i2;
        i3 = (i4 & 8) != 0 ? 1 : i3;
        this.f321375a = i;
        this.f321376b = z;
        this.f321377c = i2;
        this.f321378d = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107409s0)) {
            return false;
        }
        C107409s0 s0Var = (C107409s0) obj;
        if (!(this.f321375a == s0Var.f321375a) || this.f321376b != s0Var.f321376b) {
            return false;
        }
        if (!(this.f321377c == s0Var.f321377c)) {
            return false;
        }
        return this.f321378d == s0Var.f321378d;
    }

    public int hashCode() {
        return (((((this.f321375a * 31) + (this.f321376b ? 1231 : 1237)) * 31) + this.f321377c) * 31) + this.f321378d;
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + C104267q.m139164a(this.f321375a) + ", autoCorrect=" + this.f321376b + ", keyboardType=" + C104268r.m139165a(this.f321377c) + ", imeAction=" + C104260k.m139149a(this.f321378d) + ')';
    }
}
