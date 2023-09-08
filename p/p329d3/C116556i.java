package p329d3;

/* renamed from: d3.i */
public final class C116556i {

    /* renamed from: a */
    public static final Object f349575a = new Object();

    /* renamed from: b */
    public static char[] f349576b = new char[24];

    /* renamed from: a */
    public static int m164396a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m164397b(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        int i7 = i;
        if (f349576b.length < i7) {
            f349576b = new char[i7];
        }
        char[] cArr = f349576b;
        int i8 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i8 == 0) {
            int i9 = i7 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i8 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i15 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i16 = floor / 60;
            i4 = floor - (i16 * 60);
            i5 = i16;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i7 != 0) {
            int a = m164396a(i2, 1, false, 0);
            int a2 = a + m164396a(i3, 1, a > 0, 2);
            int a3 = a2 + m164396a(i5, 1, a2 > 0, 2);
            int a4 = a3 + m164396a(i4, 1, a3 > 0, 2);
            i6 = 0;
            for (int a5 = a4 + m164396a(i15, 2, true, a4 > 0 ? 3 : 0) + 1; a5 < i7; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i17 = i6 + 1;
        boolean z = i7 != 0;
        int i18 = i17;
        int c2 = m164398c(cArr, i2, 'd', i17, false, 0);
        int c3 = m164398c(cArr, i3, 'h', c2, c2 != i18, z ? 2 : 0);
        int c4 = m164398c(cArr, i5, 'm', c3, c3 != i18, z ? 2 : 0);
        int c5 = m164398c(cArr, i4, 's', c4, c4 != i18, z ? 2 : 0);
        int c6 = m164398c(cArr, i15, 'm', c5, true, (!z || c5 == i18) ? 0 : 3);
        cArr[c6] = 's';
        return c6 + 1;
    }

    /* renamed from: c */
    public static int m164398c(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
