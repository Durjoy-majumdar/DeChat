package com.tencent.xweb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassifier;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IDebugView;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.internal.ProxyWebViewClientExtension;
import com.tencent.xweb.report.KVReportForCrash;
import com.tencent.xweb.report.KVReportForWebView;
import com.tencent.xweb.report.KVReportForWebViewCore;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.CrashWatchDog;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebCoreInfo;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import k20.C60958c;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;

public class WebView extends FrameLayout implements IWebView {
    private static final String TAG = "WebView";
    public static final WebViewKind sDefaultWebViewKind = WebViewKind.WV_KIND_PINUS;
    private static boolean sIsWaitForInstallXWeb = false;
    private static final KVReportForWebViewCore sKVReportForWebViewCore = new KVReportForWebViewCore();
    private static WebViewKind sProcessWebViewKind = WebViewKind.WV_KIND_NONE;
    private static String sStrModule = "";
    private static boolean sXWebCoreInited = false;
    private byte _hellAccFlag_;
    private IDebugView mDebugPage;
    private boolean mHasDestroyed;
    private WebViewKind mInstanceWebViewKind;
    private final KVReportForWebView mKVReportForWebView;
    /* access modifiers changed from: private */
    public View.OnLongClickListener mOnLongClickListener;
    private IWebView mWebViewWrapper;

    public static class HitTestResult {
        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;
        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        private String mExtra;
        private int mType = 0;

        public String getExtra() {
            return this.mExtra;
        }

        public int getType() {
            return this.mType;
        }

        public void setExtra(String str) {
            this.mExtra = str;
        }

        public void setType(int i) {
            this.mType = i;
        }
    }

    public interface PreInitCallback {
        void onCoreInitFailed();

        void onCoreInitFinished();
    }

    public static class WebViewContextWrapper extends MutableContextWrapper {
        private IWebView bindedWebview;

        public WebViewContextWrapper(Context context) {
            super(context);
        }

        public void setBaseContext(Context context) {
            super.setBaseContext(context);
            XWebLog.m21911i(WebView.TAG, "setBaseContext, context:" + context + ", webViewType:" + WebView.getCurrentModuleWebCoreType());
            IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType());
            if (webViewProvider != null) {
                webViewProvider.execute(ConstValue.STR_CMD_BASE_CONTEXT_CHANGED, new Object[]{this.bindedWebview});
            }
        }

        public void setBindedWebview(IWebView iWebView) {
            this.bindedWebview = iWebView;
        }

