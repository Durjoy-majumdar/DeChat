package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OfflineCreateEvent */
public final class OfflineCreateEvent extends IEvent {

    /* renamed from: d */
    public C67745a f193775d = new C67745a();

    /* renamed from: com.tencent.mm.autogen.events.OfflineCreateEvent$a */
    public static final class C67745a {

        /* renamed from: a */
        public int f193776a;
    }

    public OfflineCreateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OfflineCreateEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193775d.f193776a), Integer.valueOf(((OfflineCreateEvent) iEvent).f193775d.f193776a));
    }
}
