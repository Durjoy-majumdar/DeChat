package com.tencent.xweb.pinus;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import com.tencent.xweb.C106947R;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.GetImageBitmapToFileFinishedCallback;
import com.tencent.xweb.RenderProcessGoneDetail;
import com.tencent.xweb.VideoControl;
import com.tencent.xweb.VideoJsCallback;
import com.tencent.xweb.WebDebugCfg;
import com.tencent.xweb.WebSettings;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewCallbackClient;
import com.tencent.xweb.WebViewDatabase;
import com.tencent.xweb.WebViewJSExceptionListener;
import com.tencent.xweb.WebViewRenderProcessClient;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.XWebKeyEventHandler;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.XWebTranslateLogic;
import com.tencent.xweb.XWebWebViewClientExtensionInterceptor;
import com.tencent.xweb.extension.video.VideoNativeInterface;
import com.tencent.xweb.extension.video.XWebFullscreenVideoUtil;
import com.tencent.xweb.extension.video.XWebNativeInterface;
import com.tencent.xweb.extension.video.XWebNativeInterfaceFactory;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import com.tencent.xweb.pinus.PinusWebDataTrans;
import com.tencent.xweb.pinus.sdk.HitTestResultInterface;
import com.tencent.xweb.pinus.sdk.HttpAuthHandlerInterface;
import com.tencent.xweb.pinus.sdk.JsResultInterface;
import com.tencent.xweb.pinus.sdk.JsResultInterfaceImpl;
import com.tencent.xweb.pinus.sdk.SslErrorHandlerInterface;
import com.tencent.xweb.pinus.sdk.WebResourceErrorInterface;
import com.tencent.xweb.pinus.sdk.WebView;
import com.tencent.xweb.pinus.sdk.WebViewClient;
import com.tencent.xweb.report.KVReportForCrash;
import com.tencent.xweb.report.KVReportForLoadUrl;
import com.tencent.xweb.report.KVReportForRenderProcessGone;
import com.tencent.xweb.util.ErrorPage;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebDebugPage;
import com.tencent.xweb.util.XWebLog;
import java.util.Map;
import java.util.concurrent.Executor;
import nu3.C117640b;
import org.xwalk.core.XWalkEnvironment;

public class PinusWebView implements IWebView, XWebTranslateLogic.TranslateLogicCallback {
    private static final String TAG = "PinusWebView";
    private static volatile boolean sEnforceThreadChecking;
    /* access modifiers changed from: private */
    public boolean bIsIn404Stage = false;
    /* access modifiers changed from: private */
    public WebViewJSExceptionListener jsExceptionListener = null;
    private final int mApkVersion;
    /* access modifiers changed from: private */
    public final XWebWebViewClientExtensionInterceptor mClientExtensionInterceptor;
    /* access modifiers changed from: private */
    public WebChromeClient.CustomViewCallback mFullscreenCallback = null;
    /* access modifiers changed from: private */
    public boolean mIsClampedY = false;
    /* access modifiers changed from: private */
    public boolean mIsFullscreen = false;
    /* access modifiers changed from: private */
    public boolean mIsMediaPlaybackRequiresUserGesture = false;
    /* access modifiers changed from: private */
    public boolean mIsVideoPlaybackRequiresUserGesture = false;
    /* access modifiers changed from: private */
    public long mLoadStartTimestamp = 0;
    private final ProxyWebViewClientExtension mPinusProxyWebViewClientExtension;
    private final PinusWebViewSettings mPinusWebViewSettings;
    /* access modifiers changed from: private */
    public int mReferType = 0;
    /* access modifiers changed from: private */
    public final AbsoluteLayout mTopView;
    /* access modifiers changed from: private */
    public final XWebTranslateLogic mTranslateLogic;
    private final com.tencent.xweb.pinus.sdk.WebChromeClient mWebChromeClient;
    /* access modifiers changed from: private */
    public final CustomPsWeb mWebView;
    /* access modifiers changed from: private */
    public WebViewCallbackClient mWebViewCallbackClient;
    /* access modifiers changed from: private */
    public com.tencent.xweb.WebChromeClient mWebViewChromeClientEx;
    private final WebViewClient mWebViewClient;
    /* access modifiers changed from: private */
    public com.tencent.xweb.WebViewClient mWebViewClientEx;
    /* access modifiers changed from: private */
    public ProxyWebViewClientExtension mWebViewClientExtension = new ProxyWebViewClientExtension();
    private final Looper mWebViewThread;
    /* access modifiers changed from: private */
    public final WebView mWebviewWraper;
    /* access modifiers changed from: private */
    public VideoNativeInterface mXWebNativeInterface;

