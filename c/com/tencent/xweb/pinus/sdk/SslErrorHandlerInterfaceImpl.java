package com.tencent.xweb.pinus.sdk;

import com.tencent.xweb.util.ReflectMethod;

public class SslErrorHandlerInterfaceImpl implements SslErrorHandlerInterface {
    private static final String TAG = "SslErrHandlerInterface";
    private ReflectMethod cancelMethod;
    private final Object inner;
    private ReflectMethod proceedMethod;

    public SslErrorHandlerInterfaceImpl(Object obj) {
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

    private synchronized ReflectMethod getProceedMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.proceedMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "proceed", (Class<?>[]) new Class[0]);
            this.proceedMethod = reflectMethod;
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

    public void proceed() {
        try {
            getProceedMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }
}
