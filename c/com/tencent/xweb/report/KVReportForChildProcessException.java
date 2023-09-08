package com.tencent.xweb.report;

import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;

public class KVReportForChildProcessException {

    /* renamed from: ID */
    public static final int f122403ID = 26120;
    public static final int SCENE_CREATE_WRAPPER = 4;
    public static final int SCENE_ON_BIND = 2;
    public static final int SCENE_ON_CREATE = 1;
    public static final int SCENE_ON_DESTROY = 3;
    public static final String TAG = "KVReportForChildProcessException";

    public static void report(int i, boolean z, String str, int i2, String str2, String str3) {
        String str4 = XWebSdk.getXWebSdkVersion() + "," + i + "," + str + "," + (z ? 1 : 0) + "," + i2 + "," + str2 + "," + str3;
        XWebLog.m21911i(TAG, "report:" + str4);
        WXWebReporter.setKVLog(f122403ID, str4);
    }
}
