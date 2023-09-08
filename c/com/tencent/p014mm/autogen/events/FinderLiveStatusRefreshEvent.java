package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveStatusRefreshEvent */
public final class FinderLiveStatusRefreshEvent extends IEvent {

    /* renamed from: d */
    public C55129a f154787d = new C55129a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveStatusRefreshEvent$a */
    public static final class C55129a {

        /* renamed from: a */
        public String f154788a;

        /* renamed from: b */
        public Long f154789b;

        /* renamed from: c */
        public int f154790c;
    }

    public FinderLiveStatusRefreshEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveStatusRefreshEvent)) {
            return false;
        }
        C55129a aVar = ((FinderLiveStatusRefreshEvent) iEvent).f154787d;
        return C46238a.m51546a(this.f154787d.f154788a, aVar.f154788a) && C46238a.m51546a(this.f154787d.f154789b, aVar.f154789b) && C46238a.m51546a(Integer.valueOf(this.f154787d.f154790c), Integer.valueOf(aVar.f154790c));
    }
}
