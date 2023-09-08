package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.d0 */
public final class C83155d0 {

    /* renamed from: a */
    public static Boolean f242964a;

    /* renamed from: b */
    public static Boolean f242965b;

    /* renamed from: a */
    public static void m102043a(C83165i iVar, int i, String str) {
        Log.m105925i("Luggage.NativeTransLogic", "initNativeTransComponentId componentId: %d appId:%s , stack: %s", Integer.valueOf(i), str, android.util.Log.getStackTraceString(new Throwable()));
        iVar.evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.id = " + i + "; };(function(){ return typeof ntrans })();", new d0$$a(i, str));
    }

    /* renamed from: b */
    public static void m102044b(C83165i iVar, int i, int i2, String str) {
        Log.m105925i("Luggage.NativeTransLogic", "initNativeTransServiceId serviceId:%d, componentId:%d, appId:%s, stack:%s", Integer.valueOf(i), Integer.valueOf(i2), str, android.util.Log.getStackTraceString(new Throwable()));
        iVar.evaluateJavascript("if (typeof ntrans !== 'undefined') { ntrans.serviceId = " + i + "; };(function(){ return typeof ntrans})();", new d0$$c(i, i2, str));
    }

    /* renamed from: c */
    public static boolean m102045c(C81879g gVar) {
        if (f242965b == null) {
            f242965b = Boolean.valueOf(Boolean.parseBoolean(gVar.mo114272k().Yk0("nativeTrans")));
        }
        return f242965b.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m102046d(com.tencent.p014mm.plugin.appbrand.C81925i2 r7) {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsruntime.d0> r0 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0.class
            monitor-enter(r0)
            r1 = 0
            r2 = 1355(0x54b, double:6.695E-321)
            if (r7 != 0) goto L_0x0018
            hr0.a r7 = com.tencent.p014mm.plugin.appbrand.jsruntime.d0$$d.f242966a     // Catch:{ all -> 0x0049 }
            r4 = 6
            r7.mo121688e(r2, r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = "Luggage.NativeTransLogic"
            java.lang.String r2 = "isServiceOpen component null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)
            return r1
        L_0x0018:
            boolean r7 = m102045c(r7)     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x0026
            hr0.a r4 = com.tencent.p014mm.plugin.appbrand.jsruntime.d0$$d.f242966a     // Catch:{ all -> 0x0049 }
            r5 = 4
            r4.mo121688e(r2, r5)     // Catch:{ all -> 0x0049 }
            goto L_0x002f
        L_0x0026:
            if (r7 != 0) goto L_0x002f
            hr0.a r4 = com.tencent.p014mm.plugin.appbrand.jsruntime.d0$$d.f242966a     // Catch:{ all -> 0x0049 }
            r5 = 5
            r4.mo121688e(r2, r5)     // Catch:{ all -> 0x0049 }
        L_0x002f:
            java.lang.String r2 = "Luggage.NativeTransLogic"
            java.lang.String r3 = "isServiceOpen isExprOpen:%b isLibMatch:%b"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0049 }
            r4[r1] = r5     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0049 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0049 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x0049 }
            if (r7 == 0) goto L_0x0047
            r1 = 1
        L_0x0047:
            monitor-exit(r0)
            return r1
        L_0x0049:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsruntime.C83155d0.m102046d(com.tencent.mm.plugin.appbrand.i2):boolean");
    }

    /* renamed from: e */
    public static synchronized boolean m102047e(C83780d1 d1Var) {
        boolean z;
        synchronized (C83155d0.class) {
            if (f242964a == null) {
                f242964a = Boolean.valueOf(XWebSdk.hasXWebFeature(2009));
            }
            boolean booleanValue = Boolean.valueOf(f242964a.booleanValue()).booleanValue();
            boolean c = m102045c(d1Var);
            if (booleanValue && c) {
                d0$$d.f242966a.mo121688e(1355, 0);
            } else if (!booleanValue) {
                d0$$d.f242966a.mo121688e(1355, 1);
            } else if (!c) {
                d0$$d.f242966a.mo121688e(1355, 2);
            } else if (!c && !booleanValue) {
                d0$$d.f242966a.mo121688e(1355, 3);
            }
            z = false;
            Log.m105925i("Luggage.NativeTransLogic", "isWebViewOpen exprOpen:%b webviewMatch:%b libMatch:%b", Boolean.TRUE, Boolean.valueOf(booleanValue), Boolean.valueOf(c));
            if (booleanValue && c) {
                z = true;
            }
        }
        return z;
    }
}
