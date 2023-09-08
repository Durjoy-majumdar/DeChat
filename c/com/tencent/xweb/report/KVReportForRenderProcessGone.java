package com.tencent.xweb.report;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.pinus.sdk.WebView;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import java.net.URLEncoder;

public class KVReportForRenderProcessGone {

    /* renamed from: ID */
    public static final int f122405ID = 26011;
    public static final String TAG = "KVReportForRenderProcessGone";

    public static int getWebViewContextType(WebView webView) {
        if (webView == null) {
            return 0;
        }
        Context context = webView.getContext();
        if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) context).getBaseContext();
        }
        if (context == null) {
            return 0;
        }
        return context instanceof Activity ? 1 : 2;
    }

    public static void report(WebView webView, boolean z, int i) {
        String str = "";
        int i2 = 0;
        if (webView != null) {
            try {
                String url = webView.getUrl();
                if (url != null) {
                    str = URLEncoder.encode(url, "UTF-8");
                }
                i2 = getWebViewContextType(webView);
            } catch (Exception e) {
                XWebLog.m21910e(TAG, "report, error", e);
            }
        }
        String str2 = i2 + "," + (z ? 1 : 0) + "," + i + "," + str + "," + XWebSdk.getXWebSdkVersion() + "," + XWebSdk.getAvailableVersion();
        XWebLog.m21911i(TAG, "report:" + str2);
        WXWebReporter.setKVLog(f122405ID, str2);
    }
}
