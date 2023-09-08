package p1054vg;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: vg.g */
public final class C90801g {
    /* renamed from: a */
    public static final String m113873a(InputStream inputStream, int i) {
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
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[SYNTHETIC, Splitter:B:25:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0049 A[SYNTHETIC, Splitter:B:32:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m113874b(java.lang.String r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L_0x004c
            r7 = 102400(0x19000, float:1.43493E-40)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0019
            goto L_0x004c
        L_0x0019:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x003e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x003e }
            long r3 = (long) r7
            long r5 = r1.length()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            long r3 = r1.length()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
        L_0x002c:
            int r7 = (int) r3     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.String r7 = m113873a(r2, r7)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r0 = r7
            goto L_0x004c
        L_0x0039:
            r7 = move-exception
            r0 = r2
            goto L_0x003f
        L_0x003c:
            goto L_0x0047
        L_0x003e:
            r7 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            throw r7
        L_0x0045:
            r2 = r0
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1054vg.C90801g.m113874b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static final String m113875c(InputStream inputStream, int i, int i2, int i3, byte[] bArr) {
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
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
