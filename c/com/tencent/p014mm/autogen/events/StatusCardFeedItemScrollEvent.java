package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent */
public final class StatusCardFeedItemScrollEvent extends IEvent {

    /* renamed from: d */
    public C40169a f107771d = new C40169a();

    /* renamed from: com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent$a */
    public static final class C40169a {

        /* renamed from: a */
        public String f107772a;
    }

    public StatusCardFeedItemScrollEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StatusCardFeedItemScrollEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107771d.f107772a, ((StatusCardFeedItemScrollEvent) iEvent).f107771d.f107772a);
    }
}
