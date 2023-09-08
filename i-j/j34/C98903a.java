package j34;

import java.util.Arrays;

/* renamed from: j34.a */
public class C98903a {

    /* renamed from: a */
    public static final char[] f289928a;

    /* renamed from: b */
    public static final int[] f289929b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f289928a = charArray;
        int[] iArr = new int[256];
        f289929b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            f289929b[f289928a[i]] = i;
        }
        f289929b[61] = 0;
    }
}
