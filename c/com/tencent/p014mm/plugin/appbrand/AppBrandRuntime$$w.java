package com.tencent.p014mm.plugin.appbrand;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$w */
public class AppBrandRuntime$$w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238201d;

    public AppBrandRuntime$$w(AppBrandRuntime appBrandRuntime) {
        this.f238201d = appBrandRuntime;
    }

    public void run() {
        AppBrandRuntime appBrandRuntime = this.f238201d;
        AppBrandRuntime$$a0 appBrandRuntime$$a0 = new AppBrandRuntime$$a0(appBrandRuntime, (AppBrandRuntime$$h) null);
        appBrandRuntime.getClass();
        ConcurrentLinkedQueue<AppBrandRuntime$$z> concurrentLinkedQueue = new ConcurrentLinkedQueue<>(appBrandRuntime.f238129V0);
        appBrandRuntime.f238131W0 = concurrentLinkedQueue;
        appBrandRuntime.f238129V0 = new LinkedList<>();
        Iterator<AppBrandRuntime$$z> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            AppBrandRuntime$$z next = it.next();
            next.f238203a = new C84884w(appBrandRuntime, concurrentLinkedQueue, next, appBrandRuntime$$a0);
            next.mo54191b();
        }
    }
}
