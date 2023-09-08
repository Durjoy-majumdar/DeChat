package ys3;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: ys3.a */
public class C118989a {

    /* renamed from: a */
    public static final byte[] f356420a = {Byte.MAX_VALUE, 69, 76, 70};

    /* renamed from: a */
    public static boolean m167751a(String str) {
        byte[] bArr = new byte[4];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (fileInputStream2.read(bArr, 0, 4) == 4) {
                    int i = 0;
                    while (true) {
                        byte[] bArr2 = f356420a;
                        if (i >= 4) {
                            C118990b.m167754a(fileInputStream2);
                            return true;
                        } else if (bArr2[i] != bArr[i]) {
                            C118990b.m167754a(fileInputStream2);
                            return false;
                        } else {
                            i++;
                        }
                    }
                } else {
                    throw new IOException("Read bytes less than 4");
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C118990b.m167754a(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            C118990b.m167754a(fileInputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m167752b(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(fileInputStream.available());
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                C118990b.m167754a(fileInputStream);
                C118990b.m167754a(byteArrayOutputStream);
                throw th;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (-1 == read) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray == null) {
                    byteArray = "".getBytes();
                }
                C118990b.m167754a(fileInputStream);
                C118990b.m167754a(byteArrayOutputStream);
                return byteArray;
            } catch (Throwable th5) {
                th = th5;
                C118990b.m167754a(fileInputStream);
                C118990b.m167754a(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th6) {
            fileInputStream = null;
            th = th6;
            byteArrayOutputStream = null;
            C118990b.m167754a(fileInputStream);
            C118990b.m167754a(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m167753c(java.lang.String r6, int r7) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.exists()
            r1 = 0
            if (r6 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0034 }
            r6.<init>(r0)     // Catch:{ all -> 0x0034 }
            byte[] r0 = new byte[r7]     // Catch:{ all -> 0x0035 }
            r2 = 0
            r3 = 0
        L_0x0016:
            int r4 = r7 - r3
            int r4 = r6.read(r0, r3, r4)     // Catch:{ all -> 0x0035 }
            r5 = -1
            if (r4 == r5) goto L_0x0022
            int r3 = r3 + r4
            if (r3 < r7) goto L_0x0016
        L_0x0022:
            if (r3 != 0) goto L_0x0028
            ys3.C118990b.m167754a(r6)
            return r1
        L_0x0028:
            if (r3 >= r7) goto L_0x0030
            byte[] r7 = new byte[r3]     // Catch:{ all -> 0x0035 }
            java.lang.System.arraycopy(r0, r2, r7, r2, r3)     // Catch:{ all -> 0x0035 }
            r0 = r7
        L_0x0030:
            ys3.C118990b.m167754a(r6)
            return r0
        L_0x0034:
            r6 = r1
        L_0x0035:
            ys3.C118990b.m167754a(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ys3.C118989a.m167753c(java.lang.String, int):byte[]");
    }
}
