package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedLiveLifeEvent */
public final class FeedLiveLifeEvent extends IEvent {

    /* renamed from: d */
    public C40097a f107525d = new C40097a();

    /* renamed from: com.tencent.mm.autogen.events.FeedLiveLifeEvent$a */
    public static final class C40097a {
    }

    public FeedLiveLifeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedLiveLifeEvent)) {
            return false;
        }
        C40097a aVar = ((FeedLiveLifeEvent) iEvent).f107525d;
        this.f107525d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
