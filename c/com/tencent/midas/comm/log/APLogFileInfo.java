package com.tencent.midas.comm.log;

import android.text.TextUtils;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.comm.APLogInfo;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import java.io.File;

public class APLogFileInfo {
    public static String dirName = "";
    public static String fileName = "";
    public static String mmapName = "";

    private static String buildDirName() {
        APLogInfo logInfo = APLog.getLogInfo();
        if (logInfo == null || logInfo.getLogPath() == null) {
            return "";
        }
        String logPath = logInfo.getLogPath();
        String str = File.separator;
        if (!logPath.endsWith(str)) {
            logPath = logPath + str;
        }
        String str2 = logPath + logInfo.getPkgName() + str;
        if (TextUtils.isEmpty(logInfo.getProcessName())) {
            return str2;
        }
        return str2 + logInfo.getProcessName() + str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String buildFileName(boolean r3) {
        /*
            r0 = 0
            java.lang.String r1 = dirName     // Catch:{ all -> 0x0050 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0054
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = dirName     // Catch:{ all -> 0x0050 }
            r1.<init>(r2)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = dirName     // Catch:{ all -> 0x004d }
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x004d }
            boolean r0 = r0.endsWith(r2)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x001d
            r1.append(r2)     // Catch:{ all -> 0x004d }
        L_0x001d:
            java.lang.String r0 = dirName     // Catch:{ all -> 0x004d }
            java.lang.String r0 = com.tencent.midas.comm.log.util.APLogFileUtil.getLastLogFileName(r0)     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0033
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x004d }
            if (r3 != 0) goto L_0x0033
            r1.append(r0)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x004d }
            return r3
        L_0x0033:
            java.lang.String r3 = com.tencent.midas.comm.log.util.APLogFileUtil.getToday()     // Catch:{ all -> 0x004d }
            r1.append(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch:{ all -> 0x004d }
            int r3 = buildFileNumber(r0)     // Catch:{ all -> 0x004d }
            r1.append(r3)     // Catch:{ all -> 0x004d }
            java.lang.String r3 = ".txt"
            r1.append(r3)     // Catch:{ all -> 0x004d }
            r0 = r1
            goto L_0x0054
        L_0x004d:
            r3 = move-exception
            r0 = r1
            goto L_0x0051
        L_0x0050:
            r3 = move-exception
        L_0x0051:
            r3.toString()
        L_0x0054:
            if (r0 != 0) goto L_0x0059
            java.lang.String r3 = ""
            goto L_0x005d
        L_0x0059:
            java.lang.String r3 = r0.toString()
        L_0x005d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.comm.log.APLogFileInfo.buildFileName(boolean):java.lang.String");
    }

    private static int buildFileNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        try {
            String[] split = str.split(APLogFileUtil.getToday() + "_");
            if (split.length > 1) {
                return Integer.parseInt(split[1].split(".txt")[0]) + 1;
            }
            return 1;
        } catch (Throwable th) {
            th.getMessage();
            return 1;
        }
    }

    private static String buildMmapName() {
        return dirName + File.separator + "MidasLog.mmap";
    }

    public static void create() {
        try {
            dirName = buildDirName();
            fileName = buildFileName(true);
            mmapName = buildMmapName();
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void updateFileName() {
        fileName = buildFileName(false);
    }
}
