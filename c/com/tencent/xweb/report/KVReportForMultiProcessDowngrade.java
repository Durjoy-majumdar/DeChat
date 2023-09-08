package com.tencent.xweb.report;

import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;

public class KVReportForMultiProcessDowngrade {
    public static final int ACTION_TYPE_DOWNGRADE_CRASH = 4;
    public static final int ACTION_TYPE_DOWNGRADE_SYS = 3;
    public static final int ACTION_TYPE_FINISH = 2;
    public static final int ACTION_TYPE_START = 1;
    public static final String CRASH_TYPE_DOWNGRADE_CHILD_PROCESS_CRASH = "DowngradeChildProcessCrash";
    public static final String CRASH_TYPE_DOWNGRADE_CRASH_COUNT = "DowngradeCrashCount";
    public static final String CRASH_TYPE_DOWNGRADE_SYS = "DowngradeSys";
    public static final String CRASH_TYPE_GPU_UNUSABLE = "GpuUnusable";
    public static final String CRASH_TYPE_INVALID_CLASSLOADER_ERROR = "InvalidClassloaderError";
    public static final String CRASH_TYPE_LOAD_LIBRARY_ERROR = "LoadXWebLibraryError";
    public static final String CRASH_TYPE_RENDER_OFFSET = "RenderOffset";
    public static final String CRASH_TYPE_SDK_UNKNOWN_ERROR = "SdkUnknownError";
    public static final String CRASH_TYPE_SET_CUSTOM_FONT_ERROR = "SetCustomFontError";

    /* renamed from: ID */
    public static final int f57022ID = 26528;
    public static final String TAG = "KVReportForMultiProcessDowngrade";

    public static void report(int i, int i2, int i3, int i4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(XWebSdk.getAvailableVersion());
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        sb.append(",");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(",");
        sb.append(CommandCfg.getInstance().getWebViewModeCommandForMM());
        sb.append(",");
        String str2 = "2";
        sb.append(CommandCfg.getInstance().getDisableChildProcessStartCrashCount() ? str2 : "1");
        sb.append(",");
        if (!CommandCfg.getInstance().getDisableChildProcessStartTimeOut()) {
            str2 = "1";
        }
        sb.append(str2);
        sb.append(",");
        sb.append(CommandCfg.getInstance().getChildProcessStartTimeOutCount());
        sb.append(",");
        sb.append(CommandCfg.getInstance().getChildProcessStartTimeOutThreshold());
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        WXWebReporter.setKVLog(f57022ID, sb4);
    }
}
