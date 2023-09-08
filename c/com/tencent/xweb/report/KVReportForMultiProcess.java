package com.tencent.xweb.report;

import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForMultiProcess {

    /* renamed from: ID */
    public static final int f57021ID = 26290;
    public static final String TAG = "KVReportForMultiProcess";

    public static void report() {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(XWalkEnvironment.getAvailableVersion());
        sb.append(",");
        sb.append(XWalkEnvironment.getProcessName());
        sb.append(",");
        sb.append(XWalkEnvironment.getPackageName());
        sb.append(",");
        sb.append(XWalkEnvironment.getMultiProcessType());
        sb.append(",");
        sb.append(XWalkEnvironment.getEnableSandbox() ? 1 : 2);
        sb.append(",");
        sb.append(XWebSdk.getWebViewModeCommandForMM().ordinal());
        sb.append(",");
        sb.append(XWebSdk.getWebViewModeCommandForAppBrand().ordinal());
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        WXWebReporter.setKVLog(f57021ID, sb4);
    }
}
