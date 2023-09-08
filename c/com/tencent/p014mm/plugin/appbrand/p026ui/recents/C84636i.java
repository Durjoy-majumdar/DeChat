package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.i */
public class C84636i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherRecentsList f246939d;

    public C84636i(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f246939d = appBrandLauncherRecentsList;
    }

    public void run() {
        if (this.f246939d.f246849w.computeVerticalScrollOffset() == 0) {
            AppBrandLauncherRecentsList appBrandLauncherRecentsList = this.f246939d;
            appBrandLauncherRecentsList.f246849w.scrollBy(0, appBrandLauncherRecentsList.f246815E.getTop());
        }
    }
}
