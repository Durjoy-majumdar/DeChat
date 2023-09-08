package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.s */
public class C84653s implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f246966d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandLauncherRecentsList f246967e;

    public C84653s(AppBrandLauncherRecentsList appBrandLauncherRecentsList, Runnable runnable) {
        this.f246967e = appBrandLauncherRecentsList;
        this.f246966d = runnable;
    }

    public boolean onPreDraw() {
        this.f246967e.f246849w.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f246967e.f246849w.post(this.f246966d);
        return false;
    }
}