        public void unbindService(ServiceConnection serviceConnection) {
            try {
                super.unbindService(serviceConnection);
            } catch (IllegalArgumentException e) {
                XWebLog.m21909e(WebView.TAG, "XWebContextWrapper unbindService IllegalArgumentException:" + e);
            }
        }
    }

    public static abstract class VisualStateCallback {
        public abstract void onComplete(long j);
    }

    public enum FullscreenVideoKind {
        NOT_HOOK,
        HOOK_NOT_EVALUTE_JS,
        HOOK_EVALUTE_JS
    }

    public class WebViewTransport {
        private WebView mWebview;

        public WebViewTransport() {
        }

        public synchronized WebView getWebView() {
            return this.mWebview;
        }

        public synchronized void setWebView(WebView webView) {
            this.mWebview = webView;
        }
    }

    public enum WebViewKind {
        WV_KIND_NONE,
        WV_KIND_CW,
        WV_KIND_X5,
        WV_KIND_SYS,
        WV_KIND_PINUS
    }

    public WebView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void clearClientCertPreferences(Runnable runnable) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(getCurrentModuleWebCoreType());
        if (webViewProvider != null) {
            webViewProvider.clearClientCertPreferences(runnable);
            return;
        }
        XWebLog.m21909e(TAG, "need init first clearClientCertPreferences error, getCurWebType:" + getCurrentModuleWebCoreType());
    }

    private void createWebView(WebViewKind webViewKind) {
        XWebLog.addInitializeLog(TAG, "createWebView start, prefer type:" + getCurrentModuleWebCoreType() + ", force type:" + webViewKind);
        XWalkEnvironment.init(getContext());
        WebViewKind webViewKind2 = this.mInstanceWebViewKind;
        WebViewKind webViewKind3 = WebViewKind.WV_KIND_NONE;
        if (webViewKind2 != webViewKind3) {
            this.mKVReportForWebView.setHasInitedWebView(true);
            XWebLog.addInitializeLog(TAG, "createWebView, already init, webview type:" + this.mInstanceWebViewKind);
            return;
        }
        if (XWebChildProcessMonitor.getShouldSwitchToSys()) {
            WebViewKind webViewKind4 = WebViewKind.WV_KIND_SYS;
            this.mInstanceWebViewKind = webViewKind4;
            this.mKVReportForWebView.setDowngradeReason("ChildProcessMonitor");
            XWebLog.addInitializeLog(TAG, "createWebView, XWebChildProcessMonitor force to use sys");
            tryInitWebViewCore(getContext(), webViewKind4);
        } else {
            WebViewKind webViewKind5 = WebViewKind.WV_KIND_SYS;
            if (webViewKind == webViewKind5) {
                this.mInstanceWebViewKind = webViewKind;
                this.mKVReportForWebView.setDowngradeReason("WebViewParam");
                XWebLog.addInitializeLog(TAG, "createWebView, force to use sys by webview param");
                tryInitWebViewCore(getContext(), webViewKind5);
            } else if (getCurrentModuleWebCoreType() == webViewKind3) {
                this.mKVReportForWebView.setHasInitedWebViewCore(false);
                WebViewKind preferedWebviewType = getPreferedWebviewType(initModuleNameBeforeInitWebViewCore());
                XWebLog.addInitializeLog(TAG, "createWebView, not init core, use prefer type:" + preferedWebviewType);
                if (preferedWebviewType != webViewKind3) {
                    this.mInstanceWebViewKind = preferedWebviewType;
                    if (tryInitWebViewCore(getContext(), this.mInstanceWebViewKind) && isXWebKernel()) {
                        sProcessWebViewKind = this.mInstanceWebViewKind;
                        XWebLog.m21911i(TAG, "createWebView, sProcessWebViewKind:" + sProcessWebViewKind);
                    }
                } else {
                    this.mKVReportForWebView.setDowngradeReason("NonePreferWebViewKind");
                    this.mInstanceWebViewKind = webViewKind5;
                    tryInitWebViewCore(getContext(), webViewKind5);
                }
            } else {
                this.mInstanceWebViewKind = getCurrentModuleWebCoreType();
            }
        }
        this.mKVReportForWebView.setModule(getModuleName());
        this.mKVReportForWebView.startCreatePreferredWebView(this.mInstanceWebViewKind.ordinal());
        XWebLog.addInitializeLog(TAG, "createWebView, try create webview type:" + this.mInstanceWebViewKind);
        IWebView webView = WebViewWrapperFactory.getWebView(this.mInstanceWebViewKind, this);
        this.mWebViewWrapper = webView;
        if (webView == null) {
            this.mKVReportForWebView.finishCreatePreferredWebView(2);
            this.mKVReportForWebView.startCreateOtherWebView();
            XWebLog.addInitializeLog(TAG, "createWebView failed, try other webview types");
            WebViewKind[] webViewKindList = getWebViewKindList();
            int i = 0;
            while (true) {
                if (i >= webViewKindList.length) {
                    break;
                }
                if (webViewKindList[i] != this.mInstanceWebViewKind && initWebviewCore(getContext(), webViewKindList[i], (PreInitCallback) null, false)) {
                    IWebView webView2 = WebViewWrapperFactory.getWebView(webViewKindList[i], this);
                    this.mWebViewWrapper = webView2;
                    if (webView2 != null) {
                        this.mInstanceWebViewKind = getCurrentModuleWebCoreType();
                        break;
                    }
                }
                i++;
            }
            if (this.mWebViewWrapper != null) {
                this.mKVReportForWebView.finishCreateOtherWebView(1, this.mInstanceWebViewKind.ordinal());
            } else {
                this.mKVReportForWebView.finishCreateOtherWebView(2, 0);
                XWebLog.m21909e(TAG, "createWebView failed finally");
                WXWebReporter.onCreateWebviewFailedFinally();
                throw new CreateWebViewException("create webview instance failed");
            }
        } else {
            this.mKVReportForWebView.finishCreatePreferredWebView(1);
        }
        this.mKVReportForWebView.startInitFinalWebView(this.mInstanceWebViewKind.ordinal());
        addView(this.mWebViewWrapper.getWebViewUI());
        XWebLog.m21911i(TAG, "createWebView success, webview type:" + this.mInstanceWebViewKind);
        this.mWebViewWrapper.getView().setOnLongClickListener(new View.OnLongClickListener() {
            private byte _hellAccFlag_;

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/xweb/WebView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                if (WebView.this.mOnLongClickListener != null) {
                    boolean onLongClick = WebView.this.mOnLongClickListener.onLongClick(WebView.this);
                    C117292a.m165362h(onLongClick, this, "com/tencent/xweb/WebView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return onLongClick;
                }
                C117292a.m165362h(false, this, "com/tencent/xweb/WebView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        });
        try {
            XWebLog.m21911i(TAG, "createWebView, xweb test mode:false");
            IDebugView iDebugView = (IDebugView) WebViewWrapperFactory.getXWebViewProvider().execute(ConstValue.STR_CMD_GET_DEBUG_VIEW, new Object[]{this});
            this.mDebugPage = iDebugView;
            iDebugView.syncConfig();
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "createWebView, create IDebugView failed, use dummy one, error", th);
            this.mDebugPage = new IDebugView() {
                public boolean onInterceptTestUrl(String str) {
                    return false;
                }

                public void syncConfig() {
                }
            };
        }
        if (isXWebKernel()) {
            Context context = getContext();
            if (context instanceof WebViewContextWrapper) {
                ((WebViewContextWrapper) context).setBindedWebview(this.mWebViewWrapper);
            }
        }
        String userAgentString = getSettings().getUserAgentString();
        WebSettings settings = getSettings();
        settings.setUserAgentString(userAgentString + " MMWEBID/" + XWebGrayValueUtil.getGrayValue());
        WebViewCounter.increase();
        this.mKVReportForWebView.finishInitFinalWebView();
    }

    public static String findAddress(String str) {
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(getCurrentModuleWebCoreType());
        if (webViewProvider != null) {
            return webViewProvider.findAddress(str);
        }
        XWebLog.m21909e(TAG, "need init first findAddress error, getCurWebType:" + getCurrentModuleWebCoreType());
        return "";
    }

    private List<TextureView> getAllTextureViews(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof TextureView) {
            arrayList.add((TextureView) view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.addAll(getAllTextureViews(viewGroup.getChildAt(i)));
            }
        }
        return arrayList;
    }

    public static WebViewKind getCurrentModuleWebCoreType() {
        return sProcessWebViewKind;
    }

    public static String getModuleName() {
        return sStrModule;
    }

    private static WebViewKind getPreferedWebviewType(String str) {
        return getPreferedWebviewType(sDefaultWebViewKind, str);
    }

    private static WebViewKind[] getWebViewKindList() {
        String[] split;
        String cmd = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_WEBVIEW_KIND_LIST, getModuleName());
        if (cmd == null || cmd.equalsIgnoreCase("") || (split = cmd.split(",")) == null || split.length <= 0) {
            return new WebViewKind[]{WebViewKind.WV_KIND_PINUS, WebViewKind.WV_KIND_SYS};
        }
        WebViewKind[] webViewKindArr = new WebViewKind[split.length];
        int i = 0;
        while (i < split.length) {
            WebViewKind convertWebType = CommandCfg.getInstance().convertWebType(split[i]);
            if (convertWebType != WebViewKind.WV_KIND_NONE) {
                webViewKindArr[i] = convertWebType;
                i++;
            } else {
                XWebLog.m21913w(TAG, "getWebViewKindList, error config:" + cmd);
                return new WebViewKind[0];
            }
        }
        XWebLog.m21911i(TAG, "getWebViewKindList:" + Arrays.toString(webViewKindArr));
        return webViewKindArr;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean hasInited() {
        if (getCurrentModuleWebCoreType() == WebViewKind.WV_KIND_NONE) {
            XWebLog.m21911i(TAG, "hasInited false, current webview type is NONE");
            return false;
        }
        IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(getCurrentModuleWebCoreType());
        if (webViewProvider != null) {
            return webViewProvider.hasInitedWebViewCore();
        }
        XWebLog.m21911i(TAG, "hasInited false, current webview provider is null");
        return false;
    }

    private static String initModuleName(String str) {
        if (str == null || str.isEmpty()) {
            str = XWalkEnvironment.MODULE_TOOLS;
        }
        sStrModule = str;
        WXWebReporter.setCurrentModule(str);
        return str;
    }

    private String initModuleNameBeforeInitWebViewCore() {
        return initModuleName(XWalkEnvironment.getSafeModuleName(XWalkEnvironment.MODULE_TOOLS));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        return;
     */
    @com.tencent.xweb.DeprecatedOutsideXWebSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void initWebviewCore(android.content.Context r7, com.tencent.xweb.WebView.WebViewKind r8, java.lang.String r9, com.tencent.xweb.WebView.PreInitCallback r10) {
        /*
            java.lang.Class<com.tencent.xweb.WebView> r0 = com.tencent.xweb.WebView.class
            monitor-enter(r0)
            java.lang.String r1 = "WebView"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r2.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "initWebviewCore start, kind:"
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            r2.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = ", module:"
            r2.append(r3)     // Catch:{ all -> 0x00fa }
            r2.append(r9)     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.WebView$WebViewKind r1 = sProcessWebViewKind     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.WebView$WebViewKind r2 = com.tencent.xweb.WebView.WebViewKind.WV_KIND_NONE     // Catch:{ all -> 0x00fa }
            if (r1 == r2) goto L_0x006e
            com.tencent.xweb.WebView$WebViewKind r7 = sProcessWebViewKind     // Catch:{ all -> 0x00fa }
            if (r7 == r8) goto L_0x0051
            java.lang.String r7 = "WebView"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r9.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "initWebviewCore, set invalid webview kind:"
            r9.append(r1)     // Catch:{ all -> 0x00fa }
            r9.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r8 = ", expected:"
            r9.append(r8)     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.WebView$WebViewKind r8 = sProcessWebViewKind     // Catch:{ all -> 0x00fa }
            r9.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r7, r8)     // Catch:{ all -> 0x00fa }
            if (r10 == 0) goto L_0x006c
            r10.onCoreInitFailed()     // Catch:{ all -> 0x00fa }
            goto L_0x006c
        L_0x0051:
            java.lang.String r7 = "WebView"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r9.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "initWebviewCore, already init webview kind:"
            r9.append(r1)     // Catch:{ all -> 0x00fa }
            r9.append(r8)     // Catch:{ all -> 0x00fa }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r7, r8)     // Catch:{ all -> 0x00fa }
            if (r10 == 0) goto L_0x006c
            r10.onCoreInitFinished()     // Catch:{ all -> 0x00fa }
        L_0x006c:
            monitor-exit(r0)
            return
        L_0x006e:
            com.tencent.xweb.report.KVReportForWebViewCore r1 = sKVReportForWebViewCore     // Catch:{ all -> 0x00fa }
            r1.startInitWebViewCore()     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = initModuleName(r9)     // Catch:{ all -> 0x00fa }
            org.xwalk.core.XWalkEnvironment.init(r7)     // Catch:{ all -> 0x00fa }
            int r2 = org.xwalk.core.XWalkEnvironment.getAvailableVersion()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "WebView"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r4.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r5 = "initWebviewCore, availableVersion:"
            r4.append(r5)     // Catch:{ all -> 0x00fa }
            r4.append(r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r3, r4)     // Catch:{ all -> 0x00fa }
            if (r2 > 0) goto L_0x009a
            com.tencent.xweb.WCWebUpdater.tryEmbedInstall()     // Catch:{ all -> 0x00fa }
            goto L_0x00b9
        L_0x009a:
            int r3 = com.tencent.xweb.util.WebViewWrapperFactory.getEmbedCoreVersion()     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "WebView"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r5.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = "initWebviewCore, embedVersion:"
            r5.append(r6)     // Catch:{ all -> 0x00fa }
            r5.append(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r4, r5)     // Catch:{ all -> 0x00fa }
            if (r2 >= r3) goto L_0x00b9
            com.tencent.xweb.WCWebUpdater.tryEmbedInstall()     // Catch:{ all -> 0x00fa }
        L_0x00b9:
            com.tencent.xweb.WebView$WebViewKind r8 = getPreferedWebviewType(r8, r9)     // Catch:{ all -> 0x00fa }
            r2 = 1
            boolean r7 = initWebviewCore((android.content.Context) r7, (com.tencent.xweb.WebView.WebViewKind) r8, (com.tencent.xweb.WebView.PreInitCallback) r10, (boolean) r2)     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.WebView$WebViewKind r8 = sProcessWebViewKind     // Catch:{ all -> 0x00fa }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x00fa }
            r1.finishInitWebViewCore(r7, r8, r9)     // Catch:{ all -> 0x00fa }
            java.lang.String r7 = "WebView"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r8.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = "###### initWebviewCore costTime:"
            r8.append(r9)     // Catch:{ all -> 0x00fa }
            long r9 = r1.getInitWebViewCoreCostTime()     // Catch:{ all -> 0x00fa }
            r8.append(r9)     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = ", stack:"
            r8.append(r9)     // Catch:{ all -> 0x00fa }
            java.lang.Throwable r9 = new java.lang.Throwable     // Catch:{ all -> 0x00fa }
            java.lang.String r10 = "please ignore this exception"
            r9.<init>(r10)     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)     // Catch:{ all -> 0x00fa }
            r8.append(r9)     // Catch:{ all -> 0x00fa }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00fa }
            com.tencent.xweb.util.XWebLog.m21913w(r7, r8)     // Catch:{ all -> 0x00fa }
            monitor-exit(r0)
            return
        L_0x00fa:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.WebView.initWebviewCore(android.content.Context, com.tencent.xweb.WebView$WebViewKind, java.lang.String, com.tencent.xweb.WebView$PreInitCallback):void");
    }

    public static boolean isPinus() {
        return sProcessWebViewKind == WebViewKind.WV_KIND_PINUS;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isSys() {
        return sProcessWebViewKind == WebViewKind.WV_KIND_SYS;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isXWeb() {
        return sProcessWebViewKind == WebViewKind.WV_KIND_PINUS;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isXWebCoreInited() {
        return sXWebCoreInited;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean needRebootProcess() {
        if (sIsWaitForInstallXWeb && XWebCoreInfo.getInstalledNewestVersionForCurAbi(XWalkEnvironment.getApplicationContext()) > 0) {
            XWebLog.m21911i(TAG, "needRebootProcess, true because of has installed xweb core");
            return true;
        } else if (!isXWeb() || XWalkEnvironment.getAvailableVersion() <= 0 || XWalkEnvironment.getInstalledNewstVersionForCurAbi() <= XWalkEnvironment.getAvailableVersion()) {
            return false;
        } else {
            XWebLog.m21911i(TAG, "needRebootProcess, true because of has newer xweb version");
            return true;
        }
    }

    public static void onXWebCoreInited() {
        sXWebCoreInited = true;
    }

    private static void reinitToPinus() {
        XWebLog.addInitializeLog(TAG, "reinitToPinus");
        sProcessWebViewKind = WebViewKind.WV_KIND_NONE;
        XWalkEnvironment.refreshVersionInfo();
        initWebviewCore(XWalkEnvironment.getApplicationContext(), WebViewKind.WV_KIND_PINUS, sStrModule, (PreInitCallback) null);
        WXWebReporter.idkeyReport(1749, 66, 1);
    }

    public static void reinitToXWeb() {
        WebViewKind webViewKindFromInstalledNewstVersion = XWalkEnvironment.getWebViewKindFromInstalledNewstVersion(XWalkEnvironment.getApplicationContext());
        XWebLog.addInitializeLog(TAG, "reinitToXWeb, webViewKind:" + webViewKindFromInstalledNewstVersion);
        if (webViewKindFromInstalledNewstVersion == WebViewKind.WV_KIND_PINUS) {
            reinitToPinus();
        }
    }

    private static Context replaceContextWrapperForWebViewConstructorIfNeed(Context context) {
        return context instanceof MutableContextWrapper ? new WebViewContextWrapper(((MutableContextWrapper) context).getBaseContext()) : context;
    }

    private static boolean tryInitWebViewCore(Context context, WebViewKind webViewKind) {
        boolean z;
        WebViewKind webViewKindFromAvailableVersion;
        XWebLog.addInitializeLog(TAG, "tryInitWebViewCore start, type:" + webViewKind);
        if ((webViewKind == WebViewKind.WV_KIND_CW || webViewKind == WebViewKind.WV_KIND_PINUS) && (webViewKindFromAvailableVersion = XWalkEnvironment.getWebViewKindFromAvailableVersion()) != WebViewKind.WV_KIND_NONE && webViewKind != webViewKindFromAvailableVersion) {
            XWebLog.addInitializeLog(TAG, "tryInitWebViewCore, type:" + webViewKind + ", but actual type:" + webViewKindFromAvailableVersion);
            return false;
        } else if (CrashWatchDog.hasRecentCrash(webViewKind)) {
            XWebLog.addInitializeLog(TAG, "tryInitWebViewCore, has recent crash");
            WXWebReporter.onJustCrashed(webViewKind);
            return false;
        } else {
            CrashWatchDog instance = CrashWatchDog.getInstance(CrashWatchDog.SCENE_LOAD_CORE, webViewKind);
            instance.logStart();
            CrashWatchDog instanceForCurModule = CrashWatchDog.getInstanceForCurModule(CrashWatchDog.SCENE_LOAD_CORE, webViewKind);
            instanceForCurModule.logStart();
            try {
                IWebViewProvider webViewProvider = WebViewWrapperFactory.getWebViewProvider(webViewKind);
                if (webViewProvider != null) {
                    z = webViewProvider.initWebviewCore(context, (PreInitCallback) null);
                    if (z) {
                        XWebLog.addInitializeLog(TAG, "tryInitWebViewCore success");
                        CookieManager.getInstance().setCookieManagerWrapper(webViewProvider.getCookieManager());
                        WXWebReporter.onWebviewCoreUsed(webViewKind);
                        instance.logFinished();
                        instanceForCurModule.logFinished();
                        return z;
                    }
                } else {
                    z = false;
                }
                XWebLog.addInitializeLog(TAG, "tryInitWebViewCore failed");
                return z;
            } catch (Throwable th) {
                WXWebReporter.onInitCoreFailed(webViewKind);
                String stackTraceString = Log.getStackTraceString(th);
                XWebLog.addInitializeLog(TAG, "tryInitWebViewCore failed, type:" + webViewKind + ", error:" + stackTraceString);
                KVReportForCrash.report(1, stackTraceString, webViewKind.ordinal());
                return false;
            }
        }
    }

    public int addDocumentStartJavaScript(String str, String[] strArr) {
        return this.mWebViewWrapper.addDocumentStartJavaScript(str, strArr);
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.mWebViewWrapper.addJavascriptInterface(obj, str);
    }

    public boolean canGoBack() {
        return this.mWebViewWrapper.canGoBack();
    }

    public boolean canGoBackOrForward(int i) {
        return this.mWebViewWrapper.canGoBackOrForward(i);
    }

    public boolean canGoForward() {
        return this.mWebViewWrapper.canGoForward();
    }

    @Deprecated
    public boolean canZoomIn() {
        return false;
    }

    @Deprecated
    public boolean canZoomOut() {
        return false;
    }

    public void captureBitmap(IWebView.ICaptureBitmapCallback iCaptureBitmapCallback) {
        this.mWebViewWrapper.captureBitmap(iCaptureBitmapCallback);
    }

    @Deprecated
    public Picture capturePicture() {
        return null;
    }

    public void clearCache(boolean z) {
        this.mWebViewWrapper.clearCache(z);
    }

    public void clearHistory() {
        this.mWebViewWrapper.clearHistory();
    }

    public void clearMatches() {
        this.mWebViewWrapper.clearMatches();
    }

    public void clearSslPreferences() {
        this.mWebViewWrapper.clearSslPreferences();
    }

    public void clearView() {
        this.mWebViewWrapper.clearView();
    }

    public WebBackForwardList copyBackForwardList() {
        return this.mWebViewWrapper.copyBackForwardList();
    }

    @Deprecated
    public PrintDocumentAdapter createPrintDocumentAdapter() {
        return null;
    }

    public PrintDocumentAdapter createPrintDocumentAdapter(String str) {
        return this.mWebViewWrapper.createPrintDocumentAdapter(str);
    }

    public WebMessagePort[] createWebMessageChannel() {
        return this.mWebViewWrapper.createWebMessageChannel();
    }

    public void destroy() {
        Context context = getContext();
        if (context instanceof WebViewContextWrapper) {
            ((WebViewContextWrapper) context).setBindedWebview((IWebView) null);
        }
        this.mWebViewWrapper.destroy();
        if (!this.mHasDestroyed) {
            this.mHasDestroyed = true;
            WebViewCounter.decrease();
        }
    }

    public void disablePlatformNotifications() {
        this.mWebViewWrapper.disablePlatformNotifications();
    }

    public void disableVideoJsCallback(boolean z) {
        this.mWebViewWrapper.disableVideoJsCallback(z);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void documentHasImages(Message message) {
        this.mWebViewWrapper.documentHasImages(message);
    }

    public void drawCanvas(Canvas canvas) {
        if (isXWebKernel()) {
            canvas.drawBitmap(getBitmap(), 0.0f, 0.0f, (Paint) null);
        } else {
            draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void enablePlatformNotifications() {
        this.mWebViewWrapper.enablePlatformNotifications();
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.mWebViewWrapper.evaluateJavascript(str, valueCallback);
    }

    @Deprecated
    public int findAll(String str) {
        findAllAsync(str);
        return 0;
    }

    public void findAllAsync(String str) {
        this.mWebViewWrapper.findAllAsync(str);
    }

    public void findNext(boolean z) {
        this.mWebViewWrapper.findNext(z);
    }

    public void flingScroll(int i, int i2) {
        this.mWebViewWrapper.flingScroll(i, i2);
    }

    public String getAbstractInfo() {
        return this.mWebViewWrapper.getAbstractInfo();
    }

    public Bitmap getBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        if (createBitmap != null) {
            createBitmap.eraseColor(-1);
            Canvas canvas = new Canvas(createBitmap);
            if (isXWebKernel()) {
                try {
                    Paint paint = new Paint();
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                    for (TextureView bitmap : getAllTextureViews(this)) {
                        Bitmap bitmap2 = bitmap.getBitmap();
                        if (bitmap2 != null) {
                            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                        } else {
                            XWebLog.m21909e(TAG, "getBitmap, textureViewBitmap = null");
                        }
                    }
                    Bitmap createBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    getTopView().draw(new Canvas(createBitmap2));
                    canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                } catch (Throwable th) {
                    XWebLog.m21910e(TAG, "getBitmap, error", th);
                }
            } else {
                draw(canvas);
            }
        }
        return createBitmap;
    }

    public SslCertificate getCertificate() {
        return this.mWebViewWrapper.getCertificate();
    }

    public int getContentHeight() {
        return this.mWebViewWrapper.getContentHeight();
    }

    public ICookieManager getCookieManager() {
        return null;
    }

    public WebViewKind getCurrentInstanceWebCoreType() {
        return this.mInstanceWebViewKind;
    }

    public Bitmap getFavicon() {
        return this.mWebViewWrapper.getFavicon();
    }

    public FullscreenVideoKind getFullscreenVideoKind() {
        return this.mWebViewWrapper.getFullscreenVideoKind();
    }

    public HitTestResult getHitTestResult() {
        return this.mWebViewWrapper.getHitTestResult();
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return this.mWebViewWrapper.getHttpAuthUsernamePassword(str, str2);
    }

    public boolean getImageBitmapToFile(String str, String str2, String str3, GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback) {
        return this.mWebViewWrapper.getImageBitmapToFile(str, str2, str3, getImageBitmapToFileFinishedCallback);
    }

    public String getOriginalUrl() {
        return this.mWebViewWrapper.getOriginalUrl();
    }

    public int getProgress() {
        return this.mWebViewWrapper.getProgress();
    }

    public float getScale() {
        return this.mWebViewWrapper.getScale();
    }

    public int getScrollHeight() {
        return this.mWebViewWrapper.getScrollHeight();
    }

    public WebSettings getSettings() {
        return this.mWebViewWrapper.getSettings();
    }

    public TextClassifier getTextClassifier() {
        return this.mWebViewWrapper.getTextClassifier();
    }

    public String getTitle() {
        return this.mWebViewWrapper.getTitle();
    }

    public ViewGroup getTopView() {
        return this.mWebViewWrapper.getTopView();
    }

    public String getUrl() {
        return this.mWebViewWrapper.getUrl();
    }

    public String getVersionInfo() {
        return this.mWebViewWrapper.getVersionInfo();
    }

    public View getView() {
        return this.mWebViewWrapper.getView();
    }

    public int getVisibleTitleHeight() {
        return this.mWebViewWrapper.getVisibleTitleHeight();
    }

    public WebChromeClient getWebChromeClient() {
        return this.mWebViewWrapper.getWebChromeClient();
    }

    public int getWebScrollX() {
        return this.mWebViewWrapper.getWebScrollX();
    }

    public int getWebScrollY() {
        return this.mWebViewWrapper.getWebScrollY();
    }

    public WebViewCallbackClient getWebViewCallbackClient() {
        return this.mWebViewWrapper.getWebViewCallbackClient();
    }

    public WebViewClient getWebViewClient() {
        return this.mWebViewWrapper.getWebViewClient();
    }

    public Looper getWebViewLooper() {
        return this.mWebViewWrapper.getWebViewLooper();
    }

    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return this.mWebViewWrapper.getWebViewRenderProcessClient();
    }

    public View getWebViewUI() {
        return this.mWebViewWrapper.getWebViewUI();
    }

    public void goBack() {
        this.mWebViewWrapper.goBack();
    }

    public void goBackOrForward(int i) {
        this.mWebViewWrapper.goBackOrForward(i);
    }

    public void goForward() {
        this.mWebViewWrapper.goForward();
    }

    public boolean hasEnteredFullscreen() {
        return this.mWebViewWrapper.hasEnteredFullscreen();
    }

    public Bundle invokeMiscMethod(String str, Bundle bundle) {
        return this.mWebViewWrapper.invokeMiscMethod(str, bundle);
    }

    public boolean isOverScrollStart() {
        return this.mWebViewWrapper.isOverScrollStart();
    }

    public boolean isSysKernel() {
        return this.mInstanceWebViewKind == WebViewKind.WV_KIND_SYS;
    }

    @Deprecated
    public boolean isXWalkKernel() {
        return this.mInstanceWebViewKind == WebViewKind.WV_KIND_PINUS;
    }

    public boolean isXWebKernel() {
        return this.mInstanceWebViewKind == WebViewKind.WV_KIND_PINUS;
    }

    public void leaveFullscreen() {
        this.mWebViewWrapper.leaveFullscreen();
    }

    public void loadData(String str, String str2, String str3) {
        this.mWebViewWrapper.loadData(str, str2, str3);
        WXWebReporter.reportPVNew(str, this);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.mWebViewWrapper.loadDataWithBaseURL(str, str2, str3, str4, str5);
        WXWebReporter.reportPVNew(str, this);
    }

    public void loadUrl(String str, Map<String, String> map) {
        if (this.mDebugPage.onInterceptTestUrl(str)) {
            this.mWebViewWrapper.loadUrl("http://weixin.qq.com/");
            return;
        }
        HashMap hashMap = null;
        if (map != null) {
            synchronized (map) {
                hashMap = new HashMap();
                hashMap.putAll(map);
            }
        }
        this.mWebViewWrapper.loadUrl(str, hashMap);
        WXWebReporter.reportPVNew(str, this);
    }

    public void onHide() {
        this.mWebViewWrapper.onHide();
    }

    public void onPause() {
        this.mWebViewWrapper.onPause();
    }

    public void onResume() {
        this.mWebViewWrapper.onResume();
    }

    public void onShow() {
        this.mWebViewWrapper.onShow();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        IWebView iWebView = this.mWebViewWrapper;
        if (iWebView != null) {
            View view2 = iWebView.getView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/xweb/WebView", "onVisibilityChanged", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/xweb/WebView", "onVisibilityChanged", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onWebViewScrollChanged(int i, int i2, int i3, int i4) {
    }

    public boolean overlayHorizontalScrollbar() {
        return this.mWebViewWrapper.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.mWebViewWrapper.overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean z) {
        return this.mWebViewWrapper.pageDown(z);
    }

    public boolean pageUp(boolean z) {
        return this.mWebViewWrapper.pageUp(z);
    }

    public void pauseTimers() {
        this.mWebViewWrapper.pauseTimers();
    }

    public void postUrl(String str, byte[] bArr) {
        this.mWebViewWrapper.postUrl(str, bArr);
    }

    public void postVisualStateCallback(long j, VisualStateCallback visualStateCallback) {
        this.mWebViewWrapper.postVisualStateCallback(j, visualStateCallback);
    }

    public void postWebMessage(WebMessage webMessage, Uri uri) {
        this.mWebViewWrapper.postWebMessage(webMessage, uri);
    }

    public void reload() {
        this.mWebViewWrapper.reload();
    }

    public void removeDocumentStartJavaScript(int i) {
        this.mWebViewWrapper.removeDocumentStartJavaScript(i);
    }

    public void removeJavascriptInterface(String str) {
        this.mWebViewWrapper.removeJavascriptInterface(str);
    }

    public void requestFocusNodeHref(Message message) {
        this.mWebViewWrapper.requestFocusNodeHref(message);
    }

    public void requestImageRef(Message message) {
        this.mWebViewWrapper.requestImageRef(message);
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        return this.mWebViewWrapper.restoreState(bundle);
    }

    public void resumeTimers() {
        this.mWebViewWrapper.resumeTimers();
    }

    public boolean savePage(String str, String str2, int i) {
        return this.mWebViewWrapper.savePage(str, str2, i);
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return this.mWebViewWrapper.saveState(bundle);
    }

    public void saveWebArchive(String str) {
        this.mWebViewWrapper.saveWebArchive(str);
    }

    public void setBackgroundColor(int i) {
        XWebLog.m21911i(TAG, "setBackgroundColor, color:" + Integer.toHexString(i));
        super.setBackgroundColor(i);
        IWebView iWebView = this.mWebViewWrapper;
        if (iWebView != null) {
            iWebView.getWebViewUI().setBackgroundColor(i);
        }
    }

    public void setBottomHeight(int i) {
        this.mWebViewWrapper.setBottomHeight(i);
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        this.mWebViewWrapper.setDownloadListener(downloadListener);
    }

    public void setFindListener(WebView.FindListener findListener) {
        this.mWebViewWrapper.setFindListener(findListener);
    }

    public void setFocusable(boolean z) {
        if (!z) {
            setDescendantFocusability(393216);
            super.setFocusable(false);
            return;
        }
        setDescendantFocusability(131072);
        super.setFocusable(false);
    }

    public void setFocusableInTouchMode(boolean z) {
        if (!z) {
            setDescendantFocusability(393216);
            super.setFocusableInTouchMode(false);
            return;
        }
        setDescendantFocusability(131072);
        super.setFocusableInTouchMode(false);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        this.mWebViewWrapper.setHorizontalScrollBarEnabled(z);
    }

    public void setHorizontalScrollbarOverlay(boolean z) {
        this.mWebViewWrapper.setHorizontalScrollbarOverlay(z);
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        this.mWebViewWrapper.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }

    public void setInitialScale(int i) {
        this.mWebViewWrapper.setInitialScale(i);
    }

    public void setJSExceptionListener(WebViewJSExceptionListener webViewJSExceptionListener) {
        this.mWebViewWrapper.setJSExceptionListener(webViewJSExceptionListener);
    }

    public void setNetworkAvailable(boolean z) {
        this.mWebViewWrapper.setNetworkAvailable(z);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mOnLongClickListener = onLongClickListener;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.mWebViewWrapper.getWebViewUI().setOnTouchListener(onTouchListener);
    }

    @Deprecated
    public void setPictureListener(WebView.PictureListener pictureListener) {
        this.mWebViewWrapper.setPictureListener(pictureListener);
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.mWebViewWrapper.setTextClassifier(textClassifier);
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.mWebViewWrapper.setVerticalScrollBarEnabled(z);
    }

    public void setVerticalScrollbarOverlay(boolean z) {
        this.mWebViewWrapper.setVerticalScrollbarOverlay(z);
    }

    public VideoControl setVideoJsCallback(VideoJsCallback videoJsCallback) {
        return this.mWebViewWrapper.setVideoJsCallback(videoJsCallback);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.mWebViewWrapper.setWebChromeClient(webChromeClient);
    }

    public void setWebContentsSize(int i, int i2) {
        this.mWebViewWrapper.setWebContentsSize(i, i2);
    }

    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
        this.mWebViewWrapper.setWebViewCallbackClient(webViewCallbackClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.mWebViewWrapper.setWebViewClient(webViewClient);
    }

    public void setWebViewClientExtension(ProxyWebViewClientExtension proxyWebViewClientExtension) {
        this.mWebViewWrapper.setWebViewClientExtension(proxyWebViewClientExtension);
    }

    public void setWebViewRenderProcessClient(Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mWebViewWrapper.setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
    }

    public void setXWebKeyEventHandler(XWebKeyEventHandler xWebKeyEventHandler) {
        this.mWebViewWrapper.setXWebKeyEventHandler(xWebKeyEventHandler);
    }

    public void smoothScroll(int i, int i2, long j) {
        this.mWebViewWrapper.smoothScroll(i, i2, j);
    }

    public void stopLoading() {
        this.mWebViewWrapper.stopLoading();
    }

    public boolean supportFeature(int i) {
        return this.mWebViewWrapper.supportFeature(i);
    }

    public boolean supportSetWebContentsSize() {
        return this.mWebViewWrapper.supportSetWebContentsSize();
    }

    public void zoomBy(float f) {
        this.mWebViewWrapper.zoomBy(f);
    }

    public boolean zoomIn() {
        return this.mWebViewWrapper.zoomIn();
    }

    public boolean zoomOut() {
        return this.mWebViewWrapper.zoomOut();
    }

    public WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static WebViewKind getPreferedWebviewType(WebViewKind webViewKind, String str) {
        XWebLog.addInitializeLog(TAG, "getPreferedWebviewType start, kind:" + webViewKind + ", module:" + str);
        WebViewKind webViewKind2 = sProcessWebViewKind;
        WebViewKind webViewKind3 = WebViewKind.WV_KIND_NONE;
        if (webViewKind2 != webViewKind3) {
            XWebLog.addInitializeLog(TAG, "getPreferedWebviewType end, already get webview type:" + sProcessWebViewKind);
            return sProcessWebViewKind;
        } else if (AbiUtil.isIaDevice()) {
            XWebLog.addInitializeLog(TAG, "getPreferedWebviewType end, x86 device, use sys");
            WXWebReporter.idkeyReport(69, 1);
            return WebViewKind.WV_KIND_SYS;
        } else {
            WebViewKind webViewKind4 = WebDebugCfg.getInst().getWebViewKind(str);
            if (webViewKind4 != webViewKind3) {
                XWebLog.addInitializeLog(TAG, "use hard code webview type:" + webViewKind4);
                webViewKind = webViewKind4;
            } else if (XWalkEnvironment.getBuildConfigForceXWebCore()) {
                webViewKind = sDefaultWebViewKind;
                XWebLog.addInitializeLog(TAG, "use compile config force to xweb");
            } else if (CommandCfg.getInstance().getWebKind(str) != webViewKind3) {
                webViewKind = CommandCfg.getInstance().getWebKind(str);
                XWebLog.addInitializeLog(TAG, "use cmd config webview type:" + webViewKind);
            }
            WXWebReporter.setMostPrefferdCore(webViewKind);
            if ((webViewKind == WebViewKind.WV_KIND_CW || webViewKind == WebViewKind.WV_KIND_PINUS) && !XWalkEnvironment.hasAvailableVersion()) {
                webViewKind = WebViewKind.WV_KIND_SYS;
                sIsWaitForInstallXWeb = true;
                XWebLog.addInitializeLog(TAG, "xweb is not available, use sys");
            }
            XWebLog.addInitializeLog(TAG, "getPreferedWebviewType end, final webview type:" + webViewKind);
            return webViewKind;
        }
    }

    public Bitmap captureBitmap() {
        return this.mWebViewWrapper.captureBitmap();
    }

    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        this.mWebViewWrapper.saveWebArchive(str, z, valueCallback);
    }

    public void setWebViewRenderProcessClient(WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mWebViewWrapper.setWebViewRenderProcessClient((Executor) null, webViewRenderProcessClient);
    }

    public WebView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, WebViewKind.WV_KIND_NONE);
    }

    public WebView(Context context, AttributeSet attributeSet, int i, WebViewKind webViewKind) {
        super(replaceContextWrapperForWebViewConstructorIfNeed(context), attributeSet, i);
        this.mInstanceWebViewKind = WebViewKind.WV_KIND_NONE;
        this.mHasDestroyed = false;
        KVReportForWebView kVReportForWebView = new KVReportForWebView();
        this.mKVReportForWebView = kVReportForWebView;
        kVReportForWebView.startCreateWebView();
        createWebView(webViewKind);
        kVReportForWebView.finishCreateWebView(1);
        XWebLog.m21913w(TAG, "###### createWebView costTime:" + kVReportForWebView.getCreateWebViewCostTime() + ", stack:" + Log.getStackTraceString(new Throwable("please ignore this exception")));
    }

    public void loadUrl(String str) {
        if (this.mDebugPage.onInterceptTestUrl(str)) {
            this.mWebViewWrapper.loadUrl("http://weixin.qq.com/");
            return;
        }
        this.mWebViewWrapper.loadUrl(str);
        WXWebReporter.reportPVNew(str, this);
    }

    public static synchronized boolean initWebviewCore(Context context, WebViewKind webViewKind, PreInitCallback preInitCallback, boolean z) {
        synchronized (WebView.class) {
            XWebLog.addInitializeLog(TAG, "initWebviewCore, kind:" + webViewKind + ", bTryOtherWebtype:" + z);
            boolean tryInitWebViewCore = tryInitWebViewCore(context, webViewKind);
            if (!tryInitWebViewCore && z) {
                XWebLog.m21913w(TAG, "initWebviewCore failed, type:" + webViewKind + ", try other webview types");
                WebViewKind[] webViewKindList = getWebViewKindList();
                int i = 0;
                while (true) {
                    if (i >= webViewKindList.length) {
                        break;
                    }
                    WebViewKind webViewKind2 = webViewKindList[i];
                    if (webViewKind2 != webViewKind) {
                        tryInitWebViewCore = tryInitWebViewCore(context, webViewKind2);
                        if (tryInitWebViewCore) {
                            sProcessWebViewKind = webViewKindList[i];
                            break;
                        }
                    }
                    i++;
                }
            } else if (tryInitWebViewCore) {
                sProcessWebViewKind = webViewKind;
            }
            if (!tryInitWebViewCore) {
                XWebLog.m21909e(TAG, "initWebviewCore failed finally");
                if (preInitCallback != null) {
                    preInitCallback.onCoreInitFailed();
                }
                WXWebReporter.onInitCoreFailedFinally();
                return false;
            }
            if (preInitCallback != null) {
                preInitCallback.onCoreInitFinished();
            }
            XWebLog.addInitializeLog(TAG, "initWebviewCore success, type:" + sProcessWebViewKind + ", sdkVer:" + XWebSdk.getXWebSdkVersion() + ", apkVer:" + XWalkEnvironment.getAvailableVersion());
            return true;
        }
    }
}
