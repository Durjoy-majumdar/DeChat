package com.tencent.p014mm.sdk.platformtools;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.platformtools.Log */
public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static String SYS_INFO = null;
    private static final String TAG = "MicroMsg.SDK.Log";
    private static LogImp debugLog = null;
    private static boolean isPrintAndroidLog = false;
    /* access modifiers changed from: private */
    public static int level = 6;
    /* access modifiers changed from: private */
    public static LogImp logImp;
    private static Map<String, LogInstance> sLogInstanceMap = new HashMap();

    /* renamed from: com.tencent.mm.sdk.platformtools.Log$LogImp */
    public interface LogImp {
        void appenderClose();

        void appenderFlush(long j, boolean z);

        void appenderOpen(int i, int i2, String str, String str2, String str3, int i3);

        int getLogLevel(long j);

        long getXlogInstance(String str);

        void logD(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4);

        void logE(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4);

        void logF(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4);

        void logI(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4);

        void logV(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4);

        void logW(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4);

        void moveLogsFromCacheDirToLogDir();

        long openLogInstance(int i, int i2, String str, String str2, String str3, int i3);

        void releaseXlogInstance(String str);

        void setAppenderMode(long j, int i);

        void setConsoleLogOpen(long j, boolean z);

        void setMaxAliveTime(long j, long j2);

        void setMaxFileSize(long j, long j2);
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.Log$LogInstance */
    public static class LogInstance {
        /* access modifiers changed from: private */
        public long mLogInstancePtr;
        private String mPrefix;

        public void appenderFlush() {
            if (Log.logImp != null && this.mLogInstancePtr != -1) {
                Log.logImp.appenderFlush(this.mLogInstancePtr, false);
            }
        }

        public void appenderFlushSync() {
            if (Log.logImp != null && this.mLogInstancePtr != -1) {
                Log.logImp.appenderFlush(this.mLogInstancePtr, true);
            }
        }

        /* renamed from: d */
        public void mo119534d(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 1 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logD(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
            }
        }

        /* renamed from: e */
        public void mo119535e(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 4 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
            }
        }

        /* renamed from: f */
        public void mo119536f(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 5 && this.mLogInstancePtr != -1) {
                Log.logImp.logF(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2));
            }
        }

        public int getLogLevel() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return 6;
            }
            return Log.logImp.getLogLevel(this.mLogInstancePtr);
        }

        /* renamed from: i */
        public void mo119538i(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 2 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logI(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
            }
        }

        public void iNoFormat(String str, String str2) {
            if (Log.logImp != null && getLogLevel() <= 2 && this.mLogInstancePtr != -1) {
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str;
                Log.logImp.logI(this.mLogInstancePtr, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
            }
        }

        public void printDebugStack(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 1 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logI(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format + "  " + Util.getStack());
            }
        }

        public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 4 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th));
            }
        }

        public void printInfoStack(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 2 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logI(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format + "  " + Util.getStack());
            }
        }

        public void setConsoleLogOpen(boolean z) {
            if (Log.logImp != null && this.mLogInstancePtr != -1) {
                Log.logImp.setConsoleLogOpen(this.mLogInstancePtr, z);
            }
        }

        /* renamed from: v */
        public void mo119544v(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 0 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logV(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
            }
        }

        /* renamed from: w */
        public void mo119545w(String str, String str2, Object... objArr) {
            Object[] objArr2 = objArr;
            if (Log.logImp != null && getLogLevel() <= 3 && this.mLogInstancePtr != -1) {
                String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
                if (format == null) {
                    format = "";
                }
                Log.logImp.logW(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format);
            }
        }

        private LogInstance(int i, int i2, String str, String str2, String str3, int i3) {
            this.mLogInstancePtr = -1;
            this.mPrefix = null;
            if (Log.logImp != null) {
                this.mLogInstancePtr = Log.logImp.openLogInstance(i, i2, str, str2, str3, i3);
                this.mPrefix = str3;
            }
        }
    }

    static {
        C857461 r0 = new LogImp() {
            private Handler handler = new Handler(Looper.getMainLooper());

            public void appenderClose() {
            }

            public void appenderFlush(long j, boolean z) {
            }

            public void appenderOpen(int i, int i2, String str, String str2, String str3, int i3) {
            }

            public int getLogLevel(long j) {
                return Log.level;
            }

            public long getXlogInstance(String str) {
                return 0;
            }

            public void logD(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
                int unused = Log.level;
            }

            public void logE(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
                int unused = Log.level;
            }

            public void logF(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
                int unused = Log.level;
            }

            public void logI(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
                int unused = Log.level;
            }

            public void logV(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
                int unused = Log.level;
            }

            public void logW(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
                int unused = Log.level;
            }

            public void moveLogsFromCacheDirToLogDir() {
            }

            public long openLogInstance(int i, int i2, String str, String str2, String str3, int i3) {
                return 0;
            }

            public void releaseXlogInstance(String str) {
            }

            public void setAppenderMode(long j, int i) {
            }

            public void setConsoleLogOpen(long j, boolean z) {
            }

            public void setMaxAliveTime(long j, long j2) {
            }

            public void setMaxFileSize(long j, long j2) {
            }
        };
        debugLog = r0;
        logImp = r0;
    }

    public static void appenderClose() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderClose();
            sLogInstanceMap.size();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, LogInstance> key : sLogInstanceMap.entrySet()) {
                arrayList.add((String) key.getKey());
            }
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                closeLogInstance((String) listIterator.next());
            }
        }
    }

    public static void appenderFlush() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0, false);
            for (Map.Entry<String, LogInstance> value : sLogInstanceMap.entrySet()) {
                ((LogInstance) value.getValue()).appenderFlush();
            }
        }
    }

    public static void appenderFlushSync() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0, true);
        }
    }

    public static void appenderOpen(int i, int i2, String str, String str2, String str3, int i3) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderOpen(i, i2, str, str2, str3, i3);
        }
    }

    public static void closeLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            if (logImp != null && sLogInstanceMap.containsKey(str)) {
                logImp.releaseXlogInstance(str);
                long unused = sLogInstanceMap.remove(str).mLogInstancePtr = -1;
            }
        }
    }

    /* renamed from: d */
    public static void m105918d(String str, String str2) {
        m105919d(str, str2, (Object[]) null);
    }

    /* renamed from: e */
    public static void m105920e(String str, String str2) {
        m105921e(str, str2, (Object[]) null);
    }

    /* renamed from: f */
    public static void m105922f(String str, String str2) {
        m105923f(str, str2, (Object[]) null);
    }

    public static LogImp getImpl() {
        return logImp;
    }

    public static LogInstance getLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            if (!sLogInstanceMap.containsKey(str)) {
                return null;
            }
            LogInstance logInstance = sLogInstanceMap.get(str);
            return logInstance;
        }
    }

    public static int getLogLevel() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLogLevel(0);
        }
        return 6;
    }

    public static String getSysInfo() {
        if (SYS_INFO == null) {
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
                sb.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
                sb.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
                sb.append("] BOARD:[" + Build.BOARD);
                sb.append("] DEVICE:[" + Build.DEVICE);
                sb.append("] DISPLAY:[" + Build.DISPLAY);
                sb.append("] FINGERPRINT:[" + Build.FINGERPRINT);
                sb.append("] HOST:[" + Build.HOST);
                sb.append("] MANUFACTURER:[" + Build.MANUFACTURER);
                sb.append("] MODEL:[" + Build.MODEL);
                sb.append("] PRODUCT:[" + Build.PRODUCT);
                sb.append("] TAGS:[" + Build.TAGS);
                sb.append("] TYPE:[" + Build.TYPE);
                sb.append("] USER:[" + Build.USER + "]");
            } catch (Throwable th) {
                printErrStackTrace(TAG, th, "", new Object[0]);
            }
            SYS_INFO = sb.toString();
        }
        return SYS_INFO;
    }

    /* renamed from: i */
    public static void m105924i(String str, String str2) {
        m105925i(str, str2, (Object[]) null);
    }

    public static boolean isDebug() {
        return getLogLevel() <= 1;
    }

    public static void moveLogsFromCacheDirToLogDir() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.moveLogsFromCacheDirToLogDir();
        }
    }

    public static LogInstance openLogInstance(int i, int i2, String str, String str2, String str3, int i3) {
        synchronized (sLogInstanceMap) {
            if (sLogInstanceMap.containsKey(str3)) {
                LogInstance logInstance = sLogInstanceMap.get(str3);
                return logInstance;
            }
            LogInstance logInstance2 = new LogInstance(i, i2, str, str2, str3, i3);
            sLogInstanceMap.put(str3, logInstance2);
            return logInstance2;
        }
    }

    public static void print(String str, String str2, Object... objArr) {
        if (isPrintAndroidLog) {
            String format = String.format(Locale.CHINA, str2, objArr);
            String.format(Locale.CHINA, "[%s, %s, %s, %s]-[%s]: [%s]", new Object[]{Integer.valueOf(Process.myTid()), Integer.valueOf(Process.myPid()), Long.valueOf(Thread.currentThread().getId()), Long.valueOf(Looper.getMainLooper().getThread().getId()), str, format});
        }
        m105925i(str, str2, objArr);
    }

    public static void printDebugStack(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 1) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logI(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2 + "  " + Util.getStack());
        }
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        Object[] objArr2 = objArr;
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 4) {
            String format = (objArr2 == null || objArr2.length == 0) ? str2 : String.format(Locale.CHINA, str2, objArr2);
            if (format == null) {
                format = "";
            }
            logImp.logE(0, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th));
        }
    }

    public static void printInfoStack(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 2) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logI(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2 + "  " + Util.getStack());
        }
    }

    public static void setConsoleLogOpen(boolean z) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setConsoleLogOpen(0, z);
        }
    }

    public static void setLevel(int i, boolean z) {
        level = i;
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    public static void setPrintAndroidLog(boolean z) {
        isPrintAndroidLog = z;
    }

    /* renamed from: v */
    public static void m105926v(String str, String str2) {
        m105927v(str, str2, (Object[]) null);
    }

    /* renamed from: w */
    public static void m105928w(String str, String str2) {
        m105929w(str, str2, (Object[]) null);
    }

    /* renamed from: d */
    public static void m105919d(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 1) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logD(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: e */
    public static void m105921e(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 4) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logE(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: f */
    public static void m105923f(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 5) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            String str3 = str;
            logImp.logF(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: i */
    public static void m105925i(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 2) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logI(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: v */
    public static void m105927v(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 0) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logV(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }

    /* renamed from: w */
    public static void m105929w(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0) <= 3) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(Locale.CHINA, str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str;
            logImp.logW(0, str3, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
        }
    }
}
