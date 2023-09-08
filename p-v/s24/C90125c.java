package s24;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import t24.C90367a;
import t24.C90368b;

/* renamed from: s24.c */
public class C90125c {

    /* renamed from: a */
    public static final /* synthetic */ int f258817a = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        throw r2;
     */
    static {
        /*
            char r0 = java.io.File.separatorChar
            t24.b r0 = new t24.b
            r1 = 4
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            r1.println()     // Catch:{ all -> 0x0017 }
            r0.toString()     // Catch:{ all -> 0x0017 }
            r1.close()     // Catch:{ all -> 0x0023 }
            return
        L_0x0017:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x0023 }
        L_0x0022:
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s24.C90125c.<clinit>():void");
    }

    @Deprecated
    /* renamed from: a */
    public static void m112774a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m112775b(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* renamed from: c */
    public static byte[] m112776c(InputStream inputStream) {
        C90367a aVar = new C90367a();
        m112775b(inputStream, aVar);
        return aVar.mo124580b();
    }

    /* renamed from: d */
    public static String m112777d(InputStream inputStream, Charset charset) {
        C90368b bVar = new C90368b();
        Charset charset2 = C77613a.f226275a;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return bVar.toString();
            }
            bVar.write(cArr, 0, read);
        }
    }
}
