package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.i */
public class C83337i implements AppBrandProcessProxyUI.C81940e {

    /* renamed from: a */
    public final /* synthetic */ Runnable f243530a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandPreInitTask f243531b;

    public C83337i(AppBrandPreInitTask appBrandPreInitTask, Runnable runnable) {
        this.f243531b = appBrandPreInitTask;
        this.f243530a = runnable;
    }

    /* renamed from: a */
    public void mo114365a() {
        this.f243531b.f243149s = false;
        this.f243530a.run();
    }

    public void cancel() {
        AppBrandPreInitTask appBrandPreInitTask = this.f243531b;
        appBrandPreInitTask.f243149s = true;
        appBrandPreInitTask.mo114394b();
    }
}
