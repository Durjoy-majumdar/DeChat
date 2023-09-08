package com.tencent.xweb.pinus;

import android.webkit.ValueCallback;
import com.tencent.xweb.WebAddress;
import com.tencent.xweb.WebView;
import com.tencent.xweb.internal.ICookieManager;
import com.tencent.xweb.pinus.sdk.CookieManager;
import com.tencent.xweb.util.XWebLog;
import java.net.URISyntaxException;

public class PinusCookieManagerWrapper implements ICookieManager {
    private static final String TAG = "PinusCookieManagerWrapper";
    private final CookieManager mCookieManager = CookieManager.getInstance();

    private static String fixupUrl(String str) {
        return new WebAddress(str).toString();
    }

    public boolean acceptCookie() {
        return this.mCookieManager.acceptCookie();
    }

    public boolean acceptThirdPartyCookies(WebView webView) {
        return false;
    }

    public void flush() {
        this.mCookieManager.flush();
    }

    public String getCookie(String str) {
        try {
            return this.mCookieManager.getCookie(fixupUrl(str));
        } catch (URISyntaxException e) {
            XWebLog.m21910e(TAG, "getCookie, Unable to get cookies due to error parsing URL: " + str, e);
            return null;
        }
    }

    public boolean hasCookies() {
        return this.mCookieManager.hasCookies();
    }

    public void removeAllCookie() {
        XWebLog.m21911i(TAG, "removeAllCookie");
        this.mCookieManager.removeAllCookie();
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.removeAllCookie(valueCallback);
    }

    public void removeExpiredCookie() {
        this.mCookieManager.removeExpiredCookie();
    }

    public void removeSessionCookie() {
        this.mCookieManager.removeSessionCookie();
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        this.mCookieManager.removeSessionCookie(valueCallback);
    }

    public void setAcceptCookie(boolean z) {
        XWebLog.m21911i(TAG, "setAcceptCookie:" + z);
        this.mCookieManager.setAcceptCookie(z);
    }

    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        XWebLog.m21911i(TAG, "setAcceptThirdPartyCookies:" + z);
    }

    public void setCookie(String str, String str2) {
        try {
            this.mCookieManager.setCookie(fixupUrl(str), str2);
        } catch (URISyntaxException e) {
            XWebLog.m21910e(TAG, "setCookie, Not setting cookie due to error parsing URL: " + str, e);
        }
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        try {
            this.mCookieManager.setCookie(fixupUrl(str), str2, valueCallback);
        } catch (URISyntaxException e) {
            XWebLog.m21910e(TAG, "setCookie, Not setting cookie due to error parsing URL: " + str, e);
        }
    }
}
