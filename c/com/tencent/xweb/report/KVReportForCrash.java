package com.tencent.xweb.report;

import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;

public class KVReportForCrash {

    /* renamed from: ID */
    public static final int f57017ID = 25407;
    public static final int SCENE_CREATE_WEBVIEW_INSTANCE = 2;
    public static final int SCENE_GET_SETTINGS_CHECK_THREAD = 3;
    public static final int SCENE_INIT_WEBVIEW_CORE = 1;
    public static final String TAG = "KVReportForCrash";

    private static String fixComma(String str) {
        return str.replaceAll(",", " ");
    }

    public static void report(int i, String str, int i2) {
        String str2 = XWebSdk.getXWebSdkVersion() + "," + XWebSdk.getAvailableVersion() + "," + i2 + "," + WebView.getModuleName() + "," + i + "," + fixComma(str);
        XWebLog.m21908d(TAG, "report:" + str2);
        WXWebReporter.setKVLog(f57017ID, str2);
    }
}
