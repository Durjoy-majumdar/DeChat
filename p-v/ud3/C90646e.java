package ud3;

import a70.C112760b;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.webkit.MimeTypeMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import ld2.C46848g;

/* renamed from: ud3.e */
public class C90646e {

    /* renamed from: a */
    public static final String f260411a = ("/storage/emulated/" + (Process.myUid() / 100000) + "/");

    /* renamed from: b */
    public static Boolean f260412b = null;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: android.database.Cursor} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r5 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r5 != null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a7, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        r6 = "share_file" + m113614c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bf, code lost:
        r1 = new com.tencent.p014mm.vfs.C86009m1(a70.C112760b.m154247s(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        if (r1.mo119967g() == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ce, code lost:
        r1 = new com.tencent.p014mm.vfs.C86009m1(com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(com.tencent.p014mm.pluginsdk.model.app.C72695v.m85067i(), r6, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2 = com.tencent.p014mm.vfs.C86013q1.m106426H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r12 = r12.openInputStream(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        if (r12 != 0) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r13 = new android.util.Pair<>((java.lang.Object) null, java.lang.Boolean.valueOf(r4));
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12);
        com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r13 = new byte[1024];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fb, code lost:
        r3 = r12.read(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ff, code lost:
        if (r3 <= 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        r2.write(r13, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0105, code lost:
        r13 = new android.util.Pair<>(r1.mo119971i(), java.lang.Boolean.valueOf(r4));
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        r13 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0118, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011a, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011d, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011e, code lost:
        r12 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.ShareUtil", r13, "copy google photo img fail", new java.lang.Object[0]);
        r13 = new android.util.Pair<>((java.lang.Object) null, java.lang.Boolean.valueOf(r4));
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0131, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0132, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0133, code lost:
        com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0);
        com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0139, code lost:
        throw r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.util.Pair<java.lang.String, java.lang.Boolean> m113612a(android.content.ContentResolver r12, android.net.Uri r13, int r14) {
        /*
            java.lang.String r14 = "MicroMsg.ShareUtil"
            r0 = 0
            if (r13 != 0) goto L_0x000d
            android.util.Pair r12 = new android.util.Pair
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r12.<init>(r0, r13)
            return r12
        L_0x000d:
            java.lang.String r1 = r12.getType(r13)
            java.lang.String r2 = m113614c(r1)
            java.lang.String r3 = "/"
            java.lang.String r4 = "_data"
            java.lang.String[] r7 = new java.lang.String[]{r4}
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = 1
            r11 = 0
            r5 = r12
            r6 = r13
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            if (r5 == 0) goto L_0x006f
            boolean r6 = r5.moveToFirst()     // Catch:{ Exception -> 0x006d }
            if (r6 == 0) goto L_0x006f
            java.lang.String r6 = r5.getString(r11)     // Catch:{ Exception -> 0x006d }
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ Exception -> 0x006d }
            java.lang.String r7 = r6.getPath()     // Catch:{ Exception -> 0x006d }
            if (r7 == 0) goto L_0x0058
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r11, r11)     // Catch:{ Exception -> 0x006d }
            java.lang.String r8 = r6.getPath()     // Catch:{ Exception -> 0x006d }
            boolean r8 = r8.equals(r7)     // Catch:{ Exception -> 0x006d }
            if (r8 != 0) goto L_0x0058
            android.net.Uri$Builder r6 = r6.buildUpon()     // Catch:{ Exception -> 0x006d }
            android.net.Uri$Builder r6 = r6.path(r7)     // Catch:{ Exception -> 0x006d }
            android.net.Uri r6 = r6.build()     // Catch:{ Exception -> 0x006d }
        L_0x0058:
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception -> 0x006d }
            int r7 = r6.lastIndexOf(r3)     // Catch:{ Exception -> 0x006d }
            if (r7 >= 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            int r7 = r7 + r4
            java.lang.String r6 = r6.substring(r7)     // Catch:{ Exception -> 0x006d }
            goto L_0x0070
        L_0x0069:
            r12 = move-exception
            r0 = r5
            goto L_0x013a
        L_0x006d:
            r6 = move-exception
            goto L_0x0078
        L_0x006f:
            r6 = r0
        L_0x0070:
            if (r5 == 0) goto L_0x00a3
            goto L_0x00a0
        L_0x0073:
            r12 = move-exception
            goto L_0x013a
        L_0x0076:
            r6 = move-exception
            r5 = r0
        L_0x0078:
            java.lang.String r7 = "getFileName"
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{ all -> 0x0069 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r6, r7, r8)     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = r13.toString()     // Catch:{ Exception -> 0x0095 }
            java.lang.String r7 = "utf8"
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r7)     // Catch:{ Exception -> 0x0095 }
            java.lang.String[] r3 = r6.split(r3)     // Catch:{ Exception -> 0x0095 }
            int r6 = r3.length     // Catch:{ Exception -> 0x0095 }
            int r6 = r6 + -1
            r3 = r3[r6]     // Catch:{ Exception -> 0x0095 }
            r6 = r3
            goto L_0x009e
        L_0x0095:
            r3 = move-exception
            java.lang.String r6 = "getFileName From Uri"
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ all -> 0x0069 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r3, r6, r7)     // Catch:{ all -> 0x0069 }
            r6 = r0
        L_0x009e:
            if (r5 == 0) goto L_0x00a3
        L_0x00a0:
            r5.close()
        L_0x00a3:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r3 == 0) goto L_0x00bf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "share_file"
            r3.append(r5)
            java.lang.String r1 = m113614c(r1)
            r3.append(r1)
            java.lang.String r6 = r3.toString()
        L_0x00bf:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = a70.C112760b.m154247s()
            r1.<init>((java.lang.String) r3, (java.lang.String) r6)
            boolean r3 = r1.mo119967g()
            if (r3 == 0) goto L_0x00dc
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85067i()
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r3, r6, r2)
            r1.<init>((java.lang.String) r2)
            goto L_0x00dd
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106426H(r1)     // Catch:{ Exception -> 0x011d, all -> 0x011a }
            java.io.InputStream r12 = r12.openInputStream(r13)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            if (r12 != 0) goto L_0x00f7
            android.util.Pair r13 = new android.util.Pair     // Catch:{ Exception -> 0x0113 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0113 }
            r13.<init>(r0, r1)     // Catch:{ Exception -> 0x0113 }
        L_0x00f0:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2)
            return r13
        L_0x00f7:
            r13 = 1024(0x400, float:1.435E-42)
            byte[] r13 = new byte[r13]     // Catch:{ Exception -> 0x0113 }
        L_0x00fb:
            int r3 = r12.read(r13)     // Catch:{ Exception -> 0x0113 }
            if (r3 <= 0) goto L_0x0105
            r2.write(r13, r11, r3)     // Catch:{ Exception -> 0x0113 }
            goto L_0x00fb
        L_0x0105:
            android.util.Pair r13 = new android.util.Pair     // Catch:{ Exception -> 0x0113 }
            java.lang.String r1 = r1.mo119971i()     // Catch:{ Exception -> 0x0113 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0113 }
            r13.<init>(r1, r3)     // Catch:{ Exception -> 0x0113 }
            goto L_0x00f0
        L_0x0113:
            r13 = move-exception
            goto L_0x0120
        L_0x0115:
            r13 = move-exception
            goto L_0x0133
        L_0x0117:
            r13 = move-exception
            r12 = r0
            goto L_0x0120
        L_0x011a:
            r13 = move-exception
            r2 = r0
            goto L_0x0133
        L_0x011d:
            r13 = move-exception
            r12 = r0
            r2 = r12
        L_0x0120:
            java.lang.String r1 = "copy google photo img fail"
            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ all -> 0x0131 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r13, r1, r3)     // Catch:{ all -> 0x0131 }
            android.util.Pair r13 = new android.util.Pair     // Catch:{ all -> 0x0131 }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0131 }
            r13.<init>(r0, r14)     // Catch:{ all -> 0x0131 }
            goto L_0x00f0
        L_0x0131:
            r13 = move-exception
            r0 = r12
        L_0x0133:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r2)
            throw r13
        L_0x013a:
            if (r0 == 0) goto L_0x013f
            r0.close()
        L_0x013f:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ud3.C90646e.m113612a(android.content.ContentResolver, android.net.Uri, int):android.util.Pair");
    }

    /* renamed from: b */
    public static final String m113613b(ContentResolver contentResolver, Uri uri, int i) {
        OutputStream outputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (uri == null) {
            return null;
        }
        String type = contentResolver.getType(uri);
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getCacheDir(), "share_img_tmp_" + i + m113614c(type));
        m1Var.mo119966f();
        try {
            outputStream = C86013q1.m106426H(m1Var);
            try {
                inputStream = contentResolver.openInputStream(uri);
                if (inputStream != null) {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                outputStream.write(bArr, 0, read);
                            } else {
                                String i2 = m1Var.mo119971i();
                                Util.qualityClose(inputStream);
                                Util.qualityClose(outputStream);
                                return i2;
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            Log.printErrStackTrace("MicroMsg.ShareUtil", e, "copy google photo img fail", new Object[0]);
                            Util.qualityClose(inputStream);
                            Util.qualityClose(outputStream);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
                Log.printErrStackTrace("MicroMsg.ShareUtil", e, "copy google photo img fail", new Object[0]);
                Util.qualityClose(inputStream);
                Util.qualityClose(outputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                Util.qualityClose(inputStream2);
                Util.qualityClose(outputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            outputStream = null;
            Log.printErrStackTrace("MicroMsg.ShareUtil", e, "copy google photo img fail", new Object[0]);
            Util.qualityClose(inputStream);
            Util.qualityClose(outputStream);
            return null;
        } catch (Throwable th5) {
            th = th5;
            outputStream = null;
            Util.qualityClose(inputStream2);
            Util.qualityClose(outputStream);
            throw th;
        }
        Util.qualityClose(inputStream);
        Util.qualityClose(outputStream);
        return null;
    }

    /* renamed from: c */
    public static String m113614c(String str) {
        String[] split;
        if (Util.isNullOrNil(str)) {
            return "";
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if ((extensionFromMimeType == null || extensionFromMimeType.length() == 0) && (split = str.split("/")) != null && split.length > 1) {
            extensionFromMimeType = split[1];
        }
        return "." + extensionFromMimeType;
    }

    /* renamed from: d */
    public static String m113615d(String str) {
        OutputStream outputStream;
        FileInputStream fileInputStream;
        String str2;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ShareUtil", "[-] path is null.");
            return null;
        } else if (Build.VERSION.SDK_INT >= 29) {
            Log.m105928w("MicroMsg.ShareUtil", "[!] only do copy on system below api 29.");
            return str;
        } else {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    FileDescriptor fd = fileInputStream.getFD();
                    Method declaredMethod = FileDescriptor.class.getDeclaredMethod("getInt$", new Class[0]);
                    declaredMethod.setAccessible(true);
                    str2 = Os.readlink("/proc/self/fd/" + ((Integer) declaredMethod.invoke(fd, new Object[0])).intValue());
                } catch (Throwable unused) {
                    Log.printErrStackTrace("MicroMsg.ShareUtil", th, "[-] Fail to call getCanonicalPath.", new Object[0]);
                    str2 = str;
                }
                Log.m105925i("MicroMsg.ShareUtil", "[+] getPathToSafePlace, oldPath: %s, resolvedPath: %s", str, str2);
                if (!str.equalsIgnoreCase(str2) && !m113618g(str).equalsIgnoreCase(m113618g(str2))) {
                    Log.m105929w("MicroMsg.ShareUtil", "[!] getPathToSafePlace, oldPath[%s] is not equal to resolvedPath[%s], return null.", str, str2);
                    Util.qualityClose((Closeable) null);
                    Util.qualityClose(fileInputStream);
                    return null;
                } else if (!Util.isResolvedPathSafeToBeCopySrc(str2)) {
                    Log.m105929w("MicroMsg.ShareUtil", "[!] getPathToSafePlace, resolvedPath[%s](orig:%s) is not allowed to be a copy source, return null.", str2, str);
                    Util.qualityClose((Closeable) null);
                    Util.qualityClose(fileInputStream);
                    return null;
                } else {
                    VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                    C86009m1 m1Var = new C86009m1(C112760b.m154236i0("cpsafe"), new File(str2).getName());
                    OutputStream H = C86013q1.m106426H(m1Var);
                    try {
                        Pattern pattern = C116299g2.f349012a;
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read != -1) {
                                H.write(bArr, 0, read);
                            } else {
                                String i = C86013q1.m106448i(m1Var.mo119971i(), false);
                                Log.m105925i("MicroMsg.ShareUtil", "[+] getPathToSafePlace, copy done, oldPath: %s, returnPath: %s", str, i);
                                Util.qualityClose(H);
                                Util.qualityClose(fileInputStream);
                                return i;
                            }
                        }
                    } catch (Throwable th) {
                        Throwable th4 = th;
                        outputStream = H;
                        th = th4;
                        Log.printErrStackTrace("MicroMsg.ShareUtil", th, "[-] Failure when check and copy path '%s' to safe place.", str);
                        return null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                outputStream = fileInputStream;
                Log.printErrStackTrace("MicroMsg.ShareUtil", th, "[-] Failure when check and copy path '%s' to safe place.", str);
                return null;
            }
        }
    }

    /* renamed from: e */
    public static String m113616e(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        return C46848g.Dx0() + MD5Util.getMD5String(str + System.currentTimeMillis());
    }

    /* renamed from: f */
    public static boolean m113617f(Context context, Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null || !scheme.equalsIgnoreCase("content")) {
            return true;
        }
        int checkCallingOrSelfUriPermission = context.checkCallingOrSelfUriPermission(uri, 1);
        Log.m105925i("MicroMsg.ShareUtil", "needRequestPermission uri: %s, permission: %d", uri, Integer.valueOf(checkCallingOrSelfUriPermission));
        return checkCallingOrSelfUriPermission != 0;
    }

    /* renamed from: g */
    public static String m113618g(String str) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        if (str.startsWith("/sdcard/")) {
            return str.substring(8);
        }
        String str2 = f260411a;
        return str.startsWith(str2) ? str.substring(str2.length()) : str;
    }
}
