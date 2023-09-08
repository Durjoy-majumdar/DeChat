package com.tencent.xweb;

import android.webkit.ValueCallback;
import com.tencent.xweb.internal.ICookieManager;

public class CookieManager implements ICookieManager {
    private static CookieManager sInstance;
    private ICookieManager mCookieManager;

    public static synchronized CookieManager getInstance() {
        CookieManager cookieManager;
        synchronized (CookieManager.class) {
            if (sInstance == null) {
                sInstance = new CookieManager();
            }
            cookieManager = sInstance;
        }
        return cookieManager;
    }

    public boolean acceptCookie() {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            return iCookieManager.acceptCookie();
        }
        return false;
    }

    public boolean acceptThirdPartyCookies(WebView webView) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            return iCookieManager.acceptThirdPartyCookies(webView);
        }
        return false;
    }

    public void flush() {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.flush();
        }
    }

    public String getCookie(String str) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            return iCookieManager.getCookie(str);
        }
        return null;
    }

    public boolean hasCookies() {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            return iCookieManager.hasCookies();
        }
        return false;
    }

    @Deprecated
    public void removeAllCookie() {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.removeAllCookie();
        }
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.removeAllCookies(valueCallback);
        }
    }

    @Deprecated
    public void removeExpiredCookie() {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.removeExpiredCookie();
        }
    }

    @Deprecated
    public void removeSessionCookie() {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.removeSessionCookie();
        }
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.removeSessionCookies(valueCallback);
        }
    }

    public synchronized void setAcceptCookie(boolean z) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.setAcceptCookie(z);
        }
    }

    public void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.setAcceptThirdPartyCookies(webView, z);
        }
    }

    public void setCookie(String str, String str2) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.setCookie(str, str2);
        }
    }

    public void setCookieManagerWrapper(ICookieManager iCookieManager) {
        this.mCookieManager = iCookieManager;
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        ICookieManager iCookieManager = this.mCookieManager;
        if (iCookieManager != null) {
            iCookieManager.setCookie(str, str2, valueCallback);
        }
    }
}
