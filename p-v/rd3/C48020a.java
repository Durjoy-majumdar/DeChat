package rd3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: rd3.a */
public final class C48020a {
    /* renamed from: a */
    public static boolean m53384a(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(str);
        Log.m105925i("MicroMsg.ResDownloaderFileUtils", "deleteFilePath, %s -> %s", str, C86013q1.m106448i(str, false));
        return !m1Var.mo119967g() || m1Var.mo119966f();
    }

    /* renamed from: b */
    public static boolean m53385b(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(str);
        return m1Var.mo119967g() && m1Var.mo119978p();
    }

    /* renamed from: c */
    public static long m53386c(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        C86009m1 m1Var = new C86009m1(str);
        Log.m105925i("MicroMsg.ResDownloaderFileUtils", "getFileLength %s -> %s", str, C86013q1.m106448i(str, false));
        if (m1Var.mo119978p()) {
            return m1Var.mo119980r();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m53387d(java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.ResDownloaderFileUtils"
            r2 = 0
            r3 = 0
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106423E(r8)     // Catch:{ FileNotFoundException -> 0x0058, IOException -> 0x004f, all -> 0x004c }
            java.lang.String r5 = "readBytes %s -> %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046, all -> 0x0042 }
            r6[r3] = r8     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046, all -> 0x0042 }
            r7 = 1
            java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106448i(r8, r3)     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046, all -> 0x0042 }
            r6[r7] = r8     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046, all -> 0x0042 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r6)     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046, all -> 0x0042 }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046, all -> 0x0042 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x0049, IOException -> 0x0046, all -> 0x0042 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003e }
        L_0x0025:
            int r6 = r4.read(r5)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003e }
            r7 = -1
            if (r6 == r7) goto L_0x0030
            r8.write(r5, r3, r6)     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003e }
            goto L_0x0025
        L_0x0030:
            r8.flush()     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003e }
            byte[] r0 = r8.toByteArray()     // Catch:{ FileNotFoundException -> 0x0040, IOException -> 0x003e }
            m53388e(r4)
            m53388e(r8)
            return r0
        L_0x003e:
            r5 = move-exception
            goto L_0x0052
        L_0x0040:
            r5 = move-exception
            goto L_0x005b
        L_0x0042:
            r0 = move-exception
            r8 = r2
        L_0x0044:
            r2 = r4
            goto L_0x0069
        L_0x0046:
            r5 = move-exception
            r8 = r2
            goto L_0x0052
        L_0x0049:
            r5 = move-exception
            r8 = r2
            goto L_0x005b
        L_0x004c:
            r0 = move-exception
            r8 = r2
            goto L_0x0069
        L_0x004f:
            r5 = move-exception
            r8 = r2
            r4 = r8
        L_0x0052:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0067 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r3)     // Catch:{ all -> 0x0067 }
            goto L_0x0060
        L_0x0058:
            r5 = move-exception
            r8 = r2
            r4 = r8
        L_0x005b:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0067 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r5, r0, r3)     // Catch:{ all -> 0x0067 }
        L_0x0060:
            m53388e(r4)
            m53388e(r8)
            return r2
        L_0x0067:
            r0 = move-exception
            goto L_0x0044
        L_0x0069:
            m53388e(r2)
            m53388e(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rd3.C48020a.m53387d(java.lang.String):byte[]");
    }

    /* renamed from: e */
    public static void m53388e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", e, "", new Object[0]);
                Log.m105920e("MicroMsg.ResDownloaderFileUtils", String.format("%s close failed (%s)", new Object[]{closeable.getClass().getSimpleName(), e.getMessage()}));
            }
        }
    }

    /* renamed from: f */
    public static boolean m53389f(String str, byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(str);
        Log.m105925i("MicroMsg.ResDownloaderFileUtils", "writeBytes %s -> %s", str, C86013q1.m106448i(str, false));
        m1Var.mo119966f();
        m1Var.mo119974l().mo119987x();
        OutputStream outputStream = null;
        try {
            outputStream = C86013q1.m106426H(m1Var);
            outputStream.write(bArr);
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", e, "", new Object[0]);
            }
            return true;
        } catch (FileNotFoundException e2) {
            Log.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", e2, "", new Object[0]);
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e3) {
                    Log.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", e3, "", new Object[0]);
                }
            }
        } catch (IOException e4) {
            Log.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", e4, "", new Object[0]);
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e5) {
                    Log.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", e5, "", new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e6) {
                    Log.printErrStackTrace("MicroMsg.ResDownloaderFileUtils", e6, "", new Object[0]);
                }
            }
            throw th;
        }
        return false;
    }
}
