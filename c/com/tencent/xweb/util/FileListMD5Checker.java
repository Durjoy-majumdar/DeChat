package com.tencent.xweb.util;

import java.io.File;

public class FileListMD5Checker {
    public static final String TAG = "FileListMD5Checker";

    public static boolean checkFileListMd5(int i, String str) {
        try {
            return checkFileListMd5(i, new File(str));
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "checkFileListMd5 error", th);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkResFileListMd5(int r9, java.io.File r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkResFileListMd5, version:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", configFile:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FileListMD5Checker"
            com.tencent.xweb.util.XWebLog.m21911i(r1, r0)
            r0 = 0
            if (r10 == 0) goto L_0x0114
            boolean r2 = r10.exists()
            if (r2 != 0) goto L_0x0029
            goto L_0x0114
        L_0x0029:
            java.lang.String r9 = com.tencent.xweb.util.XWebFileUtil.getExtractedCoreDir(r9)
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x00f7 }
            r3.<init>(r10)     // Catch:{ all -> 0x00f7 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ all -> 0x00f2 }
            r10.<init>(r3)     // Catch:{ all -> 0x00f2 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00ef }
            r4.<init>(r10)     // Catch:{ all -> 0x00ef }
        L_0x003d:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x00ed }
            r5 = 1
            if (r2 == 0) goto L_0x00e3
            boolean r6 = r2.isEmpty()     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x004b
            goto L_0x003d
        L_0x004b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r6.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = "checkResFileListMd5, line:"
            r6.append(r7)     // Catch:{ all -> 0x00ed }
            r6.append(r2)     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.xweb.util.XWebLog.m21911i(r1, r6)     // Catch:{ all -> 0x00ed }
            java.lang.String r6 = ":"
            java.lang.String[] r2 = r2.split(r6)     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x003d
            int r6 = r2.length     // Catch:{ all -> 0x00ed }
            r7 = 2
            if (r6 != r7) goto L_0x003d
            r6 = r2[r0]     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x003d
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00ed }
            if (r6 != 0) goto L_0x003d
            r6 = r2[r5]     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x003d
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00ed }
            if (r6 != 0) goto L_0x003d
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00ed }
            r7 = r2[r0]     // Catch:{ all -> 0x00ed }
            r6.<init>(r9, r7)     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = com.tencent.xweb.util.MD5.getMD5((java.io.File) r6)     // Catch:{ all -> 0x00ed }
            if (r7 == 0) goto L_0x0094
            r8 = r2[r5]     // Catch:{ all -> 0x00ed }
            boolean r8 = r7.equalsIgnoreCase(r8)     // Catch:{ all -> 0x00ed }
            if (r8 != 0) goto L_0x003d
        L_0x0094:
            r9 = r2[r0]     // Catch:{ all -> 0x00ed }
            com.tencent.xweb.report.KVReportForCheckFiles.setCheckFailedRes(r9)     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r9.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r8 = "checkResFileListMd5 failed, resFile:"
            r9.append(r8)     // Catch:{ all -> 0x00ed }
            r8 = r2[r0]     // Catch:{ all -> 0x00ed }
            r9.append(r8)     // Catch:{ all -> 0x00ed }
            java.lang.String r8 = ", fileMd5:"
            r9.append(r8)     // Catch:{ all -> 0x00ed }
            r9.append(r7)     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = ", expectedMd5:"
            r9.append(r7)     // Catch:{ all -> 0x00ed }
            r2 = r2[r5]     // Catch:{ all -> 0x00ed }
            r9.append(r2)     // Catch:{ all -> 0x00ed }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.xweb.util.XWebLog.m21913w(r1, r9)     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r9.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = "checkResFileListMd5, fileSize:"
            r9.append(r2)     // Catch:{ all -> 0x00ed }
            long r5 = com.tencent.xweb.util.FileUtils.getFileSize(r6, r0)     // Catch:{ all -> 0x00ed }
            r9.append(r5)     // Catch:{ all -> 0x00ed }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00ed }
            com.tencent.xweb.util.XWebLog.m21913w(r1, r9)     // Catch:{ all -> 0x00ed }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            return r0
        L_0x00e3:
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            return r5
        L_0x00ed:
            r9 = move-exception
            goto L_0x00f5
        L_0x00ef:
            r9 = move-exception
            r4 = r2
            goto L_0x00f5
        L_0x00f2:
            r9 = move-exception
            r10 = r2
            r4 = r10
        L_0x00f5:
            r2 = r3
            goto L_0x00fa
        L_0x00f7:
            r9 = move-exception
            r10 = r2
            r4 = r10
        L_0x00fa:
            java.lang.String r3 = "checkResFileListMd5 error"
            com.tencent.xweb.util.XWebLog.m21910e(r1, r3, r9)     // Catch:{ all -> 0x0109 }
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            return r0
        L_0x0109:
            r9 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r10)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            throw r9
        L_0x0114:
            java.lang.String r9 = "checkResFileListMd5, config file not exist"
            com.tencent.xweb.util.XWebLog.m21913w(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.FileListMD5Checker.checkResFileListMd5(int, java.io.File):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getResFileList(int r12) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getResFileList, version:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FileListMD5Checker"
            com.tencent.xweb.util.XWebLog.m21911i(r1, r0)
            java.lang.String r12 = com.tencent.xweb.util.XWebFileUtil.getDownloadResFileListConfig(r12)
            java.io.File r0 = new java.io.File
            r0.<init>(r12)
            boolean r2 = r0.exists()
            r3 = 1
            r4 = 79
            r6 = 0
            if (r2 != 0) goto L_0x0041
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getResFileList, resConfigPath not exist, path:"
            r0.append(r2)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.xweb.util.XWebLog.m21913w(r1, r12)
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r4, r3)
            return r6
        L_0x0041:
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ all -> 0x00a8 }
            r12.<init>(r0)     // Catch:{ all -> 0x00a8 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a5 }
            r0.<init>(r12)     // Catch:{ all -> 0x00a5 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x00a2 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a2 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00a0 }
            r7.<init>()     // Catch:{ all -> 0x00a0 }
        L_0x0055:
            java.lang.String r8 = r2.readLine()     // Catch:{ all -> 0x00a0 }
            r9 = 0
            if (r8 == 0) goto L_0x007f
            boolean r10 = r8.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r10 == 0) goto L_0x0063
            goto L_0x0055
        L_0x0063:
            java.lang.String r10 = ":"
            java.lang.String[] r8 = r8.split(r10)     // Catch:{ all -> 0x00a0 }
            if (r8 == 0) goto L_0x0055
            int r10 = r8.length     // Catch:{ all -> 0x00a0 }
            r11 = 2
            if (r10 != r11) goto L_0x0055
            r10 = r8[r9]     // Catch:{ all -> 0x00a0 }
            if (r10 == 0) goto L_0x0055
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r10 != 0) goto L_0x0055
            r8 = r8[r9]     // Catch:{ all -> 0x00a0 }
            r7.add(r8)     // Catch:{ all -> 0x00a0 }
            goto L_0x0055
        L_0x007f:
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ all -> 0x00a0 }
            java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ all -> 0x00a0 }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x00a0 }
            if (r7 != 0) goto L_0x0096
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r4, r3)     // Catch:{ all -> 0x00a0 }
            com.tencent.xweb.util.FileUtils.tryClose(r12)
            com.tencent.xweb.util.FileUtils.tryClose(r0)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            return r6
        L_0x0096:
            com.tencent.xweb.util.FileUtils.tryClose(r12)
            com.tencent.xweb.util.FileUtils.tryClose(r0)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            return r7
        L_0x00a0:
            r7 = move-exception
            goto L_0x00ac
        L_0x00a2:
            r7 = move-exception
            r2 = r6
            goto L_0x00ac
        L_0x00a5:
            r7 = move-exception
            r0 = r6
            goto L_0x00ab
        L_0x00a8:
            r7 = move-exception
            r12 = r6
            r0 = r12
        L_0x00ab:
            r2 = r0
        L_0x00ac:
            java.lang.String r8 = "getResFileList error"
            com.tencent.xweb.util.XWebLog.m21910e(r1, r8, r7)     // Catch:{ all -> 0x00be }
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r4, r3)     // Catch:{ all -> 0x00be }
            com.tencent.xweb.util.FileUtils.tryClose(r12)
            com.tencent.xweb.util.FileUtils.tryClose(r0)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            return r6
        L_0x00be:
            r1 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r12)
            com.tencent.xweb.util.FileUtils.tryClose(r0)
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.FileListMD5Checker.getResFileList(int):java.lang.String[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r11v5, types: [java.io.Closeable, java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkFileListMd5(int r10, java.io.File r11) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkFileListMd5, version:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", configFile:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FileListMD5Checker"
            com.tencent.xweb.util.XWebLog.m21911i(r1, r0)
            r0 = 0
            if (r11 == 0) goto L_0x0121
            boolean r2 = r11.exists()
            if (r2 != 0) goto L_0x0029
            goto L_0x0121
        L_0x0029:
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0104 }
            r3.<init>(r11)     // Catch:{ all -> 0x0104 }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ff }
            r11.<init>(r3)     // Catch:{ all -> 0x00ff }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00fc }
            r4.<init>(r11)     // Catch:{ all -> 0x00fc }
        L_0x0039:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x00fa }
            r5 = 1
            if (r2 == 0) goto L_0x00f0
            boolean r6 = r2.isEmpty()     // Catch:{ all -> 0x00fa }
            if (r6 == 0) goto L_0x0047
            goto L_0x0039
        L_0x0047:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r6.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r7 = "checkFileListMd5, line:"
            r6.append(r7)     // Catch:{ all -> 0x00fa }
            r6.append(r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.m21911i(r1, r6)     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = ":"
            java.lang.String[] r2 = r2.split(r6)     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x0039
            int r6 = r2.length     // Catch:{ all -> 0x00fa }
            r7 = 2
            if (r6 != r7) goto L_0x0039
            r6 = r2[r0]     // Catch:{ all -> 0x00fa }
            if (r6 == 0) goto L_0x0039
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00fa }
            if (r6 != 0) goto L_0x0039
            r6 = r2[r5]     // Catch:{ all -> 0x00fa }
            if (r6 == 0) goto L_0x0039
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00fa }
            if (r6 != 0) goto L_0x0039
            java.lang.String r6 = "base.apk"
            r7 = r2[r0]     // Catch:{ all -> 0x00fa }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x00fa }
            if (r6 == 0) goto L_0x008a
            java.lang.String r6 = com.tencent.xweb.util.XWebFileUtil.getDownloadApkPath(r10)     // Catch:{ all -> 0x00fa }
            goto L_0x0090
        L_0x008a:
            r6 = r2[r0]     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = com.tencent.xweb.util.XWebFileUtil.getExtractedCoreFile(r10, r6)     // Catch:{ all -> 0x00fa }
        L_0x0090:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00fa }
            r7.<init>(r6)     // Catch:{ all -> 0x00fa }
            java.lang.String r8 = com.tencent.xweb.util.MD5.getMD5((java.io.File) r7)     // Catch:{ all -> 0x00fa }
            if (r8 == 0) goto L_0x00a3
            r9 = r2[r5]     // Catch:{ all -> 0x00fa }
            boolean r9 = r8.equalsIgnoreCase(r9)     // Catch:{ all -> 0x00fa }
            if (r9 != 0) goto L_0x0039
        L_0x00a3:
            r10 = r2[r0]     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.report.KVReportForCheckFiles.setCheckFailedFile(r10)     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r10.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = "checkFileListMd5 failed, filePath:"
            r10.append(r9)     // Catch:{ all -> 0x00fa }
            r10.append(r6)     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = ", fileMd5:"
            r10.append(r6)     // Catch:{ all -> 0x00fa }
            r10.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = ", expectedMd5:"
            r10.append(r6)     // Catch:{ all -> 0x00fa }
            r2 = r2[r5]     // Catch:{ all -> 0x00fa }
            r10.append(r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.m21913w(r1, r10)     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r10.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = "checkResFileListMd5, fileSize:"
            r10.append(r2)     // Catch:{ all -> 0x00fa }
            long r5 = com.tencent.xweb.util.FileUtils.getFileSize(r7, r0)     // Catch:{ all -> 0x00fa }
            r10.append(r5)     // Catch:{ all -> 0x00fa }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.m21913w(r1, r10)     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r11)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            return r0
        L_0x00f0:
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            com.tencent.xweb.util.FileUtils.tryClose(r11)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            return r5
        L_0x00fa:
            r10 = move-exception
            goto L_0x0102
        L_0x00fc:
            r10 = move-exception
            r4 = r2
            goto L_0x0102
        L_0x00ff:
            r10 = move-exception
            r11 = r2
            r4 = r11
        L_0x0102:
            r2 = r3
            goto L_0x0107
        L_0x0104:
            r10 = move-exception
            r11 = r2
            r4 = r11
        L_0x0107:
            java.lang.String r3 = "checkFileListMd5 error"
            com.tencent.xweb.util.XWebLog.m21910e(r1, r3, r10)     // Catch:{ all -> 0x0116 }
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r11)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            return r0
        L_0x0116:
            r10 = move-exception
            com.tencent.xweb.util.FileUtils.tryClose(r2)
            com.tencent.xweb.util.FileUtils.tryClose(r11)
            com.tencent.xweb.util.FileUtils.tryClose(r4)
            throw r10
        L_0x0121:
            java.lang.String r10 = "checkFileListMd5, config file not exist"
            com.tencent.xweb.util.XWebLog.m21913w(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.FileListMD5Checker.checkFileListMd5(int, java.io.File):boolean");
    }
}
