package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderProfileChangeFeedEvent */
public final class FinderProfileChangeFeedEvent extends IEvent {

    /* renamed from: d */
    public C1059a f9239d = new C1059a();

    /* renamed from: com.tencent.mm.autogen.events.FinderProfileChangeFeedEvent$a */
    public static final class C1059a {

        /* renamed from: a */
        public long f9240a;

        /* renamed from: b */
        public String f9241b;
    }

    public FinderProfileChangeFeedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderProfileChangeFeedEvent)) {
            return false;
        }
        C1059a aVar = ((FinderProfileChangeFeedEvent) iEvent).f9239d;
        return C46238a.m51546a(Long.valueOf(this.f9239d.f9240a), Long.valueOf(aVar.f9240a)) && C46238a.m51546a(this.f9239d.f9241b, aVar.f9241b);
    }
}
