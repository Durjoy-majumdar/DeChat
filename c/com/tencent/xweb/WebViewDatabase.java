package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.internal.IWebViewDatabase;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;

public class WebViewDatabase implements IWebViewDatabase {
    private static final String TAG = "WebViewDatabase";
    private static WebViewDatabase sInstance;
    private final IWebViewDatabase mWebViewDatabase;

    public WebViewDatabase(Context context) {
        IWebViewDatabase webViewDatabase = WebViewWrapperFactory.getWebViewProvider(WebView.getCurrentModuleWebCoreType()).getWebViewDatabase(context);
        this.mWebViewDatabase = webViewDatabase;
        if (webViewDatabase == null) {
            XWebLog.m21909e(TAG, "create WebViewDatabase failed, webview type:" + WebView.getCurrentModuleWebCoreType());
        }
    }

    public static synchronized IWebViewDatabase getInstance(Context context) {
        WebViewDatabase webViewDatabase;
        synchronized (WebViewDatabase.class) {
            if (sInstance == null) {
                sInstance = new WebViewDatabase(context);
            }
            webViewDatabase = sInstance;
        }
        return webViewDatabase;
    }

    @Deprecated
    public void clearFormData() {
        this.mWebViewDatabase.clearFormData();
    }

    public void clearHttpAuthUsernamePassword() {
        this.mWebViewDatabase.clearHttpAuthUsernamePassword();
    }

    @Deprecated
    public void clearUsernamePassword() {
        this.mWebViewDatabase.clearUsernamePassword();
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return this.mWebViewDatabase.getHttpAuthUsernamePassword(str, str2);
    }

    @Deprecated
    public boolean hasFormData() {
        return this.mWebViewDatabase.hasFormData();
    }

    public boolean hasHttpAuthUsernamePassword() {
        return this.mWebViewDatabase.hasHttpAuthUsernamePassword();
    }

    @Deprecated
    public boolean hasUsernamePassword() {
        return this.mWebViewDatabase.hasUsernamePassword();
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        this.mWebViewDatabase.setHttpAuthUsernamePassword(str, str2, str3, str4);
    }
}
