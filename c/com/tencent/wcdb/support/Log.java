package com.tencent.wcdb.support;

public class Log {
    public static final int LOGGER_DEFAULT = 1;
    public static final int LOGGER_NONE = 0;
    private static LogCallback mCallback;

    public interface LogCallback {
        void println(int i, String str, String str2);
    }

    private Log() {
    }

    /* renamed from: d */
    public static void m164291d(String str, String str2) {
        println(3, str, str2);
    }

    /* renamed from: e */
    public static void m164293e(String str, String str2) {
        println(6, str, str2);
    }

    /* renamed from: f */
    public static void m164295f(String str, String str2) {
        println(7, str, str2);
    }

    /* renamed from: i */
    public static void m164297i(String str, String str2) {
        println(4, str, str2);
    }

    private static native void nativePrintLn(int i, String str, String str2);

    private static native void nativeSetLogger(int i, LogCallback logCallback);

    public static void println(int i, String str, String str2) {
        LogCallback logCallback = mCallback;
        if (logCallback != null) {
            logCallback.println(i, str, str2);
        } else {
            nativePrintLn(i, str, str2);
        }
    }

    public static void setLogger(int i) {
        mCallback = null;
        nativeSetLogger(i, (LogCallback) null);
    }

    /* renamed from: v */
    public static void m164299v(String str, String str2) {
        println(2, str, str2);
    }

    /* renamed from: w */
    public static void m164301w(String str, String str2) {
        println(5, str, str2);
    }

    /* renamed from: d */
    public static void m164292d(String str, String str2, Object... objArr) {
        println(3, str, String.format(str2, objArr));
    }

    /* renamed from: e */
    public static void m164294e(String str, String str2, Object... objArr) {
        println(6, str, String.format(str2, objArr));
    }

    /* renamed from: f */
    public static void m164296f(String str, String str2, Object... objArr) {
        println(7, str, String.format(str2, objArr));
    }

    /* renamed from: i */
    public static void m164298i(String str, String str2, Object... objArr) {
        println(4, str, String.format(str2, objArr));
    }

    /* renamed from: v */
    public static void m164300v(String str, String str2, Object... objArr) {
        println(2, str, String.format(str2, objArr));
    }

    /* renamed from: w */
    public static void m164302w(String str, String str2, Object... objArr) {
        println(5, str, String.format(str2, objArr));
    }

    public static void setLogger(LogCallback logCallback) {
        mCallback = logCallback;
        nativeSetLogger(-1, logCallback);
    }
}
