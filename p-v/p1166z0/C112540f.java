package p1166z0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: z0.f */
public final class C112540f {
    /* renamed from: a */
    public static final long m153745a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & Util.MAX_32BIT_VALUE) | (floatToIntBits << 32);
        int i = C112539e.f336958e;
        return floatToIntBits2;
    }

    /* renamed from: b */
    public static final boolean m153746b(long j) {
        float c = C112539e.m153738c(j);
        if (!Float.isInfinite(c) && !Float.isNaN(c)) {
            float d = C112539e.m153739d(j);
            if (!Float.isInfinite(d) && !Float.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m153747c(long j) {
        int i = C112539e.f336958e;
        return j != C112539e.f336957d;
    }
}
