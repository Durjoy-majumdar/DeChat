package com.tencent.xweb.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.RejectedExecutionException;

public class ReflectMethod {
    public static final String TAG = "ReflectMethod";
    public Object[] mArguments;
    public Class<?> mClass;
    public Object mInstance;
    public Method mMethod;
    public String mName;
    public Class<?>[] mParameterTypes;

    public ReflectMethod() {
    }

    public Object[] getArguments() {
        return this.mArguments;
    }

    public Object getInstance() {
        return this.mInstance;
    }

    public String getName() {
        return this.mName;
    }

    public boolean init(Object obj, Class<?> cls, String str, Class<?>... clsArr) {
        this.mInstance = obj;
        if (cls == null) {
            cls = obj != null ? obj.getClass() : null;
        }
        this.mClass = cls;
        this.mName = str;
        this.mParameterTypes = clsArr;
        this.mMethod = null;
        if (cls == null) {
            return false;
        }
        try {
            this.mMethod = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            Class cls2 = this.mClass;
            while (cls2 != null) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod(this.mName, this.mParameterTypes);
                    this.mMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                    XWebLog.m21911i(TAG, "init, find method " + this.mName + " in class " + this.mClass);
                    break;
                } catch (NoSuchMethodException e) {
                    XWebLog.m21911i(TAG, "init error:" + e);
                    cls2 = cls2.getSuperclass();
                }
            }
        }
        return this.mMethod != null;
    }

    public Object invoke(Object... objArr) {
        Method method = this.mMethod;
        if (method != null) {
            try {
                return method.invoke(this.mInstance, objArr);
            } catch (IllegalAccessException | NullPointerException e) {
                throw new RejectedExecutionException(e);
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        } else {
            throw new UnsupportedOperationException(toString());
        }
    }

    public Object invokeWithArguments() {
        return invoke(this.mArguments);
    }

    public boolean isNull() {
        return this.mMethod == null;
    }

    public void setArguments(Object... objArr) {
        this.mArguments = objArr;
    }

    public String toString() {
        Method method = this.mMethod;
        if (method != null) {
            return method.toString();
        }
        String str = "";
        if (this.mClass != null) {
            str = str + this.mClass + ".";
        }
        if (this.mName == null) {
            return str;
        }
        return str + this.mName;
    }

    public ReflectMethod(Object obj, String str, Class<?>... clsArr) {
        init(obj, (Class<?>) null, str, clsArr);
    }

    public ReflectMethod(Class<?> cls, String str, Class<?>... clsArr) {
        init((Object) null, cls, str, clsArr);
    }
}
