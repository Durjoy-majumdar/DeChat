package com.tencent.xweb.report;

import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.NetworkUtil;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import org.xwalk.core.XWalkEnvironment;

public class KVReportForLoadUrl {

    /* renamed from: ID */
    public static final int f57020ID = 15003;
    public static final int ID_FOR_WXA_SDK = 10129;
    public static final String TAG = "KVReportForLoadUrl";

    private static String getOriginUrl(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + url.getAuthority();
        } catch (MalformedURLException e) {
            XWebLog.m21910e(TAG, "getOriginUrl, url:" + str + ", error", e);
            return "";
        }
    }

    public static void report(int i, String str, int i2, int i3, int i4, int i5, String str2, WebView.WebViewKind webViewKind) {
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(XWebSdk.getAvailableVersion());
        sb.append(",");
        sb.append(webViewKind.ordinal());
        sb.append(",");
        sb.append(i);
        sb.append(",");
        sb.append(str);
        sb.append(",");
        sb.append(NetworkUtil.getCurrentNetWorkStatus(XWalkEnvironment.getApplicationContext()));
        sb.append(",");
        sb.append(100);
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        sb.append(",");
        sb.append(i5);
        sb.append(",");
        sb.append(XWalkEnvironment.getApplicationContext().getPackageName());
        sb.append(",");
        sb.append(URLEncoder.encode(str2));
        sb.append(",");
        sb.append(XWalkEnvironment.getMultiProcessType());
        sb.append(",");
        sb.append(XWalkEnvironment.getEnableSandbox() ? 1 : 2);
        sb.append(",");
        sb.append(XWalkEnvironment.getProcessName());
        sb.append(",");
        sb.append(XWebGrayValueUtil.getGrayValue());
        String sb4 = sb.toString();
        XWebLog.m21911i(TAG, "report:" + sb4);
        if (!XWalkEnvironment.getBuildConfigThirdPartyRelease() || !CommandCfg.getInstance().getEnableThirdAppReport()) {
            WXWebReporter.setKVLog(15003, sb4);
        } else {
            WXWebReporter.setKVLog(ID_FOR_WXA_SDK, sb4);
        }
    }
}
