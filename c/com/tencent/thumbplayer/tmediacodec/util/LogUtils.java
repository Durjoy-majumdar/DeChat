package com.tencent.thumbplayer.tmediacodec.util;

public final class LogUtils {
    private static final String GLOBAL_TAG = "TMediaCodec";
    private static final String TAG = "LogUtils";
    private static ILogProxy mLogProxy = new ILogProxy() {
        /* renamed from: d */
        public void mo28802d(String str, String str2) {
        }

        /* renamed from: e */
        public void mo28803e(String str, String str2, Throwable th) {
        }

        /* renamed from: i */
        public void mo28804i(String str, String str2) {
        }

        /* renamed from: v */
        public void mo28805v(String str, String str2) {
        }

        /* renamed from: w */
        public void mo28806w(String str, String str2, Throwable th) {
        }
    };
    private static boolean sLogEnable = true;
    private static int sLogLevel = 2;

    /* renamed from: d */
    public static void m21881d(String str, String str2) {
        if (isEnableLog(3)) {
            ILogProxy iLogProxy = mLogProxy;
            iLogProxy.mo28802d("TMediaCodec." + str, str2);
        }
    }

    /* renamed from: e */
    public static void m21882e(String str, String str2) {
        if (isEnableLog(6)) {
            ILogProxy iLogProxy = mLogProxy;
            iLogProxy.mo28803e("TMediaCodec." + str, str2, (Throwable) null);
        }
    }

    /* renamed from: i */
    public static void m21884i(String str, String str2) {
        if (isEnableLog(4)) {
            ILogProxy iLogProxy = mLogProxy;
            iLogProxy.mo28804i("TMediaCodec." + str, str2);
        }
    }

    public static boolean isEnableLog(int i) {
        return sLogEnable && i >= sLogLevel;
    }

    public static boolean isLogEnable() {
        return sLogEnable;
    }

    public static void setLogEnable(boolean z) {
        sLogEnable = z;
    }

    public static void setLogLevel(int i) {
        sLogLevel = i;
    }

    public static void setLogProxy(ILogProxy iLogProxy) {
        mLogProxy = iLogProxy;
    }

    /* renamed from: v */
    public static void m21885v(String str, String str2) {
        if (isEnableLog(2)) {
            ILogProxy iLogProxy = mLogProxy;
            iLogProxy.mo28805v("TMediaCodec." + str, str2);
        }
    }

    /* renamed from: w */
    public static void m21886w(String str, String str2) {
        if (isEnableLog(5)) {
            ILogProxy iLogProxy = mLogProxy;
            iLogProxy.mo28806w("TMediaCodec." + str, str2, (Throwable) null);
        }
    }

    /* renamed from: e */
    public static void m21883e(String str, String str2, Throwable th) {
        if (isEnableLog(6)) {
            ILogProxy iLogProxy = mLogProxy;
            iLogProxy.mo28803e("TMediaCodec." + str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m21887w(String str, String str2, Throwable th) {
        if (isEnableLog(5)) {
            ILogProxy iLogProxy = mLogProxy;
            iLogProxy.mo28806w("TMediaCodec." + str, str2, th);
        }
    }
}
