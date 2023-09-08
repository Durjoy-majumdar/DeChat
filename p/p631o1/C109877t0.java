package p631o1;

import com.tencent.p014mm.sdk.platformtools.Util;
import p1166z0.C112545k;
import p1166z0.C112546l;

/* renamed from: o1.t0 */
public final class C109877t0 {
    /* renamed from: a */
    public static final long m149365a(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & Util.MAX_32BIT_VALUE) | (floatToIntBits << 32);
        int i = C109873s0.f328796b;
        return floatToIntBits2;
    }

    /* renamed from: b */
    public static final long m149366b(long j, long j2) {
        float d = C112545k.m153758d(j);
        long j3 = C109873s0.f328795a;
        boolean z = true;
        if (j2 != j3) {
            float intBitsToFloat = d * Float.intBitsToFloat((int) (j2 >> 32));
            float b = C112545k.m153756b(j);
            if (j2 == j3) {
                z = false;
            }
            if (z) {
                return C112546l.m153761a(intBitsToFloat, b * Float.intBitsToFloat((int) (j2 & Util.MAX_32BIT_VALUE)));
            }
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}
