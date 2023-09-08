package cq1;

import gy3.C87412m;

/* renamed from: cq1.k */
public final class C7124k {

    /* renamed from: a */
    public final String f25087a;

    /* renamed from: b */
    public final long f25088b;

    public C7124k(String str, long j) {
        C87412m.m108594g(str, "name");
        this.f25087a = str;
        this.f25088b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7124k)) {
            return false;
        }
        C7124k kVar = (C7124k) obj;
        return C87412m.m108589b(this.f25087a, kVar.f25087a) && this.f25088b == kVar.f25088b;
    }

    public int hashCode() {
        long j = this.f25088b;
        return (this.f25087a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RecentAtBean(name='" + this.f25087a + "', time=" + this.f25088b + ')';
    }
}
