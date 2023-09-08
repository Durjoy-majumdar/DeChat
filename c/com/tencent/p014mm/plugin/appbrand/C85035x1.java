package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction;

/* renamed from: com.tencent.mm.plugin.appbrand.x1 */
public class C85035x1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLaunchErrorAction f247805d;

    /* renamed from: e */
    public final /* synthetic */ C81108a2 f247806e;

    public C85035x1(C81108a2 a2Var, AppBrandLaunchErrorAction appBrandLaunchErrorAction) {
        this.f247806e = a2Var;
        this.f247805d = appBrandLaunchErrorAction;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r3 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction r0 = r4.f247805d
            if (r0 == 0) goto L_0x0035
            com.tencent.mm.plugin.appbrand.a2 r1 = r4.f247806e
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.f238378h
            android.app.Activity r2 = r1.mo113026R()
            r0.getClass()
            if (r2 == 0) goto L_0x001d
            boolean r3 = r2.isFinishing()
            if (r3 != 0) goto L_0x001d
            boolean r3 = r2.isDestroyed()
            if (r3 == 0) goto L_0x0021
        L_0x001d:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x0021:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r1.mo113210l1()
            com.tencent.luggage.sdk.launching.h r1 = r1.f234829Y0
            com.tencent.luggage.sdk.launching.h[] r3 = com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.f243115f
            boolean r1 = u24.C90595a.m113498b(r3, r1)
            if (r1 == 0) goto L_0x0030
            goto L_0x0035
        L_0x0030:
            java.lang.String r1 = "handleSync"
            r0.mo115478a(r2, r1)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C85035x1.run():void");
    }
}
