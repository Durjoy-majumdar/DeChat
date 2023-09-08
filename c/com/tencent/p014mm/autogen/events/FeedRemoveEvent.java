package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedRemoveEvent */
public final class FeedRemoveEvent extends IEvent {

    /* renamed from: d */
    public C1039a f9167d = new C1039a();

    /* renamed from: com.tencent.mm.autogen.events.FeedRemoveEvent$a */
    public static final class C1039a {

        /* renamed from: a */
        public long f9168a;
    }

    public FeedRemoveEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedRemoveEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f9167d.f9168a), Long.valueOf(((FeedRemoveEvent) iEvent).f9167d.f9168a));
    }
}
