package p735w1;

import com.tencent.p014mm.sdk.platformtools.Util;
import my3.C61595o;

/* renamed from: w1.y */
public final class C38007y {
    /* renamed from: a */
    public static final long m41701a(int i, int i2) {
        boolean z = false;
        if (i >= 0) {
            if (i2 >= 0) {
                z = true;
            }
            if (z) {
                long j = (((long) i2) & Util.MAX_32BIT_VALUE) | (((long) i) << 32);
                int i3 = C38006x.f100499c;
                return j;
            }
            throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
    }

    /* renamed from: b */
    public static final long m41702b(long j, int i, int i2) {
        int i3 = C38006x.f100499c;
        int i4 = (int) (j >> 32);
        int e = C61595o.m72297e(i4, i, i2);
        int e2 = C61595o.m72297e(C38006x.m41695c(j), i, i2);
        return (e == i4 && e2 == C38006x.m41695c(j)) ? j : m41701a(e, e2);
    }
}
