package p1166z0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: z0.l */
public final class C112546l {
    /* renamed from: a */
    public static final long m153761a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & Util.MAX_32BIT_VALUE) | (floatToIntBits << 32);
        int i = C112545k.f336975d;
        return floatToIntBits2;
    }

    /* renamed from: b */
    public static final long m153762b(long j) {
        return C112540f.m153745a(C112545k.m153758d(j) / 2.0f, C112545k.m153756b(j) / 2.0f);
    }
}
