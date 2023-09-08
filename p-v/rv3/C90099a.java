package rv3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: rv3.a */
public class C90099a {
    /* renamed from: a */
    public static byte[] m112721a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        try {
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                deflaterOutputStream.close();
            } catch (IOException unused) {
            }
            return byteArray;
        } catch (Exception unused2) {
            try {
                byteArrayOutputStream.close();
                deflaterOutputStream.close();
            } catch (IOException unused3) {
            }
            return null;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
                deflaterOutputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m112722b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inflaterInputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } catch (Exception unused) {
                try {
                    byteArrayInputStream.close();
                    inflaterInputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                return null;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                    inflaterInputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayInputStream.close();
            inflaterInputStream.close();
            byteArrayOutputStream.close();
        } catch (IOException unused4) {
        }
        return byteArray;
    }
}
