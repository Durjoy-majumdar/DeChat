package p832y8;

/* renamed from: y8.d */
public final class C53504d {

    /* renamed from: a */
    public static final Object f150456a;

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005e */
    static {
        /*
            java.lang.String r0 = "sun.misc.JavaLangAccess"
            java.lang.String r1 = "getJavaLangAccess"
            java.lang.String r2 = "sun.misc.SharedSecrets"
            r3 = 0
            r4 = 0
            java.lang.Class r5 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ThreadDeath -> 0x0072, all -> 0x0019 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ThreadDeath -> 0x0072, all -> 0x0019 }
            java.lang.reflect.Method r5 = r5.getMethod(r1, r6)     // Catch:{ ThreadDeath -> 0x0072, all -> 0x0019 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ThreadDeath -> 0x0072, all -> 0x0019 }
            java.lang.Object r5 = r5.invoke(r3, r6)     // Catch:{ ThreadDeath -> 0x0072, all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
            r5 = r3
        L_0x001a:
            f150456a = r5
            r6 = 1
            if (r5 != 0) goto L_0x0020
            goto L_0x0036
        L_0x0020:
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r4] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r7[r6] = r8
            java.lang.String r8 = "getStackTraceElement"
            java.lang.Class r9 = java.lang.Class.forName(r0, r4, r3)     // Catch:{ ThreadDeath -> 0x0070, all -> 0x0035 }
            r9.getMethod(r8, r7)     // Catch:{ ThreadDeath -> 0x0070, all -> 0x0035 }
            goto L_0x0036
        L_0x0035:
        L_0x0036:
            if (r5 != 0) goto L_0x0039
            goto L_0x006f
        L_0x0039:
            java.lang.String r5 = "getStackTraceDepth"
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r4] = r8     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r3)     // Catch:{ ThreadDeath -> 0x006d, all -> 0x004a }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch:{ ThreadDeath -> 0x006d, all -> 0x004a }
            goto L_0x004b
        L_0x004a:
            r0 = r3
        L_0x004b:
            if (r0 != 0) goto L_0x004e
            goto L_0x006f
        L_0x004e:
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ThreadDeath -> 0x006b, all -> 0x005e }
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ ThreadDeath -> 0x006b, all -> 0x005e }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r5)     // Catch:{ ThreadDeath -> 0x006b, all -> 0x005e }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ ThreadDeath -> 0x006b, all -> 0x005e }
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch:{ ThreadDeath -> 0x006b, all -> 0x005e }
        L_0x005e:
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
            r2.<init>()     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
            r1[r4] = r2     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
            r0.invoke(r3, r1)     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
        L_0x006d:
            r0 = move-exception
            throw r0     // Catch:{ IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x006f }
        L_0x006f:
            return
        L_0x0070:
            r0 = move-exception
            throw r0
        L_0x0072:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p832y8.C53504d.<clinit>():void");
    }

    /* renamed from: a */
    public static void m60045a(Throwable th) {
        th.getClass();
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
