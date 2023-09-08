package com.tencent.p014mm.sdk.platformtools;

import android.graphics.Bitmap;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.tencent.mm.sdk.platformtools.MMNativeJpeg */
public class MMNativeJpeg {
    public static final int FAKE_PARTIAL_PROGRESSIVE_QUALITY = 25;
    public static final String TAG = "MMJPEG.JAVA";

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r0 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r0 == null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean Convert2Baseline(java.lang.String r7, int r8) {
        /*
            boolean r0 = isProgressive(r7)
            r1 = 0
            r2 = 1
            java.lang.String r3 = "MMJPEG.JAVA"
            if (r0 != 0) goto L_0x0014
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r1] = r7
            java.lang.String r7 = "c2b: not progressive file.%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r7, r8)
            return r2
        L_0x0014:
            r0 = 0
            android.graphics.Bitmap r4 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r7)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            if (r4 != 0) goto L_0x0024
            java.lang.String r4 = "c2b:use mmjpeg to decode."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            android.graphics.Bitmap r4 = decodeAsBitmap(r7)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
        L_0x0024:
            if (r4 == 0) goto L_0x005a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            r5.append(r7)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            java.lang.String r6 = ".base"
            r5.append(r6)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            java.io.OutputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106429K(r5, r1)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            boolean r8 = r4.compress(r6, r8, r0)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            if (r8 == 0) goto L_0x005a
            java.lang.String r8 = "c2b: convert baseline %s ok."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            r4[r1] = r5     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r4)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.FilesCopy.copy(r5, r7, r2)     // Catch:{ Exception -> 0x0058, OutOfMemoryError -> 0x0060 }
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            return r7
        L_0x0056:
            r7 = move-exception
            goto L_0x0079
        L_0x0058:
            r7 = move-exception
            goto L_0x0068
        L_0x005a:
            if (r0 == 0) goto L_0x0078
        L_0x005c:
            r0.close()     // Catch:{ Exception -> 0x0078 }
            goto L_0x0078
        L_0x0060:
            java.lang.String r7 = "c2b: oom"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0078
            goto L_0x005c
        L_0x0068:
            java.lang.String r8 = "c2b:exception:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = exception2String(r7)     // Catch:{ all -> 0x0056 }
            r2[r1] = r7     // Catch:{ all -> 0x0056 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r8, r2)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0078
            goto L_0x005c
        L_0x0078:
            return r1
        L_0x0079:
            if (r0 == 0) goto L_0x007e
            r0.close()     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.Convert2Baseline(java.lang.String, int):boolean");
    }

    public static void Destroy() {
    }

    public static boolean IsJpegFile(String str) {
        try {
            if (mmjpeg.queryParams(toRealPath(str)) != null) {
                return true;
            }
            Log.m105920e(TAG, "IsJpegFile : can't query jpeg parames.");
            return false;
        } catch (Exception e) {
            Log.m105921e(TAG, "IsJpegFile exception:%s", exception2String(e));
            return false;
        }
    }

    private static boolean checkAndroidVersion() {
        return true;
    }

    public static boolean convertToProgressive(String str, int i) {
        if (!checkAndroidVersion()) {
            return false;
        }
        String realPath = toRealPath(str);
        try {
            String str2 = realPath + ".prog.dat";
            Log.m105925i(TAG, "convert %s to %s use progressive.quality:%d", realPath, str2, Integer.valueOf(i));
            int convertToProgressive = mmjpeg.convertToProgressive(realPath, str2);
            if (convertToProgressive != 0) {
                Log.m105921e(TAG, "convert failed. error:%d", Integer.valueOf(convertToProgressive));
                return false;
            }
            boolean x = C86013q1.m106463x(str2, realPath);
            Log.m105925i(TAG, "convert ret:%b", Boolean.valueOf(x));
            return x;
        } catch (Exception e) {
            Log.m105921e(TAG, "convertToProgressive exception:%s", exception2String(e));
            return false;
        }
    }

    public static Bitmap decodeAsBitmap(String str) {
        Log.m105925i(TAG, "decodeAsBitmap:%s", str);
        String realPath = toRealPath(str);
        try {
            JpegParams queryParams = mmjpeg.queryParams(realPath);
            if (queryParams == null) {
                Log.m105920e(TAG, "can't query jpeg parames.");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(queryParams.Width, queryParams.Height, Bitmap.Config.ARGB_8888);
            if (mmjpeg.decodeToBitmap(realPath, createBitmap)) {
                Log.m105924i(TAG, "decode bitmap successed.");
                return createBitmap;
            }
            Log.m105920e(TAG, "can't decode to bmp.");
            return null;
        } catch (Exception e) {
            Log.m105921e(TAG, "decodeAsBitmap exception:%s", exception2String(e));
            return null;
        } catch (OutOfMemoryError unused) {
            Log.m105921e(TAG, "decodeAsBitmap OOM:%s", realPath);
            return null;
        }
    }

    private static String exception2String(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean isProgressive(String str) {
        Log.m105927v(TAG, "isProgressive:%s", str);
        if (!checkAndroidVersion() || !C86013q1.m106450k(str)) {
            return false;
        }
        String realPath = toRealPath(str);
        Log.m105919d(TAG, "check progressive for file:%s", realPath);
        try {
            int isProgressiveFile = mmjpeg.isProgressiveFile(realPath);
            if (1 == isProgressiveFile || isProgressiveFile == 0) {
                Log.m105925i(TAG, "file:%s progressive:%d", realPath, Integer.valueOf(isProgressiveFile));
                return isProgressiveFile == 1;
            }
            Log.m105921e(TAG, "check failed. error:%d", Integer.valueOf(isProgressiveFile));
            return false;
        } catch (Exception e) {
            Log.m105921e(TAG, "isProgressive exception:%s", exception2String(e));
            return false;
        }
    }

    public static int queryQuality(String str) {
        if (!checkAndroidVersion() || !C86013q1.m106450k(str)) {
            return 0;
        }
        String realPath = toRealPath(str);
        try {
            int queryQuality = mmjpeg.queryQuality(realPath);
            Log.m105925i(TAG, "after query quality:%d", Integer.valueOf(queryQuality));
            if (queryQuality < 10000 && queryQuality >= 24) {
                return queryQuality;
            }
            if (1 == mmjpeg.isProgressiveFile(realPath)) {
                return 25;
            }
            Log.m105928w(TAG, "invalid jpeg file or too small quality.");
            return 0;
        } catch (Exception e) {
            Log.m105921e(TAG, "queryQuality failed. exception:%s", exception2String(e));
            return 0;
        } catch (IncompatibleClassChangeError e2) {
            Log.printErrStackTrace("MicroMsg.Crash", e2, "May cause dvmFindCatchBlock crash!", new Object[0]);
            throw ((IncompatibleClassChangeError) new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(e2));
        } catch (Error e3) {
            Log.m105921e(TAG, "queryQuality error. java.lang.UnsatisfiedLinkError: queryQuality, %s", e3.toString());
            return 0;
        }
    }

    private static String toRealPath(String str) {
        try {
            String i = C86013q1.m106448i(str, false);
            if (i == null) {
                return str;
            }
            Log.m105925i(TAG, "From %s to real path %s", str, i);
            return i;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "to real path", new Object[0]);
            return str;
        }
    }
}
