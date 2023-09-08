package rx3;

import gy3.C87412m;
import z04.C66713a;

/* renamed from: rx3.v */
public final class C90109v implements Comparable<C90109v> {

    /* renamed from: d */
    public final long f258765d;

    public /* synthetic */ C90109v(long j) {
        this.f258765d = j;
    }

    /* renamed from: a */
    public static int m112737a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static String m112738b(long j) {
        if (j >= 0) {
            C66713a.m78712a(10);
            String l = Long.toString(j, 10);
            C87412m.m108593f(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        C66713a.m78712a(10);
        String l2 = Long.toString(j3, 10);
        C87412m.m108593f(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        C66713a.m78712a(10);
        String l3 = Long.toString(j4, 10);
        C87412m.m108593f(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }

    public int compareTo(Object obj) {
        return C87412m.m108597j(this.f258765d ^ Long.MIN_VALUE, ((C90109v) obj).f258765d ^ Long.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C90109v) && this.f258765d == ((C90109v) obj).f258765d;
    }

    public int hashCode() {
        return m112737a(this.f258765d);
    }

    public String toString() {
        return m112738b(this.f258765d);
    }
}
