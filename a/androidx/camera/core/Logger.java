package androidx.camera.core;

import android.os.Build;
import android.util.Log;

public final class Logger {
    public static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    /* renamed from: d */
    public static void m15471d(String str, String str2) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    /* renamed from: e */
    public static void m15473e(String str, String str2) {
        isLogLevelEnabled(truncateTag(str), 6);
    }

    public static int getMinLogLevel() {
        return sMinLogLevel;
    }

    /* renamed from: i */
    public static void m15475i(String str, String str2) {
        isLogLevelEnabled(truncateTag(str), 4);
    }

    public static boolean isDebugEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    private static boolean isLogLevelEnabled(String str, int i) {
        return sMinLogLevel <= i || Log.isLoggable(str, i);
    }

    public static boolean isWarnEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(int i) {
        sMinLogLevel = i;
    }

    private static String truncateTag(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* renamed from: w */
    public static void m15477w(String str, String str2) {
        isLogLevelEnabled(truncateTag(str), 5);
    }

    /* renamed from: d */
    public static void m15472d(String str, String str2, Throwable th) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    /* renamed from: e */
    public static void m15474e(String str, String str2, Throwable th) {
        isLogLevelEnabled(truncateTag(str), 6);
    }

    /* renamed from: i */
    public static void m15476i(String str, String str2, Throwable th) {
        isLogLevelEnabled(truncateTag(str), 4);
    }

    /* renamed from: w */
    public static void m15478w(String str, String str2, Throwable th) {
        isLogLevelEnabled(truncateTag(str), 5);
    }
}
