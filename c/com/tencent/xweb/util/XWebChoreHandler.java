package com.tencent.xweb.util;

public class XWebChoreHandler {
    public static final String TAG = "XWebChoreHandler";
    private static boolean hasSetDataDirSuffix;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.nio.channels.FileLock} */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d A[SYNTHETIC, Splitter:B:31:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4 A[SYNTHETIC, Splitter:B:40:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3 A[SYNTHETIC, Splitter:B:45:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e7 A[SYNTHETIC, Splitter:B:59:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setDataDirSuffix() {
        /*
            java.lang.String r0 = "_"
            java.lang.String r1 = "setDataDirSuffix, try release sLockFile failed, error"
            boolean r2 = hasSetDataDirSuffix
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.content.Context r2 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            java.lang.String r3 = "XWebChoreHandler"
            if (r2 != 0) goto L_0x0017
            java.lang.String r0 = "setDataDirSuffix, invalid context"
            com.tencent.xweb.util.XWebLog.m21913w(r3, r0)
            return
        L_0x0017:
            android.content.Context r2 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            r4 = 28
            if (r2 == 0) goto L_0x0035
            android.content.Context r2 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            if (r2 >= r4) goto L_0x0035
            java.lang.String r0 = "setDataDirSuffix, below target 28, no need to setDataDirSuffix"
            com.tencent.xweb.util.XWebLog.m21911i(r3, r0)
            return
        L_0x0035:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L_0x015c
            r2 = 0
            java.lang.String r4 = org.xwalk.core.XWalkEnvironment.getProcessName()     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = ":"
            java.lang.String r4 = r4.replace(r5, r0)     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "."
            java.lang.String r4 = r4.replace(r5, r0)     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "setDataDirSuffix, try setDataDirSuffix to "
            r0.append(r5)     // Catch:{ all -> 0x005f }
            r0.append(r4)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x005f }
            com.tencent.xweb.util.XWebLog.m21911i(r3, r0)     // Catch:{ all -> 0x005f }
            goto L_0x0068
        L_0x005f:
            r0 = move-exception
            goto L_0x0063
        L_0x0061:
            r0 = move-exception
            r4 = r2
        L_0x0063:
            java.lang.String r5 = "setDataDirSuffix, failed to get suffix dir, error"
            com.tencent.xweb.util.XWebLog.m21910e(r3, r5, r0)
        L_0x0068:
            r0 = 1
            r5 = 0
            android.content.Context r6 = org.xwalk.core.XWalkEnvironment.getApplicationContext()     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r7.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "webview_"
            r7.append(r8)     // Catch:{ all -> 0x00d5 }
            r7.append(r4)     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00d5 }
            java.io.File r6 = r6.getDir(r7, r5)     // Catch:{ all -> 0x00d5 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x00d5 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00d5 }
            java.lang.String r8 = "webview_data.lock"
            r7.<init>(r6, r8)     // Catch:{ all -> 0x00d5 }
            boolean r6 = r7.exists()     // Catch:{ all -> 0x00d5 }
            if (r6 != 0) goto L_0x009d
            java.lang.String r6 = "setDataDirSuffix, webview_data.lock not exist"
            com.tencent.xweb.util.XWebLog.m21913w(r3, r6)     // Catch:{ all -> 0x00d5 }
            r6 = r2
            r7 = 0
            r8 = 0
            goto L_0x00b2
        L_0x009d:
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "rw"
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00d2 }
            java.nio.channels.FileChannel r2 = r6.getChannel()     // Catch:{ all -> 0x00cc }
            java.nio.channels.FileLock r2 = r2.tryLock()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00b0
            r7 = 1
            goto L_0x00b1
        L_0x00b0:
            r7 = 0
        L_0x00b1:
            r8 = 1
        L_0x00b2:
            if (r2 == 0) goto L_0x00c1
            r2.release()     // Catch:{ all -> 0x00bb }
            r2.close()     // Catch:{ all -> 0x00bb }
            goto L_0x00c1
        L_0x00bb:
            r2 = move-exception
            java.lang.String r9 = "setDataDirSuffix, try release exclusiveFileLock failed, error"
            com.tencent.xweb.util.XWebLog.m21910e(r3, r9, r2)
        L_0x00c1:
            if (r6 == 0) goto L_0x00f0
            r6.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00f0
        L_0x00c7:
            r2 = move-exception
            com.tencent.xweb.util.XWebLog.m21910e(r3, r1, r2)
            goto L_0x00f0
        L_0x00cc:
            r2 = move-exception
            r8 = 1
            r15 = r6
            r6 = r2
            r2 = r15
            goto L_0x00d7
        L_0x00d2:
            r6 = move-exception
            r8 = 1
            goto L_0x00d7
        L_0x00d5:
            r6 = move-exception
            r8 = 0
        L_0x00d7:
            java.lang.String r7 = "setDataDirSuffix, try lock webview_data.lock failed, error"
            com.tencent.xweb.util.XWebLog.m21910e(r3, r7, r6)     // Catch:{ all -> 0x0150 }
            r9 = 577(0x241, double:2.85E-321)
            r11 = 230(0xe6, double:1.136E-321)
            r13 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r9, r11, r13)     // Catch:{ all -> 0x0150 }
            if (r2 == 0) goto L_0x00ef
            r2.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r2 = move-exception
            com.tencent.xweb.util.XWebLog.m21910e(r3, r1, r2)
        L_0x00ef:
            r7 = 0
        L_0x00f0:
            if (r8 == 0) goto L_0x0125
            if (r7 != 0) goto L_0x0125
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            int r2 = com.tencent.xweb.util.XWebGrayValueUtil.getGrayValue()
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setDataDirSuffix, lock webview_data.lock failed, set suffix to "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.xweb.util.XWebLog.m21913w(r3, r1)
            r6 = 577(0x241, double:2.85E-321)
            r8 = 231(0xe7, double:1.14E-321)
            r10 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r6, r8, r10)
            goto L_0x012c
        L_0x0125:
            if (r7 == 0) goto L_0x012c
            java.lang.String r1 = "setDataDirSuffix, lock webview_data.lock passed"
            com.tencent.xweb.util.XWebLog.m21911i(r3, r1)
        L_0x012c:
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x0140 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r5] = r2     // Catch:{ all -> 0x0140 }
            java.lang.String r2 = "android.webkit.WebView"
            java.lang.String r6 = "setDataDirectorySuffix"
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x0140 }
            r7[r5] = r4     // Catch:{ all -> 0x0140 }
            com.tencent.xweb.util.ReflectionUtils.invokeStatic((java.lang.String) r2, (java.lang.String) r6, (java.lang.Class<?>[]) r1, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0140 }
            hasSetDataDirSuffix = r0     // Catch:{ all -> 0x0140 }
            goto L_0x0175
        L_0x0140:
            r0 = move-exception
            java.lang.String r1 = "setDataDirSuffix, error"
            com.tencent.xweb.util.XWebLog.m21910e(r3, r1, r0)
            r4 = 577(0x241, double:2.85E-321)
            r6 = 232(0xe8, double:1.146E-321)
            r8 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r4, r6, r8)
            goto L_0x0175
        L_0x0150:
            r0 = move-exception
            if (r2 == 0) goto L_0x015b
            r2.close()     // Catch:{ all -> 0x0157 }
            goto L_0x015b
        L_0x0157:
            r2 = move-exception
            com.tencent.xweb.util.XWebLog.m21910e(r3, r1, r2)
        L_0x015b:
            throw r0
        L_0x015c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setDataDirSuffix, Build.VERSION.SDK_INT("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ") too low"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.xweb.util.XWebLog.m21911i(r3, r0)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.XWebChoreHandler.setDataDirSuffix():void");
    }
}
