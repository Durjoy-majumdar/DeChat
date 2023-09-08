package com.tencent.xweb.pinus.sdk;

import android.webkit.ValueCallback;

public interface CookieManagerInterface {
    boolean acceptCookie();

    boolean allowFileSchemeCookies();

    void flush();

    String getCookie(String str);

    boolean hasCookies();

    void removeAllCookie();

    void removeAllCookie(ValueCallback<Boolean> valueCallback);

    void removeExpiredCookie();

    void removeSessionCookie();

    void removeSessionCookie(ValueCallback<Boolean> valueCallback);

    void setAcceptCookie(boolean z);

    void setAcceptFileSchemeCookies(boolean z);

    void setCookie(String str, String str2);

    void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback);
}
