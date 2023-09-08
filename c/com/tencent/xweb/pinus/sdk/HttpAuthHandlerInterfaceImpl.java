package com.tencent.xweb.pinus.sdk;

import com.tencent.xweb.util.ReflectMethod;

public class HttpAuthHandlerInterfaceImpl implements HttpAuthHandlerInterface {
    private static final String TAG = "HttpAuthHandlerInterfaceImpl";
    private ReflectMethod cancelMethod;
    private final Object inner;
    private ReflectMethod proceedStringStringMethod;
    private ReflectMethod useHttpAuthUsernamePasswordMethod;

    public HttpAuthHandlerInterfaceImpl(Object obj) {
        this.inner = obj;
    }

    private synchronized ReflectMethod getCancelMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.cancelMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "cancel", (Class<?>[]) new Class[0]);
            this.cancelMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getProceedStringStringMethod() {
        ReflectMethod reflectMethod;
        Class<String> cls = String.class;
        synchronized (this) {
            reflectMethod = this.proceedStringStringMethod;
            if (reflectMethod == null) {
                reflectMethod = new ReflectMethod(this.inner, "proceed", (Class<?>[]) new Class[]{cls, cls});
                this.proceedStringStringMethod = reflectMethod;
            }
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getUseHttpAuthUsernamePasswordMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.useHttpAuthUsernamePasswordMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "useHttpAuthUsernamePassword", (Class<?>[]) new Class[0]);
            this.useHttpAuthUsernamePasswordMethod = reflectMethod;
        }
        return reflectMethod;
    }

    public static void handleRuntimeError(Exception exc) {
        exc.getClass();
    }

    public void cancel() {
        try {
            getCancelMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void proceed(String str, String str2) {
        try {
            getProceedStringStringMethod().invoke(str, str2);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public boolean useHttpAuthUsernamePassword() {
        try {
            return ((Boolean) getUseHttpAuthUsernamePasswordMethod().invoke(new Object[0])).booleanValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return false;
        }
    }
}
