package nl1;

import gy3.C87412m;
import te3.C50767p11;

/* renamed from: nl1.a */
public final class C11217a {

    /* renamed from: a */
    public final C50767p11 f33072a;

    /* renamed from: b */
    public long f33073b;

    /* renamed from: c */
    public final long f33074c;

    public C11217a(C50767p11 p112, long j, long j2) {
        C87412m.m108594g(p112, "gift");
        this.f33072a = p112;
        this.f33073b = j;
        this.f33074c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11217a)) {
            return false;
        }
        C11217a aVar = (C11217a) obj;
        return C87412m.m108589b(this.f33072a, aVar.f33072a) && this.f33073b == aVar.f33073b && this.f33074c == aVar.f33074c;
    }

    public int hashCode() {
        long j = this.f33073b;
        long j2 = this.f33074c;
        return (((this.f33072a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "name: " + this.f33072a.f139515o + " price: " + this.f33072a.f139516p + " target: " + this.f33073b + " curCount: " + this.f33074c;
    }
}
