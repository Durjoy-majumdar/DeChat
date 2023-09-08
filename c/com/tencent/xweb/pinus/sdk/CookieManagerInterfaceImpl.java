package com.tencent.xweb.pinus.sdk;

import android.webkit.ValueCallback;
import com.tencent.xweb.util.ReflectMethod;

public class CookieManagerInterfaceImpl implements CookieManagerInterface {
    private static final String TAG = "CookieManagerInterfaceImpl";
    private ReflectMethod acceptCookieMethod;
    private ReflectMethod allowFileSchemeCookiesMethod;
    private ReflectMethod flushMethod;
    private ReflectMethod getCookieStringMethod;
    private ReflectMethod hasCookiesMethod;
    private final Object inner;
    private ReflectMethod removeAllCookieMethod;
    private ReflectMethod removeAllCookieValueCallbackBooleanMethod;
    private ReflectMethod removeExpiredCookieMethod;
    private ReflectMethod removeSessionCookieMethod;
    private ReflectMethod removeSessionCookieValueCallbackBooleanMethod;
    private ReflectMethod setAcceptCookiebooleanMethod;
    private ReflectMethod setAcceptFileSchemeCookiesbooleanMethod;
    private ReflectMethod setCookieStringStringMethod;
    private ReflectMethod setCookieStringStringValueCallbackBooleanMethod;

    public CookieManagerInterfaceImpl(Object obj) {
        this.inner = obj;
    }

    private synchronized ReflectMethod getAcceptCookieMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.acceptCookieMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "acceptCookie", (Class<?>[]) new Class[0]);
            this.acceptCookieMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getAllowFileSchemeCookiesMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.allowFileSchemeCookiesMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "allowFileSchemeCookies", (Class<?>[]) new Class[0]);
            this.allowFileSchemeCookiesMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getFlushMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.flushMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "flush", (Class<?>[]) new Class[0]);
            this.flushMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetCookieStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getCookieStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getCookie", (Class<?>[]) new Class[]{String.class});
            this.getCookieStringMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getHasCookiesMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.hasCookiesMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "hasCookies", (Class<?>[]) new Class[0]);
            this.hasCookiesMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRemoveAllCookieMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.removeAllCookieMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "removeAllCookie", (Class<?>[]) new Class[0]);
            this.removeAllCookieMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRemoveAllCookieValueCallbackBooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.removeAllCookieValueCallbackBooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "removeAllCookie", (Class<?>[]) new Class[]{ValueCallback.class});
            this.removeAllCookieValueCallbackBooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRemoveExpiredCookieMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.removeExpiredCookieMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "removeExpiredCookie", (Class<?>[]) new Class[0]);
            this.removeExpiredCookieMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRemoveSessionCookieMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.removeSessionCookieMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "removeSessionCookie", (Class<?>[]) new Class[0]);
            this.removeSessionCookieMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getRemoveSessionCookieValueCallbackBooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.removeSessionCookieValueCallbackBooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "removeSessionCookie", (Class<?>[]) new Class[]{ValueCallback.class});
            this.removeSessionCookieValueCallbackBooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAcceptCookiebooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAcceptCookiebooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAcceptCookie", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAcceptCookiebooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetAcceptFileSchemeCookiesbooleanMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.setAcceptFileSchemeCookiesbooleanMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "setAcceptFileSchemeCookies", (Class<?>[]) new Class[]{Boolean.TYPE});
            this.setAcceptFileSchemeCookiesbooleanMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetCookieStringStringMethod() {
        ReflectMethod reflectMethod;
        Class<String> cls = String.class;
        synchronized (this) {
            reflectMethod = this.setCookieStringStringMethod;
            if (reflectMethod == null) {
                reflectMethod = new ReflectMethod(this.inner, "setCookie", (Class<?>[]) new Class[]{cls, cls});
                this.setCookieStringStringMethod = reflectMethod;
            }
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getSetCookieStringStringValueCallbackBooleanMethod() {
        ReflectMethod reflectMethod;
        Class<String> cls = String.class;
        synchronized (this) {
            reflectMethod = this.setCookieStringStringValueCallbackBooleanMethod;
            if (reflectMethod == null) {
                reflectMethod = new ReflectMethod(this.inner, "setCookie", (Class<?>[]) new Class[]{cls, cls, ValueCallback.class});
                this.setCookieStringStringValueCallbackBooleanMethod = reflectMethod;
            }
        }
        return reflectMethod;
    }

    public static void handleRuntimeError(Exception exc) {
        exc.getClass();
    }

    public boolean acceptCookie() {
        try {
            return ((Boolean) getAcceptCookieMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public boolean allowFileSchemeCookies() {
        try {
            return ((Boolean) getAllowFileSchemeCookiesMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void flush() {
        try {
            getFlushMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public String getCookie(String str) {
        try {
            return (String) getGetCookieStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public boolean hasCookies() {
        try {
            return ((Boolean) getHasCookiesMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }

    public void removeAllCookie() {
        try {
            getRemoveAllCookieMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void removeExpiredCookie() {
        try {
            getRemoveExpiredCookieMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void removeSessionCookie() {
        try {
            getRemoveSessionCookieMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAcceptCookie(boolean z) {
        try {
            getSetAcceptCookiebooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setAcceptFileSchemeCookies(boolean z) {
        try {
            getSetAcceptFileSchemeCookiesbooleanMethod().invoke(Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        try {
            getSetCookieStringStringValueCallbackBooleanMethod().invoke(str, str2, valueCallback);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void removeAllCookie(ValueCallback<Boolean> valueCallback) {
        try {
            getRemoveAllCookieValueCallbackBooleanMethod().invoke(valueCallback);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void removeSessionCookie(ValueCallback<Boolean> valueCallback) {
        try {
            getRemoveSessionCookieValueCallbackBooleanMethod().invoke(valueCallback);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void setCookie(String str, String str2) {
        try {
            getSetCookieStringStringMethod().invoke(str, str2);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }
}
