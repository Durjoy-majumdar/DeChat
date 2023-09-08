package com.alibaba.android.patronus.util;

import java.util.Locale;

public final class Log {
    public static final ILogger DEFAULT_LOGGER;
    private static ILogger sLogger;

    public interface ILogger {
        void println(int i, String str, String str2);
    }

    static {
        C169311 r0 = new ILogger() {
            public void println(int i, String str, String str2) {
                android.util.Log.println(i, str, str2);
            }
        };
        DEFAULT_LOGGER = r0;
        sLogger = r0;
    }

    /* renamed from: d */
    public static void m16619d(String str, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(3, str, str2);
        }
    }

    /* renamed from: e */
    public static void m16623e(String str, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(6, str, str2);
        }
    }

    /* renamed from: i */
    public static void m16627i(String str, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(4, str, str2);
        }
    }

    public static ILogger setLogger(ILogger iLogger) {
        ILogger iLogger2 = sLogger;
        if (iLogger2 == iLogger) {
            return iLogger;
        }
        sLogger = iLogger;
        return iLogger2;
    }

    /* renamed from: v */
    public static void m16631v(String str, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(2, str, str2);
        }
    }

    /* renamed from: w */
    public static void m16635w(String str, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(5, str, str2);
        }
    }

    /* renamed from: d */
    public static void m16620d(String str, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(3, str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    /* renamed from: e */
    public static void m16624e(String str, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(6, str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m16628i(String str, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(4, str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    /* renamed from: v */
    public static void m16632v(String str, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(2, str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    /* renamed from: w */
    public static void m16636w(String str, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(5, str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m16621d(String str, Throwable th, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(3, str, str2 + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: e */
    public static void m16625e(String str, Throwable th, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(6, str, str2 + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: i */
    public static void m16629i(String str, Throwable th, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(4, str, str2 + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: v */
    public static void m16633v(String str, Throwable th, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(2, str, str2 + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: w */
    public static void m16637w(String str, Throwable th, String str2) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(5, str, str2 + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: d */
    public static void m16622d(String str, Throwable th, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(3, str, String.format(Locale.ENGLISH, str2, objArr) + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: e */
    public static void m16626e(String str, Throwable th, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(6, str, String.format(Locale.ENGLISH, str2, objArr) + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: i */
    public static void m16630i(String str, Throwable th, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(4, str, String.format(Locale.ENGLISH, str2, objArr) + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: v */
    public static void m16634v(String str, Throwable th, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(2, str, String.format(Locale.ENGLISH, str2, objArr) + 10 + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: w */
    public static void m16638w(String str, Throwable th, String str2, Object... objArr) {
        ILogger iLogger = sLogger;
        if (iLogger != null) {
            iLogger.println(5, str, String.format(Locale.ENGLISH, str2, objArr) + 10 + android.util.Log.getStackTraceString(th));
        }
    }
}
