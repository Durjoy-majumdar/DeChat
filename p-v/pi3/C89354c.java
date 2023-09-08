package pi3;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: pi3.c */
public class C89354c {
    /* renamed from: a */
    public static int m111683a(InputStream inputStream) {
        return (m111685c(inputStream) << 8) | m111685c(inputStream);
    }

    /* renamed from: b */
    public static long m111684b(InputStream inputStream) {
        return ((long) m111685c(inputStream)) | (((long) m111685c(inputStream)) << 8) | (((long) m111685c(inputStream)) << 16) | (((long) m111685c(inputStream)) << 24);
    }

    /* renamed from: c */
    public static int m111685c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new IOException("EOF");
    }

    /* renamed from: d */
    public static void m111686d(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (i3 != -1) {
                    i3 += read;
                } else {
                    throw new IOException("EOF");
                }
            }
            return;
        }
        throw new IllegalArgumentException("length must be >= 0");
    }

    /* renamed from: e */
    public static void m111687e(InputStream inputStream, long j) {
        while (true) {
            long skip = inputStream.skip(j);
            if (skip <= 0) {
                break;
            }
            j -= skip;
        }
        if (j != 0) {
            throw new IOException("Unable to skip");
        }
    }
}
