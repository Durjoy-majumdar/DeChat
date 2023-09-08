package com.tencent.xweb.pinus.sdk;

import com.tencent.xweb.util.ReflectMethod;

public class JsResultInterfaceImpl implements JsResultInterface {
    private static final String TAG = "JsResultInterfaceImpl";
    private ReflectMethod cancelMethod;
    private ReflectMethod confirmMethod;
    private ReflectMethod confirmStringMethod;
    private final Object inner;

    public JsResultInterfaceImpl(Object obj) {
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

    private synchronized ReflectMethod getConfirmMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.confirmMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "confirm", (Class<?>[]) new Class[0]);
            this.confirmMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getConfirmStringMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.confirmStringMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "confirm", (Class<?>[]) new Class[]{String.class});
            this.confirmStringMethod = reflectMethod;
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

    public void confirm() {
        try {
            getConfirmMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }

    public void confirm(String str) {
        try {
            getConfirmStringMethod().invoke(str);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
        }
    }
}
