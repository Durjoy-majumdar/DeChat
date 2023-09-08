package com.tencent.midas.comm;

import android.content.Context;
import com.tencent.midas.comm.log.util.APLogDataReporter;
import com.tencent.midas.data.APPluginReportManager;

public class APLogUtil {
    private static boolean HAS_INIT_LOG_IN_NEW_PROCESS;
    public static boolean IS_IN_NEW_PROCESS;

    public static void flushIfNewProcess() {
        if (IS_IN_NEW_PROCESS && APLog.getLogInfo() != null && !APLog.getLogInfo().isAutoFlush()) {
            APLog.flush();
        }
    }

    public static void initAPLogIfNewProcess(Context context, boolean z, boolean z2, String str) {
        if (z && !HAS_INIT_LOG_IN_NEW_PROCESS) {
            IS_IN_NEW_PROCESS = true;
            try {
                APLogInfo aPLogInfo = new APLogInfo();
                APLogDataReporter.getInstance().setReporter(new APLogDataReporter.Reporter() {
                    public void report(String str, String str2, String str3) {
                        APPluginReportManager.getInstance().insertData(str, str2, "", str3);
                    }
                });
                aPLogInfo.setContext(context);
                aPLogInfo.setLogEnable(z2);
                aPLogInfo.setAutoFlush(true);
                aPLogInfo.setLogTag("TencentPay");
                aPLogInfo.setLogCallbackClassName(str);
                APLog.init(aPLogInfo);
                HAS_INIT_LOG_IN_NEW_PROCESS = true;
            } catch (Throwable th) {
                APLog.m161212e("APLogUtil init", th.toString());
            }
        }
    }

    public static void initAPLogInPlugin(Context context, boolean z, String str) {
        try {
            APLogInfo aPLogInfo = new APLogInfo();
            APLogDataReporter.getInstance().setReporter(new APLogDataReporter.Reporter() {
                public void report(String str, String str2, String str3) {
                    APPluginReportManager.getInstance().insertData(str, str2, "", str3);
                }
            });
            aPLogInfo.setContext(context);
            aPLogInfo.setLogEnable(z);
            aPLogInfo.setAutoFlush(true);
            aPLogInfo.setLogTag("TencentPay");
            aPLogInfo.setLogCallbackClassName(str);
            APLog.init(aPLogInfo);
        } catch (Throwable th) {
            APLog.m161212e("APLogUtil init", th.toString());
        }
    }
}
