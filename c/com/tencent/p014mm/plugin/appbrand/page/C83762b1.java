package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import java.util.Set;
import js0.C88021l;
import lb0.C88394b;

/* renamed from: com.tencent.mm.plugin.appbrand.page.b1 */
public final class C83762b1 {

    /* renamed from: a */
    public static final C88394b.C88412n f244498a = new C88394b.C88401f();

    /* renamed from: b */
    public static final C88021l<AppBrandRuntime, String> f244499b = new C88021l<>();

    /* renamed from: a */
    public static void m102897a(AppBrandRuntime appBrandRuntime) {
        Set<String> g;
        if (appBrandRuntime != null && (g = f244499b.mo122466g(appBrandRuntime)) != null) {
            for (String next : g) {
                C88394b.C88401f fVar = (C88394b.C88401f) f244498a;
                synchronized (fVar.f255405a) {
                    fVar.f255405a.remove(next);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r5 == null) goto L_0x0075;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m102898b(com.tencent.p014mm.plugin.appbrand.AppBrandRuntime r5, java.lang.String r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99874h(r6)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 == 0) goto L_0x000f
            return r0
        L_0x000f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r5.hashCode()
            int r2 = r2 + 35
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            js0.l<com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.String> r2 = f244499b
            r2.mo122464e(r5, r1)
            lb0.b$n r2 = f244498a
            r3 = r2
            lb0.b$f r3 = (lb0.C88394b.C88401f) r3
            android.graphics.Bitmap r3 = r3.mo122810b(r1)
            if (r3 == 0) goto L_0x003b
            boolean r4 = r3.isRecycled()
            if (r4 != 0) goto L_0x003b
            return r3
        L_0x003b:
            java.io.InputStream r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81247g3.m99557m(r5, r6)
            if (r5 == 0) goto L_0x007c
            int r6 = r5.available()     // Catch:{ IOException -> 0x0063 }
            if (r6 > 0) goto L_0x0048
            goto L_0x007c
        L_0x0048:
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r5)     // Catch:{ IOException -> 0x0063 }
            if (r6 == 0) goto L_0x005d
            boolean r3 = r6.isRecycled()     // Catch:{ IOException -> 0x0063 }
            if (r3 != 0) goto L_0x005d
            lb0.b$f r2 = (lb0.C88394b.C88401f) r2     // Catch:{ IOException -> 0x0063 }
            r2.mo122811c(r1, r6)     // Catch:{ IOException -> 0x0063 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            return r6
        L_0x005d:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            goto L_0x0075
        L_0x0061:
            r6 = move-exception
            goto L_0x0076
        L_0x0063:
            r6 = move-exception
            java.lang.String r1 = "MicroMsg.AppBrandPageIconCache"
            java.lang.String r2 = "try decode icon e = %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0061 }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0061 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0075
            goto L_0x005d
        L_0x0075:
            return r0
        L_0x0076:
            if (r5 == 0) goto L_0x007b
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
        L_0x007b:
            throw r6
        L_0x007c:
            if (r5 == 0) goto L_0x0081
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C83762b1.m102898b(com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.String):android.graphics.Bitmap");
    }
}
