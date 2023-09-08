package com.tencent.tinker.loader.hotplug.handler;

import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor;
import java.lang.reflect.Method;

public class PMSInterceptHandler implements ServiceBinderInterceptor.BinderInvocationHandler {
    private static final String TAG = "Tinker.PMSIntrcptHndlr";

    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object handleGetActivityInfo(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
        /*
            r8 = this;
            java.lang.String r0 = "unexpected exception."
            java.lang.String r1 = "Tinker.PMSIntrcptHndlr"
            java.lang.Class[] r2 = r10.getExceptionTypes()
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.Object r9 = r10.invoke(r9, r11)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            if (r9 == 0) goto L_0x0013
            return r9
        L_0x0013:
            r9 = 0
        L_0x0014:
            int r6 = r11.length     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            if (r9 >= r6) goto L_0x0047
            r6 = r11[r9]     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            boolean r6 = r6 instanceof android.content.ComponentName     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            if (r6 == 0) goto L_0x0044
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            r6.<init>()     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r7 = "locate componentName field of "
            r6.append(r7)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r7 = r10.getName()     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            r6.append(r7)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r7 = " done at idx: "
            r6.append(r7)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            r6.append(r9)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r6 = r6.toString()     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r1, r6, r7)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            r9 = r11[r9]     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            android.content.ComponentName r9 = (android.content.ComponentName) r9     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            goto L_0x0048
        L_0x0044:
            int r9 = r9 + 1
            goto L_0x0014
        L_0x0047:
            r9 = r4
        L_0x0048:
            if (r9 == 0) goto L_0x0053
            java.lang.String r9 = r9.getClassName()     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            android.content.pm.ActivityInfo r9 = com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(r9)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            return r9
        L_0x0053:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            r9.<init>()     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r11 = "failed to locate componentName field of "
            r9.append(r11)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r10 = r10.getName()     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            r9.append(r10)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r10 = ", notice any crashes or mistakes after resolve works."
            r9.append(r10)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.String r9 = r9.toString()     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r9, r10)     // Catch:{ InvocationTargetException -> 0x007c, all -> 0x0073 }
            return r4
        L_0x0073:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r5] = r9
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r1, r0, r10)
            return r4
        L_0x007c:
            r9 = move-exception
            java.lang.Throwable r10 = r9.getTargetException()
            if (r2 == 0) goto L_0x008a
            int r11 = r2.length
            if (r11 <= 0) goto L_0x008a
            if (r10 == 0) goto L_0x0089
            r9 = r10
        L_0x0089:
            throw r9
        L_0x008a:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            if (r10 == 0) goto L_0x008f
            r9 = r10
        L_0x008f:
            r11[r5] = r9
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r1, r0, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.hotplug.handler.PMSInterceptHandler.handleGetActivityInfo(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object handleResolveIntent(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
        /*
            r8 = this;
            java.lang.String r0 = "unexpected exception."
            java.lang.String r1 = "Tinker.PMSIntrcptHndlr"
            java.lang.Class[] r2 = r10.getExceptionTypes()
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.Object r9 = r10.invoke(r9, r11)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            if (r9 == 0) goto L_0x0013
            return r9
        L_0x0013:
            java.lang.String r9 = "failed to resolve activity in base package, try again in patch package."
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r9, r6)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            r9 = 0
        L_0x001b:
            int r6 = r11.length     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            if (r9 >= r6) goto L_0x004e
            r6 = r11[r9]     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            boolean r6 = r6 instanceof android.content.Intent     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            if (r6 == 0) goto L_0x004b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            r6.<init>()     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r7 = "locate intent field of "
            r6.append(r7)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r7 = r10.getName()     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            r6.append(r7)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r7 = " done at idx: "
            r6.append(r7)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            r6.append(r9)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r6 = r6.toString()     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r1, r6, r7)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            r9 = r11[r9]     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            android.content.Intent r9 = (android.content.Intent) r9     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            goto L_0x004f
        L_0x004b:
            int r9 = r9 + 1
            goto L_0x001b
        L_0x004e:
            r9 = r4
        L_0x004f:
            if (r9 == 0) goto L_0x0056
            android.content.pm.ResolveInfo r9 = com.tencent.tinker.loader.hotplug.IncrementComponentManager.resolveIntent(r9)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            return r9
        L_0x0056:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            r9.<init>()     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r11 = "failed to locate intent field of "
            r9.append(r11)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r10 = r10.getName()     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            r9.append(r10)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r10 = ", notice any crashes or mistakes after resolve works."
            r9.append(r10)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.String r9 = r9.toString()     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r9, r10)     // Catch:{ InvocationTargetException -> 0x007f, all -> 0x0076 }
            return r4
        L_0x0076:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r5] = r9
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r1, r0, r10)
            return r4
        L_0x007f:
            r9 = move-exception
            java.lang.Throwable r10 = r9.getTargetException()
            if (r2 == 0) goto L_0x008d
            int r11 = r2.length
            if (r11 <= 0) goto L_0x008d
            if (r10 == 0) goto L_0x008c
            r9 = r10
        L_0x008c:
            throw r9
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            if (r10 == 0) goto L_0x0092
            r9 = r10
        L_0x0092:
            r11[r5] = r9
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r1, r0, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.hotplug.handler.PMSInterceptHandler.handleResolveIntent(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        return "getActivityInfo".equals(name) ? handleGetActivityInfo(obj, method, objArr) : "resolveIntent".equals(name) ? handleResolveIntent(obj, method, objArr) : method.invoke(obj, objArr);
    }
}
