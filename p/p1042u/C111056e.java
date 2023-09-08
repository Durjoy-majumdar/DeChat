package p1042u;

/* renamed from: u.e */
public class C111056e {

    /* renamed from: a */
    public static final int[] f332570a = new int[0];

    /* renamed from: b */
    public static final Object[] f332571b = new Object[0];

    /* renamed from: a */
    public static int m151429a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: b */
    public static int m151430b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
