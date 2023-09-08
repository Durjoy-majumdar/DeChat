package p560i2;

import my3.C61595o;

/* renamed from: i2.c */
public final class C108321c {
    /* renamed from: a */
    public static final long m146704a(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i < 0 || i3 < 0) {
                    z = false;
                }
                if (z) {
                    return C108319b.f324339b.mo158784b(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    /* renamed from: b */
    public static /* synthetic */ long m146705b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m146704a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static final long m146706c(long j, long j2) {
        return C108329n.m146743a(C61595o.m72297e((int) (j2 >> 32), C108319b.m146699j(j), C108319b.m146697h(j)), C61595o.m72297e(C33181m.m39966b(j2), C108319b.m146698i(j), C108319b.m146696g(j)));
    }

    /* renamed from: d */
    public static final int m146707d(long j, int i) {
        return C61595o.m72297e(i, C108319b.m146698i(j), C108319b.m146696g(j));
    }

    /* renamed from: e */
    public static final int m146708e(long j, int i) {
        return C61595o.m72297e(i, C108319b.m146699j(j), C108319b.m146697h(j));
    }

    /* renamed from: f */
    public static final boolean m146709f(long j, long j2) {
        int i = (int) (j2 >> 32);
        if (C108319b.m146699j(j) <= i && i <= C108319b.m146697h(j)) {
            int i2 = C108319b.m146698i(j);
            int g = C108319b.m146696g(j);
            int b = C33181m.m39966b(j2);
            if (i2 <= b && b <= g) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final long m146710g(long j, int i, int i2) {
        int j2 = C108319b.m146699j(j) + i;
        int i3 = 0;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = C108319b.m146697h(j);
        if (h != Integer.MAX_VALUE && (h = h + i) < 0) {
            h = 0;
        }
        int i4 = C108319b.m146698i(j) + i2;
        if (i4 < 0) {
            i4 = 0;
        }
        int g = C108319b.m146696g(j);
        if (g == Integer.MAX_VALUE || (g = g + i2) >= 0) {
            i3 = g;
        }
        return m146704a(j2, h, i4, i3);
    }
}
