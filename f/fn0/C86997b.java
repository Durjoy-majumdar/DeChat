package fn0;

/* renamed from: fn0.b */
public class C86997b {

    /* renamed from: a */
    public static final char[] f252473a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final byte[] f252474b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    public static byte[] m107999a(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        int length = (str.length() / 2) * 2;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte[] bArr2 = f252474b;
            int i3 = i + 1;
            bArr[i2] = (byte) ((bArr2[str.charAt(i)] << 4) | bArr2[str.charAt(i3)]);
            i2++;
            i = i3 + 1;
        }
        return bArr;
    }

    /* renamed from: b */
    public static String m108000b(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length * 2);
        int i = length + 0;
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = f252473a;
            sb.append(cArr[(bArr[i2] & 240) >> 4]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }
}
