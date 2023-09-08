package p175j0;

import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: j0.a2 */
public final class C24659a2 {
    /* renamed from: a */
    public static final boolean m30849a(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    /* renamed from: b */
    public static final int m30850b(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* renamed from: c */
    public static final boolean m30851c(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    /* renamed from: d */
    public static final boolean m30852d(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    /* renamed from: e */
    public static final int m30853e(ArrayList arrayList, int i, int i2) {
        int k = m30859k(arrayList, i, i2);
        return k >= 0 ? k : -(k + 1);
    }

    /* renamed from: f */
    public static final int m30854f(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* renamed from: g */
    public static final int m30855g(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m30858j(iArr[i2 + 1] >> 28);
    }

    /* renamed from: h */
    public static final void m30856h(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
            iArr[(i * 5) + 3] = i2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: i */
    public static final void m30857i(int[] iArr, int i, int i2) {
        if (i2 >= 0 && i2 < 67108863) {
            int i3 = (i * 5) + 1;
            iArr[i3] = i2 | (iArr[i3] & -67108864);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: j */
    public static final int m30858j(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: k */
    public static final int m30859k(ArrayList<C24663c> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = arrayList.get(i4).f70328a;
            if (i5 < 0) {
                i5 += i2;
            }
            int i6 = C87412m.m108596i(i5, i);
            if (i6 < 0) {
                i3 = i4 + 1;
            } else if (i6 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
