package com.tencent.p014mm.plugin.appbrand;

import java.util.Set;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$p */
public class AppBrandRuntime$$p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81974j3 f238195d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntime f238196e;

    public AppBrandRuntime$$p(AppBrandRuntime appBrandRuntime, C81974j3 j3Var) {
        this.f238196e = appBrandRuntime;
        this.f238195d = j3Var;
    }

    public void run() {
        Set set = this.f238196e.f238139b1.get(this.f238195d.f240377a);
        if (set != null) {
            set.remove(this.f238195d);
        }
    }
}
