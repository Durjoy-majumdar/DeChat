package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedDeleteEvent */
public final class FeedDeleteEvent extends IEvent {

    /* renamed from: d */
    public C1035a f9154d = new C1035a();

    /* renamed from: com.tencent.mm.autogen.events.FeedDeleteEvent$a */
    public static final class C1035a {

        /* renamed from: a */
        public long f9155a;

        /* renamed from: b */
        public long f9156b;
    }

    public FeedDeleteEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedDeleteEvent)) {
            return false;
        }
        C1035a aVar = ((FeedDeleteEvent) iEvent).f9154d;
        if (!C46238a.m51546a(Long.valueOf(this.f9154d.f9155a), Long.valueOf(aVar.f9155a)) || !C46238a.m51546a(Long.valueOf(this.f9154d.f9156b), Long.valueOf(aVar.f9156b))) {
            return false;
        }
        this.f9154d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
