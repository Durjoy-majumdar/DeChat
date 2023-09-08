package vu3;

import java.io.InputStream;

/* renamed from: vu3.b */
public class C90874b {
    /* renamed from: a */
    public static final boolean m113987a(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                return false;
            }
            i3 += read;
        }
        return true;
    }
}
