package tu3;

/* renamed from: tu3.a */
public final class C26312a {
    /* renamed from: a */
    public static String m33783a(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m33784b(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: c */
    public static String m33785c(int i) {
        return i == ((char) i) ? m33784b(i) : m33786d(i);
    }

    /* renamed from: d */
    public static String m33786d(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static String m33787e(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }
}
