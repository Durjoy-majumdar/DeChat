package com.tencent.xweb.pinus.sdk;

import android.webkit.ValueCallback;
import com.tencent.xweb.pinus.PSCoreWrapper;
import com.tencent.xweb.util.ReflectConstructor;
import com.tencent.xweb.util.XWebLog;

public class CookieManager implements CookieManagerInterface {
    private static final String TAG = "CookieManager";
    private static CookieManager sInstance;
    private static final Object sInstanceLock = new Object();
    private PSCoreWrapper coreWrapper;
    private Object inner;
    private CookieManagerInterface reflectInterface;

    private CookieManager() {
        init();
    }

    public static CookieManager getInstance() {
        CookieManager cookieManager;
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                sInstance = new CookieManager();
            }
            cookieManager = sInstance;
        }
        return cookieManager;
    }

    private void init() {
        PSCoreWrapper instance = PSCoreWrapper.getInstance();
        this.coreWrapper = instance;
        if (instance != null) {
            try {
                Object newInstance = new ReflectConstructor(instance.getBridgeClass(TAG), new Class[0]).newInstance(new Object[0]);
                this.inner = newInstance;
                this.reflectInterface = new CookieManagerInterfaceImpl(newInstance);
            } catch (UnsupportedOperationException e) {
                XWebLog.m21910e(TAG, "init error", e);
            }
        }
    }

    public boolean acceptCookie() {
        return this.reflectInterface.acceptCookie();
    }

    public boolean allowFileSchemeCookies() {
        return this.reflectInterface.allowFileSchemeCookies();
    }

    public void flush() {
        this.reflectInterface.flush();
    }

    public String getCookie(String str) {
        return this.reflectInterface.getCookie(str);
    }

    public boolean hasCookies() {
        return this.reflectInterface.hasCookies();
    }

    public void removeAllCookie() {
        this.reflectInterface.removeAllCookie();
    }

    public void removeExpiredCookie() {
        this.reflectInterface.removeExpiredCookie();
    }

    public void removeSessionCookie() {
        this.reflectInterface.removeSessionCookie();
    }

    public void setAcceptCookie(boolean z) {
        this.reflectInterface.setAcceptCookie(z);
    }

    public void setAcceptFileSchemeCookies(boolean z) {
        this.reflectInterface.setAcceptFileSchemeCookies(z);
    }

    public void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        this.reflectInterface.setCookie(str, str2, valueCallback);
    }

    public void removeAllCookie(ValueCallback<Boolean> valueCallback) {
        this.reflectInterface.removeAllCookie(valueCallback);
    }

    public void removeSessionCookie(ValueCallback<Boolean> valueCallback) {
        this.reflectInterface.removeSessionCookie(valueCallback);
    }

    public void setCookie(String str, String str2) {
        this.reflectInterface.setCookie(str, str2);
    }
}
