package com.tencent.xweb;

import com.tencent.xweb.report.KVReportForMultiProcessDowngrade;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.XWebLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.xwalk.core.XWalkEnvironment;

public class XWebCrashMonitor {
    public static final String TAG = "XWebCrashMonitor";

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027 A[Catch:{ Exception -> 0x0064 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean checkGpuUnusableCrash(java.io.File r7) {
        /*
            java.lang.String r0 = "XWebCrashMonitor"
            java.lang.String r1 = r7.getName()
            java.lang.String r2 = "xweb_gpu_crash"
            boolean r1 = r1.contains(r2)
            r2 = 0
            if (r1 != 0) goto L_0x0011
            return r2
        L_0x0011:
            r1 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
        L_0x0021:
            java.lang.String r1 = r3.readLine()     // Catch:{ Exception -> 0x0064 }
            if (r1 == 0) goto L_0x0060
            java.lang.String r4 = "com.godinsec.godinsec_private_space"
            boolean r4 = r1.contains(r4)     // Catch:{ Exception -> 0x0064 }
            if (r4 != 0) goto L_0x0037
            java.lang.String r4 = "com.kuihua.wxsk"
            boolean r1 = r1.contains(r4)     // Catch:{ Exception -> 0x0064 }
            if (r1 == 0) goto L_0x0021
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
            r1.<init>()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "checkGpuUnusableCrash, command:"
            r1.append(r4)     // Catch:{ Exception -> 0x0064 }
            com.tencent.xweb.CommandCfg r4 = com.tencent.xweb.CommandCfg.getInstance()     // Catch:{ Exception -> 0x0064 }
            boolean r4 = r4.getWxdkDowngrade()     // Catch:{ Exception -> 0x0064 }
            r1.append(r4)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0064 }
            com.tencent.xweb.util.XWebLog.m21911i(r0, r1)     // Catch:{ Exception -> 0x0064 }
            r1 = 1
            com.tencent.xweb.XWebChildProcessMonitor.setMaybeWxdk(r1)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r4 = "GpuUnusable"
            com.tencent.xweb.XWebChildProcessMonitor.recordChildProcessCrash(r4)     // Catch:{ Exception -> 0x0064 }
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            return r1
        L_0x0060:
            com.tencent.xweb.util.FileUtils.tryClose(r3)
            goto L_0x008a
        L_0x0064:
            r1 = move-exception
            goto L_0x006c
        L_0x0066:
            r7 = move-exception
            goto L_0x008d
        L_0x0068:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x006c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r4.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r5 = "checkGpuUnusableCrash, filePath:"
            r4.append(r5)     // Catch:{ all -> 0x008b }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x008b }
            r4.append(r7)     // Catch:{ all -> 0x008b }
            java.lang.String r7 = ", error"
            r4.append(r7)     // Catch:{ all -> 0x008b }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x008b }
            com.tencent.xweb.util.XWebLog.m21910e(r0, r7, r1)     // Catch:{ all -> 0x008b }
            goto L_0x0060
        L_0x008a:
            return r2
        L_0x008b:
            r7 = move-exception
            r1 = r3
        L_0x008d:
            com.tencent.xweb.util.FileUtils.tryClose(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.XWebCrashMonitor.checkGpuUnusableCrash(java.io.File):boolean");
    }

    private static boolean checkRenderOffset4000Crash(File file) {
        BufferedReader bufferedReader;
        Exception e;
        String readLine;
        if (!file.getName().contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX) && !file.getName().contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_RENDER_UNSANDBOX)) {
            return false;
        }
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        FileUtils.tryClose(bufferedReader);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        XWebLog.m21910e(TAG, "checkRenderOffset4000Crash, filePath:" + file.getAbsolutePath() + ", error", e);
                        FileUtils.tryClose(bufferedReader);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                    }
                }
            } while (!readLine.endsWith("libxwebcore.so (offset 0x4000)"));
            XWebLog.m21911i(TAG, "checkRenderOffset4000Crash, command:" + CommandCfg.getInstance().getWxdkDowngrade());
            XWebChildProcessMonitor.setMaybeWxdk(true);
            XWebChildProcessMonitor.recordChildProcessCrash(KVReportForMultiProcessDowngrade.CRASH_TYPE_RENDER_OFFSET);
            FileUtils.tryClose(bufferedReader);
            return true;
        } catch (Exception e3) {
            Exception exc = e3;
            bufferedReader = null;
            e = exc;
            XWebLog.m21910e(TAG, "checkRenderOffset4000Crash, filePath:" + file.getAbsolutePath() + ", error", e);
            FileUtils.tryClose(bufferedReader);
            return false;
        } catch (Throwable th4) {
            th = th4;
            FileUtils.tryClose(bufferedReader2);
            throw th;
        }
    }

    public static boolean isXWebChildProcessCrashDumpFiles(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.getName().contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX) || file.getName().contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_GPU) || file.getName().contains(XWalkEnvironment.CRASH_DUMP_FILE_SUFFIX_FOR_RENDER_UNSANDBOX);
    }

    public static void onReportXWebCrash(File file) {
        if (!isXWebChildProcessCrashDumpFiles(file)) {
            return;
        }
        if (checkRenderOffset4000Crash(file)) {
            XWebLog.m21911i(TAG, "onReportXWebCrash, is RenderOffset4000Crash");
        } else if (checkGpuUnusableCrash(file)) {
            XWebLog.m21911i(TAG, "onReportXWebCrash, is GpuUnusableCrash");
        } else {
            XWebLog.m21911i(TAG, "onReportXWebCrash, increase crash count");
            XWebChildProcessMonitor.increaseCrashCount();
        }
    }
}
