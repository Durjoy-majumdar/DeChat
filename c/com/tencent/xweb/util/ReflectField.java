package com.tencent.xweb.util;

import java.lang.reflect.Field;
import java.util.concurrent.RejectedExecutionException;

public class ReflectField {
    public static final String TAG = "ReflectField";
    private Class<?> mClass;
    private Field mField;
    private Object mInstance;
    private String mName;

    public ReflectField() {
    }

    public Object get() {
        Field field = this.mField;
        if (field != null) {
            try {
                return field.get(this.mInstance);
            } catch (IllegalAccessException | NullPointerException e) {
                throw new RejectedExecutionException(e);
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (ExceptionInInitializerError e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw new UnsupportedOperationException(toString());
        }
    }

    public Object getInstance() {
        return this.mInstance;
    }

    public String getName() {
        return this.mName;
    }

    public boolean init(Object obj, Class<?> cls, String str) {
        this.mInstance = obj;
        if (cls == null) {
            cls = obj != null ? obj.getClass() : null;
        }
        this.mClass = cls;
        this.mName = str;
        this.mField = null;
        if (cls == null) {
            return false;
        }
        try {
            this.mField = cls.getField(str);
        } catch (NoSuchFieldException unused) {
            Class cls2 = this.mClass;
            while (cls2 != null) {
                try {
                    Field declaredField = cls2.getDeclaredField(this.mName);
                    this.mField = declaredField;
                    declaredField.setAccessible(true);
                    break;
                } catch (NoSuchFieldException e) {
                    XWebLog.m21909e(TAG, "init error:" + e);
                    cls2 = cls2.getSuperclass();
                }
            }
        }
        return this.mField != null;
    }

    public boolean isNull() {
        return this.mField == null;
    }

    public String toString() {
        Field field = this.mField;
        if (field != null) {
            return field.toString();
        }
        String str = "";
        if (this.mClass != null) {
            str = str + this.mClass.toString() + ".";
        }
        if (this.mName == null) {
            return str;
        }
        return str + this.mName;
    }

    public ReflectField(Object obj, String str) {
        init(obj, (Class<?>) null, str);
    }

    public ReflectField(Class<?> cls, String str) {
        init((Object) null, cls, str);
    }
}
