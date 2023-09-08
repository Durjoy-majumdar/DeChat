package com.tencent.midas.jsbridge;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JsResult;
import android.webkit.WebView;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.control.APMidasPayHelper;
import com.tencent.midas.data.APPluginDataInterface;
import com.tencent.midas.data.APPluginReportManager;
import com.tencent.midas.plugin.APPluginUtils;
import java.net.URLEncoder;
import java.util.HashMap;

public class APWebProtocol {
    public static String URL_KEY_HEAD_CONTROL = "midasheader";
    public static String URL_KEY_HEAD_TITLE = "midastitle";
    public static String WEBACTION_CLOSE = "closeWeb";
    public static String WEBACTION_GETCGIEXTEND = "getCgiExtend";
    public static String WEBACTION_HEAD = "setHead";

    public static void AnalyzeWebEntry(Activity activity, Object obj, IAPWebPage iAPWebPage, String str) {
        HashMap<String, String> url2Map = APPluginUtils.url2Map(str);
        String str2 = url2Map.get("page");
        String str3 = url2Map.get("action");
        String str4 = url2Map.get("saveNumber");
        String str5 = url2Map.get("saveType");
        String str6 = url2Map.get("callback");
        if (WEBACTION_GETCGIEXTEND.equals(str3)) {
            String reserv = APPluginDataInterface.singleton().getReserv();
            APLog.m161210d("APWebResultPage", "sendCgiExtends() callback=" + str6 + ", extendStr=" + reserv);
            if (!TextUtils.isEmpty(reserv)) {
                try {
                    reserv = URLEncoder.encode(reserv, "UTF-8");
                } catch (Exception unused) {
                }
            }
            H5CallBack(obj, str6, reserv);
        } else if (WEBACTION_CLOSE.equals(str3)) {
            APPluginReportManager.getInstance().insertData(APPluginDataInterface.singleton().getLaunchInterface(), APPluginReportManager.MIDASPLUGIN_WEBPAGE_WEBCLOSE, "", "");
            APMidasResponse aPMidasResponse = new APMidasResponse();
            aPMidasResponse.resultCode = 100;
            aPMidasResponse.resultMsg = "关闭";
            APMidasPayHelper.midasCallBack(aPMidasResponse);
            if (activity != null) {
                activity.finish();
            }
        } else if (WEBACTION_HEAD.equals(str3)) {
            try {
                iAPWebPage.initHead(activity, url2Map.get(URL_KEY_HEAD_CONTROL), url2Map.get(URL_KEY_HEAD_TITLE));
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A[Catch:{ Exception -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c A[SYNTHETIC, Splitter:B:21:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[Catch:{ Exception -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void H5CallBack(java.lang.Object r5, java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            org.json.JSONTokener r2 = new org.json.JSONTokener     // Catch:{ Exception | JSONException -> 0x0019 }
            r2.<init>(r7)     // Catch:{ Exception | JSONException -> 0x0019 }
            java.lang.Object r2 = r2.nextValue()     // Catch:{ Exception | JSONException -> 0x0019 }
            if (r2 != 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            boolean r3 = r2 instanceof org.json.JSONObject     // Catch:{ Exception | JSONException -> 0x0019 }
            if (r3 == 0) goto L_0x0014
        L_0x0012:
            r2 = 1
            goto L_0x001b
        L_0x0014:
            boolean r2 = r2 instanceof org.json.JSONArray     // Catch:{ Exception | JSONException -> 0x0019 }
            if (r2 == 0) goto L_0x001a
            goto L_0x0012
        L_0x0019:
        L_0x001a:
            r2 = 0
        L_0x001b:
            r3 = 2
            r4 = 3
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = "typeof window[\"%s\"]==='function' && window[\"%s\"](%s);"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x007a }
            r4[r1] = r6     // Catch:{ Exception -> 0x007a }
            r4[r0] = r6     // Catch:{ Exception -> 0x007a }
            r4[r3] = r7     // Catch:{ Exception -> 0x007a }
            java.lang.String r7 = java.lang.String.format(r2, r4)     // Catch:{ Exception -> 0x007a }
            goto L_0x003c
        L_0x002e:
            java.lang.String r2 = "typeof window[\"%s\"]==='function' && window[\"%s\"](\"%s\");"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x007a }
            r4[r1] = r6     // Catch:{ Exception -> 0x007a }
            r4[r0] = r6     // Catch:{ Exception -> 0x007a }
            r4[r3] = r7     // Catch:{ Exception -> 0x007a }
            java.lang.String r7 = java.lang.String.format(r2, r4)     // Catch:{ Exception -> 0x007a }
        L_0x003c:
            java.lang.String r0 = "callback"
            com.tencent.midas.comm.APLog.m161214i(r0, r6)     // Catch:{ Exception -> 0x007a }
            java.lang.String r6 = "cb"
            com.tencent.midas.comm.APLog.m161214i(r6, r7)     // Catch:{ Exception -> 0x007a }
            boolean r6 = r5 instanceof android.webkit.WebView     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = "javascript:"
            if (r6 == 0) goto L_0x0061
            android.webkit.WebView r5 = (android.webkit.WebView) r5     // Catch:{ Exception -> 0x007a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a }
            r6.<init>()     // Catch:{ Exception -> 0x007a }
            r6.append(r0)     // Catch:{ Exception -> 0x007a }
            r6.append(r7)     // Catch:{ Exception -> 0x007a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x007a }
            r5.loadUrl(r6)     // Catch:{ Exception -> 0x007a }
            goto L_0x0095
        L_0x0061:
            boolean r6 = r5 instanceof com.tencent.smtt.sdk.WebView     // Catch:{ Exception -> 0x007a }
            if (r6 == 0) goto L_0x0095
            com.tencent.smtt.sdk.WebView r5 = (com.tencent.smtt.sdk.WebView) r5     // Catch:{ Exception -> 0x007a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a }
            r6.<init>()     // Catch:{ Exception -> 0x007a }
            r6.append(r0)     // Catch:{ Exception -> 0x007a }
            r6.append(r7)     // Catch:{ Exception -> 0x007a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x007a }
            r5.loadUrl(r6)     // Catch:{ Exception -> 0x007a }
            goto L_0x0095
        L_0x007a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "H5CallBack() ex = "
            r6.append(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "H5CallBack"
            com.tencent.midas.comm.APLog.m161210d(r6, r5)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.jsbridge.APWebProtocol.H5CallBack(java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public static boolean hookH5Method(Activity activity, WebView webView, String str, String str2, JsResult jsResult, IAPWebViewCallback iAPWebViewCallback) {
        if (TextUtils.isEmpty(str2) || !str2.startsWith("http://unipay.sdk.android/?")) {
            return false;
        }
        iAPWebViewCallback.WebChromeClientJsAlert(webView, str, str2, jsResult);
        return true;
    }

    public static boolean hookH5Method(Activity activity, com.tencent.smtt.sdk.WebView webView, String str, String str2, com.tencent.smtt.export.external.interfaces.JsResult jsResult, IAPX5WebViewCallback iAPX5WebViewCallback) {
        if (TextUtils.isEmpty(str2) || !str2.startsWith("http://unipay.sdk.android/?")) {
            return false;
        }
        iAPX5WebViewCallback.WebChromeClientJsAlert(webView, str, str2, jsResult);
        return true;
    }
}
