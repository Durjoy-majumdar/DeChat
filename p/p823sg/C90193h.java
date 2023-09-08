package p823sg;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: sg.h */
public final class C90193h {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0030 A[SYNTHETIC, Splitter:B:22:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0037 A[SYNTHETIC, Splitter:B:30:0x0037] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m112873a(com.tencent.p014mm.vfs.C86009m1 r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x003a
            if (r7 <= 0) goto L_0x003a
            boolean r1 = r6.mo119967g()
            if (r1 != 0) goto L_0x000c
            goto L_0x003a
        L_0x000c:
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106422D(r6)     // Catch:{ Exception -> 0x0034, all -> 0x002d }
            long r2 = (long) r7
            long r4 = r6.mo119980r()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            long r2 = r6.mo119980r()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
        L_0x001e:
            int r6 = (int) r2     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            java.lang.String r6 = m112874b(r1, r6)     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r1.close()     // Catch:{ Exception -> 0x0035, all -> 0x002a }
            r1.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r6
        L_0x002a:
            r6 = move-exception
            r0 = r1
            goto L_0x002e
        L_0x002d:
            r6 = move-exception
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r6
        L_0x0034:
            r1 = r0
        L_0x0035:
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p823sg.C90193h.m112873a(com.tencent.mm.vfs.m1, int):java.lang.String");
    }

    /* renamed from: b */
    public static final String m112874b(InputStream inputStream, int i) {
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

    /* renamed from: c */
    public static final String m112875c(InputStream inputStream, int i, int i2, int i3) {
        if (inputStream == null || i <= 0 || i2 < 0 || i3 <= 0) {
            return null;
        }
        long j = (long) i2;
        try {
            if (inputStream.skip(j) < j) {
                return null;
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            StringBuilder sb = new StringBuilder(32);
            byte[] bArr = new byte[i];
            int i4 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1 || i4 >= i3) {
                    byte[] digest = instance.digest();
                } else {
                    int i5 = i4 + read;
                    if (i5 <= i3) {
                        instance.update(bArr, 0, read);
                        i4 = i5;
                    } else {
                        instance.update(bArr, 0, i3 - i4);
                        i4 = i3;
                    }
                }
            }
            byte[] digest2 = instance.digest();
            for (byte b : digest2) {
                sb.append(Integer.toString((b & ExifInterface.MARKER) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m112876d(String str) {
        if (str == null) {
            return null;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g()) {
            return m112873a(m1Var, 102400);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0035 A[SYNTHETIC, Splitter:B:23:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003d A[SYNTHETIC, Splitter:B:30:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m112877e(java.lang.String r2, int r3, int r4) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r2)
            boolean r2 = r1.mo119967g()
            if (r2 == 0) goto L_0x0040
            boolean r2 = r1.mo119967g()
            if (r2 == 0) goto L_0x0040
            if (r3 < 0) goto L_0x0040
            if (r4 > 0) goto L_0x001a
            goto L_0x0040
        L_0x001a:
            java.io.InputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106422D(r1)     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            r1 = 102400(0x19000, float:1.43493E-40)
            java.lang.String r3 = m112875c(r2, r1, r3, r4)     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            r2.close()     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            r2.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            r0 = r3
            goto L_0x0040
        L_0x002d:
            r3 = move-exception
            r0 = r2
            goto L_0x0033
        L_0x0030:
            goto L_0x003b
        L_0x0032:
            r3 = move-exception
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            throw r3
        L_0x0039:
            r2 = r0
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p823sg.C90193h.m112877e(java.lang.String, int, int):java.lang.String");
    }

    /* renamed from: f */
    public static final String m112878f(byte[] bArr) {
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
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static final byte[] m112879g(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
