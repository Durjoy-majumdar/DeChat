package com.tencent.p014mm.sdk.event;

/* renamed from: com.tencent.mm.sdk.event.EventCenter$$a */
public final /* synthetic */ class EventCenter$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EventCenter f249790d;

    /* renamed from: e */
    public final /* synthetic */ IEvent f249791e;

    public /* synthetic */ EventCenter$$a(EventCenter eventCenter, IEvent iEvent) {
        this.f249790d = eventCenter;
        this.f249791e = iEvent;
    }

    public final void run() {
        this.f249790d.lambda$asyncPublish$1(this.f249791e);
    }
}
