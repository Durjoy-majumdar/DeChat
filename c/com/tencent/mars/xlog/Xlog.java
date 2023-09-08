package com.tencent.mars.xlog;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LogDecryptor;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import k20.C9556a;

public class Xlog implements Log.LogImp {
    public static final int AppednerModeAsync = 0;
    public static final int AppednerModeSync = 1;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    public static int MONITOR_LEVEL = 2;
    public static final int ZLIB_MODE = 0;
    public static final int ZSTD_COMPRESS_LEVEL1 = 1;
    public static final int ZSTD_COMPRESS_LEVEL2 = 2;
    public static final int ZSTD_COMPRESS_LEVEL3 = 3;
    public static final int ZSTD_COMPRESS_LEVEL4 = 4;
    public static final int ZSTD_COMPRESS_LEVEL5 = 5;
    public static final int ZSTD_COMPRESS_LEVEL6 = 6;
    public static final int ZSTD_COMPRESS_LEVEL7 = 7;
    public static final int ZSTD_COMPRESS_LEVEL8 = 8;
    public static final int ZSTD_COMPRESS_LEVEL9 = 9;
    public static final int ZSTD_MODE = 1;
    public static LogDecryptor logDecryptor = null;
    private static String mCacheDir = null;
    private static String mLogDir = null;
    private static LogMonitor monitor = new LogMonitor();
    private static String xlog_pubkey = "1dac3876bd566b60c7dcbffd219ca6af2d2c07f045711bf2a6d111a2b1fc27c4df31c1f568879708c5159e370ab141e6627ea028b47f8a5cf4d39ca30d501f81";
    private byte _hellAccFlag_;

    public static class XLogConfig {
        public int cachedays = 0;
        public String cachedir;
        public int compresslevel = 6;
        public int compressmode = 0;
        public int level = 2;
        public String logdir;
        public int mode = 0;
        public String nameprefix;
        public String pubkey = "";
    }

    public static class XLoggerInfo {
        public String filename;
        public String funcname;
        public int level;
        public int line;
        public long maintid;
        public long pid;
        public String tag;
        public long tid;
    }

    private static native void appenderOpen(XLogConfig xLogConfig);

    private static String decryptTag(String str) {
        LogDecryptor logDecryptor2 = logDecryptor;
        return logDecryptor2 != null ? logDecryptor2.decryptTag(str) : str;
    }

    private static void logMonitor(long j, int i, String str, String str2, String str3, int i2, int i3, long j2, long j3, String str4) {
        if (i < MONITOR_LEVEL || monitor.monitor(str, str4)) {
            logWrite2(j, i, str, str2, str3, i2, i3, j2, j3, str4);
        }
    }

    public static native void logWrite(XLoggerInfo xLoggerInfo, String str);

    public static void logWrite2(int i, String str, String str2, String str3, int i2, int i3, long j, long j2, String str4) {
        logMonitor(0, i, str, str2, str3, i2, i3, j, j2, str4);
    }

    public static native void logWrite2(long j, int i, String str, String str2, String str3, int i2, int i3, long j2, long j3, String str4);

    public static void open(boolean z, int i, int i2, String str, String str2, String str3, int i3) {
        if (z) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("tencentxlog");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mars/xlog/Xlog", WeChatBrands.Business.GROUP_OPEN, "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mars/xlog/Xlog", WeChatBrands.Business.GROUP_OPEN, "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        Log.appenderOpen(i, i2, str, str2, str3, i3);
    }

    public native void appenderClose();

    public native void appenderFlush(long j, boolean z);

    public void appenderOpen(int i, int i2, String str, String str2, String str3, int i3) {
        mCacheDir = str;
        mLogDir = str2;
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i;
        xLogConfig.mode = i2;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 0;
        xLogConfig.pubkey = xlog_pubkey;
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i3;
        appenderOpen(xLogConfig);
    }

    public native int getLogLevel(long j);

    public native long getXlogInstance(String str);

    public void logD(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logMonitor(j, 1, decryptTag(str), str2, str3, i, i2, j2, j3, LogLogic.appendMemLog(str4));
    }

    public void logE(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logMonitor(j, 4, decryptTag(str), str2, str3, i, i2, j2, j3, LogLogic.appendMemLog(str4));
    }

    public void logF(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logMonitor(j, 5, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    public void logI(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logMonitor(j, 2, decryptTag(str), str2, str3, i, i2, j2, j3, LogLogic.appendMemLog(str4));
    }

    public void logV(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logMonitor(j, 0, decryptTag(str), str2, str3, i, i2, j2, j3, str4);
    }

    public void logW(long j, String str, String str2, String str3, int i, int i2, long j2, long j3, String str4) {
        logMonitor(j, 3, decryptTag(str), str2, str3, i, i2, j2, j3, LogLogic.appendMemLog(str4));
    }

    public void moveLogsFromCacheDirToLogDir() {
        String str = mCacheDir;
        if (str != null && mLogDir != null && str.length() != 0 && mLogDir.length() != 0) {
            C86009m1 m1Var = new C86009m1(mCacheDir);
            if (m1Var.mo119967g()) {
                C86009m1[] v = m1Var.mo119985v(new C86011o1() {
                    public boolean accept(C86009m1 m1Var) {
                        if (m1Var.mo119977o()) {
                            return false;
                        }
                        return m1Var.getName().toLowerCase().endsWith(".xlog");
                    }
                });
                if (v.length != 0) {
                    for (C86009m1 m1Var2 : v) {
                        C86013q1.m106463x(m1Var2.mo119976n(), mLogDir + "/" + m1Var2.getName());
                    }
                }
            }
        }
    }

    public native long newXlogInstance(XLogConfig xLogConfig);

    public long openLogInstance(int i, int i2, String str, String str2, String str3, int i3) {
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i;
        xLogConfig.mode = i2;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 0;
        xLogConfig.pubkey = xlog_pubkey;
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i3;
        return newXlogInstance(xLogConfig);
    }

    public native void releaseXlogInstance(String str);

    public native void setAppenderMode(long j, int i);

    public native void setConsoleLogOpen(long j, boolean z);

    public native void setMaxAliveTime(long j, long j2);

    public native void setMaxFileSize(long j, long j2);
}
