package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderTabSelectedEvent */
public final class FinderTabSelectedEvent extends IEvent {

    /* renamed from: d */
    public C1063a f9251d = new C1063a();

    /* renamed from: com.tencent.mm.autogen.events.FinderTabSelectedEvent$a */
    public static final class C1063a {

        /* renamed from: a */
        public int f9252a;
    }

    public FinderTabSelectedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderTabSelectedEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9251d.f9252a), Integer.valueOf(((FinderTabSelectedEvent) iEvent).f9251d.f9252a));
    }
}
