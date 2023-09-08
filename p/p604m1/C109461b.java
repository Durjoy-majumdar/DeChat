package p604m1;

import gy3.C8480h;
import p1166z0.C112539e;

/* renamed from: m1.b */
public final class C109461b {

    /* renamed from: a */
    public final long f327625a;

    /* renamed from: b */
    public final long f327626b;

    public C109461b(long j, long j2, C8480h hVar) {
        this.f327625a = j;
        this.f327626b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109461b)) {
            return false;
        }
        C109461b bVar = (C109461b) obj;
        return C112539e.m153736a(this.f327625a, bVar.f327625a) && this.f327626b == bVar.f327626b;
    }

    public int hashCode() {
        long j = this.f327626b;
        return (C112539e.m153740e(this.f327625a) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "PointAtTime(point=" + C112539e.m153744i(this.f327625a) + ", time=" + this.f327626b + ')';
    }
}
