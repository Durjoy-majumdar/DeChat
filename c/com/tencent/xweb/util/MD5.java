package com.tencent.xweb.util;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class MD5 {
    private MD5() {
    }

    public static boolean checkMD5(String str, String str2) {
        String md5 = getMD5(str);
        return (md5 == null || str2 == null || !str2.equalsIgnoreCase(md5)) ? false : true;
    }

    public static final String getMD5(InputStream inputStream, int i, int i2, int i3) {
        return getMD5ExtendBytes(inputStream, i, i2, i3, (byte[]) null);
    }

    public static final String getMD5ExtendBytes(InputStream inputStream, int i, int i2, int i3, byte[] bArr) {
        if (inputStream != null && i > 0 && i2 >= 0 && i3 > 0) {
            long j = (long) i2;
            try {
                if (inputStream.skip(j) < j) {
                    return null;
                }
                MessageDigest instance = MessageDigest.getInstance("MD5");
                StringBuilder sb = new StringBuilder(32);
                byte[] bArr2 = new byte[i];
                int i4 = 0;
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read != -1 && i4 < i3) {
                        int i5 = i4 + read;
                        if (i5 <= i3) {
                            instance.update(bArr2, 0, read);
                            i4 = i5;
                        } else {
                            instance.update(bArr2, 0, i3 - i4);
                            i4 = i3;
                        }
                    } else if (bArr != null && bArr.length > 0) {
                        instance.update(bArr);
                    }
                }
                instance.update(bArr);
                byte[] digest = instance.digest();
                for (byte b : digest) {
                    sb.append(Integer.toString((b & ExifInterface.MARKER) + 256, 16).substring(1));
                }
                return sb.toString();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final String getMessageDigest(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            char[] cArr2 = new char[(r1 * 2)];
            int i = 0;
            for (byte b : instance.digest()) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final byte[] getRawDigest(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String getMD5(InputStream inputStream, int i) {
        int i2;
        if (inputStream != null && i > 0) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                StringBuilder sb = new StringBuilder(32);
                byte[] bArr = new byte[i];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                }
                byte[] digest = instance.digest();
                for (byte b : digest) {
                    sb.append(Integer.toString((b & ExifInterface.MARKER) + 256, 16).substring(1));
                }
                return sb.toString();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String getMD5(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return getMD5(file, 102400);
        }
        return null;
    }

    public static String getMD5(File file) {
        return getMD5(file, 102400);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A[SYNTHETIC, Splitter:B:19:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMD5ExtendBytes(java.io.File r2, int r3, int r4, byte[] r5) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0027
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x0027
            if (r3 < 0) goto L_0x0027
            if (r4 > 0) goto L_0x000e
            goto L_0x0027
        L_0x000e:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            r2 = 102400(0x19000, float:1.43493E-40)
            java.lang.String r2 = getMD5ExtendBytes(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            return r2
        L_0x0021:
            r1 = r0
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.MD5.getMD5ExtendBytes(java.io.File, int, int, byte[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002e A[SYNTHETIC, Splitter:B:22:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMD5(java.io.File r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0031
            if (r7 <= 0) goto L_0x0031
            boolean r1 = r6.exists()
            if (r1 != 0) goto L_0x000c
            goto L_0x0031
        L_0x000c:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x002b }
            r1.<init>(r6)     // Catch:{ all -> 0x002b }
            long r2 = (long) r7
            long r4 = r6.length()     // Catch:{ all -> 0x002c }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            long r2 = r6.length()     // Catch:{ all -> 0x002c }
        L_0x001f:
            int r6 = (int) r2     // Catch:{ all -> 0x002c }
            java.lang.String r6 = getMD5((java.io.InputStream) r1, (int) r6)     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            return r6
        L_0x002b:
            r1 = r0
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.MD5.getMD5(java.io.File, int):java.lang.String");
    }

    public static String getMD5(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            return getMD5(file, i, i2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A[SYNTHETIC, Splitter:B:19:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMD5(java.io.File r2, int r3, int r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0027
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x0027
            if (r3 < 0) goto L_0x0027
            if (r4 > 0) goto L_0x000e
            goto L_0x0027
        L_0x000e:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            r2 = 102400(0x19000, float:1.43493E-40)
            java.lang.String r2 = getMD5(r1, r2, r3, r4)     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            return r2
        L_0x0021:
            r1 = r0
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.MD5.getMD5(java.io.File, int, int):java.lang.String");
    }
}
