package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import bh3.C113177k;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import wi0.C90988l;
import wq0.C91075m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.a0 */
public final class C84714a0 implements C91075m {

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.a0$a */
    public static final class C84715a implements C113177k.C79704f {

        /* renamed from: a */
        public final /* synthetic */ C82381f f247104a;

        /* renamed from: b */
        public final /* synthetic */ String f247105b;

        /* renamed from: c */
        public final /* synthetic */ int f247106c;

        /* renamed from: d */
        public final /* synthetic */ C91075m.C91076a f247107d;

        /* renamed from: com.tencent.mm.plugin.appbrand.utils.a0$a$a */
        public /* synthetic */ class C84716a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f247108a;

            static {
                int[] iArr = new int[C113177k.C79703c.values().length];
                iArr[2] = 1;
                f247108a = iArr;
            }
        }

        public C84715a(C82381f fVar, String str, int i, C91075m.C91076a aVar) {
            this.f247104a = fVar;
            this.f247105b = str;
            this.f247106c = i;
            this.f247107d = aVar;
        }

        /* renamed from: a */
        public final void mo109818a(C113177k.C79703c cVar) {
            Log.m105924i("MicroMsg.AppBrandPermissionDelegateLogic", "requestPermission appid:" + this.f247104a.getAppId() + " permission:" + this.f247105b + " business:" + this.f247106c + " grantResult:" + cVar);
            int i = -1;
            if ((cVar == null ? -1 : C84716a.f247108a[cVar.ordinal()]) == 1) {
                i = 0;
            }
            C91075m.C91076a aVar = this.f247107d;
            if (aVar != null) {
                aVar.mo117448a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
        r2 = ((bh3.C113177k) di3.C86312j.m106911c(r0)).gl0(r5.getAppId(), r12);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo117443a(android.app.Activity r10, com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r11, java.lang.String r12, wq0.C91075m.C91076a r13) {
        /*
            r9 = this;
            java.lang.Class<bh3.k> r0 = bh3.C113177k.class
            java.lang.String r1 = "component"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.String r1 = "permission"
            gy3.C87412m.m108594g(r12, r1)
            int r6 = r9.mo117446d(r11)
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = gy3.C87412m.m108589b(r12, r1)
            r2 = 0
            java.lang.String r3 = "MicroMsg.AppBrandPermissionDelegateLogic"
            java.lang.String r4 = " permission:"
            if (r1 != 0) goto L_0x001f
            goto L_0x006f
        L_0x001f:
            r5 = r11
            com.tencent.mm.plugin.appbrand.g r5 = (com.tencent.p014mm.plugin.appbrand.C81879g) r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r5.getRuntime()
            wi0.l r7 = r7.mo113051d0()
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC"
            gy3.C87412m.m108592e(r7, r8)
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r7 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC) r7
            int r8 = r7.f239417f1
            r1 = r1 & r8
            if (r1 != 0) goto L_0x0037
            goto L_0x006f
        L_0x0037:
            di3.d r1 = di3.C86312j.m106911c(r0)
            bh3.k r1 = (bh3.C113177k) r1
            java.lang.String r2 = r5.getAppId()
            boolean r2 = r1.gl0(r2, r12)
            if (r2 == 0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "hit limit appId:"
            r1.append(r8)
            java.lang.String r5 = r5.getAppId()
            r1.append(r5)
            r1.append(r4)
            r1.append(r12)
            java.lang.String r5 = " flag:"
            r1.append(r5)
            int r5 = r7.f239417f1
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
        L_0x006f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "requestPermission appid:"
            r1.append(r5)
            java.lang.String r5 = r11.getAppId()
            r1.append(r5)
            r1.append(r4)
            r1.append(r12)
            java.lang.String r4 = " business:"
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = " isLimit:"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r2 == 0) goto L_0x00a7
            if (r13 == 0) goto L_0x00a6
            r10 = -1
            r13.mo117448a(r10)
        L_0x00a6:
            return
        L_0x00a7:
            di3.d r0 = di3.C86312j.m106911c(r0)
            r2 = r0
            bh3.k r2 = (bh3.C113177k) r2
            java.lang.String r4 = r11.getAppId()
            com.tencent.mm.plugin.appbrand.utils.a0$a r7 = new com.tencent.mm.plugin.appbrand.utils.a0$a
            r7.<init>(r11, r12, r6, r13)
            r3 = r10
            r5 = r12
            r2.mo165713kx(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84714a0.mo117443a(android.app.Activity, com.tencent.mm.plugin.appbrand.jsapi.f, java.lang.String, wq0.m$a):void");
    }

    /* renamed from: b */
    public boolean mo117444b(Context context, C82381f fVar, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fVar, "component");
        int d = mo117446d(fVar);
        C113177k.C79703c ls02 = ((C113177k) C86312j.m106911c(C113177k.class)).ls0(context, str, d);
        Log.m105924i("MicroMsg.AppBrandPermissionDelegateLogic", "isPermissionGranted permission: business:" + d + ' ' + str + " ret:" + ls02);
        return ls02 == C113177k.C79703c.GRANTED;
    }

    /* renamed from: c */
    public boolean mo117445c() {
        return !((C113177k) C86312j.m106911c(C113177k.class)).vf0();
    }

    /* renamed from: d */
    public final int mo117446d(C82381f fVar) {
        C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandComponentWxaShared");
        C81879g gVar = (C81879g) fVar;
        AppBrandRuntime runtime = gVar.getRuntime();
        AppBrandSysConfigWC appBrandSysConfigWC = null;
        C90988l d0 = runtime != null ? runtime.mo113051d0() : null;
        if (d0 instanceof AppBrandSysConfigWC) {
            appBrandSysConfigWC = (AppBrandSysConfigWC) d0;
        }
        int i = appBrandSysConfigWC != null ? appBrandSysConfigWC.f239416e1 : 0;
        return i <= 0 ? AppBrandRuntimeWCAccessible.m99328d(gVar.getRuntime()) ? C113177k.C113178a.APPBRAND_FAKE_NATIVE_DEFAULT.f338662e : C113177k.C113178a.APPBRAND.f338662e : i;
    }
}
