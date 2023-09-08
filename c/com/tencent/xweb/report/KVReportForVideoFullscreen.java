package com.tencent.xweb.report;

import android.text.TextUtils;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.util.WXWebReporter;

public class KVReportForVideoFullscreen {
    public static final int ACTION_TYPE_CREATE = 1;
    public static final int ACTION_TYPE_ENTER = 2;

    /* renamed from: ID */
    public static final int f122407ID = 24151;
    public static final int INTERFACE_TYPE_RUNTIME = 2;
    public static final int INTERFACE_TYPE_SDK = 1;
    public static final int RUNTIME_TO_SDK_NO = 0;
    public static final int RUNTIME_TO_SDK_YES = 1;

    public static int convertWebCoreType(WebView.WebViewKind webViewKind) {
        if (webViewKind == WebView.WebViewKind.WV_KIND_SYS) {
            return 1;
        }
        if (webViewKind == WebView.WebViewKind.WV_KIND_CW) {
            return 3;
        }
        return webViewKind == WebView.WebViewKind.WV_KIND_PINUS ? 4 : 0;
    }

    public static void report(WebView.WebViewKind webViewKind, int i, int i2, boolean z, String str) {
        int convertWebCoreType = convertWebCoreType(webViewKind);
        StringBuilder sb = new StringBuilder();
        sb.append(XWebSdk.getAvailableVersion());
        sb.append(",");
        sb.append(XWebSdk.getXWebSdkVersion());
        sb.append(",");
        sb.append(convertWebCoreType);
        sb.append(",");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(z ? 1 : 0);
        sb.append(",");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        WXWebReporter.setKVLog(f122407ID, sb.toString());
    }
}
