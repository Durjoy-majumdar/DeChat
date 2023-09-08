package cy3;

import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: cy3.a */
public final class C86147a {
    /* renamed from: a */
    public static final long m106659a(InputStream inputStream, OutputStream outputStream, int i) {
        C87412m.m108594g(inputStream, "<this>");
        C87412m.m108594g(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m106660b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m106659a(inputStream, outputStream, i);
    }

    /* renamed from: c */
    public static final byte[] m106661c(InputStream inputStream) {
        C87412m.m108594g(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m106660b(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C87412m.m108593f(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
