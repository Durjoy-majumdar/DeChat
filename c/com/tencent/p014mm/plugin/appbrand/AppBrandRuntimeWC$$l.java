package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$l */
public class AppBrandRuntimeWC$$l implements Runnable {

    /* renamed from: d */
    public final AtomicBoolean f238327d = new AtomicBoolean(false);

    /* renamed from: e */
    public final /* synthetic */ Runnable f238328e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandRuntimeWC f238329f;

    public AppBrandRuntimeWC$$l(AppBrandRuntimeWC appBrandRuntimeWC, Runnable runnable) {
        this.f238329f = appBrandRuntimeWC;
        this.f238328e = runnable;
    }

    public void run() {
        if (!this.f238327d.getAndSet(true)) {
            Log.m105924i("MicroMsg.AppBrandRuntimeWC", "[ILaunchWxaAppInfoNotify] addPendingPermissionUpdateTask run()");
            this.f238328e.run();
        }
    }
}
