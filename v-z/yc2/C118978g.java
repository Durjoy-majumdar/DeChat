package yc2;

/* renamed from: yc2.g */
public final class C118978g {

    /* renamed from: a */
    public static final char[] f356401a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m167741a(byte[] bArr, int i, int i2) {
        char[] cArr = new char[((i2 - i) * 2)];
        int i3 = 0;
        while (i < i2) {
            byte b = bArr[i];
            int i4 = i3 + 1;
            char[] cArr2 = f356401a;
            cArr[i3] = cArr2[(b >>> 4) & 15];
            i3 = i4 + 1;
            cArr[i4] = cArr2[b & 15];
            i++;
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m167742b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int i = 1;
        while (true) {
            try {
                char charAt = str.charAt(i - 1) ^ str.charAt(i);
                i++;
                if (i == str.length()) {
                    sb.append((char) charAt);
                    return sb.toString();
                }
                sb.append((char) charAt);
            } catch (Throwable unused) {
                return sb.toString();
            }
        }
    }
}
