package p24;

import gy3.C87412m;
import o24.C21752a0;

/* renamed from: p24.c */
public final class C21917c {
    /* renamed from: a */
    public static final int m25179a(C21752a0 a0Var, int i) {
        int i2;
        C87412m.m108594g(a0Var, "$this$segment");
        int[] iArr = a0Var.f61676j;
        int i3 = i + 1;
        int i4 = 0;
        int length = a0Var.f61675i.length;
        C87412m.m108594g(iArr, "$this$binarySearch");
        int i5 = length - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
