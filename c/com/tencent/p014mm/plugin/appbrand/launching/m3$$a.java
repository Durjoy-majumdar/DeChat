package com.tencent.p014mm.plugin.appbrand.launching;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.m3$$a */
public final /* synthetic */ class m3$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83385m3 f243637d;

    /* renamed from: e */
    public final /* synthetic */ m3$$b f243638e;

    public /* synthetic */ m3$$a(C83385m3 m3Var, m3$$b m3__b) {
        this.f243637d = m3Var;
        this.f243638e = m3__b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if ((r2.mo115706a() && ((com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r2.getBaseContext()).isDestroyed()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.launching.m3 r0 = r6.f243637d
            com.tencent.mm.plugin.appbrand.launching.m3$$b r1 = r6.f243638e
            r0.getClass()
            com.tencent.mm.plugin.appbrand.launching.precondition.c r1 = (com.tencent.p014mm.plugin.appbrand.launching.precondition.C83412c) r1
            com.tencent.mm.plugin.appbrand.launching.precondition.a r2 = r1.f243767d
            android.content.Context r2 = r2.getBaseContext()
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0020
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI r2 = (com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r2
            boolean r2 = r2.isFinishing()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 != 0) goto L_0x0029
            java.lang.String r1 = "ActivityProxy !canStartActivityForResult()"
            r0.mo115658b((java.lang.String) r1)
            goto L_0x0079
        L_0x0029:
            com.tencent.mm.plugin.appbrand.launching.precondition.a r2 = r1.f243767d
            boolean r2 = r2.mo115707b()
            if (r2 != 0) goto L_0x004a
            com.tencent.mm.plugin.appbrand.launching.precondition.a r2 = r1.f243767d
            boolean r3 = r2.mo115706a()
            if (r3 == 0) goto L_0x0047
            android.content.Context r2 = r2.getBaseContext()
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI r2 = (com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r2
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x004b
        L_0x004a:
            r4 = 1
        L_0x004b:
            if (r4 == 0) goto L_0x0053
            java.lang.String r1 = "ActivityProxy destroyed or finishing"
            r0.mo115658b((java.lang.String) r1)
            goto L_0x0079
        L_0x0053:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            com.tencent.mm.plugin.appbrand.launching.precondition.a r3 = r1.f243767d
            android.content.Context r3 = r3.getBaseContext()
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI> r4 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandXWebDownloadProxyUI.class
            android.content.Intent r2 = r2.setClass(r3, r4)
            java.lang.String r3 = "intent_extra_download_ignore_network_type"
            android.content.Intent r2 = r2.putExtra(r3, r5)
            int r3 = r0.f243636d
            com.tencent.mm.plugin.appbrand.launching.precondition.a r1 = r1.f243767d
            android.content.Context r1 = r1.getBaseContext()
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI r1 = (com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r1
            r1.f243129r = r0
            r1.startActivityForResult((android.content.Intent) r2, (int) r3)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.m3$$a.run():void");
    }
}
