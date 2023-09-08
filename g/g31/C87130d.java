package g31;

import c31.C79925c;

/* renamed from: g31.d */
public class C87130d implements C79925c {
    /* renamed from: a */
    public boolean mo58760a(int i) {
        return i < 26;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo58763d() {
        /*
            r10 = this;
            java.lang.String r0 = "sService"
            java.lang.String r1 = "MicroMsg.ToastBadTokenFix"
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class<lj.a> r5 = p910lj.C76701a.class
            java.lang.String r6 = "getService"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            r5.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            r5.invoke(r2, r6)     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            java.lang.Class<lj.a> r5 = p910lj.C76701a.class
            java.lang.reflect.Field r5 = r5.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            r5.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ NoSuchFieldException -> 0x0043, IllegalAccessException -> 0x003a, NoSuchMethodException -> 0x0031, InvocationTargetException -> 0x0028 }
            goto L_0x004c
        L_0x0028:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            goto L_0x004b
        L_0x0031:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            goto L_0x004b
        L_0x003a:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
            goto L_0x004b
        L_0x0043:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r5)
        L_0x004b:
            r5 = r2
        L_0x004c:
            if (r5 == 0) goto L_0x00c0
            java.lang.Object r6 = g31.C87129c.f252719a
            if (r6 != 0) goto L_0x008a
            java.lang.Class r6 = r5.getClass()     // Catch:{ Exception -> 0x0080 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x0080 }
            java.lang.Class r7 = r5.getClass()     // Catch:{ Exception -> 0x0080 }
            java.lang.Class[] r7 = r7.getInterfaces()     // Catch:{ Exception -> 0x0080 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0080 }
            r9 = 25
            if (r8 != r9) goto L_0x0074
            g31.b r8 = new g31.b     // Catch:{ Exception -> 0x0080 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0080 }
            java.lang.Object r5 = java.lang.reflect.Proxy.newProxyInstance(r6, r7, r8)     // Catch:{ Exception -> 0x0080 }
            g31.C87129c.f252719a = r5     // Catch:{ Exception -> 0x0080 }
            goto L_0x008a
        L_0x0074:
            g31.a r8 = new g31.a     // Catch:{ Exception -> 0x0080 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0080 }
            java.lang.Object r5 = java.lang.reflect.Proxy.newProxyInstance(r6, r7, r8)     // Catch:{ Exception -> 0x0080 }
            g31.C87129c.f252719a = r5     // Catch:{ Exception -> 0x0080 }
            goto L_0x008a
        L_0x0080:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "MicroMsg.ProxyNotificationManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
        L_0x008a:
            java.lang.Object r5 = g31.C87129c.f252719a
            if (r5 != 0) goto L_0x0094
            java.lang.String r0 = "INotificationManagerInvocationHandler.getProxy null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return r4
        L_0x0094:
            java.lang.String r6 = "INotificationManagerInvocationHandler.getProxy succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            java.lang.Class<lj.a> r6 = p910lj.C76701a.class
            java.lang.reflect.Field r0 = r6.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x00b8, IllegalAccessException -> 0x00af }
            r0.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x00b8, IllegalAccessException -> 0x00af }
            a31.C67003a.m79166a(r0)     // Catch:{ NoSuchFieldException -> 0x00b8, IllegalAccessException -> 0x00af }
            r0.set(r2, r5)     // Catch:{ NoSuchFieldException -> 0x00b8, IllegalAccessException -> 0x00af }
            java.lang.String r0 = "replace succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ NoSuchFieldException -> 0x00b8, IllegalAccessException -> 0x00af }
            return r3
        L_0x00af:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x00c0
        L_0x00b8:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x00c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g31.C87130d.mo58763d():boolean");
    }
}
