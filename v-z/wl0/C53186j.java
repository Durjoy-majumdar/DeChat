package wl0;

/* renamed from: wl0.j */
public class C53186j {
    /* renamed from: a */
    public static String m59593a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            byte b2 = b & 15;
            int i = 48;
            int i2 = b2 + (b2 < 10 ? (byte) 48 : 55);
            int i3 = (b & 240) >> 4;
            if (i3 >= 10) {
                i = 55;
            }
            sb.append(i3 + i);
            sb.append(i2);
        }
        return sb.toString();
    }
}
