package p658q1;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: q1.g */
public final class C62576g {
    /* renamed from: a */
    public static final long m73547a(float f, boolean z) {
        return ((z ? 1 : 0) & Util.MAX_32BIT_VALUE) | (((long) Float.floatToIntBits(f)) << 32);
    }
}
