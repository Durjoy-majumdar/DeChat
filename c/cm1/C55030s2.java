package cm1;

import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import te3.C51449tu2;

/* renamed from: cm1.s2 */
public final class C55030s2 implements Comparable<C55030s2> {

    /* renamed from: d */
    public final long f154486d;

    /* renamed from: e */
    public boolean f154487e;

    /* renamed from: f */
    public final long f154488f;

    /* renamed from: g */
    public C51449tu2 f154489g;

    public C55030s2(long j, boolean z, long j2, C51449tu2 tu22, int i, C8480h hVar) {
        z = (i & 2) != 0 ? false : z;
        j2 = (i & 4) != 0 ? C31543z5.m39453c() : j2;
        tu22 = (i & 8) != 0 ? null : tu22;
        this.f154486d = j;
        this.f154487e = z;
        this.f154488f = j2;
        this.f154489g = tu22;
    }

    public int compareTo(Object obj) {
        C55030s2 s2Var = (C55030s2) obj;
        C87412m.m108594g(s2Var, "other");
        return (int) (s2Var.f154488f - this.f154488f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55030s2)) {
            return false;
        }
        C55030s2 s2Var = (C55030s2) obj;
        return this.f154486d == s2Var.f154486d && this.f154487e == s2Var.f154487e && this.f154488f == s2Var.f154488f && C87412m.m108589b(this.f154489g, s2Var.f154489g);
    }

    public int hashCode() {
        long j = this.f154486d;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f154487e;
        if (z) {
            z = true;
        }
        long j2 = this.f154488f;
        int i2 = (((i + (z ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C51449tu2 tu22 = this.f154489g;
        return i2 + (tu22 == null ? 0 : tu22.hashCode());
    }

    public String toString() {
        return "StreamMarkReadStat(feedId=" + this.f154486d + ", isRead=" + this.f154487e + ", timestamp=" + this.f154488f + ", stat=" + this.f154489g + ')';
    }
}
