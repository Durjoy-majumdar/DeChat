package com.tencent.p014mm.plugin.appbrand.app;

/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$$c */
public class AppBrandProcessSuicideLogic$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Class f238441d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProcessSuicideLogic f238442e;

    public AppBrandProcessSuicideLogic$$c(AppBrandProcessSuicideLogic appBrandProcessSuicideLogic, Class cls) {
        this.f238442e = appBrandProcessSuicideLogic;
        this.f238441d = cls;
    }

    public void run() {
        this.f238442e.mo113317M(this.f238441d, AppBrandProcessSuicideLogic$$d.NO_ACTIVITIES_LEFT);
    }
}
