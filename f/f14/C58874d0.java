package f14;

import z04.C66731x;

/* renamed from: f14.d0 */
public final class C58874d0 {
    /* renamed from: a */
    public static final long m68708a(String str, long j, long j2, long j3) {
        String str2;
        int i = C58876e0.f168513a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long f = C66731x.m78732f(str2);
        if (f != null) {
            long longValue = f.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    /* renamed from: b */
    public static int m68709b(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) m68708a(str, (long) i, (long) i2, (long) i3);
    }
}
