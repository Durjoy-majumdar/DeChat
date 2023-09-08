package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;
import p1166z0.C112546l;

/* renamed from: i2.n */
public final class C108329n {
    /* renamed from: a */
    public static final long m146743a(int i, int i2) {
        return (((long) i2) & Util.MAX_32BIT_VALUE) | (((long) i) << 32);
    }

    /* renamed from: b */
    public static final long m146744b(long j) {
        return C112546l.m153761a((float) ((int) (j >> 32)), (float) C33181m.m39966b(j));
    }
}
