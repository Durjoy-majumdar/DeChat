package com.tencent.qqmusic.mediaplayer.perf;

public class FileLogger {
    private static final String TAG = "FileLogger";

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[SYNTHETIC, Splitter:B:17:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[SYNTHETIC, Splitter:B:21:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(java.lang.StringBuilder r2, java.io.File r3, boolean r4) {
        /*
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x001c }
            r1.<init>(r3, r4)     // Catch:{ IOException -> 0x001c }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
            r1.write(r2)     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
            r1.flush()     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
            r1.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x0029
        L_0x0014:
            r2 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x0017:
            r2 = move-exception
            r0 = r1
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            goto L_0x002a
        L_0x001c:
            r2 = move-exception
        L_0x001d:
            java.lang.String r3 = "FileLogger"
            java.lang.String r4 = "[write] failed!"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r2)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.perf.FileLogger.write(java.lang.StringBuilder, java.io.File, boolean):void");
    }
}
