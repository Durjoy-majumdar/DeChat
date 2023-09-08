package com.tencent.midas.comm;

import android.text.TextUtils;
import com.tencent.midas.comm.log.APLogFileInfo;
import com.tencent.midas.comm.log.internal.APCallbackLogger;
import com.tencent.midas.comm.log.internal.APLogger;
import com.tencent.midas.comm.log.util.APLogFileUtil;

public class APLog {
    private static boolean hasLogCallback = false;
    private static APLogInfo logInfo = new APLogInfo();
    private static APLogger logger;
    private static boolean shouldPrintLog = true;
    private static boolean shouldWriteLog = false;

    private APLog() {
    }

    public static void closeLog() {
        flush();
    }

    private static String composeLogMsg(String str, String str2) {
        return str + APLogFileUtil.SEPARATOR_LOG + Thread.currentThread().getName() + APLogFileUtil.SEPARATOR_LOG + str2 + APLogFileUtil.SEPARATOR_LINE;
    }

    /* renamed from: d */
    public static void m161210d(String str, String str2) {
        String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            APCallbackLogger.log(2, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            APLogger.log(2, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    /* renamed from: e */
    public static void m161212e(String str, String str2) {
        String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            APCallbackLogger.log(5, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            APLogger.log(5, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    public static void flush() {
        try {
            APLogger aPLogger = logger;
            if (aPLogger != null) {
                aPLogger.flush();
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static APLogInfo getLogInfo() {
        return logInfo;
    }

    /* renamed from: i */
    public static void m161214i(String str, String str2) {
        String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            APCallbackLogger.log(3, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            APLogger.log(3, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    public static void init(APLogInfo aPLogInfo) {
        if (aPLogInfo != null) {
            try {
                logInfo = aPLogInfo;
                if (TextUtils.isEmpty(aPLogInfo.getLogCallbackClassName())) {
                    hasLogCallback = false;
                    APCallbackLogger.release();
                } else if (APCallbackLogger.init(aPLogInfo.getLogCallbackClassName())) {
                    hasLogCallback = true;
                    return;
                }
                logInfo.init();
                APLogFileInfo.create();
                APLogFileUtil.readLogKeepConf(logInfo.getContext());
                shouldPrintLog = logInfo.shouldPrintLog();
                if (APLogFileUtil.initLogDir(APLogFileInfo.dirName)) {
                    shouldWriteLog = logInfo.isWriteLog();
                    if (logger == null) {
                        logger = APLogger.open();
                    }
                }
            } catch (Throwable th) {
                th.toString();
            }
        }
    }

    /* renamed from: s */
    public static void m161218s(boolean z, String str, String str2) {
        String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            APCallbackLogger.log(6, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog && !z) {
            APLogger.log(6, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    /* renamed from: v */
    public static void m161220v(String str, String str2) {
        String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            APCallbackLogger.log(1, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            APLogger.log(1, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    /* renamed from: w */
    public static void m161222w(String str, String str2) {
        String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            APCallbackLogger.log(4, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            APLogger.log(4, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    private static void write(String str) {
        try {
            APLogger aPLogger = logger;
            if (aPLogger != null) {
                aPLogger.write(str);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    private static void writeLog(String str) {
        if (shouldWriteLog) {
            write(str);
        }
    }

    /* renamed from: d */
    public static void m161211d(String str, String str2, Object... objArr) {
        m161210d(str, String.format(str2, objArr));
    }

    /* renamed from: e */
    public static void m161213e(String str, String str2, Object... objArr) {
        m161212e(str, String.format(str2, objArr));
    }

    /* renamed from: i */
    public static void m161215i(String str, String str2, Object... objArr) {
        m161214i(str, String.format(str2, objArr));
    }

    /* renamed from: s */
    public static void m161219s(boolean z, String str, String str2, Object... objArr) {
        m161218s(z, str, String.format(str2, objArr));
    }

    /* renamed from: v */
    public static void m161221v(String str, String str2, Object... objArr) {
        m161220v(str, String.format(str2, objArr));
    }

    /* renamed from: w */
    public static void m161223w(String str, String str2, Object... objArr) {
        m161222w(str, String.format(str2, objArr));
    }

    /* renamed from: s */
    public static void m161216s(String str, String str2) {
        writeLog(composeLogMsg(str, str2));
    }

    /* renamed from: s */
    public static void m161217s(String str, String str2, Object... objArr) {
        m161216s(str, String.format(str2, objArr));
    }
}
