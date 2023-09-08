package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderTimelineRefreshEvent */
public final class FinderTimelineRefreshEvent extends IEvent {

    /* renamed from: d */
    public C1066a f9256d = new C1066a();

    /* renamed from: com.tencent.mm.autogen.events.FinderTimelineRefreshEvent$a */
    public static final class C1066a {

        /* renamed from: a */
        public int f9257a;
    }

    public FinderTimelineRefreshEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderTimelineRefreshEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9256d.f9257a), Integer.valueOf(((FinderTimelineRefreshEvent) iEvent).f9256d.f9257a));
    }
}
