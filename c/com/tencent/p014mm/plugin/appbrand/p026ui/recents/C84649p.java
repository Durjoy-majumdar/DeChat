package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.p */
public class C84649p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherRecentsList f246959d;

    public C84649p(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        this.f246959d = appBrandLauncherRecentsList;
    }

    public void run() {
        int size = this.f246959d.f246853z.size();
        if (size > 0) {
            this.f246959d.f246853z.clear();
            this.f246959d.f246852y.notifyItemRangeRemoved(0, size);
        }
        AppBrandLauncherRecentsList.m104195S(this.f246959d);
        synchronized (this.f246959d.f246827R) {
            this.f246959d.f246827R.notifyAll();
        }
    }
}
