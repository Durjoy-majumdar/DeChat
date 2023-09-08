package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderNewEntranceNotifyInsertEvent */
public final class FinderNewEntranceNotifyInsertEvent extends IEvent {

    /* renamed from: d */
    public C1055a f9231d = new C1055a();

    /* renamed from: com.tencent.mm.autogen.events.FinderNewEntranceNotifyInsertEvent$a */
    public static final class C1055a {

        /* renamed from: a */
        public long f9232a;
    }

    public FinderNewEntranceNotifyInsertEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderNewEntranceNotifyInsertEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f9231d.f9232a), Long.valueOf(((FinderNewEntranceNotifyInsertEvent) iEvent).f9231d.f9232a));
    }
}
