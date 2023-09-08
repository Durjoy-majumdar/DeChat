package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i2.t */
public final class C108331t {
    /* renamed from: a */
    public static final long m146750a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & Util.MAX_32BIT_VALUE) | (floatToIntBits << 32);
        int i = C108330s.f324355c;
        return floatToIntBits2;
    }
}
