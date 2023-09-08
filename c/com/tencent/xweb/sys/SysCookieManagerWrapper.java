package com.tencent.xweb.sys;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.util.XWebLog;

public class SysCookieManagerWrapper implements ICookieManager {
    private static final String TAG = "SysCookieManagerWrapper";
    private final CookieManager mCookieManager = CookieManager.getInstance();

    public boolean acceptCookie() {
        return this.mCookieManager.acceptCookie();
    }

    public boolean acceptThirdPartyCookies(WebView webView) {
        if (webView == null || webView.getWebViewUI() == null || !(webView.getWebViewUI() instanceof android.webkit.WebView)) {
            return false;
        }
        return this.mCookieManager.acceptThirdPartyCookies((android.webkit.WebView) webView.getWebViewUI());
    }

    public void flush() {
        this.mCookieManager.flush();
    }

    public String getCookie(String str) {
        return this.mCookieManager.getCookie(str);
    }

    public boolean hasCookies() {
        return this.mCookieManager.hasCookies();
    }

    public void removeAllCookie() {
        this.mCookieManager.removeAllCookie();
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.removeAllCookies(valueCallback);
    }

    public void removeExpiredCookie() {
        this.mCookieManager.removeExpiredCookie();
    }

    public void removeSessionCookie() {
        this.mCookieManager.removeSessionCookie();
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.removeSessionCookies(valueCallback);
    }

    public void setAcceptCookie(boolean z) {
        this.mCookieManager.setAcceptCookie(z);
    }

    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        if (webView == null || webView.getWebViewUI() == null || !(webView.getWebViewUI() instanceof android.webkit.WebView)) {
            XWebLog.m21909e(TAG, "setAcceptThirdPartyCookies, webview kind not match");
        } else {
            this.mCookieManager.setAcceptThirdPartyCookies((android.webkit.WebView) webView.getWebViewUI(), z);
        }
    }

    public void setCookie(String str, String str2) {
        this.mCookieManager.setCookie(str, str2);
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.setCookie(str, str2, valueCallback);
    }
}
