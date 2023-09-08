package ru3;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: ru3.d */
public final class C118234d {
    /* renamed from: a */
    public static byte[] m166795a(InputStream inputStream, int i) {
        if (i <= 0) {
            i = 32768;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
