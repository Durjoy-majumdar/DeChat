package com.tencent.mars.ilink.xlog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;

public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static final String TAG = "mars.xlog.log";
    private static LogImp debugLog = null;
    /* access modifiers changed from: private */
    public static int level = 6;
    private static LogImp logImp;
    public static Context toastSupportContext;

    public interface LogImp {
        void appenderClose();

        void appenderFlush(boolean z);

        int getLogLevel();

        void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logF(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);

        void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4);
    }

    static {
        C1143851 r0 = new LogImp() {
            private Handler handler = new Handler(Looper.getMainLooper());

            public void appenderClose() {
            }

            public void appenderFlush(boolean z) {
            }

            public int getLogLevel() {
                return Log.level;
            }

            public void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }

            public void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }

            public void logF(String str, String str2, String str3, int i, int i2, long j, long j2, final String str4) {
                if (Log.level <= 5 && Log.toastSupportContext != null) {
                    this.handler.post(new Runnable() {
                        public void run() {
                            Toast.makeText(Log.toastSupportContext, str4, 1).show();
                        }
                    });
                }
            }

            public void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }

            public void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }

            public void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
                int unused = Log.level;
            }
        };
        debugLog = r0;
        logImp = r0;
    }

    public static void appenderClose() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderClose();
        }
    }

    public static void appenderFlush(boolean z) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(z);
        }
    }

    /* renamed from: d */
    public static void m160922d(String str, String str2) {
        m160923d(str, str2, (Object[]) null);
    }

    /* renamed from: e */
    public static void m160924e(String str, String str2) {
        m160925e(str, str2, (Object[]) null);
    }

    /* renamed from: f */
    public static void m160926f(String str, String str2) {
        m160927f(str, str2, (Object[]) null);
    }

    public static LogImp getImpl() {
        return logImp;
    }

    public static int getLogLevel() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLogLevel();
        }
        return 6;
    }

    /* renamed from: i */
    public static void m160928i(String str, String str2) {
        m160929i(str, str2, (Object[]) null);
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logE(str3, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2 + "  " + android.util.Log.getStackTraceString(th));
        }
    }

    public static void setLevel(int i, boolean z) {
        level = i;
        if (z) {
            Xlog.setLogLevel(i);
        }
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    /* renamed from: v */
    public static void m160930v(String str, String str2) {
        m160931v(str, str2, (Object[]) null);
    }

    /* renamed from: w */
    public static void m160932w(String str, String str2) {
        m160933w(str, str2, (Object[]) null);
    }

    /* renamed from: d */
    public static void m160923d(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logD(str3, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: e */
    public static void m160925e(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logE(str3, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: f */
    public static void m160927f(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            String str3 = str;
            logImp.logF(str3, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: i */
    public static void m160929i(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logI(str3, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: v */
    public static void m160931v(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logV(str3, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: w */
    public static void m160933w(String str, String str2, Object... objArr) {
        if (logImp != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logW(str3, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }
}
