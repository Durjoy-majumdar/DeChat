package p296bf;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.zip.ZipFile;

/* renamed from: bf.c */
public final class C79696c {
    /* renamed from: a */
    public static void m96814a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof ZipFile) {
                    ((ZipFile) obj).close();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m96815b(File file, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                try {
                    int read = bufferedInputStream2.read(bArr);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        m96814a(bufferedInputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    m96814a(bufferedInputStream);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            m96814a(bufferedInputStream);
            throw th;
        }
    }
}
