package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderNearbyRefreshEvent */
public final class FinderNearbyRefreshEvent extends IEvent {

    /* renamed from: d */
    public C1054a f9229d = new C1054a();

    /* renamed from: com.tencent.mm.autogen.events.FinderNearbyRefreshEvent$a */
    public static final class C1054a {

        /* renamed from: a */
        public long f9230a;
    }

    public FinderNearbyRefreshEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderNearbyRefreshEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f9229d.f9230a), Long.valueOf(((FinderNearbyRefreshEvent) iEvent).f9229d.f9230a));
    }
}
