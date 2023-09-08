package com.tencent.xweb.pinus;

import android.content.Context;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebViewProvider;
import com.tencent.xweb.XWebWebViewDatabase;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.internal.IWebView;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.internal.IWebViewDatabase;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class PinusWebFactory extends XWebViewProvider {
    private static final String TAG = "PinusWebFactory";
    private boolean mHasInitedWebViewCore;

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static final PinusWebFactory sInstance = new PinusWebFactory();

        private SingletonHolder() {
        }
    }

    public static PinusWebFactory getInstance() {
        return SingletonHolder.sInstance;
    }

    private boolean initWebViewCoreInternal() {
        if (this.mHasInitedWebViewCore) {
            return true;
        }
        XWebLog.m21911i(TAG, "initWebViewCoreInternal start");
        PSInitializerWrapper.getInstance().initWebViewCore();
        if (PSInitializerWrapper.getInstance().isWebViewCoreReady()) {
            XWebLog.m21911i(TAG, "initWebViewCoreInternal finished");
            this.mHasInitedWebViewCore = true;
        } else {
            XWebLog.m21911i(TAG, "initWebViewCoreInternal failed, pinus is not available");
        }
        return this.mHasInitedWebViewCore;
    }

    public void clearAllWebViewCache(Context context, boolean z) {
        ICookieManager cookieManager;
        if (WebView.getCurrentModuleWebCoreType() != WebView.WebViewKind.WV_KIND_PINUS) {
            XWebLog.m21913w(TAG, "clearAllWebViewCache, not pinus");
            return;
        }
        try {
            if (XWalkEnvironment.getAvailableVersion() <= 0) {
                XWebLog.m21913w(TAG, "clearAllWebViewCache, no available version");
                return;
            }
            com.tencent.xweb.pinus.sdk.WebView webView = new com.tencent.xweb.pinus.sdk.WebView(new PSContextWrapper(XWalkEnvironment.getApplicationContext(), XWalkEnvironment.getAvailableVersion()));
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.clearCache(true);
            if (z && (cookieManager = getCookieManager()) != null) {
                cookieManager.removeAllCookie();
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "clearAllWebViewCache, error", th);
        }
    }

    public void clearClientCertPreferences(Runnable runnable) {
        PinusWebView.clearClientCertPreferences(runnable);
    }

    public IWebView createWebView(WebView webView) {
        if (!initWebViewCoreInternal()) {
            return null;
        }
        XWebLog.m21911i(TAG, "createWebView, PinusWebView is available");
        return new PinusWebView(webView);
    }

    public String findAddress(String str) {
        return PinusWebView.findAddress(str);
    }

    public ICookieManager getCookieManager() {
        return new PinusCookieManagerWrapper();
    }

    public IWebViewContextWrapper getWebViewContextWrapper() {
        return PSInitializerWrapper.getInstance().getWebViewContextWrapper();
    }

    public IWebViewCoreWrapper getWebViewCoreWrapper() {
        return PSCoreWrapper.getInstance();
    }

    public IWebViewDatabase getWebViewDatabase(Context context) {
        return new XWebWebViewDatabase(context);
    }

    public IWebStorage getWebviewStorage() {
        return new PinusStorage();
    }

    public Object handleBaseContextChanged(Object[] objArr) {
        PinusWebView pinusWebView;
        Object bridge;
        if (objArr != null && objArr.length >= 1) {
            PinusWebView pinusWebView2 = objArr[0];
            if (pinusWebView2 instanceof PinusWebView) {
                pinusWebView = pinusWebView2;
                if (!(pinusWebView == null || PSCoreWrapper.getInstance() == null || (bridge = pinusWebView.getBridge()) == null)) {
                    invokeRuntimeChannel(80001, new Object[]{bridge});
                }
                return null;
            }
        }
        pinusWebView = null;
        invokeRuntimeChannel(80001, new Object[]{bridge});
        return null;
    }

    public boolean hasInitedWebViewCore() {
        return this.mHasInitedWebViewCore;
    }

    public boolean initWebviewCore(Context context, WebView.PreInitCallback preInitCallback) {
        XWebLog.m21911i(TAG, "initWebviewCore");
        boolean initWebViewCoreInternal = initWebViewCoreInternal();
        if (preInitCallback != null) {
            if (initWebViewCoreInternal) {
                preInitCallback.onCoreInitFinished();
            } else {
                preInitCallback.onCoreInitFailed();
            }
        }
        return initWebViewCoreInternal;
    }

    private PinusWebFactory() {
        this.mHasInitedWebViewCore = false;
    }
}
