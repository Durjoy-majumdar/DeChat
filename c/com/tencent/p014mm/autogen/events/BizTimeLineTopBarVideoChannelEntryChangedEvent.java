package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.gr4;

/* renamed from: com.tencent.mm.autogen.events.BizTimeLineTopBarVideoChannelEntryChangedEvent */
public final class BizTimeLineTopBarVideoChannelEntryChangedEvent extends IEvent {

    /* renamed from: d */
    public C40044a f107385d = new C40044a();

    /* renamed from: com.tencent.mm.autogen.events.BizTimeLineTopBarVideoChannelEntryChangedEvent$a */
    public static final class C40044a {

        /* renamed from: a */
        public int f107386a;

        /* renamed from: b */
        public gr4 f107387b;
    }

    public BizTimeLineTopBarVideoChannelEntryChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BizTimeLineTopBarVideoChannelEntryChangedEvent)) {
            return false;
        }
        C40044a aVar = ((BizTimeLineTopBarVideoChannelEntryChangedEvent) iEvent).f107385d;
        return C46238a.m51546a(Integer.valueOf(this.f107385d.f107386a), Integer.valueOf(aVar.f107386a)) && C46238a.m51546a(this.f107385d.f107387b, aVar.f107387b);
    }
}
