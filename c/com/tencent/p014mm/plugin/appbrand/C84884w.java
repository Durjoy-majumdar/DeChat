package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.mm.plugin.appbrand.w */
public class C84884w implements AppBrandRuntime$$y {

    /* renamed from: d */
    public final /* synthetic */ ConcurrentLinkedQueue f247404d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntime$$z f247405e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandRuntime$$y f247406f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandRuntime f247407g;

    public C84884w(AppBrandRuntime appBrandRuntime, ConcurrentLinkedQueue concurrentLinkedQueue, AppBrandRuntime$$z appBrandRuntime$$z, AppBrandRuntime$$y appBrandRuntime$$y) {
        this.f247407g = appBrandRuntime;
        this.f247404d = concurrentLinkedQueue;
        this.f247405e = appBrandRuntime$$z;
        this.f247406f = appBrandRuntime$$y;
    }

    /* renamed from: a */
    public void mo113094a() {
        if (!this.f247404d.remove(this.f247405e)) {
            Log.m105921e("MicroMsg.AppBrandRuntime", "AppBrandRuntime[%s].prepare() duplicate ready() called, PrepareProcess[%s]", this.f247407g.f238147j, this.f247405e);
            return;
        }
        this.f247407g.mo113052e("prepare() PrepareProcess[%s] done", this.f247405e);
        if (this.f247404d.isEmpty()) {
            this.f247406f.mo113094a();
        }
    }
}
