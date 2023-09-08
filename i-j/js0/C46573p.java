package js0;

/* renamed from: js0.p */
public final class C46573p {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r3 == r0) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = r0.getDeclaredMethod(r4, r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[ExcHandler: all (r3v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m51896a(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object r5, java.lang.Class<?>[] r6, java.lang.Object[] r7) {
        /*
            if (r5 == 0) goto L_0x0039
            java.lang.Class r0 = r5.getClass()
            r1 = 0
            r2 = r1
        L_0x0008:
            if (r0 == 0) goto L_0x0021
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r4, r6)     // Catch:{ Exception -> 0x0011, all -> 0x000f }
            goto L_0x001c
        L_0x000f:
            r3 = move-exception
            goto L_0x0018
        L_0x0011:
            if (r3 != r0) goto L_0x001c
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r4, r6)     // Catch:{ Exception -> 0x001c, all -> 0x000f }
            goto L_0x001c
        L_0x0018:
            r0.getSuperclass()
            throw r3
        L_0x001c:
            java.lang.Class r0 = r0.getSuperclass()
            goto L_0x0008
        L_0x0021:
            if (r2 != 0) goto L_0x0024
            goto L_0x0038
        L_0x0024:
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x002d }
            java.lang.Object r1 = r2.invoke(r5, r7)     // Catch:{ Exception -> 0x002d }
            goto L_0x0038
        L_0x002d:
            r3 = move-exception
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "MicroMsg.ReflectUtil"
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r3, r6, r4)
        L_0x0038:
            return r1
        L_0x0039:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "instance cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: js0.C46573p.m51896a(java.lang.Class, java.lang.String, java.lang.Object, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }
}
