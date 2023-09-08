package com.tencent.p014mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.tencent.mm.sdk.platformtools.MMNativeWebP */
public final class MMNativeWebP {
    public static final String TAG = "MMWEBP.JAVA";
    public static final int WEBP_MIN_HEADER_SIZE = 256;

    /* JADX WARNING: Can't wrap try/catch for region: R(15:8|9|10|11|12|13|14|(2:17|15)|88|18|19|20|21|22|23) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085 A[SYNTHETIC, Splitter:B:43:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c A[SYNTHETIC, Splitter:B:47:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c A[SYNTHETIC, Splitter:B:56:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3 A[SYNTHETIC, Splitter:B:60:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b3 A[SYNTHETIC, Splitter:B:69:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ba A[SYNTHETIC, Splitter:B:73:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00c2 A[SYNTHETIC, Splitter:B:80:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00c9 A[SYNTHETIC, Splitter:B:84:0x00c9] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x0093=Splitter:B:53:0x0093, B:66:0x00aa=Splitter:B:66:0x00aa, B:40:0x007c=Splitter:B:40:0x007c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap DecodeWebPFile(java.lang.String r10) {
        /*
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r10)
            boolean r1 = r0.mo119967g()
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MMWEBP.JAVA"
            r5 = 0
            if (r1 != 0) goto L_0x001a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r10
            java.lang.String r10 = "file %s not exists."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r0)
            return r5
        L_0x001a:
            long r6 = r0.mo119980r()
            r8 = 256(0x100, double:1.265E-321)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x002f
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r10
            java.lang.String r10 = "too small webp file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r0)
            return r5
        L_0x002f:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00a7, NullPointerException -> 0x0090, RuntimeException -> 0x0079, all -> 0x0076 }
            long r1 = r0.mo119980r()     // Catch:{ IOException -> 0x00a7, NullPointerException -> 0x0090, RuntimeException -> 0x0079, all -> 0x0076 }
            int r2 = (int) r1     // Catch:{ IOException -> 0x00a7, NullPointerException -> 0x0090, RuntimeException -> 0x0079, all -> 0x0076 }
            r10.<init>(r2)     // Catch:{ IOException -> 0x00a7, NullPointerException -> 0x0090, RuntimeException -> 0x0079, all -> 0x0076 }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0073, NullPointerException -> 0x0070, RuntimeException -> 0x006d, all -> 0x006a }
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106422D(r0)     // Catch:{ IOException -> 0x0073, NullPointerException -> 0x0070, RuntimeException -> 0x006d, all -> 0x006a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0073, NullPointerException -> 0x0070, RuntimeException -> 0x006d, all -> 0x006a }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, RuntimeException -> 0x0064 }
            int r6 = r1.read(r2, r3, r0)     // Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, RuntimeException -> 0x0064 }
        L_0x004a:
            r7 = -1
            if (r6 == r7) goto L_0x0055
            r10.write(r2, r3, r6)     // Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, RuntimeException -> 0x0064 }
            int r6 = r1.read(r2, r3, r0)     // Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, RuntimeException -> 0x0064 }
            goto L_0x004a
        L_0x0055:
            byte[] r0 = r10.toByteArray()     // Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, RuntimeException -> 0x0064 }
            android.graphics.Bitmap r0 = nativeDecodeByteArray(r0, r5)     // Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, RuntimeException -> 0x0064 }
            r10.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            r1.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            return r0
        L_0x0064:
            r0 = move-exception
            goto L_0x007c
        L_0x0066:
            r0 = move-exception
            goto L_0x0093
        L_0x0068:
            r0 = move-exception
            goto L_0x00aa
        L_0x006a:
            r0 = move-exception
            r1 = r5
            goto L_0x00bf
        L_0x006d:
            r0 = move-exception
            r1 = r5
            goto L_0x007c
        L_0x0070:
            r0 = move-exception
            r1 = r5
            goto L_0x0093
        L_0x0073:
            r0 = move-exception
            r1 = r5
            goto L_0x00aa
        L_0x0076:
            r0 = move-exception
            r1 = r5
            goto L_0x00c0
        L_0x0079:
            r0 = move-exception
            r10 = r5
            r1 = r10
        L_0x007c:
            java.lang.String r0 = exception2String(r0)     // Catch:{ all -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x00be }
            if (r10 == 0) goto L_0x008a
            r10.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x008a
        L_0x0089:
        L_0x008a:
            if (r1 == 0) goto L_0x008f
            r1.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return r5
        L_0x0090:
            r0 = move-exception
            r10 = r5
            r1 = r10
        L_0x0093:
            java.lang.String r0 = exception2String(r0)     // Catch:{ all -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x00be }
            if (r10 == 0) goto L_0x00a1
            r10.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a1
        L_0x00a0:
        L_0x00a1:
            if (r1 == 0) goto L_0x00a6
            r1.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            return r5
        L_0x00a7:
            r0 = move-exception
            r10 = r5
            r1 = r10
        L_0x00aa:
            java.lang.String r0 = exception2String(r0)     // Catch:{ all -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x00be }
            if (r10 == 0) goto L_0x00b8
            r10.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
            r1.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            return r5
        L_0x00be:
            r0 = move-exception
        L_0x00bf:
            r5 = r10
        L_0x00c0:
            if (r5 == 0) goto L_0x00c7
            r5.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00c7
        L_0x00c6:
        L_0x00c7:
            if (r1 == 0) goto L_0x00cc
            r1.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMNativeWebP.DecodeWebPFile(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean IsWebPImageFile(java.lang.String r10) {
        /*
            java.lang.String r0 = "nativeIsWebPImage exception:%s"
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r10)
            boolean r2 = r1.mo119967g()
            r3 = 1
            java.lang.String r4 = "MMWEBP.JAVA"
            r5 = 0
            if (r2 != 0) goto L_0x001b
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r10
            java.lang.String r10 = "file %s not exists."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r0)
            return r5
        L_0x001b:
            long r6 = r1.mo119980r()
            r8 = 256(0x100, double:1.265E-321)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r10
            java.lang.String r10 = "too small webp file:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r0)
            return r5
        L_0x0030:
            r10 = 0
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106422D(r1)     // Catch:{ IOException -> 0x0060 }
            r1 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r1]     // Catch:{ IOException -> 0x0060 }
            r10.read(r1)     // Catch:{ IOException -> 0x0060 }
            r10.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            boolean r10 = nativeIsWebPImage(r1)     // Catch:{ NullPointerException -> 0x0051, RuntimeException -> 0x0044 }
            return r10
        L_0x0044:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r10 = exception2String(r10)
            r1[r5] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
            return r5
        L_0x0051:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r10 = exception2String(r10)
            r1[r5] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r1)
            return r5
        L_0x005e:
            r0 = move-exception
            goto L_0x006e
        L_0x0060:
            r0 = move-exception
            java.lang.String r0 = exception2String(r0)     // Catch:{ all -> 0x005e }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x005e }
            if (r10 == 0) goto L_0x006d
            r10.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            return r5
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMNativeWebP.IsWebPImageFile(java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.OutputStream, com.tencent.mm.vfs.f0$h] */
    public static boolean SaveToWebPFile(Bitmap bitmap, int i, String str) {
        if (bitmap == null || str.length() == 0) {
            return false;
        }
        ? r2 = 0;
        try {
            byte[] nativeEncodeBitmap = nativeEncodeBitmap(bitmap, i);
            if (nativeEncodeBitmap == null) {
                return false;
            }
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            OutputStream G = C86013q1.m106425G(n, C116281f0.C116289i.f348994a.mo177799l(n, r2), false);
            G.write(nativeEncodeBitmap);
            G.close();
            try {
                G.close();
            } catch (IOException unused) {
            }
            return true;
        } catch (IOException e) {
            Log.m105920e(TAG, exception2String(e));
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (IOException unused2) {
                }
            }
            return false;
        } catch (NullPointerException e2) {
            Log.m105920e(TAG, exception2String(e2));
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (RuntimeException e3) {
            Log.m105920e(TAG, exception2String(e3));
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    private static String exception2String(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static native Bitmap nativeDecodeByteArray(byte[] bArr, BitmapFactory.Options options);

    public static native byte[] nativeEncodeBitmap(Bitmap bitmap, int i);

    public static native boolean nativeIsWebPImage(byte[] bArr);
}
