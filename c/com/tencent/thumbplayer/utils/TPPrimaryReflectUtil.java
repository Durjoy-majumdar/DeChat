package com.tencent.thumbplayer.utils;

import java.lang.reflect.Method;

public class TPPrimaryReflectUtil {
    public static final String TAG = "TPPrimaryReflectUtil";
    private static Method sForNameMethod;
    private static Method sGetDeclaredMethod;
    private static Method sGetFieldMethod;

    static {
        Class<String> cls = String.class;
        try {
            sForNameMethod = Class.class.getDeclaredMethod("forName", new Class[]{cls});
            sGetDeclaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, Class[].class});
            sGetFieldMethod = Class.class.getDeclaredMethod("getDeclaredField", new Class[]{cls});
        } catch (Throwable th) {
            TPLogUtil.m21894e(TAG, th.getMessage());
        }
    }

    private static boolean canReflection() {
        return (sForNameMethod == null || sGetDeclaredMethod == null || sGetFieldMethod == null) ? false : true;
    }

    private static Method getMethod(String str, String str2, Class[] clsArr) {
        Method method = null;
        if (!canReflection()) {
            return null;
        }
        try {
            Method method2 = sGetDeclaredMethod;
            Object[] objArr = {str2, clsArr};
            Method method3 = (Method) method2.invoke((Class) sForNameMethod.invoke((Object) null, new Object[]{str}), objArr);
            try {
                method3.setAccessible(true);
                return method3;
            } catch (Throwable th) {
                th = th;
                method = method3;
                TPLogUtil.m21894e(TAG, th.getMessage());
                return method;
            }
        } catch (Throwable th4) {
            th = th4;
            TPLogUtil.m21894e(TAG, th.getMessage());
            return method;
        }
    }

    public static Object invokeMethod(Object obj, String str, String str2, Class[] clsArr, Object... objArr) {
        try {
            Method method = getMethod(str, str2, clsArr);
            if (method != null) {
                return method.invoke(obj, objArr);
            }
            return null;
        } catch (Throwable th) {
            TPLogUtil.m21894e(TAG, th.getMessage());
            return null;
        }
    }
}
