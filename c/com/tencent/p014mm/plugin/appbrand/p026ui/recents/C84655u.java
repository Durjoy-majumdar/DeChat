package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.u */
public class C84655u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84624c0 f246970d;

    /* renamed from: e */
    public final /* synthetic */ C54248l.C54251c f246971e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandLauncherRecentsList f246972f;

    public C84655u(AppBrandLauncherRecentsList appBrandLauncherRecentsList, C84624c0 c0Var, C54248l.C54251c cVar) {
        this.f246972f = appBrandLauncherRecentsList;
        this.f246970d = c0Var;
        this.f246971e = cVar;
    }

    public void run() {
        LoadMoreRecyclerView loadMoreRecyclerView = this.f246972f.f246849w;
        if (loadMoreRecyclerView != null && loadMoreRecyclerView.isAttachedToWindow()) {
            if (this.f246972f.f246849w.mo17036W0()) {
                AppBrandLauncherRecentsList.C84605j jVar = this.f246972f.f246812B;
                jVar.sendMessage(jVar.obtainMessage(2, this));
                return;
            }
            this.f246972f.f246853z.clear();
            this.f246972f.f246853z.addAll(this.f246970d);
            MMHandlerThread.setCurrentPriority(-8);
            this.f246971e.mo75045a(this.f246972f.f246828S);
        }
    }
}
