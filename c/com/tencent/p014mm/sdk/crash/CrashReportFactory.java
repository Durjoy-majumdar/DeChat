package com.tencent.p014mm.sdk.crash;

import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;

/* renamed from: com.tencent.mm.sdk.crash.CrashReportFactory */
public class CrashReportFactory {
    private static boolean backupMerge = false;
    public static String currentActivity = "unknow";
    public static boolean foreground = false;
    public static long heavyUserFlag = 0;
    private static boolean isDualByTools = false;
    private static boolean isHookedByXposed = false;
    private static boolean isX86Env = false;
    private static boolean onlinePatchBlocked = false;
    public static String recentlyDbPoolBusyRunningSql = "";
    private static ICrashReporter reporter;
    private static volatile IDebuggerStatusProvider sDebuggerStatusProvider;

    /* renamed from: com.tencent.mm.sdk.crash.CrashReportFactory$IDebuggerStatusProvider */
    public interface IDebuggerStatusProvider {
        boolean isDebuggerAttached();
    }

    public static void addCrashReportExtraMessageGetter(ICrashReporter.ICrashReportExtraMessageGetter iCrashReportExtraMessageGetter) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.addExtraMessageGetter(iCrashReportExtraMessageGetter);
        }
    }

    public static void addCrashReportListener(ICrashReporter.ICrashReportListener iCrashReportListener) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.addCrashReportListener(iCrashReportListener);
        }
    }

    @Deprecated
    public static String getDebugerApiLevel() {
        return WeChatEnvironment.getDebuggerApiLevel();
    }

    @Deprecated
    public static boolean hasDebuger() {
        if (sDebuggerStatusProvider != null) {
            return sDebuggerStatusProvider.isDebuggerAttached();
        }
        return false;
    }

    public static boolean isBackupMerge() {
        return backupMerge;
    }

    public static synchronized boolean isDualByTools() {
        boolean z;
        synchronized (CrashReportFactory.class) {
            z = isDualByTools;
        }
        return z;
    }

    public static synchronized boolean isHookedByXposed() {
        boolean z;
        synchronized (CrashReportFactory.class) {
            z = isHookedByXposed;
        }
        return z;
    }

    @Deprecated
    public static boolean isMonkeyEnv() {
        return WeChatEnvironment.isMonkeyEnv();
    }

    public static boolean isOnlinePatchBlocked() {
        return onlinePatchBlocked;
    }

    public static synchronized boolean isX86Env() {
        boolean z;
        synchronized (CrashReportFactory.class) {
            z = isX86Env;
        }
        return z;
    }

    public static void removeCrashReportListener(ICrashReporter.ICrashReportListener iCrashReportListener) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.removeCrashReportListener(iCrashReportListener);
        }
    }

    public static void reportCrashMessage(String str, String str2) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.reportCrashMessage(str, str2);
        }
    }

    public static void reportJniCrash(int i, String str, String str2) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.reportJniCrash(i, str, str2);
        }
    }

    public static void reportRawMessage(String str, String str2) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.reportRawMessage(str, str2);
        }
    }

    public static void setBackupMerge(boolean z) {
        backupMerge = z;
    }

    public static void setCallbackForReset(CallbackForReset callbackForReset) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.setCallbackForReset(callbackForReset);
        }
    }

    public static void setCurrentActivity(String str) {
        currentActivity = str;
    }

    @Deprecated
    public static void setDebugerApiLevel(String str) {
        WeChatEnvironment.setDebuggerApiLevel(str);
    }

    public static void setDebuggerStatusProvider(IDebuggerStatusProvider iDebuggerStatusProvider) {
        sDebuggerStatusProvider = iDebuggerStatusProvider;
    }

    public static synchronized void setDualByTools(boolean z) {
        synchronized (CrashReportFactory.class) {
            isDualByTools = z;
        }
    }

    public static void setForeground(boolean z) {
        foreground = z;
    }

    public static void setHeavyUserFlag(long j) {
        heavyUserFlag = j;
    }

    public static synchronized void setHookedByXposed(boolean z) {
        synchronized (CrashReportFactory.class) {
            isHookedByXposed = z;
        }
    }

    public static void setOnlinePatchBlocked(boolean z) {
        onlinePatchBlocked = z;
    }

    public static void setReportID(String str) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.setReportID(str);
        }
    }

    public static synchronized void setX86Env(boolean z) {
        synchronized (CrashReportFactory.class) {
            isX86Env = z;
        }
    }

    public static void setupCrashReporter(ICrashReporter iCrashReporter) {
        reporter = iCrashReporter;
    }

    public static void setupSubReporter(ISubReporter iSubReporter) {
        ICrashReporter iCrashReporter = reporter;
        if (iCrashReporter != null) {
            iCrashReporter.setupSubReporter(iSubReporter);
        }
    }
}
