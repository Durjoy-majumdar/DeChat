package p1166z0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: z0.a */
public final class C112535a {

    /* renamed from: a */
    public static final long f336949a = C112536b.m153732b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: b */
    public static final /* synthetic */ int f336950b = 0;

    /* renamed from: a */
    public static final boolean m153727a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final float m153728b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: c */
    public static final float m153729c(long j) {
        return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
    }

    /* renamed from: d */
    public static String m153730d(long j) {
        if (m153728b(j) == m153729c(j)) {
            return "CornerRadius.circular(" + C112537c.m153733a(m153728b(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + C112537c.m153733a(m153728b(j), 1) + ", " + C112537c.m153733a(m153729c(j), 1) + ')';
    }
}
