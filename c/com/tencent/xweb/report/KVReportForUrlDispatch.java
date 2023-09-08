package com.tencent.xweb.report;

import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import java.net.URLEncoder;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForUrlDispatch {

    /* renamed from: ID */
    public static final int f122406ID = 26621;
    public static final String TAG = "KVReportForUrlDispatch";
    public static final int TYPE_IN_BLACK_LIST = 3;
    public static final int TYPE_IN_TOOLS_LIST = 1;
    public static final int TYPE_IN_WHITE_LIST = 2;

    public static void report(String str, int i) {
        String str2 = XWebSdk.getXWebSdkVersion() + "," + XWebSdk.getAvailableVersion() + "," + XWalkEnvironment.getApplicationContext().getPackageName() + "," + i + "," + URLEncoder.encode(str);
        XWebLog.m21911i(TAG, "report:" + str2);
        WXWebReporter.setKVLog(f122406ID, str2);
    }
}
