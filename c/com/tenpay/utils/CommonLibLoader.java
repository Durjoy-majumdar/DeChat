package com.tenpay.utils;

import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CommonLibLoader {
    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(2:4|(2:6|7)(2:8|(1:10)(2:11|12)))|13|(2:14|(1:16)(1:27))|17|(2:19|20)|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean extractAndLoadLibFile(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Class<com.tenpay.utils.CommonLibLoader> r0 = com.tenpay.utils.CommonLibLoader.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = "/"
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r8, r7)
            r2 = 0
            boolean r3 = r1.exists()     // Catch:{ IOException -> 0x00b0 }
            if (r3 == 0) goto L_0x0060
            java.io.InputStream r3 = r0.getResourceAsStream(r6)     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r3 = md5sum(r3)     // Catch:{ IOException -> 0x00b0 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b0 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r4 = md5sum(r4)     // Catch:{ IOException -> 0x00b0 }
            boolean r3 = r3.equals(r4)     // Catch:{ IOException -> 0x00b0 }
            if (r3 == 0) goto L_0x003e
            boolean r6 = loadNativeLib(r8, r7)     // Catch:{ IOException -> 0x00b0 }
            return r6
        L_0x003e:
            boolean r3 = r1.delete()     // Catch:{ IOException -> 0x00b0 }
            if (r3 == 0) goto L_0x0045
            goto L_0x0060
        L_0x0045:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x00b0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b0 }
            r7.<init>()     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r8 = "failed to remove existing native library file: "
            r7.append(r8)     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r8 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x00b0 }
            r7.append(r8)     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00b0 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00b0 }
            throw r6     // Catch:{ IOException -> 0x00b0 }
        L_0x0060:
            java.io.InputStream r6 = r0.getResourceAsStream(r6)     // Catch:{ IOException -> 0x00b0 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b0 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b0 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x00b0 }
        L_0x006d:
            int r4 = r6.read(r3)     // Catch:{ IOException -> 0x00b0 }
            r5 = -1
            if (r4 == r5) goto L_0x0078
            r0.write(r3, r2, r4)     // Catch:{ IOException -> 0x00b0 }
            goto L_0x006d
        L_0x0078:
            r0.close()     // Catch:{ IOException -> 0x00b0 }
            r6.close()     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r6 = "os.name"
            java.lang.String r6 = java.lang.System.getProperty(r6)     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r0 = "Windows"
            boolean r6 = r6.contains(r0)     // Catch:{ IOException -> 0x00b0 }
            if (r6 != 0) goto L_0x00ab
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x00ab }
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = "chmod"
            r0[r2] = r3     // Catch:{ all -> 0x00ab }
            r3 = 1
            java.lang.String r4 = "755"
            r0[r3] = r4     // Catch:{ all -> 0x00ab }
            r3 = 2
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x00ab }
            r0[r3] = r1     // Catch:{ all -> 0x00ab }
            java.lang.Process r6 = r6.exec(r0)     // Catch:{ all -> 0x00ab }
            r6.waitFor()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            boolean r6 = loadNativeLib(r8, r7)     // Catch:{ IOException -> 0x00b0 }
            return r6
        L_0x00b0:
            r6 = move-exception
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.String r6 = r6.getMessage()
            r7.println(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.utils.CommonLibLoader.extractAndLoadLibFile(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private static boolean extractResourceFiles(String str, String str2, String str3) {
        String[] strArr = {str2};
        boolean z = true;
        for (int i = 0; i < 1; i++) {
            z &= extractAndLoadLibFile(str, strArr[i], str3);
        }
        return z;
    }

    private static String getNativeLibPath() {
        String lowerCase = System.getProperty("os.name").toLowerCase();
        if (lowerCase.contains("win")) {
            return "/win64";
        }
        if (lowerCase.contains("nux")) {
            return "/linux";
        }
        if (lowerCase.contains(TPDownloadProxyEnum.USER_MAC)) {
            return "/mac";
        }
        return null;
    }

    public static boolean load(String str) {
        Class<CommonLibLoader> cls = CommonLibLoader.class;
        String mapLibraryName = System.mapLibraryName(str);
        if (mapLibraryName != null && mapLibraryName.endsWith("dll")) {
            mapLibraryName = "lib" + mapLibraryName;
        }
        String str2 = "/" + Platform.getNativeLibraryResourcePrefix();
        System.out.println("jar lib path=" + str2);
        if (cls.getResource(str2 + "/" + mapLibraryName) == null) {
            str2 = getNativeLibPath();
            if (cls.getResource(str2 + "/" + mapLibraryName) == null) {
                throw new Exception("Error loading native library: " + str2 + "/" + mapLibraryName);
            }
        }
        return extractResourceFiles(str2, mapLibraryName, new File(System.getProperty("java.io.tmpdir")).getAbsolutePath());
    }

    private static synchronized boolean loadNativeLib(String str, String str2) {
        synchronized (CommonLibLoader.class) {
            if (!new File(str, str2).exists()) {
                return false;
            }
            try {
                System.load(new File(str, str2).getAbsolutePath());
                return true;
            } catch (UnsatisfiedLinkError e) {
                System.err.println(e);
                return false;
            }
        }
    }

    public static String md5sum(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            while (new DigestInputStream(bufferedInputStream, instance).read() >= 0) {
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(instance.digest());
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            bufferedInputStream.close();
            return byteArrayOutputStream2;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("MD5 algorithm is not available: " + e);
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }
}
