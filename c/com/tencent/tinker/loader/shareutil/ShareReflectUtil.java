package com.tencent.tinker.loader.shareutil;

import android.content.Context;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ShareReflectUtil {
    public static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        findField.set(obj, objArr3);
    }

    public static Constructor<?> findConstructor(Object obj, Class<?>... clsArr) {
        return findConstructor(obj.getClass(), clsArr);
    }

    public static Field findField(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method findMethod(Object obj, String str, Class<?>... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static Object getActivityThread(Context context, Class<?> cls) {
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread");
            } catch (Throwable unused) {
                return null;
            }
        }
        Method method = cls.getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke((Object) null, new Object[0]);
        if (invoke != null || context == null) {
            return invoke;
        }
        Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static int getValueOfStaticIntField(Class<?> cls, String str, int i) {
        try {
            return findField(cls, str).getInt((Object) null);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static void reduceFieldArray(Object obj, String str, int i) {
        if (i > 0) {
            Field findField = findField(obj, str);
            Object[] objArr = (Object[]) findField.get(obj);
            int length = objArr.length - i;
            if (length > 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                System.arraycopy(objArr, i, objArr2, 0, length);
                findField.set(obj, objArr2);
            }
        }
    }

    public static Constructor<?> findConstructor(Class<?> cls, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Constructor with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    public static Field findField(Class<?> cls, String str) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    public static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Class<? super Object> cls2;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                Class<? super Object> superclass = cls2.getSuperclass();
                cls2 = cls;
                cls2 = superclass;
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls2);
    }
}
