package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.s */
public class C83026s extends C82016a0<C82554k> {
    public static final int CTRL_INDEX = 17;
    public static final String NAME = "getStorageSync";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo1731t(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r13, org.json.JSONObject r14) {
        /*
            r12 = this;
            r6 = r13
            com.tencent.mm.plugin.appbrand.jsapi.k r6 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82554k) r6
            java.lang.String r13 = "key"
            java.lang.String r13 = r14.optString(r13)
            r0 = 0
            java.lang.String r1 = "storageId"
            int r14 = r14.optInt(r1, r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r1 == 0) goto L_0x001f
            java.lang.String r13 = "fail:key is empty"
            java.lang.String r13 = r12.mo115109j(r13)
            goto L_0x00eb
        L_0x001f:
            boolean r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0.m99897c(r14)
            if (r1 == 0) goto L_0x002d
            java.lang.String r13 = "fail:nonexistent storage space"
            java.lang.String r13 = r12.mo115109j(r13)
            goto L_0x00eb
        L_0x002d:
            java.lang.String r1 = r6.getAppId()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x003f
            java.lang.String r13 = "fail:appID is empty"
            java.lang.String r13 = r12.mo115109j(r13)
            goto L_0x00eb
        L_0x003f:
            long r2 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r6.getRuntime()
            wi0.l r4 = r4.mo113051d0()
            int r4 = r4.f261073s
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r5 = r6.getRuntime()
            wi0.l r5 = r5.mo113051d0()
            java.lang.String r5 = r5.f261075u
            java.lang.String r7 = ""
            r8 = 1
            r9 = 2
            if (r4 == r8) goto L_0x0088
            java.lang.Class<tb.a> r10 = p1039tb.C90388a.class
            ra.b r10 = p224ra.C89909e.m112436a(r10)
            tb.a r10 = (p1039tb.C90388a) r10
            java.lang.String r11 = r6.getAppId()
            com.tencent.mm.plugin.appbrand.appstorage.g0 r4 = r10.mo56837dI(r11, r4, r5)
            java.lang.Object[] r14 = r4.mo56596xf(r14, r1, r13)
            r0 = r14[r0]
            com.tencent.mm.plugin.appbrand.appstorage.g0$a r0 = (com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0.C29326a) r0
            com.tencent.mm.plugin.appbrand.appstorage.g0$a r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0.C29326a.NONE
            r4 = 0
            if (r0 != r1) goto L_0x0084
            r0 = r14[r8]
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            r14 = r14[r9]
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0085
        L_0x0084:
            r14 = r4
        L_0x0085:
            r8 = r4
            r0 = 2
            goto L_0x00bb
        L_0x0088:
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask r0 = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask
            r0.<init>()
            r0.f242667f = r1
            r0.f242668g = r14
            r0.f242674p = r13
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            int r1 = android.os.Process.myPid()
            r14.append(r1)
            r14.append(r7)
            int r1 = r12.hashCode()
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r0.f242677s = r14
            r0.mo114396f()
            java.lang.String r4 = r0.f242675q
            java.lang.String r14 = r0.f242676r
            r8 = r4
            r0 = 1
        L_0x00bb:
            int r13 = com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0.m99896b(r13, r8)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r1 = 2
            r3 = 1
            r2 = r13
            com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0.m99894a(r0, r1, r2, r3, r4, r6)
            if (r8 != 0) goto L_0x00cf
            java.lang.String r13 = "fail:data not found"
            goto L_0x00d1
        L_0x00cf:
            java.lang.String r13 = "ok"
        L_0x00d1:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r8 != 0) goto L_0x00d9
            r8 = r7
        L_0x00d9:
            java.lang.String r1 = "data"
            r0.put(r1, r8)
            if (r14 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r7 = r14
        L_0x00e2:
            java.lang.String r14 = "dataType"
            r0.put(r14, r7)
            java.lang.String r13 = r12.mo115112m(r13, r0)
        L_0x00eb:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83026s.mo1731t(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject):java.lang.String");
    }
}
