package com.tencent.mars.ilink.xlog;

import com.tencent.mars.ilink.xlog.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
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
    private byte _hellAccFlag_;

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

    public static native void appenderOpen(int i, int i2, String str, String str2, String str3, int i3, String str4);

    private static String decryptTag(String str) {
        return str;
    }

    public static native void logWrite(XLoggerInfo xLoggerInfo, String str);

    public static native void logWrite2(int i, String str, String str2, String str3, int i2, int i3, long j, long j2, String str4);

    public static void open(boolean z, int i, int i2, String str, String str2, String str3, String str4) {
        if (z) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("c++_shared");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mars/ilink/xlog/Xlog", WeChatBrands.Business.GROUP_OPEN, "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mars/ilink/xlog/Xlog", WeChatBrands.Business.GROUP_OPEN, "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c("ilink_xlog");
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar2.mo10232b(), "com/tencent/mars/ilink/xlog/Xlog", WeChatBrands.Business.GROUP_OPEN, "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar2.mo10231a(0));
            C117292a.m165359e(obj2, "com/tencent/mars/ilink/xlog/Xlog", WeChatBrands.Business.GROUP_OPEN, "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        appenderOpen(i, i2, str, str2, str3, 0, str4);
    }

    public static native void setAppenderMode(int i);

    public static native void setConsoleLogOpen(boolean z);

    public static native void setErrLogOpen(boolean z);

    public static native void setLogLevel(int i);

    public static native void setMaxAliveTime(long j);

    public static native void setMaxFileSize(long j);

    public native void appenderClose();

    public native void appenderFlush(boolean z);

    public native int getLogLevel();

    public void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(1, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    public void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(4, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    public void logF(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(5, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    public void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(2, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    public void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(0, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    public void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(3, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }
}
