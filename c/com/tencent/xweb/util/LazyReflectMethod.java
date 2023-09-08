package com.tencent.xweb.util;

public class LazyReflectMethod extends ReflectMethod {
    public static final String TAG = "LazyReflectMethod";
    private boolean mInited = false;

    public LazyReflectMethod() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|17|(3:19|20|34)|35|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r7.mMethod == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean doInit() {
        /*
            r7 = this;
            java.lang.Class<?> r0 = r7.mClass
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r7.mInited
            r2 = 1
            if (r0 == 0) goto L_0x0010
            java.lang.reflect.Method r0 = r7.mMethod
            if (r0 == 0) goto L_0x0010
            return r2
        L_0x0010:
            monitor-enter(r7)
            boolean r0 = r7.mInited     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0017
            monitor-exit(r7)     // Catch:{ all -> 0x005f }
            return r2
        L_0x0017:
            java.lang.Class<?> r0 = r7.mClass     // Catch:{ NoSuchMethodException -> 0x0024 }
            java.lang.String r3 = r7.mName     // Catch:{ NoSuchMethodException -> 0x0024 }
            java.lang.Class<?>[] r4 = r7.mParameterTypes     // Catch:{ NoSuchMethodException -> 0x0024 }
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0024 }
            r7.mMethod = r0     // Catch:{ NoSuchMethodException -> 0x0024 }
            goto L_0x0056
        L_0x0024:
            java.lang.Class<?> r0 = r7.mClass     // Catch:{ all -> 0x005f }
        L_0x0026:
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = r7.mName     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.Class<?>[] r4 = r7.mParameterTypes     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r7.mMethod = r3     // Catch:{ NoSuchMethodException -> 0x0036 }
            r3.setAccessible(r2)     // Catch:{ NoSuchMethodException -> 0x0036 }
            goto L_0x0056
        L_0x0036:
            r3 = move-exception
            java.lang.String r4 = "LazyReflectMethod"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r5.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "doInit error:"
            r5.append(r6)     // Catch:{ all -> 0x005f }
            java.lang.String r3 = r3.getLocalizedMessage()     // Catch:{ all -> 0x005f }
            r5.append(r3)     // Catch:{ all -> 0x005f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x005f }
            com.tencent.xweb.util.XWebLog.m21909e(r4, r3)     // Catch:{ all -> 0x005f }
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ all -> 0x005f }
            goto L_0x0026
        L_0x0056:
            r7.mInited = r2     // Catch:{ all -> 0x005f }
            monitor-exit(r7)     // Catch:{ all -> 0x005f }
            java.lang.reflect.Method r0 = r7.mMethod
            if (r0 == 0) goto L_0x005e
            r1 = 1
        L_0x005e:
            return r1
        L_0x005f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x005f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.LazyReflectMethod.doInit():boolean");
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
        this.mInited = false;
        return true;
    }

    public Object invoke(Object... objArr) {
        doInit();
        return super.invoke(objArr);
    }

    public boolean isNull() {
        doInit();
        return super.isNull();
    }

    public LazyReflectMethod(Object obj, String str, Class<?>... clsArr) {
        super(obj, str, clsArr);
    }

    public LazyReflectMethod(Class<?> cls, String str, Class<?>... clsArr) {
        super(cls, str, clsArr);
    }
}
