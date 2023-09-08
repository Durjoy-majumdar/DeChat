package com.tencent.p014mm.opensdk.utils;

/* renamed from: com.tencent.mm.opensdk.utils.Log */
public class Log {
    private static ILog logImpl;

    /* renamed from: d */
    public static void m99043d(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo112987d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m99044e(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo112988e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m99045i(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo112989i(str, str2);
        }
    }

    public static void setLogImpl(ILog iLog) {
        logImpl = iLog;
    }

    /* renamed from: v */
    public static void m99046v(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo112990v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m99047w(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo112991w(str, str2);
        }
    }
}
