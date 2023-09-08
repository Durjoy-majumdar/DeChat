package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i2.g */
public final class C108326g {
    /* renamed from: a */
    public static final long m146736a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & Util.MAX_32BIT_VALUE) | (floatToIntBits << 32);
        int i = C108327h.f324348c;
        return floatToIntBits2;
    }

    /* renamed from: b */
    public static final long m146737b(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & Util.MAX_32BIT_VALUE) | (floatToIntBits << 32);
        int i = C108328i.f324352d;
        return floatToIntBits2;
    }
}
