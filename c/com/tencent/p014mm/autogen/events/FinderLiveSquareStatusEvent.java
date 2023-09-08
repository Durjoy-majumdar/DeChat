package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent */
public final class FinderLiveSquareStatusEvent extends IEvent {

    /* renamed from: d */
    public C1051a f9220d = new C1051a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent$a */
    public static final class C1051a {

        /* renamed from: a */
        public long f9221a;
    }

    public FinderLiveSquareStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveSquareStatusEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f9220d.f9221a), Long.valueOf(((FinderLiveSquareStatusEvent) iEvent).f9220d.f9221a));
    }
}
