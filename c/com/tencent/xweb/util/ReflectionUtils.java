package com.tencent.xweb.util;

import android.text.TextUtils;
import java.lang.reflect.Method;

public class ReflectionUtils {
    private static final String TAG = "ReflectionUtils";

    private ReflectionUtils() {
    }

    public static Object getFieldStatic(String str, String str2) {
        try {
            return Class.forName(str).getField(str2).get((Object) null);
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "getFieldStatic, error", th);
            return null;
        }
    }

    public static Method getParentDeclaredMethod(Object obj, String str, Class... clsArr) {
        Class cls = obj.getClass();
        while (cls != Object.class && cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object instanceFromName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "instanceFromName, error", th);
            return null;
        }
    }

    public static Object invokeInstance(Object obj, String str) {
        return invokeInstance(obj, str, (Class<?>[]) null, new Object[0]);
    }

    public static Object invokeStatic(String str, String str2) {
        try {
            return Class.forName(str).getMethod(str2, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "invokeStatic, error", th);
            return null;
        }
    }

    public static Object invokeInstance(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            if (objArr.length == 0) {
                objArr = null;
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "invokeInstance, error", th);
            return null;
        }
    }

    public static Object invokeStatic(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        try {
            Method method = Class.forName(str).getMethod(str2, clsArr);
            method.setAccessible(true);
            return method.invoke((Object) null, objArr);
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "invokeStatic, error", th);
            return null;
        }
    }

    public static Object invokeStatic(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke((Object) null, objArr);
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "invokeStatic, error", th);
            return null;
        }
    }
}
