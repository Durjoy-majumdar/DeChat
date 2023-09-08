package com.tencent.xweb.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.RejectedExecutionException;

public class ReflectConstructor {
    public static final String TAG = "ReflectConstructor";
    private Class<?> mClass;
    private Constructor<?> mConstructor;
    private Class<?>[] mParameterTypes;

    public ReflectConstructor() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|10|(1:12)(1:13)) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        com.tencent.xweb.util.XWebLog.m21909e(TAG, "init error:" + r4.getLocalizedMessage());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean init(java.lang.Class<?> r4, java.lang.Class<?>... r5) {
        /*
            r3 = this;
            r3.mClass = r4
            r3.mParameterTypes = r5
            r0 = 0
            r3.mConstructor = r0
            r0 = 0
            if (r4 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 1
            java.lang.reflect.Constructor r4 = r4.getConstructor(r5)     // Catch:{ NoSuchMethodException -> 0x0013 }
            r3.mConstructor = r4     // Catch:{ NoSuchMethodException -> 0x0013 }
            goto L_0x003c
        L_0x0013:
            java.lang.Class<?> r4 = r3.mClass     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.Class<?>[] r5 = r3.mParameterTypes     // Catch:{ NoSuchMethodException -> 0x0021 }
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch:{ NoSuchMethodException -> 0x0021 }
            r3.mConstructor = r4     // Catch:{ NoSuchMethodException -> 0x0021 }
            r4.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0021 }
            goto L_0x003c
        L_0x0021:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "init error:"
            r5.append(r2)
            java.lang.String r4 = r4.getLocalizedMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "ReflectConstructor"
            com.tencent.xweb.util.XWebLog.m21909e(r5, r4)
        L_0x003c:
            java.lang.reflect.Constructor<?> r4 = r3.mConstructor
            if (r4 == 0) goto L_0x0041
            r0 = 1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.ReflectConstructor.init(java.lang.Class, java.lang.Class[]):boolean");
    }

    public boolean isNull() {
        return this.mConstructor == null;
    }

    public Object newInstance(Object... objArr) {
        Constructor<?> constructor = this.mConstructor;
        if (constructor != null) {
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                throw new RejectedExecutionException(e);
            } catch (InstantiationException e2) {
                throw new RejectedExecutionException(e2);
            } catch (IllegalArgumentException e3) {
                throw e3;
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        } else {
            throw new UnsupportedOperationException(toString());
        }
    }

    public String toString() {
        Constructor<?> constructor = this.mConstructor;
        if (constructor != null) {
            return constructor.toString();
        }
        if (this.mClass == null) {
            return "";
        }
        return "" + this.mClass.toString();
    }

    public ReflectConstructor(Class<?> cls, Class<?>... clsArr) {
        init(cls, clsArr);
    }
}
