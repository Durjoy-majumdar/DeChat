package p926a2;

import gy3.C87412m;

/* renamed from: a2.a */
public final class C79459a {

    /* renamed from: a */
    public static final int[] f233000a = new int[0];

    /* renamed from: b */
    public static final Object[] f233001b = new Object[0];

    /* renamed from: a */
    public static final int m96416a(int[] iArr, int i, int i2) {
        C87412m.m108594g(iArr, "<this>");
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
}
