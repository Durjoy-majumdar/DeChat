package com.tencent.p014mm.app;

import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;

/* renamed from: com.tencent.mm.app.TempAppForegroundNotifyDeprecated$$a */
public final /* synthetic */ class TempAppForegroundNotifyDeprecated$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TempAppForegroundNotifyDeprecated f78651d;

    /* renamed from: e */
    public final /* synthetic */ boolean f78652e;

    public /* synthetic */ TempAppForegroundNotifyDeprecated$$a(TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated, boolean z) {
        this.f78651d = tempAppForegroundNotifyDeprecated;
        this.f78652e = z;
    }

    public final void run() {
        TempAppForegroundNotifyDeprecated tempAppForegroundNotifyDeprecated = this.f78651d;
        boolean z = this.f78652e;
        tempAppForegroundNotifyDeprecated.getClass();
        DestroyPreloadedWebViewEvent destroyPreloadedWebViewEvent = new DestroyPreloadedWebViewEvent();
        destroyPreloadedWebViewEvent.f78769d.f78770a = System.currentTimeMillis();
        destroyPreloadedWebViewEvent.f78769d.f78771b = z;
        destroyPreloadedWebViewEvent.publish();
        tempAppForegroundNotifyDeprecated.f235724g.post(new TempAppForegroundNotifyDeprecated$$b(tempAppForegroundNotifyDeprecated, destroyPreloadedWebViewEvent));
    }
}
