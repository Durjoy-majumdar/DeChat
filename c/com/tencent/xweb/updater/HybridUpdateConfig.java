package com.tencent.xweb.updater;

public class HybridUpdateConfig extends EmbededUpdateConfig {
    public static final String TAG = "HybridUpdateConfig";

    public HybridUpdateConfig(int i) {
        super(i);
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean copyPackageToLocal(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "HybridUpdateConfig"
            android.content.Context r1 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            android.content.res.AssetManager r1 = r1.getAssets()
            r2 = 0
            r3 = 0
            java.io.InputStream r14 = r1.open(r14)     // Catch:{ all -> 0x0176 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r1.<init>()     // Catch:{ all -> 0x0172 }
            java.lang.String r4 = r13.getDownloadPath()     // Catch:{ all -> 0x0172 }
            r1.append(r4)     // Catch:{ all -> 0x0172 }
            java.lang.String r4 = ".temp"
            r1.append(r4)     // Catch:{ all -> 0x0172 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0172 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0172 }
            r4.<init>(r1)     // Catch:{ all -> 0x0172 }
            r2 = 524288(0x80000, float:7.34684E-40)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0170 }
        L_0x002e:
            int r5 = r14.read(r2)     // Catch:{ all -> 0x0170 }
            r6 = -1
            if (r5 == r6) goto L_0x0039
            r4.write(r2, r3, r5)     // Catch:{ all -> 0x0170 }
            goto L_0x002e
        L_0x0039:
            r4.flush()     // Catch:{ all -> 0x0170 }
            com.tencent.xweb.util.FileUtils.tryClose(r14)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            java.io.File r14 = new java.io.File
            r14.<init>(r1)
            java.lang.String r2 = r14.getParent()
            java.lang.String r14 = r14.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            java.lang.String r14 = "zipfolder"
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = java.io.File.separator
            r4.append(r2)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            com.tencent.xweb.util.FileUtils.deleteAll((java.lang.String) r14)
            boolean r4 = com.tencent.xweb.util.ZipUtil.unZipFile(r14, r1)
            if (r4 != 0) goto L_0x008c
            r5 = 903(0x387, double:4.46E-321)
            r7 = 132(0x84, double:6.5E-322)
            r9 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r5, r7, r9)
            java.lang.String r14 = "copyPackageToLocal, unzip failed"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r14)
            return r3
        L_0x008c:
            com.tencent.xweb.util.FileUtils.deleteAll((java.lang.String) r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r4 = org.xwalk.core.XWalkEnvironment.getApplicationContext()
            java.lang.String r4 = com.tencent.xweb.util.FileUtils.getDataRootPath(r4)
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = "lib"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = "libxwebfullpack.so"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r1)
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            r7.append(r2)
            r7.append(r4)
            java.lang.String r2 = r7.toString()
            r6.<init>(r2)
            boolean r2 = r6.exists()
            r4 = 1
            if (r2 == 0) goto L_0x00ee
            java.lang.String r2 = r6.getAbsolutePath()
            boolean r2 = com.tencent.xweb.util.MD5.checkMD5(r2, r15)
            if (r2 == 0) goto L_0x00e6
            java.lang.String r14 = "copyPackageToLocal, already have file and md5 matched"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r14)
            return r4
        L_0x00e6:
            java.lang.String r2 = "copyPackageToLocal, already have file but md5 not matched"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r2)
            r6.delete()
        L_0x00ee:
            boolean r2 = r5.exists()
            if (r2 != 0) goto L_0x0112
            r7 = 903(0x387, double:4.46E-321)
            r9 = 133(0x85, double:6.57E-322)
            r11 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r7, r9, r11)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "copyPackageToLocal, src file not find, path:"
            r14.append(r15)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r14)
            return r3
        L_0x0112:
            java.lang.String r1 = r5.getAbsolutePath()
            boolean r15 = com.tencent.xweb.util.MD5.checkMD5(r1, r15)
            if (r15 != 0) goto L_0x012c
            java.lang.String r15 = "copyPackageToLocal, src file MD5 not match"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r15)
            r7 = 903(0x387, double:4.46E-321)
            r9 = 134(0x86, double:6.6E-322)
            r11 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r7, r9, r11)
            r13.isMatchMd5 = r3
        L_0x012c:
            boolean r15 = com.tencent.xweb.util.FileUtils.copyFile((java.io.File) r5, (java.io.File) r6)
            if (r15 != 0) goto L_0x0141
            java.lang.String r14 = "copyPackageToLocal, copy file failed"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r14)
            r4 = 903(0x387, double:4.46E-321)
            r6 = 135(0x87, double:6.67E-322)
            r8 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r4, r6, r8)
            return r3
        L_0x0141:
            java.io.File r15 = new java.io.File
            r15.<init>(r14)
            boolean r14 = r15.isDirectory()
            if (r14 != 0) goto L_0x0152
            java.lang.String r14 = "copyPackageToLocal, unzip folder file is not a folder"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r14)
            return r3
        L_0x0152:
            java.io.File[] r14 = r15.listFiles()
            java.lang.String r15 = r13.getDownloadPath()
            boolean r14 = com.tencent.xweb.util.ZipUtil.zipFilesEx(r14, r15, r3)
            if (r14 != 0) goto L_0x016f
            r5 = 903(0x387, double:4.46E-321)
            r7 = 136(0x88, double:6.7E-322)
            r9 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r5, r7, r9)
            java.lang.String r14 = "copyPackageToLocal, zip all files failed"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r14)
            return r3
        L_0x016f:
            return r4
        L_0x0170:
            r15 = move-exception
            goto L_0x0174
        L_0x0172:
            r15 = move-exception
            r4 = r2
        L_0x0174:
            r2 = r14
            goto L_0x0178
        L_0x0176:
            r15 = move-exception
            r4 = r2
        L_0x0178:
            java.lang.String r14 = "copyPackageToLocal error"
            com.tencent.xweb.util.XWebLog.m21910e(r0, r14, r15)     // Catch:{ all -> 0x0184 }
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            return r3
        L_0x0184:
            r14 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.HybridUpdateConfig.copyPackageToLocal(java.lang.String, java.lang.String):boolean");
    }
}
