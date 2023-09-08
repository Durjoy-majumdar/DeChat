package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e */
public abstract class C82374e {

    /* renamed from: d */
    public String f241427d;

    public C82374e() {
        Assert.assertTrue("Must declare NAME in subclasses", !BuildInfo.DEBUG || mo114779e() != null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|16|17|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r2 = (java.lang.reflect.Field) b34.C79664a.m96759a(r3.getDeclaredField("NAME"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        throw new b34.C79665b(r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[Catch:{ NoSuchFieldException -> 0x0019, Exception -> 0x003a }, LOOP:0: B:8:0x001b->B:19:0x0042, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0043 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo114779e() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f241427d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0061
            java.lang.Class r0 = r5.getClass()     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = "NAME"
            java.lang.reflect.Field r2 = r0.getField(r1)     // Catch:{ NoSuchFieldException -> 0x0019 }
            java.lang.reflect.AccessibleObject r2 = b34.C79664a.m96759a(r2)     // Catch:{ NoSuchFieldException -> 0x0019 }
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch:{ NoSuchFieldException -> 0x0019 }
            goto L_0x0026
        L_0x0019:
            r2 = move-exception
            r3 = r0
        L_0x001b:
            java.lang.reflect.Field r4 = r3.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x003c }
            java.lang.reflect.AccessibleObject r4 = b34.C79664a.m96759a(r4)     // Catch:{ NoSuchFieldException -> 0x003c }
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch:{ NoSuchFieldException -> 0x003c }
            r2 = r4
        L_0x0026:
            java.lang.Class r1 = r2.getType()     // Catch:{ Exception -> 0x003a }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x003a }
            b34.a r2 = new b34.a     // Catch:{ Exception -> 0x003a }
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x003a }
            java.lang.Object r0 = r2.f233575b     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x004f }
            r5.f241427d = r0     // Catch:{ Exception -> 0x004f }
            goto L_0x0061
        L_0x003a:
            r0 = move-exception
            goto L_0x0049
        L_0x003c:
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0043
            goto L_0x001b
        L_0x0043:
            b34.b r0 = new b34.b     // Catch:{ Exception -> 0x003a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x003a }
            throw r0     // Catch:{ Exception -> 0x003a }
        L_0x0049:
            b34.b r1 = new b34.b     // Catch:{ Exception -> 0x004f }
            r1.<init>(r0)     // Catch:{ Exception -> 0x004f }
            throw r1     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r2] = r0
            java.lang.String r0 = "MicroMsg.AppBrand.BaseJsApi"
            java.lang.String r2 = "getName exp = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
        L_0x0061:
            java.lang.String r0 = r5.f241427d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C82374e.mo114779e():java.lang.String");
    }
}
