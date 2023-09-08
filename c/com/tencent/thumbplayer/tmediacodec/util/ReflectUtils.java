package com.tencent.thumbplayer.tmediacodec.util;

import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReflectUtils {
    public static final Object[] EMPTY_PARAMS = new Object[0];
    public static final Class<?>[] EMPTY_PARAM_TYPES = new Class[0];

    public static String getClassName(Class<?> cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Constructor<?> getConstructor(java.lang.Class<?> r1, boolean r2, boolean r3, java.lang.Class<?>... r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0008
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x000e }
            goto L_0x000c
        L_0x0008:
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x000e }
        L_0x000c:
            r0 = r1
            goto L_0x002a
        L_0x000e:
            if (r3 == 0) goto L_0x002a
            java.lang.Class r3 = r1.getSuperclass()
        L_0x0015:
            if (r0 != 0) goto L_0x002a
            if (r3 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x0020
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0025 }
            goto L_0x0015
        L_0x0020:
            java.lang.reflect.Constructor r0 = r1.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0025 }
            goto L_0x0015
        L_0x0025:
            java.lang.Class r3 = r3.getSuperclass()
            goto L_0x0015
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.util.ReflectUtils.getConstructor(java.lang.Class, boolean, boolean, java.lang.Class[]):java.lang.reflect.Constructor");
    }

    public static List<Constructor<?>> getConstructors(Class<?> cls, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        if (z2) {
            List<Class<?>> superClasss = getSuperClasss(cls, true);
            if (z3) {
                for (int size = superClasss.size() - 1; size > -1; size--) {
                    for (Constructor add : z ? superClasss.get(size).getDeclaredConstructors() : superClasss.get(size).getConstructors()) {
                        arrayList.add(add);
                    }
                }
            } else {
                for (int i = 0; i < superClasss.size(); i++) {
                    for (Constructor add2 : z ? superClasss.get(i).getDeclaredConstructors() : superClasss.get(i).getConstructors()) {
                        arrayList.add(add2);
                    }
                }
            }
        } else {
            for (Constructor add3 : z ? cls.getDeclaredConstructors() : cls.getConstructors()) {
                arrayList.add(add3);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Field getField(java.lang.Class<?> r1, java.lang.String r2, boolean r3, boolean r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0008
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x000e }
            goto L_0x000c
        L_0x0008:
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ NoSuchFieldException -> 0x000e }
        L_0x000c:
            r0 = r1
            goto L_0x002b
        L_0x000e:
            if (r4 == 0) goto L_0x002b
            java.lang.Class r1 = r1.getSuperclass()
        L_0x0015:
            if (r0 != 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            if (r3 == 0) goto L_0x0020
            java.lang.reflect.Field r4 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0026 }
            goto L_0x0024
        L_0x0020:
            java.lang.reflect.Field r4 = r1.getField(r2)     // Catch:{ NoSuchFieldException -> 0x0026 }
        L_0x0024:
            r0 = r4
            goto L_0x0015
        L_0x0026:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x0015
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.util.ReflectUtils.getField(java.lang.Class, java.lang.String, boolean, boolean):java.lang.reflect.Field");
    }

    public static List<Field> getFields(Class<?> cls, boolean z, boolean z2, boolean z3, boolean z4) {
        List<Class<?>> list;
        Field[] fieldArr;
        Field[] fieldArr2;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            if (z3) {
                list = getSuperClasss(cls, true);
            } else {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(cls);
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass != null) {
                    arrayList2.add(superclass);
                }
                list = arrayList2;
            }
            if (z4) {
                for (int size = list.size() - 1; size > -1; size--) {
                    if (z) {
                        fieldArr2 = list.get(size).getDeclaredFields();
                    } else {
                        fieldArr2 = list.get(size).getFields();
                    }
                    for (Field add : fieldArr2) {
                        arrayList.add(add);
                    }
                }
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (z) {
                        fieldArr = list.get(i).getDeclaredFields();
                    } else {
                        fieldArr = list.get(i).getFields();
                    }
                    for (Field add2 : fieldArr) {
                        arrayList.add(add2);
                    }
                }
            }
        } else {
            for (Field add3 : z ? cls.getDeclaredFields() : cls.getFields()) {
                arrayList.add(add3);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method getMethod(java.lang.Class<?> r1, boolean r2, boolean r3, java.lang.String r4, java.lang.Class<?>... r5) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0008
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x000e }
            goto L_0x000c
        L_0x0008:
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x000e }
        L_0x000c:
            r0 = r1
            goto L_0x002b
        L_0x000e:
            if (r3 == 0) goto L_0x002b
            java.lang.Class r1 = r1.getSuperclass()
        L_0x0015:
            if (r0 != 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            if (r2 == 0) goto L_0x0020
            java.lang.reflect.Method r3 = r1.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0026 }
            goto L_0x0024
        L_0x0020:
            java.lang.reflect.Method r3 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0026 }
        L_0x0024:
            r0 = r3
            goto L_0x0015
        L_0x0026:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x0015
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.util.ReflectUtils.getMethod(java.lang.Class, boolean, boolean, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static List<Method> getMethods(Class<?> cls, boolean z, boolean z2, boolean z3) {
        Method[] methodArr;
        Method[] methodArr2;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            List<Class<?>> superClasss = getSuperClasss(cls, true);
            if (z3) {
                for (int size = superClasss.size() - 1; size > -1; size--) {
                    if (z) {
                        methodArr2 = superClasss.get(size).getDeclaredMethods();
                    } else {
                        methodArr2 = superClasss.get(size).getMethods();
                    }
                    for (Method add : methodArr2) {
                        arrayList.add(add);
                    }
                }
            } else {
                for (int i = 0; i < superClasss.size(); i++) {
                    if (z) {
                        methodArr = superClasss.get(i).getDeclaredMethods();
                    } else {
                        methodArr = superClasss.get(i).getMethods();
                    }
                    for (Method add2 : methodArr) {
                        arrayList.add(add2);
                    }
                }
            }
        } else {
            for (Method add3 : z ? cls.getDeclaredMethods() : cls.getMethods()) {
                arrayList.add(add3);
            }
        }
        return arrayList;
    }

    public static <T> T getObjectByFieldName(Object obj, String str, Class<T> cls) {
        if (!(obj == null || TextUtils.isEmpty(str) || cls == null)) {
            try {
                Field field = getField(obj.getClass(), str, true, true);
                if (field != null) {
                    field.setAccessible(true);
                    return field.get(obj);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static List<Class<?>> getSuperClasss(Class<?> cls, boolean z) {
        ArrayList arrayList = new ArrayList();
        Class<? super Object> cls2 = cls;
        if (!z) {
            cls2 = cls.getSuperclass();
        }
        for (Class<? super Object> cls3 = cls2; cls3 != null; cls3 = cls3.getSuperclass()) {
            arrayList.add(cls3);
        }
        return arrayList;
    }

    public static Method getValueOfMethod(Class<?> cls, Class<?>... clsArr) {
        return getMethod(cls, true, true, "valueOf", clsArr);
    }

    public static Object invokeMethod(Method method, Object obj) {
        return method.invoke(obj, EMPTY_PARAMS);
    }

    public static final boolean isArrayByType(Field field, Class<?> cls) {
        Class<?> type = field.getType();
        return type.isArray() && cls.isAssignableFrom(type.getComponentType());
    }

    public static final boolean isCollectionByType(Field field, Class<? extends Collection> cls, Class<?> cls2) {
        if (cls.isAssignableFrom(field.getType())) {
            return cls2.isAssignableFrom((Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]);
        }
        return false;
    }

    public static boolean setField(Object obj, String str, Object obj2, boolean z, boolean z2) {
        Field field = getField(obj.getClass(), str, z, z2);
        if (field != null) {
            try {
                field.setAccessible(true);
                field.set(obj, obj2);
                return true;
            } catch (IllegalAccessException unused) {
            }
        }
        return false;
    }

    public static Object invokeMethod(Method method, Object obj, Object... objArr) {
        return method.invoke(obj, objArr);
    }

    public static Field getField(Class<?> cls, String str) {
        return getField(cls, str, true, true);
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        return getMethod(cls, true, true, str, clsArr);
    }

    public static Method getMethod(Class<?> cls, String str) {
        return getMethod(cls, str, EMPTY_PARAM_TYPES);
    }

    public static List<Method> getMethods(Class<?> cls) {
        return getMethods(cls, true, true, true);
    }

    public static List<Field> getFields(Class<?> cls) {
        return getFields(cls, true, true, true, true);
    }
}
