package com.tencent.liteav.base;

import com.tencent.xweb.file.XVFSFile;
import java.util.Locale;

public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final String sDeprecatedTagPrefix = "cr.";
    private static final String sTagPrefix = "cr_";
    private static final boolean useChromiumLog = true;

    private Log() {
    }

    /* renamed from: d */
    public static void m97545d(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(3, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    /* renamed from: e */
    public static void m97546e(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(6, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static String formatLog(String str, Throwable th, Object... objArr) {
        return objArr != null ? ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr) : str;
    }

    private static String formatLogWithStack(String str, Throwable th, Object... objArr) {
        return "[" + getCallOrigin() + "] " + formatLog(str, th, objArr);
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (stackTrace[i].getClassName().equals(name)) {
                i += 3;
                break;
            } else {
                i++;
            }
        }
        return stackTrace[i].getFileName() + XVFSFile.PATH_SEPARATOR + stackTrace[i].getLineNumber();
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Throwable th = objArr[objArr.length - 1];
        if (!(th instanceof Throwable)) {
            return null;
        }
        return th;
    }

    /* renamed from: i */
    public static void m97547i(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(4, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static boolean isDebug() {
        return true;
    }

    public static boolean isLoggable(String str, int i) {
        if (isDebug() || i > 4) {
            return android.util.Log.isLoggable(str, i);
        }
        return false;
    }

    private static native void nativeWriteLogToNative(int i, String str, String str2);

    public static String normalizeTag(String str) {
        if (str.startsWith(sTagPrefix)) {
            return str;
        }
        int i = 0;
        if (str.startsWith(sDeprecatedTagPrefix)) {
            i = 3;
        }
        return sTagPrefix + str.substring(i, str.length());
    }

    /* renamed from: v */
    public static void m97548v(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(2, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    /* renamed from: w */
    public static void m97549w(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(5, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    public static void wtf(String str, String str2, Object... objArr) {
        nativeWriteLogToNative(7, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }
}
