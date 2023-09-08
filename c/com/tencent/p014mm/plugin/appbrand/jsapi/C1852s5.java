package com.tencent.p014mm.plugin.appbrand.jsapi;

import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.s5 */
public final class C1852s5 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C1877t5 f11664a;

    /* renamed from: b */
    public final /* synthetic */ C82554k f11665b;

    /* renamed from: c */
    public final /* synthetic */ int f11666c;

    public C1852s5(C1877t5 t5Var, C82554k kVar, int i) {
        this.f11664a = t5Var;
        this.f11665b = kVar;
        this.f11666c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if ((r10 == -1) != false) goto L_0x002d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1596b(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.JsApiRequestSnsPayment"
            java.lang.String r4 = "on Activity result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            com.tencent.mm.plugin.appbrand.jsapi.t5 r1 = r8.f11664a
            int r1 = r1.f11716g
            if (r9 == r1) goto L_0x0018
            return r3
        L_0x0018:
            r9 = 0
            if (r11 == 0) goto L_0x002c
            java.lang.String r1 = "ret"
            java.lang.String r1 = r11.getStringExtra(r1)
            if (r1 == 0) goto L_0x002c
            r2 = -1
            if (r10 != r2) goto L_0x0028
            r10 = 1
            goto L_0x0029
        L_0x0028:
            r10 = 0
        L_0x0029:
            if (r10 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r9
        L_0x002d:
            java.lang.String r10 = "transaction_id"
            if (r11 == 0) goto L_0x0037
            java.lang.String r2 = r11.getStringExtra(r10)
            goto L_0x0038
        L_0x0037:
            r2 = r9
        L_0x0038:
            com.tencent.mm.plugin.appbrand.jsapi.t5 r4 = r8.f11664a
            if (r1 != 0) goto L_0x003f
            java.lang.String r5 = "fail"
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            fl0.c r1 = fl0.C86920e.f252311a
            goto L_0x0047
        L_0x0045:
            fl0.c r1 = fl0.C86920e.f252314d
        L_0x0047:
            rx3.l[] r6 = new rx3.C13604l[r0]
            rx3.l r7 = new rx3.l
            r7.<init>(r10, r2)
            r6[r3] = r7
            java.util.HashMap r10 = sx3.C90364q0.m113146e(r6)
            java.lang.String r10 = r4.mo115110k(r5, r1, r10)
            com.tencent.mm.plugin.appbrand.jsapi.k r1 = r8.f11665b
            int r2 = r8.f11666c
            r1.mo109647a(r2, r10)
            com.tencent.mm.plugin.appbrand.jsapi.k r10 = r8.f11665b
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r10 = r10.getRuntime()
            if (r11 == 0) goto L_0x0070
            java.lang.String r1 = "closeWindow"
            int r11 = r11.getIntExtra(r1, r3)
            if (r11 != r0) goto L_0x0070
            r3 = 1
        L_0x0070:
            if (r3 == 0) goto L_0x0073
            r9 = r10
        L_0x0073:
            if (r9 == 0) goto L_0x0078
            r9.mo113063k()
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C1852s5.mo1596b(int, int, android.content.Intent):boolean");
    }
}
