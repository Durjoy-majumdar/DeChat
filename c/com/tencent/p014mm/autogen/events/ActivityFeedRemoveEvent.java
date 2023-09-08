package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ActivityFeedRemoveEvent */
public final class ActivityFeedRemoveEvent extends IEvent {

    /* renamed from: d */
    public C0993a f9022d = new C0993a();

    /* renamed from: com.tencent.mm.autogen.events.ActivityFeedRemoveEvent$a */
    public static final class C0993a {

        /* renamed from: a */
        public long f9023a;

        /* renamed from: b */
        public long f9024b;

        /* renamed from: c */
        public long f9025c;
    }

    public ActivityFeedRemoveEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ActivityFeedRemoveEvent)) {
            return false;
        }
        C0993a aVar = ((ActivityFeedRemoveEvent) iEvent).f9022d;
        return C46238a.m51546a(Long.valueOf(this.f9022d.f9023a), Long.valueOf(aVar.f9023a)) && C46238a.m51546a(Long.valueOf(this.f9022d.f9024b), Long.valueOf(aVar.f9024b)) && C46238a.m51546a(Long.valueOf(this.f9022d.f9025c), Long.valueOf(aVar.f9025c));
    }
}
