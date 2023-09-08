package com.tencent.youtu.ytcommon.tools;

public class YTLogger {
    private static IFaceLiveLogger iFaceLiveLogger;
    private static boolean sEnableLog;
    private static boolean sEnableNativeLog;

    public interface IFaceLiveLogger {
        /* renamed from: d */
        void mo157299d(String str, String str2);

        /* renamed from: e */
        void mo157300e(String str, String str2);

        /* renamed from: i */
        void mo157301i(String str, String str2);

        /* renamed from: v */
        void mo157302v(String str, String str2);

        /* renamed from: w */
        void mo157303w(String str, String str2);
    }

    /* renamed from: d */
    public static void m144666d(String str, String str2) {
        IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.mo157299d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m144667e(String str, String str2) {
        IFaceLiveLogger iFaceLiveLogger2 = iFaceLiveLogger;
        if (iFaceLiveLogger2 != null) {
            iFaceLiveLogger2.mo157300e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m144668i(String str, String str2) {
        IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.mo157301i(str, str2);
        }
    }

    public static boolean isEnableLog() {
        return sEnableLog;
    }

    public static boolean isEnableNativeLog() {
        return sEnableNativeLog;
    }

    public static void setIsEnabledLog(boolean z) {
        sEnableLog = z;
    }

    public static void setIsEnabledNativeLog(boolean z) {
        sEnableNativeLog = z;
    }

    public static void setLog(IFaceLiveLogger iFaceLiveLogger2) {
        iFaceLiveLogger = iFaceLiveLogger2;
    }

    /* renamed from: v */
    public static void m144669v(String str, String str2) {
        IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.mo157302v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m144670w(String str, String str2) {
        IFaceLiveLogger iFaceLiveLogger2;
        if (sEnableLog && (iFaceLiveLogger2 = iFaceLiveLogger) != null) {
            iFaceLiveLogger2.mo157303w(str, str2);
        }
    }
}
