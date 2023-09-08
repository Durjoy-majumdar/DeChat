package kv3;

import java.io.EOFException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kv3.e */
public final class C88313e {

    /* renamed from: a */
    public static final /* synthetic */ int f255282a = 0;

    static {
        new AtomicReference();
    }

    /* renamed from: a */
    public static void m110082a(InputStream inputStream, byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (inputStream == null) {
                throw new NullPointerException("in == null");
            } else if (bArr != null) {
                int length = bArr.length;
                if ((i | i2) < 0 || i > length || length - i < i2) {
                    throw new ArrayIndexOutOfBoundsException(i);
                }
                while (i2 > 0) {
                    int read = inputStream.read(bArr, i, i2);
                    if (read >= 0) {
                        i += read;
                        i2 -= read;
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new NullPointerException("dst == null");
            }
        }
    }
}
