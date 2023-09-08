package p1062x3;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: x3.c */
public class C91136c {
    /* renamed from: a */
    public static byte[] m114340a(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* renamed from: b */
    public static byte[] m114341b(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m114342c(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            throw new IllegalStateException(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* renamed from: d */
    public static long m114343d(InputStream inputStream, int i) {
        byte[] b = m114341b(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (b[i2] & ExifInterface.MARKER)) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: e */
    public static int m114344e(InputStream inputStream) {
        return (int) m114343d(inputStream, 2);
    }

    /* renamed from: f */
    public static void m114345f(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    /* renamed from: g */
    public static void m114346g(OutputStream outputStream, int i) {
        m114345f(outputStream, (long) i, 2);
    }
}
