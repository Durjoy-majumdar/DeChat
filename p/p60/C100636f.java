package p60;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import o60.C100290d;

/* renamed from: p60.f */
public class C100636f implements C100290d {
    /* renamed from: a */
    public static byte[] m131649a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArray;
            }
        }
    }
}
