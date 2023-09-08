package hf0;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: hf0.c */
public class C87488c {
    /* renamed from: a */
    public static int m108774a(InputStream inputStream) {
        return (m108776c(inputStream) << 8) | m108776c(inputStream);
    }

    /* renamed from: b */
    public static long m108775b(InputStream inputStream) {
        return ((long) m108776c(inputStream)) | (((long) m108776c(inputStream)) << 8) | (((long) m108776c(inputStream)) << 16) | (((long) m108776c(inputStream)) << 24);
    }

    /* renamed from: c */
    public static int m108776c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new IOException("EOF");
    }

    /* renamed from: d */
    public static void m108777d(InputStream inputStream, byte[] bArr, int i, int i2) {
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
    public static void m108778e(InputStream inputStream, long j) {
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
