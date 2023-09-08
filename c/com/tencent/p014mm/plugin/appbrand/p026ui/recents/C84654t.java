package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.t */
public class C84654t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84624c0 f246968d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandLauncherRecentsList f246969e;

    public C84654t(AppBrandLauncherRecentsList appBrandLauncherRecentsList, C84624c0 c0Var) {
        this.f246969e = appBrandLauncherRecentsList;
        this.f246968d = c0Var;
    }

    public void run() {
        if (!Util.isNullOrNil((List) this.f246969e.f246853z)) {
            int size = this.f246969e.f246853z.size();
            this.f246969e.f246853z.clear();
            this.f246969e.f246852y.notifyItemRangeRemoved(0, size);
        }
        this.f246969e.f246853z.addAll(this.f246968d);
        this.f246969e.f246852y.notifyItemRangeInserted(0, this.f246968d.size());
        synchronized (this.f246969e.f246827R) {
            this.f246969e.f246827R.notifyAll();
        }
    }
}
