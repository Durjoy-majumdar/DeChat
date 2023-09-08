package ft3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

/* renamed from: ft3.a */
public class C87080a {
    /* renamed from: a */
    public static byte[] m108102a(byte[] bArr) {
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
        } catch (Exception e) {
            C116895f.m164892d("CompressUtil", "deflater(), exception: " + e);
            try {
                byteArrayOutputStream.close();
                deflaterOutputStream.close();
            } catch (IOException unused2) {
            }
            return null;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
                deflaterOutputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
