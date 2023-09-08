package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p225rc.C89912a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.d0 */
public final class C81412d0 {
    /* renamed from: a */
    public static boolean m99867a(C86009m1 m1Var) {
        if (m1Var == null) {
            throw new NullPointerException("file should not be NULL");
        } else if (!m1Var.mo119967g()) {
            return false;
        } else {
            try {
                FileStructStat fileStructStat = new FileStructStat();
                if (FileStat.vfsStat(m1Var.mo119971i(), fileStructStat) == 0) {
                    Log.m105925i("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "constainsSymLink, path %s, stat.st_mode %d", m1Var.mo119971i(), Integer.valueOf(fileStructStat.st_mode));
                    return fileStructStat.isSymLink();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e, "", new Object[0]);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static String m99868b(String str, boolean z) {
        int i = 0;
        if (z) {
            Log.m105919d("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "eliminateDuplicateSlashForPkgFile, original file name = [%s]", str);
        }
        if (Util.isNullOrNil(str)) {
            return "";
        }
        String trim = str.trim();
        if (!trim.startsWith("/")) {
            return "/" + trim;
        }
        while (i < trim.length() && '/' == trim.charAt(i)) {
            i++;
        }
        return "/" + trim.substring(i);
    }

    /* renamed from: c */
    public static long m99869c(C86009m1 m1Var) {
        if (m1Var == null) {
            return -1;
        }
        C86009m1[] u = m1Var.mo119984u();
        long j = 0;
        if (u == null) {
            return 0;
        }
        for (C86009m1 m1Var2 : u) {
            j += m1Var2.mo119978p() ? m1Var2.mo119980r() : m99869c(m1Var2);
        }
        return j;
    }

    /* renamed from: d */
    public static ByteBuffer m99870d(C86009m1 m1Var, long j, long j2) {
        RandomAccessFile B;
        if (m1Var == null || !m1Var.mo119967g() || !m1Var.mo119978p()) {
            return ByteBuffer.allocateDirect(0);
        }
        int r = (int) m1Var.mo119980r();
        if (r < 0) {
            return ByteBuffer.allocateDirect(0);
        }
        if ((j + j2) - 1 > ((long) (r - 1))) {
            return ByteBuffer.allocateDirect(0);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(r);
        long j3 = (long) r;
        if (j2 < 0) {
            j2 = j3;
        }
        try {
            B = C86013q1.m106420B(m1Var.mo119971i(), false);
            B.getChannel().read(allocateDirect);
            allocateDirect.flip();
            if (j == 0 && j2 == j3) {
                B.close();
                return allocateDirect;
            }
            int i = (int) j2;
            byte[] bArr = new byte[i];
            allocateDirect.position((int) j);
            allocateDirect.get(bArr, 0, i);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            B.close();
            return wrap;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e, "readAsDirectByteBuffer", new Object[0]);
            C89912a.m112442a(allocateDirect);
            return ByteBuffer.allocateDirect(0);
        } catch (BufferOverflowException unused) {
            Log.m105921e("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "BufferOverflow, file_length %d, byte_allocated %d", Long.valueOf(m1Var.mo119980r()), Integer.valueOf(allocateDirect.capacity()));
            C89912a.m112442a(allocateDirect);
            return ByteBuffer.allocateDirect(0);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r13 != com.tencent.p014mm.sdk.platformtools.MAlarmHandler.NEXT_FIRE_INTERVAL) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r13 = ((long) r2.size()) - r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r8 = (int) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        if (r8 < 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r11 <= ((long) (r2.size() - 1))) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        r10 = (int) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r10 < 1) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r13 <= (((long) r2.size()) - r11)) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008a, code lost:
        r11 = new byte[r10];
        java.lang.System.arraycopy(r2.toByteArray(), r8, r11, 0, r10);
        r0.put(r4, java.nio.ByteBuffer.wrap(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_ILLEGAL_READ_LENGTH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a6, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_ILLEGAL_READ_POSITION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ac, code lost:
        com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00af, code lost:
        return r8;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0 m99871e(java.lang.String r8, js0.C9514m<java.util.Map<java.lang.String, java.nio.ByteBuffer>> r9, java.lang.String r10, long r11, long r13) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            r2 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00da }
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r8)     // Catch:{ Exception -> 0x00da }
            r3.<init>(r8)     // Catch:{ Exception -> 0x00da }
            r8 = 16384(0x4000, float:2.2959E-41)
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
        L_0x0014:
            java.util.zip.ZipEntry r2 = r3.getNextEntry()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            if (r2 == 0) goto L_0x00ca
            java.lang.String r4 = r2.getName()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            java.lang.String r5 = "../"
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            if (r5 != 0) goto L_0x0014
            java.lang.String r5 = "..\\"
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            if (r5 == 0) goto L_0x002f
            goto L_0x0014
        L_0x002f:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.equals(r10)     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            if (r5 != 0) goto L_0x003c
            goto L_0x0014
        L_0x003c:
            boolean r2 = r2.isDirectory()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            if (r2 != 0) goto L_0x0014
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            r2.<init>()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
        L_0x0047:
            int r5 = r3.read(r8)     // Catch:{ all -> 0x00c0 }
            r6 = -1
            if (r5 == r6) goto L_0x0052
            r2.write(r8, r1, r5)     // Catch:{ all -> 0x00c0 }
            goto L_0x0047
        L_0x0052:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ all -> 0x00c0 }
            if (r5 != 0) goto L_0x00b0
            boolean r5 = r4.equals(r10)     // Catch:{ all -> 0x00c0 }
            if (r5 == 0) goto L_0x00b0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x006d
            int r8 = r2.size()     // Catch:{ all -> 0x00c0 }
            long r13 = (long) r8     // Catch:{ all -> 0x00c0 }
            long r13 = r13 - r11
        L_0x006d:
            int r8 = (int) r11     // Catch:{ all -> 0x00c0 }
            if (r8 < 0) goto L_0x00a7
            int r10 = r2.size()     // Catch:{ all -> 0x00c0 }
            r5 = 1
            int r10 = r10 - r5
            long r6 = (long) r10     // Catch:{ all -> 0x00c0 }
            int r10 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x007c
            goto L_0x00a7
        L_0x007c:
            int r10 = (int) r13     // Catch:{ all -> 0x00c0 }
            if (r10 < r5) goto L_0x009e
            int r5 = r2.size()     // Catch:{ all -> 0x00c0 }
            long r5 = (long) r5     // Catch:{ all -> 0x00c0 }
            long r5 = r5 - r11
            int r11 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x008a
            goto L_0x009e
        L_0x008a:
            byte[] r11 = new byte[r10]     // Catch:{ all -> 0x00c0 }
            byte[] r12 = r2.toByteArray()     // Catch:{ all -> 0x00c0 }
            java.lang.System.arraycopy(r12, r8, r11, r1, r10)     // Catch:{ all -> 0x00c0 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r11)     // Catch:{ all -> 0x00c0 }
            r0.put(r4, r8)     // Catch:{ all -> 0x00c0 }
            r2.close()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            goto L_0x00ca
        L_0x009e:
            com.tencent.mm.plugin.appbrand.appstorage.b0 r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_ILLEGAL_READ_LENGTH     // Catch:{ all -> 0x00c0 }
            r2.close()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            return r8
        L_0x00a7:
            com.tencent.mm.plugin.appbrand.appstorage.b0 r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_ILLEGAL_READ_POSITION     // Catch:{ all -> 0x00c0 }
            r2.close()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            return r8
        L_0x00b0:
            byte[] r5 = r2.toByteArray()     // Catch:{ all -> 0x00c0 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ all -> 0x00c0 }
            r0.put(r4, r5)     // Catch:{ all -> 0x00c0 }
            r2.close()     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            goto L_0x0014
        L_0x00c0:
            r8 = move-exception
            r2.close()     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
        L_0x00c9:
            throw r8     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
        L_0x00ca:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            r9.f29691a = r0
            com.tencent.mm.plugin.appbrand.appstorage.b0 r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
            return r8
        L_0x00d2:
            r8 = move-exception
            r2 = r3
            goto L_0x00eb
        L_0x00d5:
            r8 = move-exception
            r2 = r3
            goto L_0x00db
        L_0x00d8:
            r8 = move-exception
            goto L_0x00eb
        L_0x00da:
            r8 = move-exception
        L_0x00db:
            java.lang.String r9 = "MicroMsg.AppBrand.FileSystemUtil[ZIP]"
            java.lang.String r10 = "readZipEntry"
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ all -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r8, r10, r11)     // Catch:{ all -> 0x00d8 }
            com.tencent.mm.plugin.appbrand.appstorage.b0 r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_OP_FAIL     // Catch:{ all -> 0x00d8 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2)
            return r8
        L_0x00eb:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99871e(java.lang.String, js0.m, java.lang.String, long, long):com.tencent.mm.plugin.appbrand.appstorage.b0");
    }

    /* renamed from: f */
    public static void m99872f(C86009m1 m1Var) {
        if (m1Var != null && m1Var.mo119977o() && m1Var.mo119967g()) {
            C86009m1[] u = m1Var.mo119984u();
            if (u != null) {
                for (C86009m1 m1Var2 : u) {
                    if (m1Var2.mo119977o()) {
                        m99872f(m1Var2);
                    }
                    m1Var2.mo119966f();
                }
            }
            m1Var.mo119966f();
        }
    }

    /* renamed from: g */
    public static void m99873g(C86009m1 m1Var, C86011o1 o1Var) {
        C86009m1[] v = m1Var.mo119985v(o1Var);
        if (v != null) {
            for (C86009m1 m1Var2 : v) {
                if (m1Var2.mo119977o()) {
                    m99873g(m1Var2, o1Var);
                }
            }
        }
    }

    /* renamed from: h */
    public static String m99874h(String str) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        int i = 0;
        while (i < str.length() && '/' == str.charAt(i)) {
            i++;
        }
        return str.substring(i);
    }

    /* renamed from: i */
    public static String m99875i(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        while (i < str.length() && '/' == str.charAt(i)) {
            i++;
        }
        return str.substring(i);
    }

    /* renamed from: j */
    public static int m99876j(ZipInputStream zipInputStream, String str) {
        int i;
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (!name.contains("../")) {
                        if (!name.contains("..\\")) {
                            if (nextEntry.isDirectory()) {
                                String substring = name.substring(0, name.length() - 1);
                                Uri n = C116299g2.m163858n(str + "/" + substring);
                                String path = n.getPath();
                                if (path != null) {
                                    String k = C116299g2.m163855k(path, false, false);
                                    if (!n.getPath().equals(k)) {
                                        n = n.buildUpon().path(k).build();
                                    }
                                }
                                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                                if (l.mo177810a()) {
                                    l.f348991a.mo119937g(l.f348992b);
                                }
                            } else {
                                C86009m1 m1Var = new C86009m1(str + "/" + name);
                                m1Var.mo119974l().mo119987x();
                                m1Var.mo119964e();
                                OutputStream H = C86013q1.m106426H(m1Var);
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    H.write(bArr, 0, read);
                                    H.flush();
                                }
                                Util.qualityClose(H);
                            }
                        }
                    }
                } else {
                    Util.qualityClose(zipInputStream);
                    return 0;
                }
            }
        } catch (Exception e) {
            throw e;
        } catch (FileNotFoundException e2) {
            Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e2, "unzipBytes", new Object[0]);
            Util.qualityClose(zipInputStream);
            return -1;
        } catch (IOException e3) {
            Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e3, "unzipBytes", new Object[0]);
            i = -2;
        } catch (OutOfMemoryError e4) {
            Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e4, "unzipBytes", new Object[0]);
            i = -3;
        } catch (Throwable th) {
            Util.qualityClose(zipInputStream);
            throw th;
        }
        Util.qualityClose(zipInputStream);
        return i;
    }
}
