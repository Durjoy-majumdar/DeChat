package com.tencent.xweb.pinus.sdk;

import com.tencent.xweb.util.ReflectMethod;

public class HitTestResultInterfaceImpl implements HitTestResultInterface {
    private static final String TAG = "HitTestResultInterfaceImpl";
    private ReflectMethod getExtraMethod;
    private ReflectMethod getTypeMethod;
    private final Object inner;

    public HitTestResultInterfaceImpl(Object obj) {
        this.inner = obj;
    }

    private synchronized ReflectMethod getGetExtraMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getExtraMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getExtra", (Class<?>[]) new Class[0]);
            this.getExtraMethod = reflectMethod;
        }
        return reflectMethod;
    }

    private synchronized ReflectMethod getGetTypeMethod() {
        ReflectMethod reflectMethod;
        reflectMethod = this.getTypeMethod;
        if (reflectMethod == null) {
            reflectMethod = new ReflectMethod(this.inner, "getType", (Class<?>[]) new Class[0]);
            this.getTypeMethod = reflectMethod;
        }
        return reflectMethod;
    }

    public static void handleRuntimeError(Exception exc) {
        exc.getClass();
    }

    public String getExtra() {
        try {
            return (String) getGetExtraMethod().invoke(new Object[0]);
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return null;
        }
    }

    public int getType() {
        try {
            return ((Integer) getGetTypeMethod().invoke(new Object[0])).intValue();
        } catch (UnsupportedOperationException e) {
            handleRuntimeError(e);
            return 0;
        }
    }
}