    public PinusWebView(WebView webView) {
        C201844 r1 = new com.tencent.xweb.pinus.sdk.WebChromeClient() {
            public View getVideoLoadingProgressView() {
                return PinusWebView.this.mWebViewChromeClientEx != null ? PinusWebView.this.mWebViewChromeClientEx.getVideoLoadingProgressView() : LayoutInflater.from(PinusWebView.this.mWebviewWraper.getContext()).inflate(C106947R.C106949layout.cjl, (ViewGroup) null);
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (ConsoleMessage.MessageLevel.ERROR == consoleMessage.messageLevel() && PinusWebView.this.jsExceptionListener != null) {
                    String[] split = consoleMessage.message().split(XVFSFile.PATH_SEPARATOR);
                    if (split.length == 2) {
                        PinusWebView.this.jsExceptionListener.onJsException(consoleMessage.sourceId(), split[0], split[1]);
                        WXWebReporter.onJSException();
                    }
                }
                return PinusWebView.this.mWebViewChromeClientEx != null ? PinusWebView.this.mWebViewChromeClientEx.onConsoleMessage(consoleMessage) : super.onConsoleMessage(consoleMessage);
            }

            public boolean onCreateWindow(com.tencent.xweb.pinus.sdk.WebView webView, boolean z, boolean z2, Message message) {
                return PinusWebView.this.mWebViewChromeClientEx != null ? PinusWebView.this.mWebViewChromeClientEx.onCreateWindow(PinusWebView.this.mWebviewWraper, z, z2, message) : super.onCreateWindow(webView, z, z2, message);
            }

            public void onExitFullscreenVideo(Bitmap bitmap) {
                XWebLog.m21911i(PinusWebView.TAG, "onExitFullscreenVideo");
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onExitFullscreenVideo(bitmap);
                }
            }

            public void onGeolocationPermissionsHidePrompt() {
                XWebLog.m21911i(PinusWebView.TAG, "onGeolocationPermissionsHidePrompt");
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onGeolocationPermissionsHidePrompt();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                XWebLog.m21911i(PinusWebView.TAG, "onGeolocationPermissionsShowPrompt");
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onGeolocationPermissionsShowPrompt(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            public void onGetSampleString(com.tencent.xweb.pinus.sdk.WebView webView, Map<String, String> map) {
                PinusWebView.this.mTranslateLogic.onGetSampleString(map);
            }

            public void onGetTranslateString(com.tencent.xweb.pinus.sdk.WebView webView, Map<String, String> map) {
                PinusWebView.this.mTranslateLogic.onGetTranslateString(map);
            }

            public void onHideCustomView() {
                XWebLog.m21911i(PinusWebView.TAG, "onHideCustomView");
                WebChromeClient.CustomViewCallback unused = PinusWebView.this.mFullscreenCallback = null;
                if (PinusWebView.this.mIsFullscreen) {
                    boolean unused2 = PinusWebView.this.mIsFullscreen = false;
                    XWebLog.m21911i(PinusWebView.TAG, "onHideCustomView, mIsMediaPlaybackRequiresUserGesture:" + PinusWebView.this.mIsMediaPlaybackRequiresUserGesture + ", mIsVideoPlaybackRequiresUserGesture:" + PinusWebView.this.mIsVideoPlaybackRequiresUserGesture);
                    PinusWebView.this.mWebView.getSettings().setMediaPlaybackRequiresUserGesture(PinusWebView.this.mIsMediaPlaybackRequiresUserGesture);
                    PinusWebView.this.mWebView.getSettings().setVideoPlaybackRequiresUserGesture(PinusWebView.this.mIsVideoPlaybackRequiresUserGesture);
                }
                if (PinusWebView.this.mWebViewChromeClientEx != null ? PinusWebView.this.mWebViewChromeClientEx.onExitFullscreen() : false) {
                    XWebLog.m21911i(PinusWebView.TAG, "onHideCustomView isHandled:true");
                    return;
                }
                PinusWebView.this.mTopView.setVisibility(0);
                if (PinusWebView.this.mXWebNativeInterface != null) {
                    PinusWebView.this.mXWebNativeInterface.onHideCustomView();
                } else if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onHideCustomView();
                } else {
                    super.onHideCustomView();
                }
            }

            public boolean onJsAlert(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
                XWebLog.m21911i(PinusWebView.TAG, "onJsAlert, message:" + str2);
                return PinusWebView.this.mWebViewChromeClientEx != null ? PinusWebView.this.mWebViewChromeClientEx.onJsAlert(PinusWebView.this.mWebviewWraper, str, str2, new PinusWebDataTrans.PsWebJsResultImpl(jsResultInterface)) : super.onJsAlert(webView, str, str2, jsResultInterface);
            }

            public boolean onJsAlertInner(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, Object obj) {
                return onJsAlert(webView, str, str2, new JsResultInterfaceImpl(obj));
            }

            public boolean onJsConfirm(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, JsResultInterface jsResultInterface) {
                XWebLog.m21911i(PinusWebView.TAG, "onJsConfirm, message:" + str2);
                return PinusWebView.this.mWebViewChromeClientEx != null ? PinusWebView.this.mWebViewChromeClientEx.onJsConfirm(PinusWebView.this.mWebviewWraper, str, str2, new PinusWebDataTrans.PsWebJsResultImpl(jsResultInterface)) : super.onJsConfirm(webView, str, str2, jsResultInterface);
            }

            public boolean onJsConfirmInner(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, Object obj) {
                return onJsConfirm(webView, str, str2, new JsResultInterfaceImpl(obj));
            }

            public boolean onJsPrompt(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, String str3, JsResultInterface jsResultInterface) {
                XWebLog.m21911i(PinusWebView.TAG, "onJsPrompt, message:" + str2);
                if (PinusWebView.this.mWebViewChromeClientEx == null) {
                    return super.onJsPrompt(webView, str, str2, str3, jsResultInterface);
                }
                return PinusWebView.this.mWebViewChromeClientEx.onJsPrompt(PinusWebView.this.mWebviewWraper, str, str2, str3, new PinusWebDataTrans.PsWebJsPromptResultImpl(jsResultInterface));
            }

            public boolean onJsPromptInner(com.tencent.xweb.pinus.sdk.WebView webView, String str, String str2, String str3, Object obj) {
                return onJsPrompt(webView, str, str2, str3, new JsResultInterfaceImpl(obj));
            }

            public void onPermissionRequest(PermissionRequest permissionRequest) {
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onPermissionRequest(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onPermissionRequestCanceled(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            public void onProgressChanged(com.tencent.xweb.pinus.sdk.WebView webView, int i) {
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onProgressChanged(PinusWebView.this.mWebviewWraper, i);
                } else {
                    super.onProgressChanged(webView, i);
                }
            }

            public void onReceivedTitle(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
                XWebLog.m21911i(PinusWebView.TAG, "onReceivedTitle: " + str);
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onReceivedTitle(PinusWebView.this.mWebviewWraper, str);
                } else {
                    super.onReceivedTitle(webView, str);
                }
                if (PinusWebView.this.mXWebNativeInterface != null) {
                    PinusWebView.this.mXWebNativeInterface.evaluteJavascript(true, PinusWebView.this.mWebviewWraper.getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS);
                }
            }

            public void onRequestFocus(com.tencent.xweb.pinus.sdk.WebView webView) {
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onRequestFocus(PinusWebView.this.mWebviewWraper);
                } else {
                    super.onRequestFocus(webView);
                }
            }

            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                XWebLog.m21911i(PinusWebView.TAG, "onShowCustomView");
                WebChromeClient.CustomViewCallback unused = PinusWebView.this.mFullscreenCallback = customViewCallback;
                boolean z = false;
                if (!PinusWebView.this.mIsFullscreen) {
                    boolean unused2 = PinusWebView.this.mIsFullscreen = true;
                    PinusWebView pinusWebView = PinusWebView.this;
                    boolean unused3 = pinusWebView.mIsMediaPlaybackRequiresUserGesture = pinusWebView.mWebView.getSettings().getMediaPlaybackRequiresUserGesture();
                    PinusWebView pinusWebView2 = PinusWebView.this;
                    boolean unused4 = pinusWebView2.mIsVideoPlaybackRequiresUserGesture = pinusWebView2.mWebView.getSettings().getVideoPlaybackRequiresUserGesture();
                    XWebLog.m21911i(PinusWebView.TAG, "onShowCustomView, mIsMediaPlaybackRequiresUserGesture:" + PinusWebView.this.mIsMediaPlaybackRequiresUserGesture + ", mIsVideoPlaybackRequiresUserGesture:" + PinusWebView.this.mIsVideoPlaybackRequiresUserGesture);
                    PinusWebView.this.mWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                    PinusWebView.this.mWebView.getSettings().setVideoPlaybackRequiresUserGesture(false);
                }
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    z = PinusWebView.this.mWebViewChromeClientEx.onEnterFullscreen(view, customViewCallback);
                }
                WXWebReporter.onXWWebViewOnShowCustomViewFullscreen();
                if (z) {
                    XWebLog.m21911i(PinusWebView.TAG, "onShowCustomView isHandled:true");
                    return;
                }
                PinusWebView.this.mTopView.setVisibility(4);
                if (PinusWebView.this.mXWebNativeInterface != null) {
                    WXWebReporter.reportWebViewOnShowCustomView(WebView.WebViewKind.WV_KIND_PINUS, PinusWebView.this.mXWebNativeInterface instanceof XWebNativeInterface, PinusWebView.this.getUrl());
                    PinusWebView.this.mXWebNativeInterface.onShowCustomView(view, customViewCallback);
                } else if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.onShowCustomView(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            public boolean onShowFileChooser(com.tencent.xweb.pinus.sdk.WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                XWebLog.m21911i(PinusWebView.TAG, "onShowFileChooser last method");
                return PinusWebView.this.mWebViewChromeClientEx != null ? PinusWebView.this.mWebViewChromeClientEx.onShowFileChooser(PinusWebView.this.mWebviewWraper, valueCallback, new PinusWebDataTrans.PsWebFileChooserParamsImpl(fileChooserParams)) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback) {
                XWebLog.m21911i(PinusWebView.TAG, "openFileChooser with one param");
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.openFileChooser(valueCallback, (String) null, (String) null);
                } else {
                    valueCallback.onReceiveValue((Object) null);
                }
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
                XWebLog.m21911i(PinusWebView.TAG, "openFileChooser with two param");
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.openFileChooser(valueCallback, str, (String) null);
                } else {
                    valueCallback.onReceiveValue((Object) null);
                }
            }

