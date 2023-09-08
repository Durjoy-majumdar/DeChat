package com.tencent.p014mm.plugin.appbrand.app;

import fy3.C32226l;

/* renamed from: com.tencent.mm.plugin.appbrand.app.m */
public class C29147m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l f79751d;

    public C29147m(C32226l lVar) {
        this.f79751d = lVar;
    }

    public void run() {
        this.f79751d.invoke("MMHandlerThread.postToMainThread");
    }
}
