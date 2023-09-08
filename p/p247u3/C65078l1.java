package p247u3;

import gy3.C8480h;

/* renamed from: u3.l1 */
public final class C65078l1 {

    /* renamed from: a */
    public final int f187298a;

    /* renamed from: b */
    public final int f187299b;

    /* renamed from: c */
    public final boolean f187300c;

    /* renamed from: d */
    public final int f187301d;

    /* renamed from: e */
    public final int f187302e;

    /* renamed from: f */
    public final int f187303f;

    public C65078l1(int i, int i2, boolean z, int i3, int i4, int i5, int i6, C8480h hVar) {
        i2 = (i6 & 2) != 0 ? i : i2;
        boolean z2 = true;
        z = (i6 & 4) != 0 ? true : z;
        i3 = (i6 & 8) != 0 ? i * 3 : i3;
        i4 = (i6 & 16) != 0 ? Integer.MAX_VALUE : i4;
        i5 = (i6 & 32) != 0 ? Integer.MIN_VALUE : i5;
        this.f187298a = i;
        this.f187299b = i2;
        this.f187300c = z;
        this.f187301d = i3;
        this.f187302e = i4;
        this.f187303f = i5;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        } else if (i4 == Integer.MAX_VALUE || i4 >= (i2 * 2) + i) {
            if (i5 != Integer.MIN_VALUE && i5 <= 0) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
        } else {
            throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist" + ", pageSize=" + i + ", prefetchDist=" + i2 + ", maxSize=" + i4);
        }
    }
}
