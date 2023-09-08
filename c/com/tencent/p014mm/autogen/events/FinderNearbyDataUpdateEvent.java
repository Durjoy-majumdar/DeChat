package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent */
public final class FinderNearbyDataUpdateEvent extends IEvent {

    /* renamed from: d */
    public C1053a f9225d = new C1053a();

    /* renamed from: com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent$a */
    public static final class C1053a {

        /* renamed from: a */
        public long f9226a;

        /* renamed from: b */
        public boolean f9227b;

        /* renamed from: c */
        public Object f9228c;
    }

    public FinderNearbyDataUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderNearbyDataUpdateEvent)) {
            return false;
        }
        C1053a aVar = ((FinderNearbyDataUpdateEvent) iEvent).f9225d;
        return C46238a.m51546a(Long.valueOf(this.f9225d.f9226a), Long.valueOf(aVar.f9226a)) && C46238a.m51546a(Boolean.valueOf(this.f9225d.f9227b), Boolean.valueOf(aVar.f9227b)) && C46238a.m51546a(this.f9225d.f9228c, aVar.f9228c);
    }
}
