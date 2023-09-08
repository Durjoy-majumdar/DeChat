package com.tencent.mapsdk.internal;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.tencent.mapsdk.internal.hd */
public final class C113800hd {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b A[SYNTHETIC, Splitter:B:29:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0081 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m157128a(java.lang.Class<T> r10, java.lang.Object... r11) {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x009a
            boolean r1 = r10.isEnum()
            if (r1 != 0) goto L_0x009a
            boolean r1 = r10.isInterface()
            if (r1 != 0) goto L_0x009a
            boolean r1 = r10.isAnnotation()
            if (r1 != 0) goto L_0x009a
            boolean r1 = r10.isArray()
            if (r1 == 0) goto L_0x001d
            goto L_0x009a
        L_0x001d:
            java.lang.reflect.Constructor[] r1 = r10.getDeclaredConstructors()
            r2 = 0
            r3 = 0
        L_0x0023:
            int r4 = r1.length
            if (r3 >= r4) goto L_0x0084
            r4 = r1[r3]
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r5 = r4.length
            int r6 = r11.length
            r7 = 1
            if (r5 != r6) goto L_0x0058
            r5 = 0
            r6 = 0
        L_0x0033:
            int r8 = r4.length
            if (r5 >= r8) goto L_0x0053
            r8 = r4[r5]
            r9 = r11[r5]
            java.lang.Class r9 = r9.getClass()
            if (r8 == r9) goto L_0x004e
            r8 = r4[r5]
            r9 = r11[r5]
            java.lang.Class r9 = r9.getClass()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L_0x0050
        L_0x004e:
            int r6 = r6 + 1
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0053:
            int r4 = r4.length
            if (r6 != r4) goto L_0x0058
            r4 = 1
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r4 == 0) goto L_0x0081
            r4 = r1[r3]     // Catch:{ IllegalAccessException -> 0x0079, InstantiationException -> 0x0070, InvocationTargetException -> 0x0067 }
            r4.setAccessible(r7)     // Catch:{ IllegalAccessException -> 0x0079, InstantiationException -> 0x0070, InvocationTargetException -> 0x0067 }
            r4 = r1[r3]     // Catch:{ IllegalAccessException -> 0x0079, InstantiationException -> 0x0070, InvocationTargetException -> 0x0067 }
            java.lang.Object r10 = r4.newInstance(r11)     // Catch:{ IllegalAccessException -> 0x0079, InstantiationException -> 0x0070, InvocationTargetException -> 0x0067 }
            return r10
        L_0x0067:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r5, (java.lang.Throwable) r4)
            goto L_0x0081
        L_0x0070:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r5, (java.lang.Throwable) r4)
            goto L_0x0081
        L_0x0079:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r5, (java.lang.Throwable) r4)
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0084:
            java.lang.Object r10 = r10.newInstance()     // Catch:{ IllegalAccessException -> 0x0092, InstantiationException -> 0x0089 }
            return r10
        L_0x0089:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r11, (java.lang.Throwable) r10)
            goto L_0x009a
        L_0x0092:
            r10 = move-exception
            java.lang.String r11 = r10.getMessage()
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r11, (java.lang.Throwable) r10)
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113800hd.m157128a(java.lang.Class, java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: a */
    private static boolean m157134a(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (clsArr[i2] == objArr[i2].getClass() || clsArr[i2].isAssignableFrom(objArr[i2].getClass())) {
                i++;
            }
        }
        if (i == clsArr.length) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m157133a(Object obj, String str, Object obj2) {
        if (obj != null) {
            try {
                Field declaredField = obj.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
            } catch (NoSuchFieldException e) {
                C113889km.m157547b(e.getMessage(), (Throwable) e);
            } catch (IllegalAccessException e2) {
                C113889km.m157547b(e2.getMessage(), (Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public static Object m157129a(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if (Modifier.isStatic(declaredField.getModifiers())) {
                return declaredField.get(cls);
            }
            return declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            C113889km.m157547b(e.getMessage(), (Throwable) e);
            return null;
        } catch (IllegalAccessException e2) {
            C113889km.m157547b(e2.getMessage(), (Throwable) e2);
            return null;
        }
    }

    /* renamed from: a */
    private static Object m157131a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        try {
            Method a = m157132a((Class) obj.getClass(), str, clsArr);
            if (a != null) {
                a.setAccessible(true);
                return a.invoke(obj, objArr);
            }
        } catch (IllegalAccessException e) {
            C113889km.m157547b(e.getMessage(), (Throwable) e);
        } catch (InvocationTargetException e2) {
            C113889km.m157547b(e2.getMessage(), (Throwable) e2);
        }
        return null;
    }

    /* renamed from: a */
    private static Object m157130a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Method a = m157132a((Class) obj.getClass(), str, clsArr);
            if (a != null) {
                a.setAccessible(true);
                return a.invoke(obj, objArr);
            }
        } catch (IllegalAccessException e) {
            C113889km.m157547b(e.getMessage(), (Throwable) e);
        } catch (InvocationTargetException e2) {
            C113889km.m157547b(e2.getMessage(), (Throwable) e2);
        }
        return null;
    }

    /* renamed from: a */
    private static Method m157132a(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            if (cls.getSuperclass() != Object.class) {
                return m157132a(cls.getSuperclass(), str, clsArr);
            }
            C113889km.m157547b(e.getMessage(), (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public static Class m157127a(String str, ClassLoader classLoader) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException e) {
            C113889km.m157547b(e.getMessage(), (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public static <T> Class<? extends T> m157126a(String str, Class<T> cls, ClassLoader classLoader) {
        try {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (ClassNotFoundException e) {
            C113889km.m157547b(e.getMessage(), (Throwable) e);
            return null;
        }
    }
}
