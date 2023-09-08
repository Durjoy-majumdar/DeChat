package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C64836xp2;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent */
public final class FinderLiveScrollSquareStatusEvent extends IEvent {

    /* renamed from: d */
    public C1050a f9216d = new C1050a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent$a */
    public static final class C1050a {

        /* renamed from: a */
        public long f9217a;

        /* renamed from: b */
        public C64836xp2 f9218b;

        /* renamed from: c */
        public Object f9219c;
    }

    public FinderLiveScrollSquareStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveScrollSquareStatusEvent)) {
            return false;
        }
        C1050a aVar = ((FinderLiveScrollSquareStatusEvent) iEvent).f9216d;
        return C46238a.m51546a(Long.valueOf(this.f9216d.f9217a), Long.valueOf(aVar.f9217a)) && C46238a.m51546a(this.f9216d.f9218b, aVar.f9218b) && C46238a.m51546a(this.f9216d.f9219c, aVar.f9219c);
    }
}
