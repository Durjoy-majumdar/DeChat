package com.tencent.xweb;

import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.XWebLog;

public class XWebCoreWrapper implements IWebViewCoreWrapper {
    public static final String TAG = "XWebCoreWrapper";

    public Class<?> getBridgeClass(String str) {
        try {
            ClassLoader webViewCoreClassLoader = getWebViewCoreClassLoader();
            if (webViewCoreClassLoader == null) {
                return null;
            }
            return webViewCoreClassLoader.loadClass(getBridgePackageName() + "." + str);
        } catch (Throwable th) {
            XWebLog.m21913w(TAG, "getBridgeClass failed, class:" + str + ", error:" + th);
            return null;
        }
    }

    public Object getBridgeObject(Object obj) {
        try {
            return new ReflectMethod(obj, "getBridge", (Class<?>[]) new Class[0]).invoke(new Object[0]);
        } catch (Throwable th) {
            XWebLog.m21913w(TAG, "getBridgeObject failed, object:" + obj + ", error:" + th);
            return null;
        }
    }

    public String getBridgePackageName() {
        return null;
    }

    public Class<?> getClass(String str) {
        try {
            ClassLoader webViewCoreClassLoader = getWebViewCoreClassLoader();
            if (webViewCoreClassLoader != null) {
                return webViewCoreClassLoader.loadClass(str);
            }
            return null;
        } catch (Throwable th) {
            XWebLog.m21913w(TAG, "getClass failed, class:" + str + ", error:" + th);
            return null;
        }
    }

    public ClassLoader getWebViewCoreClassLoader() {
        return null;
    }

    public boolean hasFeature(int i) {
        return false;
    }

    public boolean invokeNativeChannel(int i, Object[] objArr) {
        return false;
    }

    public Object invokeRuntimeChannel(int i, Object[] objArr) {
        return null;
    }
}
