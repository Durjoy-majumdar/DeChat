package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderNofityTabSelectedEvent */
public final class FinderNofityTabSelectedEvent extends IEvent {

    /* renamed from: d */
    public C1058a f9238d = new C1058a();

    /* renamed from: com.tencent.mm.autogen.events.FinderNofityTabSelectedEvent$a */
    public static final class C1058a {
    }

    public FinderNofityTabSelectedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderNofityTabSelectedEvent)) {
            return false;
        }
        C1058a aVar = ((FinderNofityTabSelectedEvent) iEvent).f9238d;
        this.f9238d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
