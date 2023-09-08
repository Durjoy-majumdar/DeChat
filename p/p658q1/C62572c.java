package p658q1;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: q1.c */
public final class C62572c {
    /* renamed from: a */
    public static final int m73542a(long j, long j2) {
        boolean b = m73543b(j);
        return b != m73543b(j2) ? b ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    /* renamed from: b */
    public static final boolean m73543b(long j) {
        return ((int) (j & Util.MAX_32BIT_VALUE)) != 0;
    }
}
