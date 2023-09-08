package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.qqmusic.mediaplayer.ILog;

public class Logger {
    private static ILog mILog = new ILog() {
        /* renamed from: d */
        public void mo24102d(String str, String str2) {
        }

        /* renamed from: e */
        public void mo24103e(String str, String str2) {
        }

        /* renamed from: e */
        public void mo24104e(String str, String str2, Throwable th) {
        }

        /* renamed from: e */
        public void mo24105e(String str, String str2, Object... objArr) {
            String.format(str2, objArr);
        }

        /* renamed from: e */
        public void mo24106e(String str, Throwable th) {
        }

        /* renamed from: i */
        public void mo24107i(String str, String str2) {
        }

        /* renamed from: i */
        public void mo24108i(String str, String str2, Throwable th) {
        }

        /* renamed from: w */
        public void mo24109w(String str, String str2) {
        }
    };

    /* renamed from: d */
    public static void m21786d(String str, String str2) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24102d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m21787e(String str, String str2) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24103e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m21791i(String str, String str2) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24107i(str, str2);
        }
    }

    public static void setLog(ILog iLog) {
        mILog = iLog;
    }

    /* renamed from: w */
    public static void m21793w(String str, String str2) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24109w(str, str2);
        }
    }

    /* renamed from: e */
    public static void m21790e(String str, Throwable th) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24106e(str, th);
        }
    }

    /* renamed from: i */
    public static void m21792i(String str, String str2, Throwable th) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24108i(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m21788e(String str, String str2, Throwable th) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24104e(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m21789e(String str, String str2, Object... objArr) {
        ILog iLog = mILog;
        if (iLog != null) {
            iLog.mo24105e(str, str2, objArr);
        }
    }
}
