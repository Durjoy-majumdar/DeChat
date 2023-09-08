package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.j */
public class C84638j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f246942d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandLauncherRecentsList f246943e;

    public C84638j(AppBrandLauncherRecentsList appBrandLauncherRecentsList, Runnable runnable) {
        this.f246943e = appBrandLauncherRecentsList;
        this.f246942d = runnable;
    }

    public boolean onPreDraw() {
        this.f246943e.f246815E.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f246942d.run();
        return false;
    }
}
