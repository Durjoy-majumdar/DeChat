package com.tencent.mars.xlog;

import android.os.Debug;
import android.os.Process;

public class LogLogic {
    private static ICallBack callBack;

    public interface ICallBack {
        void hitLogRuleCallback(String str, String str2, String str3, int i, String str4);
    }

    public static native void addLogRule(int i, String str, String str2);

    public static String appendMemLog(String str) {
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String convertStreamToString(java.io.InputStream r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002a }
            r3.<init>(r4)     // Catch:{ all -> 0x002a }
            r2.<init>(r3)     // Catch:{ all -> 0x002a }
        L_0x0010:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x001f
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            r4 = 10
            r0.append(r4)     // Catch:{ all -> 0x0027 }
            goto L_0x0010
        L_0x001f:
            r2.close()
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0027:
            r4 = move-exception
            r1 = r2
            goto L_0x002b
        L_0x002a:
            r4 = move-exception
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.xlog.LogLogic.convertStreamToString(java.io.InputStream):java.lang.String");
    }

    public static native int getAppenderModeFromCfg();

    public static long getDalvikHeap() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / 1024;
    }

    public static native int getIPxxLogLevel();

    public static native int getLogLevelFromCfg();

    public static long getNativeHeap() {
        return Debug.getNativeHeapAllocatedSize() / 1024;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStringFromFile(java.lang.String r3) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r3 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x001a }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001a }
            r2.<init>(r0)     // Catch:{ all -> 0x001a }
            r1.<init>(r2)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = convertStreamToString(r1)     // Catch:{ all -> 0x0018 }
            r1.close()
            return r3
        L_0x0018:
            r3 = move-exception
            goto L_0x001d
        L_0x001a:
            r0 = move-exception
            r1 = r3
            r3 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()
        L_0x0022:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.xlog.LogLogic.getStringFromFile(java.lang.String):java.lang.String");
    }

    public static String getVmSize() {
        try {
            String[] split = getStringFromFile(String.format("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    return str;
                }
            }
            return split[12];
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getVmStatus() {
        String format = String.format("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())});
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(getStringFromFile(format).trim());
            return sb.toString();
        } catch (Exception unused) {
            return sb.toString();
        }
    }

    public static void hitLogRuleCallback(String str, String str2, String str3, int i, String str4) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.hitLogRuleCallback(str, str2, str3, i, str4);
        }
    }

    public static native void initIPxxLogInfo();

    public static native void removeLogRule(String str);

    public static void setCallBack(ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static native void setIPxxLogML(int i, int i2);
}