            public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
                XWebLog.m21911i(PinusWebView.TAG, "openFileChooser with three param");
                if (PinusWebView.this.mWebViewChromeClientEx != null) {
                    PinusWebView.this.mWebViewChromeClientEx.openFileChooser(valueCallback, str, str2);
                } else {
                    valueCallback.onReceiveValue((Object) null);
                }
            }
        };
        this.mWebChromeClient = r1;
        C201855 r2 = new WebViewClient() {
            private String mPreUrl = null;
            private String mSessionId = null;
            private String mStrLastFinishedUrl = null;

            public void doUpdateVisitedHistory(com.tencent.xweb.pinus.sdk.WebView webView, String str, boolean z) {
                if (str != null && str.startsWith("data:text/html;charset=utf-8")) {
                    XWebLog.m21913w(PinusWebView.TAG, "doUpdateVisitedHistory, ignore");
                } else if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.doUpdateVisitedHistory(PinusWebView.this.mWebviewWraper, str, z);
                } else {
                    super.doUpdateVisitedHistory(webView, str, z);
                }
            }

            public void onLoadResource(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onLoadResource(PinusWebView.this.mWebviewWraper, str);
                } else {
                    super.onLoadResource(webView, str);
                }
            }

            public void onPageCommitVisible(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
                XWebLog.m21911i(PinusWebView.TAG, "onPageCommitVisible, webview:" + webView.hashCode() + ", url:" + str);
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onPageCommitVisible(PinusWebView.this.mWebviewWraper, str);
                }
            }

            public void onPageFinished(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
                String str2 = this.mStrLastFinishedUrl;
                if (str2 == null || !str2.equals(str)) {
                    XWebLog.m21911i(PinusWebView.TAG, "onPageFinished, webview:" + webView.hashCode() + ", url:" + str);
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.evaluteJavascript(false, PinusWebView.this.mWebviewWraper.getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS);
                    }
                    this.mStrLastFinishedUrl = str;
                    if (PinusWebView.this.mWebViewClientEx != null) {
                        PinusWebView.this.mWebViewClientEx.onPageFinished(PinusWebView.this.mWebviewWraper, str);
                    } else {
                        super.onPageFinished(webView, str);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - PinusWebView.this.mLoadStartTimestamp;
                    WXWebReporter.onWXWebviewLoadSuccess(currentTimeMillis);
                    KVReportForLoadUrl.report(WXWebReporter.getUrlType(str), this.mSessionId, 1, 0, (int) currentTimeMillis, PinusWebView.this.mReferType, str, WebView.WebViewKind.WV_KIND_PINUS);
                    long unused = PinusWebView.this.mLoadStartTimestamp = System.currentTimeMillis();
                    WebDebugPage.initFpsPage(PinusWebView.this.mWebviewWraper);
                    return;
                }
                XWebLog.m21911i(PinusWebView.TAG, "onPageFinished abandoned, url:" + str);
            }

            public void onPageStarted(com.tencent.xweb.pinus.sdk.WebView webView, String str, Bitmap bitmap) {
                XWebLog.m21911i(PinusWebView.TAG, "onPageStarted, webview:" + webView.hashCode() + ", url:" + str);
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onPageStarted(PinusWebView.this.mWebviewWraper, str, bitmap);
                } else {
                    super.onPageStarted(webView, str, bitmap);
                }
                this.mStrLastFinishedUrl = null;
                this.mSessionId = WXWebReporter.generateSessionId();
                String str2 = this.mPreUrl;
                if (!(str2 == null || str == null || str.equals(str2) || WXWebReporter.getUrlType(str) == WXWebReporter.getUrlType(this.mPreUrl))) {
                    if (WXWebReporter.getUrlType(this.mPreUrl) == 1 && WXWebReporter.getUrlType(str) == 2) {
                        int unused = PinusWebView.this.mReferType = 1;
                    } else if (WXWebReporter.getUrlType(this.mPreUrl) == 2 && WXWebReporter.getUrlType(str) == 1) {
                        int unused2 = PinusWebView.this.mReferType = 2;
                    }
                }
                this.mPreUrl = str;
                long unused3 = PinusWebView.this.mLoadStartTimestamp = System.currentTimeMillis();
                WXWebReporter.onWXWebviewLoad(str);
                KVReportForLoadUrl.report(WXWebReporter.getUrlType(str), this.mSessionId, 0, 0, 0, PinusWebView.this.mReferType, str, WebView.WebViewKind.WV_KIND_PINUS);
                if (PinusWebView.this.mXWebNativeInterface != null) {
                    PinusWebView.this.mXWebNativeInterface.evaluteJavascript(true, PinusWebView.this.mWebviewWraper.getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS);
                }
                PinusWebView.this.mTranslateLogic.onPageLoadStarted();
            }

            public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, int i, String str, String str2) {
                XWebLog.m21911i(PinusWebView.TAG, "onReceivedError, webview:" + webView.hashCode() + ", errorCode:" + i + ", desc:" + str + ", url:" + str2);
                boolean unused = PinusWebView.this.bIsIn404Stage = true;
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onReceivedError(PinusWebView.this.mWebviewWraper, i, str, str2);
                } else {
                    super.onReceivedError(webView, i, str, str2);
                }
                WXWebReporter.onWXWebviewLoadFailed();
                int i2 = i;
                String str3 = str2;
                KVReportForLoadUrl.report(WXWebReporter.getUrlType(str2), this.mSessionId, 1, i2, (int) (System.currentTimeMillis() - PinusWebView.this.mLoadStartTimestamp), PinusWebView.this.mReferType, str3, WebView.WebViewKind.WV_KIND_PINUS);
                if (PinusWebView.this.mWebViewClientEx == null || !PinusWebView.this.mWebViewClientEx.shouldInterceptLoadError(PinusWebView.this.mWebviewWraper, i, str, str2)) {
                    PinusWebView.this.mWebView.loadDataWithBaseURL("file:///android_asset/", ErrorPage.createErrorPage(i, str, str2), "text/html", "utf-8", (String) null);
                }
            }

            public void onReceivedHttpAuthRequest(com.tencent.xweb.pinus.sdk.WebView webView, HttpAuthHandlerInterface httpAuthHandlerInterface, String str, String str2) {
                XWebLog.m21911i(PinusWebView.TAG, "onReceivedHttpAuthRequest, host:" + str + ", realm:" + str2);
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onReceivedHttpAuthRequest(PinusWebView.this.mWebviewWraper, new PinusWebDataTrans.PsWebHttpAuthHandler(httpAuthHandlerInterface), str, str2);
                } else {
                    super.onReceivedHttpAuthRequest(webView, httpAuthHandlerInterface, str, str2);
                }
            }

            public void onReceivedHttpError(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                String valueOf = String.valueOf(webResourceResponse.getStatusCode());
                XWebLog.m21911i(PinusWebView.TAG, "onReceivedHttpError, webview:" + webView.hashCode() + ", code:" + valueOf);
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onReceivedHttpError(PinusWebView.this.mWebviewWraper, new PinusWebDataTrans.WebResourceRequestImpl(webResourceRequest), PinusWebDataTrans.createWCWebResponse(webResourceResponse));
                } else {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
                if (webResourceRequest.isForMainFrame()) {
                    onPageFinished(webView, webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : "");
                }
            }

            public void onReceivedSslError(com.tencent.xweb.pinus.sdk.WebView webView, SslErrorHandlerInterface sslErrorHandlerInterface, SslError sslError) {
                XWebLog.m21911i(PinusWebView.TAG, "onReceivedSslError, webview:" + webView.hashCode() + ", error:" + sslError.getPrimaryError());
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onReceivedSslError(PinusWebView.this.mWebviewWraper, new PinusWebDataTrans.SslErrorHandlerImp(sslErrorHandlerInterface), sslError);
                } else {
                    super.onReceivedSslError(webView, sslErrorHandlerInterface, sslError);
                }
            }

            public boolean onRenderProcessGone(com.tencent.xweb.pinus.sdk.WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
                XWebLog.m21911i(PinusWebView.TAG, "onRenderProcessGone, webview:" + webView.hashCode() + ", didCrash:" + renderProcessGoneDetail.didCrash() + ", rendererPriorityAtExit:" + renderProcessGoneDetail.rendererPriorityAtExit());
                KVReportForRenderProcessGone.report(webView, renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
                return PinusWebView.this.mWebViewClientEx != null ? PinusWebView.this.mWebViewClientEx.onRenderProcessGone(PinusWebView.this.mWebviewWraper, new RenderProcessGoneDetail() {
                    public boolean didCrash() {
                        return renderProcessGoneDetail.didCrash();
                    }

                    public int rendererPriorityAtExit() {
                        return renderProcessGoneDetail.rendererPriorityAtExit();
                    }
                }) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }

            public void onScaleChanged(com.tencent.xweb.pinus.sdk.WebView webView, float f, float f2) {
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onScaleChanged(PinusWebView.this.mWebviewWraper, f, f2);
                } else {
                    super.onScaleChanged(webView, f, f2);
                }
            }

            public WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
                if (PinusWebView.this.mWebViewClientEx != null) {
                    return PinusWebDataTrans.createWebKitResponse(PinusWebView.this.mWebViewClientEx.shouldInterceptRequest(PinusWebView.this.mWebviewWraper, str));
                }
                return super.shouldInterceptRequest(webView, str);
            }

            public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, String str) {
                if (WebDebugPage.containsDebugPiece(str)) {
                    return true;
                }
                if (PinusWebView.this.mWebViewClientEx == null) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                boolean shouldOverrideUrlLoading = PinusWebView.this.mWebViewClientEx.shouldOverrideUrlLoading(PinusWebView.this.mWebviewWraper, str);
                XWebLog.m21911i(PinusWebView.TAG, "shouldOverrideUrlLoading, ret:" + shouldOverrideUrlLoading + ", url:" + str);
                return shouldOverrideUrlLoading;
            }

            public WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest) {
                if (PinusWebView.this.mWebViewClientEx == null) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                com.tencent.xweb.WebResourceResponse webResourceResponse = null;
                PinusWebDataTrans.WebResourceRequestImpl webResourceRequestImpl = new PinusWebDataTrans.WebResourceRequestImpl(webResourceRequest);
                Bundle bundle = webResourceRequestImpl.getBundle();
                if (bundle != null) {
                    webResourceResponse = PinusWebView.this.mWebViewClientEx.shouldInterceptRequest(PinusWebView.this.mWebviewWraper, webResourceRequestImpl, bundle);
                }
                if (webResourceResponse == null) {
                    webResourceResponse = PinusWebView.this.mWebViewClientEx.shouldInterceptRequest(PinusWebView.this.mWebviewWraper, (com.tencent.xweb.WebResourceRequest) webResourceRequestImpl);
                }
                if (webResourceResponse == null) {
                    webResourceResponse = PinusWebView.this.mWebViewClientEx.shouldInterceptRequest(PinusWebView.this.mWebviewWraper, webResourceRequest.getUrl().toString());
                }
                return PinusWebDataTrans.createWebKitResponse(webResourceResponse);
            }

            public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest) {
                if (WebDebugPage.containsDebugPiece(webResourceRequest.getUrl().toString())) {
                    return true;
                }
                if (PinusWebView.this.mWebViewClientEx == null) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                boolean shouldOverrideUrlLoading = PinusWebView.this.mWebViewClientEx.shouldOverrideUrlLoading(PinusWebView.this.mWebviewWraper, (com.tencent.xweb.WebResourceRequest) new PinusWebDataTrans.WebResourceRequestImpl(webResourceRequest));
                XWebLog.m21911i(PinusWebView.TAG, "shouldOverrideUrlLoading, ret:" + shouldOverrideUrlLoading + ", url:" + webResourceRequest.getUrl().toString());
                return shouldOverrideUrlLoading;
            }

            public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, WebResourceRequest webResourceRequest, WebResourceErrorInterface webResourceErrorInterface) {
                XWebLog.m21911i(PinusWebView.TAG, "onReceivedSslError, webview:" + webView.hashCode() + ", error:" + webResourceErrorInterface);
                if (PinusWebView.this.mWebViewClientEx != null) {
                    PinusWebView.this.mWebViewClientEx.onReceivedError(PinusWebView.this.mWebviewWraper, new PinusWebDataTrans.WebResourceRequestImpl(webResourceRequest), PinusWebDataTrans.createPSWebResourceError(webResourceErrorInterface));
                } else {
                    super.onReceivedError(webView, webResourceRequest, webResourceErrorInterface);
                }
            }
        };
        this.mWebViewClient = r2;
        C201826 r3 = new ProxyWebViewClientExtension() {
            public Object onMiscCallBack(String str, Bundle bundle) {
                if (PinusWebView.this.mClientExtensionInterceptor != null) {
                    XWebWebViewClientExtensionInterceptor.InterceptResult interceptOnMiscCallback = PinusWebView.this.mClientExtensionInterceptor.interceptOnMiscCallback(str, bundle);
                    if (interceptOnMiscCallback.intercepted) {
                        XWebLog.m21911i(PinusWebView.TAG, "onMiscCallBack, method(" + str + ") intercepted, result:" + interceptOnMiscCallback.result);
                        return interceptOnMiscCallback.result;
                    }
                }
                if (PinusWebView.this.mWebViewClientExtension != null) {
                    return PinusWebView.this.mWebViewClientExtension.onMiscCallBack(str, bundle);
                }
                return null;
            }
        };
        this.mPinusProxyWebViewClientExtension = r3;
        this.mWebViewThread = Looper.myLooper();
        sEnforceThreadChecking = webView.getContext().getApplicationInfo().targetSdkVersion >= 18;
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        this.mApkVersion = availableVersion;
        PSContextWrapper pSContextWrapper = new PSContextWrapper(webView.getContext(), availableVersion);
        CustomPsWeb customPsWeb = new CustomPsWeb(pSContextWrapper);
        this.mWebView = customPsWeb;
        AbsoluteLayout absoluteLayout = new AbsoluteLayout(pSContextWrapper);
        this.mTopView = absoluteLayout;
        customPsWeb.getContentView().addView(absoluteLayout);
        customPsWeb.setCustomOnScrollChangedListener(new WebView.ScrollChangedListener() {
            public void onScrollChanged(int i, int i2, int i3, int i4) {
                PinusWebView.this.mTopView.scrollTo(i, i2);
                if (PinusWebView.this.mWebViewCallbackClient != null) {
                    PinusWebView.this.mWebViewCallbackClient.onScrollChanged(i, i2, i3, i4, PinusWebView.this.mWebView);
                }
            }
        });
        customPsWeb.setCustomOnOverScrolledListener(new WebView.OverScrolledListener() {
            public void onOverScrolled(boolean z) {
                boolean unused = PinusWebView.this.mIsClampedY = z;
            }

            public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
                if (PinusWebView.this.mWebViewCallbackClient != null) {
                    return PinusWebView.this.mWebViewCallbackClient.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z, view);
                }
                return false;
            }

            public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
                if (PinusWebView.this.mWebViewCallbackClient != null) {
                    PinusWebView.this.mWebViewCallbackClient.onOverScrolled(i, i2, z, z2, view);
                }
            }
        });
        customPsWeb.setBackgroundColor(0);
        this.mWebviewWraper = webView;
        this.mPinusWebViewSettings = new PinusWebViewSettings(customPsWeb);
        customPsWeb.setWebChromeClient(r1);
        customPsWeb.setWebViewClient(r2);
        this.mClientExtensionInterceptor = new XWebWebViewClientExtensionInterceptor(this);
        customPsWeb.setProxyWebViewClientExtension(r3);
        this.mTranslateLogic = new XWebTranslateLogic(webView, this);
        initFullscreenVideo(customPsWeb.getContext());
    }

    private void checkThread() {
        if (this.mWebViewThread != null && Looper.myLooper() != this.mWebViewThread) {
            Throwable th = new Throwable("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + this.mWebViewThread + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            String stackTraceString = Log.getStackTraceString(th);
            StringBuilder sb = new StringBuilder();
            sb.append("checkThread error:");
            sb.append(stackTraceString);
            XWebLog.m21913w(TAG, sb.toString());
            KVReportForCrash.report(3, stackTraceString, WebView.WebViewKind.WV_KIND_PINUS.ordinal());
            if (sEnforceThreadChecking) {
                throw new RuntimeException(th);
            }
        }
    }

    public static void clearClientCertPreferences(Runnable runnable) {
        if (PSCoreWrapper.getInstance() != null) {
            ReflectMethod reflectMethod = new ReflectMethod(PSCoreWrapper.getInstance().getBridgeClass("AwContentsStatics"), "clearClientCertPreferences", (Class<?>[]) new Class[]{Runnable.class});
            if (!reflectMethod.isNull()) {
                reflectMethod.invoke(runnable);
                return;
            }
            XWebLog.m21909e(TAG, "AwContentsStatics clearClientCertPreferences function not found");
            return;
        }
        XWebLog.m21909e(TAG, "AwContentsStatics clearClientCertPreferences error, not inited");
    }

    public static String findAddress(String str) {
        if (PSCoreWrapper.getInstance() != null) {
            ReflectMethod reflectMethod = new ReflectMethod(PSCoreWrapper.getInstance().getBridgeClass("AwContentsStatics"), "findAddress", (Class<?>[]) new Class[]{String.class});
            if (!reflectMethod.isNull()) {
                return (String) reflectMethod.invoke(str);
            }
            XWebLog.m21909e(TAG, "AwContentsStatics findAddress function not found");
            return "";
        }
        XWebLog.m21909e(TAG, "AwContentsStatics findAddress error, not inited");
        return "";
    }

    private void initFullscreenVideo(Context context) {
        XWebLog.m21911i(TAG, "initFullscreenVideo, kind:" + getFullscreenVideoKind() + ", activity:" + context);
        this.mXWebNativeInterface = XWebNativeInterfaceFactory.createXWebNativeInterface(this.mWebviewWraper.getCurrentInstanceWebCoreType(), context, this.mWebviewWraper, this.mWebView, XWebFullscreenVideoUtil.initJs());
        if (getFullscreenVideoKind() == WebView.FullscreenVideoKind.HOOK_EVALUTE_JS) {
            this.mXWebNativeInterface.registerJavascriptInterface(this.mWebView);
        }
    }

    public int addDocumentStartJavaScript(String str, String[] strArr) {
        return this.mWebView.addDocumentStartJavaScript(str, strArr);
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.mWebView.addJavascriptInterface(obj, str);
    }

    public boolean canGoBack() {
        if (this.bIsIn404Stage) {
            return false;
        }
        return this.mWebView.canGoBack();
    }

    public boolean canGoBackOrForward(int i) {
        return this.mWebView.canGoBackOrForward(i);
    }

    public boolean canGoForward() {
        return this.mWebView.canGoForward();
    }

    public void captureBitmap(final IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
        final View childAt = ((ViewGroup) ((ViewGroup) this.mWebView.getChildAt(0)).getChildAt(0)).getChildAt(0);
        if (childAt instanceof TextureView) {
            C117640b.f351893a.execute(new Runnable() {
                public void run() {
                    Bitmap bitmap = ((TextureView) childAt).getBitmap();
                    XWebLog.m21911i(PinusWebView.TAG, "captureBitmap, onFinishGetBitmap:" + bitmap);
                    iCaptureBitmapCallback.onBitmapCaptureFinished(bitmap);
                }
            });
        }
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
        return null;
    }

    public void destroy() {
        this.mWebView.destroy();
    }

    public void disablePlatformNotifications() {
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
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.mWebView.evaluateJavascript(str, valueCallback);
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
        return "pinus, sdk ver = " + XWebSdk.getXWebSdkVersion() + "\n apk ver = " + XWalkEnvironment.getAvailableVersion() + "\n detail = " + XWalkEnvironment.getAvailableVersionDetail();
    }

    public Object getBridge() {
        CustomPsWeb customPsWeb = this.mWebView;
        if (customPsWeb != null) {
            return customPsWeb.getBridge();
        }
        XWebLog.m21909e(TAG, "getPinusBridge, mWebview is null");
        return null;
    }

    public SslCertificate getCertificate() {
        return this.mWebView.getCertificate();
    }

    public int getContentHeight() {
        return this.mWebView.getContentHeight();
    }

    public ICookieManager getCookieManager() {
        return new PinusCookieManagerWrapper();
    }

    public Bitmap getFavicon() {
        return this.mWebView.getFavicon();
    }

    public WebView.FullscreenVideoKind getFullscreenVideoKind() {
        return CommandCfg.getInstance().getFullscreenVideoKind(com.tencent.xweb.WebView.getModuleName());
    }

    public WebView.HitTestResult getHitTestResult() {
        WebView.HitTestResult hitTestResult = new WebView.HitTestResult();
        HitTestResultInterface hitTestResult2 = this.mWebView.getHitTestResult();
        hitTestResult.setType(hitTestResult2.getType());
        hitTestResult.setExtra(hitTestResult2.getExtra());
        return hitTestResult;
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return WebViewDatabase.getInstance(this.mWebView.getContext()).getHttpAuthUsernamePassword(str, str2);
    }

    public boolean getImageBitmapToFile(String str, String str2, String str3, GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback) {
        return this.mWebView.getImageBitmapToFile(str, str2, str3, getImageBitmapToFileFinishedCallback);
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
        return this.mWebView.computeVerticalScrollRange();
    }

    public WebSettings getSettings() {
        if (WebDebugCfg.getInst().getEnableCheckThread()) {
            checkThread();
        }
        return this.mPinusWebViewSettings;
    }

    public TextClassifier getTextClassifier() {
        return null;
    }

    public String getTitle() {
        return this.mWebView.getTitle();
    }

    public ViewGroup getTopView() {
        return this.mTopView;
    }

    public String getUrl() {
        return this.mWebView.getUrl();
    }

    public String getVersionInfo() {
        return "pinus, sdkver = " + XWebSdk.getXWebSdkVersion() + ", apkver = " + this.mApkVersion + ", detail = " + XWalkEnvironment.getAvailableVersionDetail();
    }

    public View getView() {
        return this.mWebView;
    }

    public int getVisibleTitleHeight() {
        return 0;
    }

    public com.tencent.xweb.WebChromeClient getWebChromeClient() {
        return this.mWebViewChromeClientEx;
    }

    public int getWebScrollX() {
        View webViewUI = getWebViewUI();
        return webViewUI instanceof com.tencent.xweb.pinus.sdk.WebView ? ((com.tencent.xweb.pinus.sdk.WebView) webViewUI).computeHorizontalScrollOffset() : webViewUI.getScrollX();
    }

    public int getWebScrollY() {
        return this.mWebView.computeVerticalScrollOffset();
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
            XWebLog.m21908d(TAG, "invokeMiscMethod, method string is null or empty");
            return null;
        }
        XWebLog.m21908d(TAG, "invokeMiscMethod, method:" + str);
        if (str.equals("supportTranslateWebSite")) {
            boolean isSupportTranslateWebSite = PinusWebFactory.getInstance().isSupportTranslateWebSite();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("result", isSupportTranslateWebSite);
            XWebLog.m21911i(TAG, "translate: xweb is supportTranslateWebSite = " + isSupportTranslateWebSite);
            return bundle2;
        } else if (str.equals("getTranslateSampleString")) {
            XWebLog.m21911i(TAG, "translate: xweb is detectTranslateWebSiteIsNeeded, getTranslateSampleString");
            this.mWebView.getTranslateSampleString(0);
            return null;
        } else if (str.equals("translateWebSite")) {
            this.mTranslateLogic.setIsInTranslateMode(true);
            return null;
        } else {
            if (str.equals("replaceTranslatedString")) {
                this.mTranslateLogic.replaceTranslatedString(bundle);
            }
            return null;
        }
    }

    public boolean isClampedY() {
        return this.mIsClampedY;
    }

    public boolean isOverScrollStart() {
        boolean isClampedY = isClampedY();
        View webViewUI = getWebViewUI();
        return (webViewUI instanceof com.tencent.xweb.pinus.sdk.WebView ? ((com.tencent.xweb.pinus.sdk.WebView) webViewUI).computeVerticalScrollOffset() : webViewUI.getScrollY()) == 0 && isClampedY;
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
        if (str == null || !str.trim().startsWith("javascript:")) {
            this.bIsIn404Stage = false;
            this.mWebView.loadUrl(str);
            return;
        }
        this.mWebView.evaluateJavascript(str, (ValueCallback<String>) null);
    }

    public void onHide() {
        this.mWebView.onHide();
    }

    public void onPause() {
        this.mWebView.onPause();
    }

    public void onResume() {
        this.mWebView.onResume();
    }

    public void onShow() {
        this.mWebView.onShow();
    }

    public void onTranslateFinish() {
        ProxyWebViewClientExtension proxyWebViewClientExtension = this.mWebViewClientExtension;
        if (proxyWebViewClientExtension != null) {
            proxyWebViewClientExtension.onMiscCallBack("onTranslateFinish", new Bundle());
        }
    }

    public void onTranslateMiscCallBack(String str, Bundle bundle) {
        ProxyWebViewClientExtension proxyWebViewClientExtension = this.mWebViewClientExtension;
        if (proxyWebViewClientExtension != null) {
            proxyWebViewClientExtension.onMiscCallBack(str, bundle);
        }
    }

    public void onTranslateStart() {
        ProxyWebViewClientExtension proxyWebViewClientExtension = this.mWebViewClientExtension;
        if (proxyWebViewClientExtension != null) {
            proxyWebViewClientExtension.onMiscCallBack("onTranslateStart", new Bundle());
        }
        this.mWebView.setTranslateMode(true);
    }

    public boolean overlayHorizontalScrollbar() {
        int scrollBarStyle = this.mWebView.getScrollBarStyle();
        return scrollBarStyle == 0 || scrollBarStyle == 33554432;
    }

    public boolean overlayVerticalScrollbar() {
        return false;
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

    public void postVisualStateCallback(long j, WebView.VisualStateCallback visualStateCallback) {
    }

    public void postWebMessage(WebMessage webMessage, Uri uri) {
    }

    public void reload() {
        this.mWebView.reload();
    }

    public void removeDocumentStartJavaScript(int i) {
        this.mWebView.removeDocumentStartJavaScript(i);
    }

    public void removeJavascriptInterface(String str) {
        this.mWebView.removeJavascriptInterface(str);
    }

    public void replaceTranslatedString(Map<String, String> map) {
        this.mWebView.replaceTranslatedString(map);
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
        return this.mWebView.savePage(str, str2, i);
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return this.mWebView.saveState(bundle);
    }

    public void saveWebArchive(String str) {
        this.mWebView.saveWebArchive(str);
    }

    public void setBottomHeight(int i) {
        this.mWebView.setBottomHeight(i);
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        this.mWebView.setDownloadListener(downloadListener);
    }

    public void setFindListener(WebView.FindListener findListener) {
        this.mWebView.setFindListener(findListener);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.mWebView.setHorizontalScrollBarEnable(z);
    }

    public void setHorizontalScrollbarOverlay(boolean z) {
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        WebViewDatabase.getInstance(this.mWebView.getContext()).setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public void setInitialScale(int i) {
        this.mWebView.setInitialScale(i);
    }

    public void setJSExceptionListener(WebViewJSExceptionListener webViewJSExceptionListener) {
        this.jsExceptionListener = webViewJSExceptionListener;
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
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.mWebView.setVerticalScrollBarEnable(z);
    }

    public void setVerticalScrollbarOverlay(boolean z) {
    }

    public VideoControl setVideoJsCallback(VideoJsCallback videoJsCallback) {
        VideoNativeInterface videoNativeInterface = this.mXWebNativeInterface;
        if (videoNativeInterface != null && videoNativeInterface.setVideoJsCallback(videoJsCallback)) {
            return new VideoControl() {
                public boolean supportSetRequestedOrientationCallback() {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        return PinusWebView.this.mXWebNativeInterface.supportSetRequestedOrientationCallback();
                    }
                    return false;
                }

                public void videoChangeStatus() {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.videoChangeStatus();
                    }
                }

                public void videoExitFullscreen() {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.videoExitFullscreen();
                    }
                }

                public void videoMute(boolean z) {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.videoMute(z);
                    }
                }

                public void videoPause() {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.videoPause();
                    }
                }

                public void videoPlay() {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.videoPlay();
                    }
                }

                public void videoPlaybackRate(double d) {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.videoPlaybackRate(d);
                    }
                }

                public void videoSeek(double d) {
                    if (PinusWebView.this.mXWebNativeInterface != null) {
                        PinusWebView.this.mXWebNativeInterface.videoSeek(d);
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
        this.mWebView.setWebContentsSize(i, i2);
    }

    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
        this.mWebViewCallbackClient = webViewCallbackClient;
    }

    public void setWebViewClient(com.tencent.xweb.WebViewClient webViewClient) {
        this.mWebViewClientEx = webViewClient;
    }

    public void setWebViewClientExtension(ProxyWebViewClientExtension proxyWebViewClientExtension) {
        this.mWebViewClientExtension = proxyWebViewClientExtension;
        this.mWebView.setProxyWebViewClientExtension(this.mPinusProxyWebViewClientExtension);
    }

    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
    }

    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
    }

    public void setXWebKeyEventHandler(XWebKeyEventHandler xWebKeyEventHandler) {
        Object bridge = getBridge();
        PinusStandAloneChannel.getInstance().invokeRuntimeChannel(ConstValue.INVOKE_RUNTIME_ID_SET_INTERCEPT_DISPATCH_KEY_HANDLER, new Object[]{bridge, xWebKeyEventHandler});
    }

    public void smoothScroll(int i, int i2, long j) {
        this.mWebView.smoothScroll(i, i2, j);
    }

    public void stopLoading() {
        this.mWebView.stopLoading();
    }

    public boolean supportFeature(int i) {
        return PSCoreWrapper.getInstance().hasFeature(i);
    }

    public boolean supportSetWebContentsSize() {
        return supportFeature(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE);
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

    public class CustomPsWeb extends com.tencent.xweb.pinus.sdk.WebView {
        public CustomPsWeb(Context context) {
            super(context);
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (PinusWebView.this.mWebviewWraper != null) {
                PinusWebView.this.mWebviewWraper.onWebViewScrollChanged(i, i2, i3, i4);
            }
        }

        public CustomPsWeb(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        this.mWebView.saveWebArchive(str, z, valueCallback);
    }

    public void loadUrl(String str, Map<String, String> map) {
        this.mWebView.loadUrl(str, map);
    }

    public Bitmap captureBitmap() {
        XWebLog.m21911i(TAG, "captureBitmap, start");
        View childAt = ((ViewGroup) ((ViewGroup) this.mWebView.getChildAt(0)).getChildAt(0)).getChildAt(0);
        if (!(childAt instanceof TextureView)) {
            return null;
        }
        Bitmap bitmap = ((TextureView) childAt).getBitmap();
        XWebLog.m21911i(TAG, "captureBitmap, bitmap:" + bitmap);
        return bitmap;
    }
}
