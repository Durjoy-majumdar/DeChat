package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedLiveFeedExposeEvent */
public final class FeedLiveFeedExposeEvent extends IEvent {

    /* renamed from: d */
    public C1037a f9158d = new C1037a();

    /* renamed from: com.tencent.mm.autogen.events.FeedLiveFeedExposeEvent$a */
    public static final class C1037a {

        /* renamed from: a */
        public long f9159a;
    }

    public FeedLiveFeedExposeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedLiveFeedExposeEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f9158d.f9159a), Long.valueOf(((FeedLiveFeedExposeEvent) iEvent).f9158d.f9159a));
    }
}
