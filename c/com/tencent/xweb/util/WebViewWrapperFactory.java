package com.tencent.xweb.util;

import android.util.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.report.KVReportForCrash;

public class WebViewWrapperFactory {
    public static final String TAG = "WebViewWrapperFactory";
    private static IWebViewProvider sPinusViewProvider;
    private static IWebViewProvider sSysViewProvider;
    private static IWebViewProvider sXWebViewProvider;

    public static int getEmbedCoreVersion() {
        if (getXWebViewProvider() == null) {
            return -1;
        }
        Object execute = getXWebViewProvider().execute(ConstValue.STR_CMD_GET_EMBED_CORE_VERSION, (Object[]) null);
        if (execute instanceof Integer) {
            try {
                return ((Integer) execute).intValue();
            } catch (Throwable th) {
                XWebLog.m21910e(TAG, "getEmbedCoreVersion, error", th);
            }
        }
        return -1;
    }

    public static IWebView getWebView(WebView.WebViewKind webViewKind, WebView webView) {
        XWebLog.addInitializeLog(TAG, "getWebView, try to create webview type = " + webViewKind);
        CrashWatchDog instance = CrashWatchDog.getInstance(CrashWatchDog.SCENE_CREATE_WEBVIEW, webViewKind);
        instance.logStart();
        CrashWatchDog instanceForCurModule = CrashWatchDog.getInstanceForCurModule(CrashWatchDog.SCENE_CREATE_WEBVIEW, webViewKind);
        instanceForCurModule.logStart();
        IWebView iWebView = null;
        try {
            IWebViewProvider webViewProvider = getWebViewProvider(webViewKind);
            if (webViewProvider == null) {
                XWebLog.addInitializeLog(TAG, "getWebView, provider not exist");
                return null;
            }
            iWebView = webViewProvider.createWebView(webView);
            if (iWebView != null) {
                XWebLog.addInitializeLog(TAG, "getWebView, create webview success");
                instance.logFinished();
                instanceForCurModule.logFinished();
            } else {
                XWebLog.addInitializeLog(TAG, "getWebView, create webview failed");
            }
            return iWebView;
        } catch (Throwable th) {
            WXWebReporter.onCreateWebviewFailed(webViewKind);
            String stackTraceString = Log.getStackTraceString(th);
            XWebLog.addInitializeLog(TAG, "getWebView, create webview error:" + stackTraceString);
            KVReportForCrash.report(2, stackTraceString, webViewKind.ordinal());
        }
    }

    public static IWebViewProvider getWebViewProvider(WebView.WebViewKind webViewKind) {
        if (webViewKind == WebView.WebViewKind.WV_KIND_SYS) {
            if (sSysViewProvider == null) {
                Object invokeStatic = ReflectionUtils.invokeStatic("com.tencent.xweb.sys.SysWebFactory", "getInstance");
                if (!(invokeStatic instanceof IWebViewProvider)) {
                    XWebLog.m21909e(TAG, "getWebViewProvider, find SysWebFactory failed");
                    return null;
                }
                sSysViewProvider = (IWebViewProvider) invokeStatic;
            }
            return sSysViewProvider;
        } else if (webViewKind != WebView.WebViewKind.WV_KIND_PINUS) {
            return null;
        } else {
            if (sPinusViewProvider == null) {
                Object invokeStatic2 = ReflectionUtils.invokeStatic("com.tencent.xweb.pinus.PinusWebFactory", "getInstance");
                if (!(invokeStatic2 instanceof IWebViewProvider)) {
                    XWebLog.m21909e(TAG, "getWebViewProvider, find PinusWebFactory failed");
                    return null;
                }
                sPinusViewProvider = (IWebViewProvider) invokeStatic2;
            }
            return sPinusViewProvider;
        }
    }

    public static IWebViewProvider getXWebViewProvider() {
        if (sXWebViewProvider == null) {
            Object invokeStatic = ReflectionUtils.invokeStatic("com.tencent.xweb.XWebViewProvider", "getInstance");
            if (!(invokeStatic instanceof IWebViewProvider)) {
                XWebLog.m21909e(TAG, "getXWebViewProvider, find XWebViewProvider failed");
                return null;
            }
            sXWebViewProvider = (IWebViewProvider) invokeStatic;
        }
        return sXWebViewProvider;
    }
}
