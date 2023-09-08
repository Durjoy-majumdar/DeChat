package com.tencent.xweb.sys;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.xweb.C106947R;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.GetImageBitmapToFileFinishedCallback;
import com.tencent.xweb.VideoControl;
import com.tencent.xweb.VideoJsCallback;
import com.tencent.xweb.WebDebugCfg;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.WebViewDatabase;
import com.tencent.xweb.WebViewJSExceptionListener;
import com.tencent.xweb.WebViewRenderProcessClient;
import com.tencent.xweb.XWebKeyEventHandler;
import com.tencent.xweb.extension.video.VideoNativeInterface;
import com.tencent.xweb.extension.video.XWebFullscreenVideoUtil;
import com.tencent.xweb.extension.video.XWebNativeInterface;
import com.tencent.xweb.extension.video.XWebNativeInterfaceFactory;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import com.tencent.xweb.report.KVReportForCrash;
import com.tencent.xweb.report.KVReportForLoadUrl;
import com.tencent.xweb.sys.SysWebDataTrans;
import com.tencent.xweb.util.ChromiumVersionUtil;
import com.tencent.xweb.util.ReflectionUtils;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebDebugPage;
import com.tencent.xweb.util.XWebLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class SysWebView implements IWebView {
    private static final String TAG = "SysWebView";
    private static volatile boolean sEnforceThreadChecking;
    /* access modifiers changed from: private */
    public int mContentHeight = -1;
    /* access modifiers changed from: private */
    public WebChromeClient.CustomViewCallback mFullscreenCallback = null;
    /* access modifiers changed from: private */
    public boolean mIsFullscreen = false;
    /* access modifiers changed from: private */
    public long mLoadStartTimestamp = 0;
    /* access modifiers changed from: private */
    public int mReferType = 0;
    private SysWebViewSettings mSysWebViewSettings;
    private ValueCallBackWrapper mValueCallBackWrapper;
    private final WebChromeClient mWebChromeClient;
    /* access modifiers changed from: private */
    public final CustomSysWeb mWebView;
    /* access modifiers changed from: private */
    public WebViewCallbackClient mWebViewCallbackClient;
    /* access modifiers changed from: private */
    public com.tencent.xweb.WebChromeClient mWebViewChromeClientEx;
    private final WebViewClient mWebViewClient;
    /* access modifiers changed from: private */
    public com.tencent.xweb.WebViewClient mWebViewClientEx;
    private final Looper mWebViewThread;
    /* access modifiers changed from: private */
    public final WebView mWebviewWraper;
    /* access modifiers changed from: private */
    public VideoNativeInterface mXWebNativeInterface;
    private final String strCallBackName;

    public static class ValueCallBackWrapper {
        public HashMap<String, ValueCallback<String>> mMapIdToCallBack = new HashMap<>();
        public int mNCallBackId = 0;

        public String addCallBack(ValueCallback<String> valueCallback) {
            if (valueCallback == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i = this.mNCallBackId;
            this.mNCallBackId = i + 1;
            sb.append(i);
            String sb4 = sb.toString();
            this.mMapIdToCallBack.put(sb4, valueCallback);
            return sb4;
        }

        @JavascriptInterface
        public void notifyJava(String str, String str2) {
            ValueCallback valueCallback = this.mMapIdToCallBack.get(str);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(str2);
                this.mMapIdToCallBack.remove(str);
            }
        }
    }

    public SysWebView(WebView webView) {
        C201952 r2 = new WebChromeClient() {
            public View getVideoLoadingProgressView() {
                return SysWebView.this.mWebViewChromeClientEx != null ? SysWebView.this.mWebViewChromeClientEx.getVideoLoadingProgressView() : LayoutInflater.from(SysWebView.this.mWebviewWraper.getContext()).inflate(C106947R.C106949layout.cjl, (ViewGroup) null);
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return SysWebView.this.mWebViewChromeClientEx != null ? SysWebView.this.mWebViewChromeClientEx.onConsoleMessage(consoleMessage) : super.onConsoleMessage(consoleMessage);
            }

            public void onGeolocationPermissionsHidePrompt() {
                XWebLog.m21911i(SysWebView.TAG, "onGeolocationPermissionsHidePrompt");
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                XWebLog.m21911i(SysWebView.TAG, "onGeolocationPermissionsShowPrompt");
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            public void onHideCustomView() {
                XWebLog.m21911i(SysWebView.TAG, "onHideCustomView");
                WebChromeClient.CustomViewCallback unused = SysWebView.this.mFullscreenCallback = null;
                boolean z = false;
                boolean unused2 = SysWebView.this.mIsFullscreen = false;
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    z = SysWebView.this.mWebViewChromeClientEx.onExitFullscreen();
                }
                if (z) {
                    XWebLog.m21911i(SysWebView.TAG, "onHideCustomView, isHandled:true");
                } else if (SysWebView.this.mXWebNativeInterface != null) {
                    SysWebView.this.mXWebNativeInterface.onHideCustomView();
                } else if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            public boolean onJsAlert(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
                XWebLog.m21911i(SysWebView.TAG, "onJsAlert");
                return SysWebView.this.mWebViewChromeClientEx != null ? SysWebView.this.mWebViewChromeClientEx.onJsAlert(SysWebView.this.mWebviewWraper, str, str2, new SysWebDataTrans.SysWebJsResultImpl(jsResult)) : super.onJsAlert(webView, str, str2, jsResult);
            }

            public boolean onJsConfirm(android.webkit.WebView webView, String str, String str2, JsResult jsResult) {
                XWebLog.m21911i(SysWebView.TAG, "onJsConfirm");
                return SysWebView.this.mWebViewChromeClientEx != null ? SysWebView.this.mWebViewChromeClientEx.onJsConfirm(SysWebView.this.mWebviewWraper, str, str2, new SysWebDataTrans.SysWebJsResultImpl(jsResult)) : super.onJsConfirm(webView, str, str2, jsResult);
            }

            public boolean onJsPrompt(android.webkit.WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                XWebLog.m21911i(SysWebView.TAG, "onJsPrompt");
                if (SysWebView.this.mWebViewChromeClientEx == null) {
                    return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
                }
                return SysWebView.this.mWebViewChromeClientEx.onJsPrompt(SysWebView.this.mWebviewWraper, str, str2, str3, new SysWebDataTrans.SysWebJsPromptResultImpl(jsPromptResult));
            }

            public void onPermissionRequest(PermissionRequest permissionRequest) {
                XWebLog.m21911i(SysWebView.TAG, "onPermissionRequest");
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                XWebLog.m21911i(SysWebView.TAG, "onPermissionRequestCanceled");
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            public void onProgressChanged(android.webkit.WebView webView, int i) {
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onProgressChanged(SysWebView.this.mWebviewWraper, i);
                } else {
                    super.onProgressChanged(webView, i);
                }
            }

            public void onReceivedTitle(android.webkit.WebView webView, String str) {
                XWebLog.m21911i(SysWebView.TAG, "onReceivedTitle: " + str);
                if (SysWebView.this.mXWebNativeInterface != null) {
                    SysWebView.this.mXWebNativeInterface.evaluteJavascript(true, SysWebView.this.mWebviewWraper.getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS);
                }
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onReceivedTitle(SysWebView.this.mWebviewWraper, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
            }

            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                XWebLog.m21911i(SysWebView.TAG, "onShowCustomView");
                WebChromeClient.CustomViewCallback unused = SysWebView.this.mFullscreenCallback = customViewCallback;
                boolean unused2 = SysWebView.this.mIsFullscreen = true;
                boolean onEnterFullscreen = SysWebView.this.mWebViewChromeClientEx != null ? SysWebView.this.mWebViewChromeClientEx.onEnterFullscreen(view, customViewCallback) : false;
                WXWebReporter.onSysWebViewOnShowCustomView();
                if (onEnterFullscreen) {
                    XWebLog.m21911i(SysWebView.TAG, "onShowCustomView, isHandled:true");
                } else if (SysWebView.this.mXWebNativeInterface != null) {
                    WXWebReporter.reportWebViewOnShowCustomView(WebView.WebViewKind.WV_KIND_SYS, SysWebView.this.mXWebNativeInterface instanceof XWebNativeInterface, SysWebView.this.getUrl());
                    SysWebView.this.mXWebNativeInterface.onShowCustomView(view, customViewCallback);
                } else if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            public boolean onShowFileChooser(android.webkit.WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                XWebLog.m21911i(SysWebView.TAG, "onShowFileChooser last method");
                return SysWebView.this.mWebViewChromeClientEx != null ? SysWebView.this.mWebViewChromeClientEx.onShowFileChooser(SysWebView.this.mWebviewWraper, valueCallback, new SysWebDataTrans.SysWebFileChooserParamsImpl(fileChooserParams)) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback) {
                XWebLog.m21911i(SysWebView.TAG, "openFileChooser with one param");
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.openFileChooser(valueCallback, (String) null, (String) null);
                } else {
                    valueCallback.onReceiveValue((Object) null);
                }
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
                XWebLog.m21911i(SysWebView.TAG, "openFileChooser with two param");
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.openFileChooser(valueCallback, str, (String) null);
                } else {
                    valueCallback.onReceiveValue((Object) null);
                }
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                XWebLog.m21911i(SysWebView.TAG, "openFileChooser with three param");
                if (SysWebView.this.mWebViewChromeClientEx != null) {
                    SysWebView.this.mWebViewChromeClientEx.openFileChooser(valueCallback, str, str2);
                } else {
                    valueCallback.onReceiveValue((Object) null);
                }
            }
        };
        this.mWebChromeClient = r2;
        C201963 r3 = new WebViewClient() {
            private String mPreUrl = null;
            private final String mSessionId = null;

            public void doUpdateVisitedHistory(android.webkit.WebView webView, String str, boolean z) {
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.doUpdateVisitedHistory(SysWebView.this.mWebviewWraper, str, z);
                } else {
                    super.doUpdateVisitedHistory(webView, str, z);
                }
            }

            public void onLoadResource(android.webkit.WebView webView, String str) {
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onLoadResource(SysWebView.this.mWebviewWraper, str);
                } else {
                    super.onLoadResource(webView, str);
                }
            }

            public void onPageCommitVisible(android.webkit.WebView webView, String str) {
                XWebLog.m21911i(SysWebView.TAG, "onPageCommitVisible s = " + str);
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onPageCommitVisible(SysWebView.this.mWebviewWraper, str);
                }
            }

            public void onPageFinished(android.webkit.WebView webView, String str) {
                XWebLog.m21911i(SysWebView.TAG, "onPageFinished " + str);
                if (SysWebView.this.mXWebNativeInterface != null) {
                    SysWebView.this.mXWebNativeInterface.evaluteJavascript(false, SysWebView.this.mWebviewWraper.getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS);
                }
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onPageFinished(SysWebView.this.mWebviewWraper, str);
                } else {
                    super.onPageFinished(webView, str);
                }
                long currentTimeMillis = System.currentTimeMillis() - SysWebView.this.mLoadStartTimestamp;
                WXWebReporter.onWebviewLoadSuccess(currentTimeMillis);
                WXWebReporter.onSysWebviewLoadSuccess(currentTimeMillis);
                KVReportForLoadUrl.report(WXWebReporter.getUrlType(str), this.mSessionId, 1, 0, (int) currentTimeMillis, SysWebView.this.mReferType, str, WebView.WebViewKind.WV_KIND_SYS);
                long unused = SysWebView.this.mLoadStartTimestamp = System.currentTimeMillis();
                WebDebugPage.initFpsPage(SysWebView.this.mWebviewWraper);
            }

            public void onPageStarted(android.webkit.WebView webView, String str, Bitmap bitmap) {
                XWebLog.m21911i(SysWebView.TAG, "onPageStarted " + str);
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onPageStarted(SysWebView.this.mWebviewWraper, str, bitmap);
                } else {
                    super.onPageStarted(webView, str, bitmap);
                }
                String str2 = this.mPreUrl;
                if (!(str2 == null || str == null || str.equals(str2) || WXWebReporter.getUrlType(str) == WXWebReporter.getUrlType(this.mPreUrl))) {
                    if (WXWebReporter.getUrlType(this.mPreUrl) == 1 && WXWebReporter.getUrlType(str) == 2) {
                        int unused = SysWebView.this.mReferType = 1;
                    } else if (WXWebReporter.getUrlType(this.mPreUrl) == 2 && WXWebReporter.getUrlType(str) == 1) {
                        int unused2 = SysWebView.this.mReferType = 2;
                    }
                }
                this.mPreUrl = str;
                long unused3 = SysWebView.this.mLoadStartTimestamp = System.currentTimeMillis();
                WXWebReporter.onWebviewLoad(str);
                WXWebReporter.onSysWebviewLoad();
                KVReportForLoadUrl.report(WXWebReporter.getUrlType(str), this.mSessionId, 0, 0, 0, SysWebView.this.mReferType, str, WebView.WebViewKind.WV_KIND_SYS);
                if (SysWebView.this.mXWebNativeInterface != null) {
                    SysWebView.this.mXWebNativeInterface.evaluteJavascript(true, SysWebView.this.mWebviewWraper.getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS);
                }
            }

            public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                XWebLog.m21911i(SysWebView.TAG, "onReceivedError2");
                if (SysWebView.this.mWebViewClientEx != null) {
                    if (webResourceRequest.isForMainFrame() && webResourceError != null) {
                        SysWebView.this.mWebViewClientEx.onReceivedError(SysWebView.this.mWebviewWraper, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                    }
                    SysWebView.this.mWebViewClientEx.onReceivedError(SysWebView.this.mWebviewWraper, new SysWebDataTrans.WebResourceRequestImpl(webResourceRequest), SysWebDataTrans.createWCWebResourceError(webResourceError));
                }
            }

            public void onReceivedHttpAuthRequest(android.webkit.WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                XWebLog.m21911i(SysWebView.TAG, "onReceivedHttpAuthRequest host:" + str + ", realm:" + str2);
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onReceivedHttpAuthRequest(SysWebView.this.mWebviewWraper, new SysWebDataTrans.SysHttpAuthHandler(httpAuthHandler), str, str2);
                } else {
                    super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                }
            }

            public void onReceivedHttpError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                String valueOf = String.valueOf(webResourceResponse.getStatusCode());
                XWebLog.m21911i(SysWebView.TAG, "onReceivedHttpError code:" + valueOf);
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onReceivedHttpError(SysWebView.this.mWebviewWraper, new SysWebDataTrans.WebResourceRequestImpl(webResourceRequest), SysWebDataTrans.createWCWebResponse(webResourceResponse));
                } else {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            public void onReceivedSslError(android.webkit.WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                XWebLog.m21911i(SysWebView.TAG, "onReceivedSslError " + sslError.getPrimaryError());
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onReceivedSslError(SysWebView.this.mWebviewWraper, new SysWebDataTrans.SslErrorHandlerImp(sslErrorHandler), sslError);
                } else {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }
            }

            public void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onScaleChanged(SysWebView.this.mWebviewWraper, f, f2);
                } else {
                    super.onScaleChanged(webView, f, f2);
                }
            }

            public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, String str) {
                if (SysWebView.this.mWebViewClientEx != null) {
                    return SysWebDataTrans.createWebKitResponse(SysWebView.this.mWebViewClientEx.shouldInterceptRequest(SysWebView.this.mWebviewWraper, str));
                }
                return super.shouldInterceptRequest(webView, str);
            }

            public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
                XWebLog.m21911i(SysWebView.TAG, "shouldOverrideUrlLoading " + webResourceRequest.getUrl().toString());
                if (SysWebView.this.mWebViewClientEx == null) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                return SysWebView.this.mWebViewClientEx.shouldOverrideUrlLoading(SysWebView.this.mWebviewWraper, (com.tencent.xweb.WebResourceRequest) new SysWebDataTrans.WebResourceRequestImpl(webResourceRequest));
            }

            public WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, WebResourceRequest webResourceRequest) {
                if (SysWebView.this.mWebViewClientEx == null) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                com.tencent.xweb.WebResourceResponse webResourceResponse = null;
                SysWebDataTrans.WebResourceRequestImpl webResourceRequestImpl = new SysWebDataTrans.WebResourceRequestImpl(webResourceRequest);
                Bundle bundle = webResourceRequestImpl.getBundle();
                if (bundle != null) {
                    webResourceResponse = SysWebView.this.mWebViewClientEx.shouldInterceptRequest(SysWebView.this.mWebviewWraper, webResourceRequestImpl, bundle);
                }
                if (webResourceResponse == null) {
                    webResourceResponse = SysWebView.this.mWebViewClientEx.shouldInterceptRequest(SysWebView.this.mWebviewWraper, (com.tencent.xweb.WebResourceRequest) webResourceRequestImpl);
                }
                return SysWebDataTrans.createWebKitResponse(webResourceResponse);
            }

            public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
                if (WebDebugPage.containsDebugPiece(str)) {
                    return true;
                }
                XWebLog.m21911i(SysWebView.TAG, "shouldOverrideUrlLoading " + str);
                if (SysWebView.this.mWebViewClientEx != null) {
                    return SysWebView.this.mWebViewClientEx.shouldOverrideUrlLoading(SysWebView.this.mWebviewWraper, str);
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            public void onReceivedError(android.webkit.WebView webView, int i, String str, String str2) {
                if (SysWebView.this.mWebViewClientEx != null) {
                    SysWebView.this.mWebViewClientEx.onReceivedError(SysWebView.this.mWebviewWraper, i, str, str2);
                } else {
                    super.onReceivedError(webView, i, str, str2);
                }
                WXWebReporter.onWebviewLoadFailed();
                WXWebReporter.onSysWebviewLoadFailed();
                int i2 = i;
                String str3 = str2;
                KVReportForLoadUrl.report(WXWebReporter.getUrlType(str2), this.mSessionId, 1, i2, (int) (System.currentTimeMillis() - SysWebView.this.mLoadStartTimestamp), SysWebView.this.mReferType, str3, WebView.WebViewKind.WV_KIND_SYS);
            }
        };
        this.mWebViewClient = r3;
        this.strCallBackName = "xwalkTempCallBack";
        this.mWebviewWraper = webView;
        this.mWebViewThread = Looper.myLooper();
        sEnforceThreadChecking = webView.getContext().getApplicationInfo().targetSdkVersion >= 18;
        CustomSysWeb customSysWeb = new CustomSysWeb(webView.getContext());
        this.mWebView = customSysWeb;
        customSysWeb.setBackgroundColor(0);
        getSettings();
        customSysWeb.setWebChromeClient(r2);
        customSysWeb.setWebViewClient(r3);
        if (webView.getContext() instanceof Activity) {
            initFullscreenVideo((Activity) webView.getContext());
        } else {
            initFullscreenVideo((Activity) null);
        }
    }

    private void checkThread() {
        if (this.mWebViewThread != null && Looper.myLooper() != this.mWebViewThread) {
            Throwable th = new Throwable("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + this.mWebViewThread + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            String stackTraceString = Log.getStackTraceString(th);
            StringBuilder sb = new StringBuilder();
            sb.append("checkThread error:");
            sb.append(stackTraceString);
            XWebLog.m21913w(TAG, sb.toString());
            KVReportForCrash.report(3, stackTraceString, WebView.WebViewKind.WV_KIND_SYS.ordinal());
            if (sEnforceThreadChecking) {
                throw new RuntimeException(th);
            }
        }
    }

    public static void clearClientCertPreferences(Runnable runnable) {
        android.webkit.WebView.clearClientCertPreferences(runnable);
    }

    public static String findAddress(String str) {
        return android.webkit.WebView.findAddress(str);
    }

    private void initFullscreenVideo(Activity activity) {
        XWebLog.m21911i(TAG, "initFullscreenVideo, kind:" + getFullscreenVideoKind() + ", activity:" + activity);
        if (getFullscreenVideoKind() != WebView.FullscreenVideoKind.NOT_HOOK) {
            this.mXWebNativeInterface = XWebNativeInterfaceFactory.createXWebNativeInterface(this.mWebviewWraper.getCurrentInstanceWebCoreType(), activity, this.mWebviewWraper, this.mWebView, XWebFullscreenVideoUtil.initJs());
            if (getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS) {
                this.mXWebNativeInterface.registerJavascriptInterface(this.mWebView);
            }
        }
    }

    public int addDocumentStartJavaScript(String str, String[] strArr) {
        XWebLog.m21913w(TAG, "addDocumentStartJavaScript not implemented");
        return 0;
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.mWebView.addJavascriptInterface(obj, str);
    }

    public boolean canGoBack() {
        return this.mWebView.canGoBack();
    }

    public boolean canGoBackOrForward(int i) {
        return this.mWebView.canGoBackOrForward(i);
    }

    public boolean canGoForward() {
        return this.mWebView.canGoForward();
    }

    public Bitmap captureBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(this.mWebView.getWidth(), this.mWebView.getHeight(), Bitmap.Config.ARGB_8888);
        this.mWebView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void clearCache(boolean z) {
        this.mWebView.clearCache(z);
    }

    public void clearHistory() {
        this.mWebView.clearHistory();
    }

    public void clearMatches() {
        this.mWebView.clearMatches();
    }

    public void clearSslPreferences() {
        this.mWebView.clearSslPreferences();
    }

    public void clearView() {
        this.mWebView.clearView();
    }

    public WebBackForwardList copyBackForwardList() {
        return this.mWebView.copyBackForwardList();
    }

    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        return this.mWebView.createPrintDocumentAdapter(str);
    }

    public WebMessagePort[] createWebMessageChannel() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.mWebView.createWebMessageChannel();
        }
        return null;
    }

    public void destroy() {
        this.mWebView.destroy();
    }

    public void disablePlatformNotifications() {
        ReflectionUtils.invokeStatic("android.webkit.WebView", "disablePlatformNotifications");
    }

    public void disableVideoJsCallback(boolean z) {
        VideoNativeInterface videoNativeInterface = this.mXWebNativeInterface;
        if (videoNativeInterface != null) {
            videoNativeInterface.disableJsCallback(z);
        }
    }

    public void documentHasImages(Message message) {
        this.mWebView.documentHasImages(message);
    }

    public void enablePlatformNotifications() {
        ReflectionUtils.invokeStatic("android.webkit.WebView", "enablePlatformNotifications");
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (str != null) {
            this.mWebView.evaluateJavascript(str, valueCallback);
        }
    }

    public void findAllAsync(String str) {
        this.mWebView.findAllAsync(str);
    }

    public void findNext(boolean z) {
        this.mWebView.findNext(z);
    }

    public void flingScroll(int i, int i2) {
        this.mWebView.flingScroll(i, i2);
    }

    public String getAbstractInfo() {
        return getVersionInfo();
    }

    public SslCertificate getCertificate() {
        return this.mWebView.getCertificate();
    }

    public int getContentHeight() {
        return this.mWebView.getContentHeight();
    }

    public ICookieManager getCookieManager() {
        return new SysCookieManagerWrapper();
    }

    public Bitmap getFavicon() {
        return this.mWebView.getFavicon();
    }

    public WebView.FullscreenVideoKind getFullscreenVideoKind() {
        return CommandCfg.getInstance().getFullscreenVideoKind(WebView.getModuleName());
    }

    public WebView.HitTestResult getHitTestResult() {
        WebView.HitTestResult hitTestResult = this.mWebView.getHitTestResult();
        WebView.HitTestResult hitTestResult2 = new WebView.HitTestResult();
        hitTestResult2.setType(hitTestResult.getType());
        hitTestResult2.setExtra(hitTestResult.getExtra());
        return hitTestResult2;
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return WebViewDatabase.getInstance(this.mWebView.getContext()).getHttpAuthUsernamePassword(str, str2);
    }

    public boolean getImageBitmapToFile(String str, String str2, String str3, GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback) {
        return false;
    }

    public String getOriginalUrl() {
        return this.mWebView.getOriginalUrl();
    }

    public int getProgress() {
        return this.mWebView.getProgress();
    }

    public float getScale() {
        return this.mWebView.getScale();
    }

    public int getScrollHeight() {
        return this.mWebView.getScrollHeight();
    }

    public WebSettings getSettings() {
        if (WebDebugCfg.getInst().getEnableCheckThread()) {
            checkThread();
        }
        SysWebViewSettings sysWebViewSettings = this.mSysWebViewSettings;
        if (sysWebViewSettings != null) {
            return sysWebViewSettings;
        }
        CustomSysWeb customSysWeb = this.mWebView;
        if (customSysWeb == null) {
            return null;
        }
        SysWebViewSettings sysWebViewSettings2 = new SysWebViewSettings(customSysWeb);
        this.mSysWebViewSettings = sysWebViewSettings2;
        return sysWebViewSettings2;
    }

    public TextClassifier getTextClassifier() {
        if (Build.VERSION.SDK_INT >= 27) {
            return this.mWebView.getTextClassifier();
        }
        return null;
    }

    public String getTitle() {
        return this.mWebView.getTitle();
    }

    public ViewGroup getTopView() {
        return this.mWebView;
    }

    public String getUrl() {
        return this.mWebView.getUrl();
    }

    public String getVersionInfo() {
        return "sys, version = " + ChromiumVersionUtil.getChromiumVersion();
    }

    public View getView() {
        return this.mWebView;
    }

    public int getVisibleTitleHeight() {
        Object invokeInstance = ReflectionUtils.invokeInstance(this.mWebView, "getVisibleTitleHeight");
        if (invokeInstance == null) {
            return 0;
        }
        return ((Integer) invokeInstance).intValue();
    }

    public com.tencent.xweb.WebChromeClient getWebChromeClient() {
        return this.mWebViewChromeClientEx;
    }

    public int getWebScrollX() {
        return getWebViewUI().getScrollX();
    }

    public int getWebScrollY() {
        return this.mWebView.getScrollY();
    }

    public WebViewCallbackClient getWebViewCallbackClient() {
        return this.mWebViewCallbackClient;
    }

    public com.tencent.xweb.WebViewClient getWebViewClient() {
        return this.mWebViewClientEx;
    }

    public Looper getWebViewLooper() {
        return this.mWebViewThread;
    }

    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return null;
    }

    public View getWebViewUI() {
        return this.mWebView;
    }

    public void goBack() {
        this.mWebView.goBack();
    }

    public void goBackOrForward(int i) {
        this.mWebView.goBackOrForward(i);
    }

    public void goForward() {
        this.mWebView.goForward();
    }

    public boolean hasEnteredFullscreen() {
        return this.mIsFullscreen;
    }

    public Bundle invokeMiscMethod(String str, Bundle bundle) {
        if (str == null || str.length() == 0) {
            XWebLog.m21908d(TAG, " method string is null or empty");
            return null;
        } else if (!str.equals("supportTranslateWebSite")) {
            return null;
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("result", false);
            XWebLog.m21911i(TAG, "sys web is not supportTranslateWebSite");
            return bundle2;
        }
    }

    public boolean isOverScrollStart() {
        return getWebViewUI().getScrollY() == 0;
    }

    public void leaveFullscreen() {
        WebChromeClient.CustomViewCallback customViewCallback = this.mFullscreenCallback;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }

    public void loadData(String str, String str2, String str3) {
        this.mWebView.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.mWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        this.mWebView.loadUrl(str);
    }

    public void onHide() {
        this.mWebView.onPause();
    }

    public void onPause() {
        this.mWebView.onPause();
    }

    public void onResume() {
        this.mWebView.onResume();
    }

    public void onShow() {
        this.mWebView.onPause();
    }

    public boolean overlayHorizontalScrollbar() {
        return this.mWebView.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.mWebView.overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean z) {
        return this.mWebView.pageDown(z);
    }

    public boolean pageUp(boolean z) {
        return this.mWebView.pageUp(z);
    }

    public void pauseTimers() {
        this.mWebView.pauseTimers();
    }

    public void postUrl(String str, byte[] bArr) {
        if (URLUtil.isNetworkUrl(str)) {
            this.mWebView.postUrl(str, bArr);
        } else {
            this.mWebView.loadUrl(str);
        }
    }

    public void postVisualStateCallback(long j, final WebView.VisualStateCallback visualStateCallback) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mWebView.postVisualStateCallback(j, new WebView.VisualStateCallback() {
                public void onComplete(long j) {
                    visualStateCallback.onComplete(j);
                }
            });
        }
    }

    public void postWebMessage(WebMessage webMessage, Uri uri) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mWebView.postWebMessage(webMessage, uri);
        }
    }

    public void reload() {
        this.mWebView.reload();
    }

    public void removeDocumentStartJavaScript(int i) {
        XWebLog.m21913w(TAG, "removeDocumentStartJavaScript not implemented");
    }

    public void removeJavascriptInterface(String str) {
        this.mWebView.removeJavascriptInterface(str);
    }

    public void requestFocusNodeHref(Message message) {
        this.mWebView.requestFocusNodeHref(message);
    }

    public void requestImageRef(Message message) {
        this.mWebView.requestImageRef(message);
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        return this.mWebView.restoreState(bundle);
    }

    public void resumeTimers() {
        this.mWebView.resumeTimers();
    }

    public boolean savePage(String str, String str2, int i) {
        return false;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return this.mWebView.saveState(bundle);
    }

    public void saveWebArchive(String str) {
        this.mWebView.saveWebArchive(str);
    }

    public void setBottomHeight(int i) {
        XWebLog.m21909e(TAG, "setBottomHeight not implement");
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        this.mWebView.setDownloadListener(downloadListener);
    }

    public void setFindListener(WebView.FindListener findListener) {
        this.mWebView.setFindListener(findListener);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.mWebView.setHorizontalScrollBarEnabled(z);
    }

    public void setHorizontalScrollbarOverlay(boolean z) {
        this.mWebView.setHorizontalScrollbarOverlay(z);
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        WebViewDatabase.getInstance(this.mWebView.getContext()).setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public void setInitialScale(int i) {
        this.mWebView.setInitialScale(i);
    }

    public void setJSExceptionListener(WebViewJSExceptionListener webViewJSExceptionListener) {
    }

    public void setNetworkAvailable(boolean z) {
        this.mWebView.setNetworkAvailable(z);
    }

    @Deprecated
    public void setPictureListener(WebView.PictureListener pictureListener) {
    }

    public void setScrollBarStyle(int i) {
        this.mWebView.setScrollBarStyle(i);
    }

    public void setScrollbarFadingEnabled(boolean z) {
        this.mWebView.setScrollbarFadingEnabled(z);
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (Build.VERSION.SDK_INT >= 27) {
            this.mWebView.setTextClassifier(textClassifier);
        }
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.mWebView.setVerticalScrollBarEnabled(z);
    }

    public void setVerticalScrollbarOverlay(boolean z) {
        this.mWebView.setVerticalScrollbarOverlay(z);
    }

    public VideoControl setVideoJsCallback(VideoJsCallback videoJsCallback) {
        VideoNativeInterface videoNativeInterface = this.mXWebNativeInterface;
        if (videoNativeInterface != null && videoNativeInterface.setVideoJsCallback(videoJsCallback)) {
            return new VideoControl() {
                public boolean supportSetRequestedOrientationCallback() {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        return SysWebView.this.mXWebNativeInterface.supportSetRequestedOrientationCallback();
                    }
                    return false;
                }

                public void videoChangeStatus() {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        SysWebView.this.mXWebNativeInterface.videoChangeStatus();
                    }
                }

                public void videoExitFullscreen() {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        SysWebView.this.mXWebNativeInterface.videoExitFullscreen();
                    }
                }

                public void videoMute(boolean z) {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        SysWebView.this.mXWebNativeInterface.videoMute(z);
                    }
                }

                public void videoPause() {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        SysWebView.this.mXWebNativeInterface.videoPause();
                    }
                }

                public void videoPlay() {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        SysWebView.this.mXWebNativeInterface.videoPlay();
                    }
                }

                public void videoPlaybackRate(double d) {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        SysWebView.this.mXWebNativeInterface.videoPlaybackRate(d);
                    }
                }

                public void videoSeek(double d) {
                    if (SysWebView.this.mXWebNativeInterface != null) {
                        SysWebView.this.mXWebNativeInterface.videoSeek(d);
                    }
                }
            };
        }
        XWebLog.m21911i(TAG, "setVideoJsCallback not support");
        return null;
    }

    public void setWebChromeClient(com.tencent.xweb.WebChromeClient webChromeClient) {
        this.mWebViewChromeClientEx = webChromeClient;
    }

    public void setWebContentsSize(int i, int i2) {
    }

    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
        this.mWebViewCallbackClient = webViewCallbackClient;
    }

    public void setWebViewClient(com.tencent.xweb.WebViewClient webViewClient) {
        this.mWebViewClientEx = webViewClient;
    }

    public void setWebViewClientExtension(ProxyWebViewClientExtension proxyWebViewClientExtension) {
    }

    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
    }

    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
    }

    public void setXWebKeyEventHandler(XWebKeyEventHandler xWebKeyEventHandler) {
    }

    public void smoothScroll(int i, int i2, long j) {
    }

    public void stopLoading() {
        this.mWebView.stopLoading();
    }

    public boolean supportFeature(int i) {
        return i == 2006 ? Build.VERSION.SDK_INT >= 23 : i == 2012;
    }

    public boolean supportSetWebContentsSize() {
        return false;
    }

    public void zoomBy(float f) {
        this.mWebView.zoomBy(f);
    }

    public boolean zoomIn() {
        return this.mWebView.zoomIn();
    }

    public boolean zoomOut() {
        return this.mWebView.zoomOut();
    }

    public class CustomSysWeb extends android.webkit.WebView {
        public CustomSysWeb(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4 || !SysWebView.this.hasEnteredFullscreen()) {
                return super.dispatchKeyEvent(keyEvent);
            }
            SysWebView.this.leaveFullscreen();
            return true;
        }

        public int getScrollHeight() {
            return computeVerticalScrollRange();
        }

        public void invalidate() {
            super.invalidate();
            int contentHeight = getContentHeight();
            if (contentHeight != SysWebView.this.mContentHeight) {
                int unused = SysWebView.this.mContentHeight = contentHeight;
                if (SysWebView.this.mWebViewCallbackClient != null) {
                    XWebLog.m21911i(SysWebView.TAG, "onContentHeightChanged, height:" + contentHeight);
                    SysWebView.this.mWebViewCallbackClient.onContentHeightChanged(contentHeight);
                }
            }
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
            super.onOverScrolled(i, i2, z, z2);
            if (SysWebView.this.mWebViewCallbackClient != null) {
                SysWebView.this.mWebViewCallbackClient.onOverScrolled(i, i2, z, z2, this);
            }
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (SysWebView.this.mWebviewWraper != null) {
                SysWebView.this.mWebviewWraper.onWebViewScrollChanged(i, i2, i3, i4);
            }
            if (SysWebView.this.mWebViewCallbackClient != null) {
                SysWebView.this.mWebViewCallbackClient.onScrollChanged(i, i2, i3, i4, this);
            }
        }

        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            if (SysWebView.this.mWebViewCallbackClient != null) {
                SysWebView.this.mWebViewCallbackClient.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z, this);
            }
            return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }

        public CustomSysWeb(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public CustomSysWeb(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public CustomSysWeb(Context context, AttributeSet attributeSet, int i, boolean z) {
            super(context, attributeSet, i, z);
        }
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.mWebView.loadUrl(str, map);
    }

    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        this.mWebView.saveWebArchive(str, z, valueCallback);
    }

    public void captureBitmap(final IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
        new Thread(new Runnable() {
            public void run() {
                Bitmap createBitmap = Bitmap.createBitmap(SysWebView.this.mWebView.getWidth(), SysWebView.this.mWebView.getHeight(), Bitmap.Config.ARGB_8888);
                SysWebView.this.mWebView.draw(new Canvas(createBitmap));
                iCaptureBitmapCallback.onBitmapCaptureFinished(createBitmap);
                XWebLog.m21908d(SysWebView.TAG, "bitmapCaptureFinished");
            }
        }).start();
    }
}
