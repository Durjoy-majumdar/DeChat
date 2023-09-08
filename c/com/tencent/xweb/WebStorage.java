package com.tencent.xweb;

import android.webkit.ValueCallback;
import com.tencent.xweb.internal.IWebStorage;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;
import java.util.Map;

public class WebStorage implements IWebStorage {
    private static final String TAG = "WebStorage";
    private static WebStorage sInstance;
    private final IWebStorage mWebStorage;

    private WebStorage() {
        IWebStorage webviewStorage = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType()).getWebviewStorage();
        this.mWebStorage = webviewStorage;
        if (webviewStorage == null) {
            XWebLog.m21909e(TAG, "create WebStorage failed, webview type:" + WebView.getCurrentModuleWebCoreType());
        }
    }

    public static synchronized WebStorage getInstance() {
        WebStorage webStorage;
        synchronized (WebStorage.class) {
            if (sInstance == null) {
                sInstance = new WebStorage();
            }
            webStorage = sInstance;
        }
        return webStorage;
    }

    public void deleteAllData() {
    }

    public void deleteOrigin(String str) {
        IWebStorage iWebStorage = this.mWebStorage;
        if (iWebStorage != null) {
            iWebStorage.deleteOrigin(str);
        }
    }

    public void getOrigins(ValueCallback<Map> valueCallback) {
    }

    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    @Deprecated
    public void setQuotaForOrigin(String str, long j) {
    }
}
