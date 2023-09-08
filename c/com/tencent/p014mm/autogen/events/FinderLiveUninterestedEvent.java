package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveUninterestedEvent */
public final class FinderLiveUninterestedEvent extends IEvent {

    /* renamed from: d */
    public C1052a f9222d = new C1052a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveUninterestedEvent$a */
    public static final class C1052a {

        /* renamed from: a */
        public long f9223a;

        /* renamed from: b */
        public boolean f9224b;
    }

    public FinderLiveUninterestedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveUninterestedEvent)) {
            return false;
        }
        C1052a aVar = ((FinderLiveUninterestedEvent) iEvent).f9222d;
        return C46238a.m51546a(Long.valueOf(this.f9222d.f9223a), Long.valueOf(aVar.f9223a)) && C46238a.m51546a(Boolean.valueOf(this.f9222d.f9224b), Boolean.valueOf(aVar.f9224b));
    }
}
