package com.qcloud.qvb;

public abstract class LoggerCallback {
    private static LoggerCallback logger;

    public static void debug(String str, String str2) {
        LoggerCallback loggerCallback = logger;
        if (loggerCallback != null) {
            loggerCallback.mo169547d(str, str2);
        }
    }

    public static void error(String str, String str2) {
        LoggerCallback loggerCallback = logger;
        if (loggerCallback != null) {
            loggerCallback.mo169548e(str, str2);
        }
    }

    public static void info(String str, String str2) {
        LoggerCallback loggerCallback = logger;
        if (loggerCallback != null) {
            loggerCallback.mo169549i(str, str2);
        }
    }

    public static void setLoggerCallback(LoggerCallback loggerCallback) {
        logger = loggerCallback;
    }

    public static void verbose(String str, String str2) {
        LoggerCallback loggerCallback = logger;
        if (loggerCallback != null) {
            loggerCallback.mo169550v(str, str2);
        }
    }

    public static void warn(String str, String str2) {
        LoggerCallback loggerCallback = logger;
        if (loggerCallback != null) {
            loggerCallback.mo169551w(str, str2);
        }
    }

    /* renamed from: d */
    public abstract void mo169547d(String str, String str2);

    /* renamed from: e */
    public abstract void mo169548e(String str, String str2);

    /* renamed from: i */
    public abstract void mo169549i(String str, String str2);

    /* renamed from: v */
    public abstract void mo169550v(String str, String str2);

    /* renamed from: w */
    public abstract void mo169551w(String str, String str2);
}
