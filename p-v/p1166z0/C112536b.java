package p1166z0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: z0.b */
public final class C112536b {
    /* renamed from: a */
    public static final long m153731a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & Util.MAX_32BIT_VALUE) | (floatToIntBits << 32);
        int i = C112535a.f336950b;
        return floatToIntBits2;
    }

    /* renamed from: b */
    public static /* synthetic */ long m153732b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return m153731a(f, f2);
    }
}
