package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.task.q$$c */
public class q$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPreloadProfiler f246239d;

    public q$$c(AppBrandPreloadProfiler appBrandPreloadProfiler) {
        this.f246239d = appBrandPreloadProfiler;
    }

    public void run() {
        try {
            String str = this.f246239d.f246125f;
            if (str != null) {
                Class.forName(str).newInstance();
            }
            String str2 = this.f246239d.f246126g;
            if (str2 != null) {
                Class.forName(str2).newInstance();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            Log.m105929w("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "run: ", e);
        }
    }
}
