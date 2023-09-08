package com.tencent.p014mm.xlog.app;

import android.os.Looper;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.mars.xlog.LogLogic;
import com.tencent.mars.xlog.Xlog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.xlog.app.XLogSetup */
public class XLogSetup {
    public static Boolean appendIsSync;
    public static String cachePath;
    public static boolean hasInit = false;
    public static Boolean isLogcatOpen;
    public static String logPath;
    public static String nameprefix;
    private static boolean setup;
    public static Integer toolsLevel;
    public static Xlog xlog = new Xlog();

    public static void keep_setupXLog(boolean z, String str, String str2, Integer num, Boolean bool, Boolean bool2, String str3) {
        if (!hasInit) {
            PlatformComm.init(MMApplicationContext.getContext(), new MMHandler(Looper.getMainLooper()));
            hasInit = true;
        }
        cachePath = str;
        logPath = str2;
        toolsLevel = num;
        appendIsSync = bool;
        isLogcatOpen = bool2;
        nameprefix = str3;
        if (z && !setup) {
            setup = true;
            C88957l.m111079o("wechatxlog", XLogSetup.class.getClassLoader());
            Log.setLogImp(xlog);
            Log.setConsoleLogOpen(isLogcatOpen.booleanValue());
            if (toolsLevel == null) {
                Log.appenderOpen(2, 0, cachePath, logPath, nameprefix, 3);
                Log.LogImp impl = Log.getImpl();
                if (impl != null) {
                    impl.setMaxAliveTime(0, 345600);
                }
                LogLogic.initIPxxLogInfo();
                return;
            }
            boolean booleanValue = bool.booleanValue();
            Log.appenderOpen(toolsLevel.intValue(), booleanValue ? 1 : 0, cachePath, logPath, nameprefix, 0);
        }
    }

    public static void realSetupXlog() {
        keep_setupXLog(true, cachePath, logPath, toolsLevel, appendIsSync, isLogcatOpen, nameprefix);
    }
}
