package com.tencent.xweb.pinus.sdk;

import com.tencent.xweb.util.ReflectMethod;

public class WebResourceErrorInterfaceImpl implements WebResourceErrorInterface {
    private static final String TAG = "WebResourceErrorInterfaceImpl";
    private ReflectMethod getDescriptionMethod;
    private ReflectMethod getErrorCodeMethod;
    private final Object inner;

    public WebResourceErrorInterfaceImpl(Object obj) {
        this.inner = obj;
    }

    private synchronized ReflectMethod getGetDescriptionMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getDescriptionMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getDescription", (Class<?>[]) new Class[0]);
            this.getDescriptionMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetErrorCodeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getErrorCodeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getErrorCode", (Class<?>[]) new Class[0]);
            this.getErrorCodeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    public static void handleRuntimeError(Exception exc) {
        exc.getClass();
    }

    public CharSequence getDescription() {
        try {
            return (CharSequence) getGetDescriptionMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getErrorCode() {
        try {
            return ((Integer) getGetErrorCodeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }
}
