package com.tencent.p014mm.sdk.event;

/* renamed from: com.tencent.mm.sdk.event.EventCenter$$b */
public final /* synthetic */ class EventCenter$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EventCenter f249792d;

    /* renamed from: e */
    public final /* synthetic */ IEvent f249793e;

    public /* synthetic */ EventCenter$$b(EventCenter eventCenter, IEvent iEvent) {
        this.f249792d = eventCenter;
        this.f249793e = iEvent;
    }

    public final void run() {
        this.f249792d.lambda$asyncPublish$0(this.f249793e);
    }
}
