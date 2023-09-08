package com.tencent.thumbplayer.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class TPThreadAnnotations {
    private static ArrayList<RegisterMethod> mRegisterMethods = new ArrayList<>();

    public static class RegisterMethod {
        public String className;
        public Map<Integer, Method> methodMap;

        private RegisterMethod() {
        }
    }

    @Documented
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ThreadSwitch {
        boolean checkObj() default false;

        boolean needWait() default false;

        boolean removeRepeat() default false;
    }

    public static boolean checkObj(Class<?> cls, int i) {
        Method method;
        ThreadSwitch threadSwitch;
        Map<Integer, Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null || (method = registerMethodMap.get(Integer.valueOf(i))) == null || (threadSwitch = (ThreadSwitch) method.getAnnotation(ThreadSwitch.class)) == null) {
            return false;
        }
        return threadSwitch.checkObj();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1 = r1.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getApi(java.lang.Class<?> r1, int r2) {
        /*
            java.util.Map r1 = getRegisterMethodMap(r1)
            java.lang.String r0 = "unknown"
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.getName()
            return r1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPThreadAnnotations.getApi(java.lang.Class, int):java.lang.String");
    }

    public static Method getMethod(Class<?> cls, String str, Object[] objArr) {
        Map<Integer, Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null) {
            return null;
        }
        for (Map.Entry<Integer, Method> value : registerMethodMap.entrySet()) {
            Method method = (Method) value.getValue();
            if (method != null && str.equals(method.getName()) && isMatchParams(method, objArr)) {
                return method;
            }
        }
        return null;
    }

    public static Method getMethodByMsgId(Class<?> cls, int i) {
        Map<Integer, Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null) {
            return null;
        }
        return registerMethodMap.get(Integer.valueOf(i));
    }

    public static int getMethodMsgId(Class<?> cls, String str, Object[] objArr) {
        Map<Integer, Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null) {
            return -1;
        }
        for (Map.Entry next : registerMethodMap.entrySet()) {
            Method method = (Method) next.getValue();
            if (method != null && str.equals(method.getName()) && isMatchParams(method, objArr)) {
                return ((Integer) next.getKey()).intValue();
            }
        }
        return -1;
    }

    private static Map<Integer, Method> getRegisterMethodMap(Class<?> cls) {
        String str;
        Iterator<RegisterMethod> it = mRegisterMethods.iterator();
        while (it.hasNext()) {
            RegisterMethod next = it.next();
            if (next != null && (str = next.className) != null && str.equals(cls.getName())) {
                return next.methodMap;
            }
        }
        return null;
    }

    private static boolean isMatchParams(Method method, Object[] objArr) {
        Class[] parameterTypes = method.getParameterTypes();
        if (objArr == null || objArr.length == 0) {
            return parameterTypes.length == 0;
        }
        if (parameterTypes.length != objArr.length) {
            return false;
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            Class cls = parameterTypes[i];
            Object obj = objArr[i];
            if (obj == null) {
                if (cls.isPrimitive()) {
                    return false;
                }
            } else if (!cls.isAssignableFrom(obj.getClass()) && !isSamePrimitive(cls, objArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeedWait(Class<?> cls, int i) {
        Method method;
        Map<Integer, Method> registerMethodMap = getRegisterMethodMap(cls);
        if (!(registerMethodMap == null || (method = registerMethodMap.get(Integer.valueOf(i))) == null)) {
            Class[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                return true;
            }
            ThreadSwitch threadSwitch = (ThreadSwitch) method.getAnnotation(ThreadSwitch.class);
            if (threadSwitch != null) {
                return threadSwitch.needWait();
            }
        }
        return false;
    }

    private static boolean isRegistered(Class<?> cls) {
        String str;
        Iterator<RegisterMethod> it = mRegisterMethods.iterator();
        while (it.hasNext()) {
            RegisterMethod next = it.next();
            if (next != null && (str = next.className) != null && str.equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSamePrimitive(Class<?> cls, Object obj) {
        if (!cls.isPrimitive()) {
            return false;
        }
        try {
            return obj.getClass().getField("TYPE").get((Object) null).equals(cls);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:24|25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean register(java.lang.Class<?> r9, int r10) {
        /*
            java.lang.Class<com.tencent.thumbplayer.utils.TPThreadAnnotations> r0 = com.tencent.thumbplayer.utils.TPThreadAnnotations.class
            monitor-enter(r0)
            boolean r1 = isRegistered(r9)     // Catch:{ all -> 0x004d }
            r2 = 1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            return r2
        L_0x000c:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            r3 = 0
            java.lang.reflect.Method[] r4 = r9.getMethods()     // Catch:{ Exception -> 0x0048 }
            int r5 = r4.length     // Catch:{ Exception -> 0x0048 }
            r6 = 0
        L_0x0018:
            if (r6 >= r5) goto L_0x0033
            r7 = r4[r6]     // Catch:{ Exception -> 0x0048 }
            java.lang.Class<com.tencent.thumbplayer.utils.TPThreadAnnotations$ThreadSwitch> r8 = com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch.class
            java.lang.annotation.Annotation r8 = r7.getAnnotation(r8)     // Catch:{ Exception -> 0x0048 }
            com.tencent.thumbplayer.utils.TPThreadAnnotations$ThreadSwitch r8 = (com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch) r8     // Catch:{ Exception -> 0x0048 }
            if (r8 != 0) goto L_0x0027
            goto L_0x0030
        L_0x0027:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0048 }
            r1.put(r8, r7)     // Catch:{ Exception -> 0x0048 }
            int r10 = r10 + 1
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0033:
            com.tencent.thumbplayer.utils.TPThreadAnnotations$RegisterMethod r10 = new com.tencent.thumbplayer.utils.TPThreadAnnotations$RegisterMethod     // Catch:{ all -> 0x004d }
            r3 = 0
            r10.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x004d }
            r10.className = r9     // Catch:{ all -> 0x004d }
            r10.methodMap = r1     // Catch:{ all -> 0x004d }
            java.util.ArrayList<com.tencent.thumbplayer.utils.TPThreadAnnotations$RegisterMethod> r9 = mRegisterMethods     // Catch:{ all -> 0x004d }
            r9.add(r10)     // Catch:{ all -> 0x004d }
            monitor-exit(r0)
            return r2
        L_0x0048:
            r1.clear()     // Catch:{ all -> 0x004d }
            monitor-exit(r0)
            return r3
        L_0x004d:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPThreadAnnotations.register(java.lang.Class, int):boolean");
    }

    public static boolean removeRepeat(Class<?> cls, int i) {
        Method method;
        ThreadSwitch threadSwitch;
        Map<Integer, Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null || (method = registerMethodMap.get(Integer.valueOf(i))) == null || (threadSwitch = (ThreadSwitch) method.getAnnotation(ThreadSwitch.class)) == null) {
            return false;
        }
        return threadSwitch.removeRepeat();
    }
}
