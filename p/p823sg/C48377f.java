package p823sg;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: sg.f */
public class C48377f {
    /* renamed from: a */
    public static long m53722a(InputStream inputStream, OutputStream outputStream) {
        if (!(inputStream == null || outputStream == null)) {
            try {
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        return j;
                    }
                    outputStream.write(bArr, 0, read);
                    j += (long) read;
                }
            } catch (Exception e) {
                Log.m105929w("MicroMsg.FileOperation", "copyStream error: %s", e.getMessage());
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static byte[] m53723b(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            try {
                i = inputStream.read(bArr, 0, 1024);
            } catch (IOException unused) {
            }
            if (i <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
