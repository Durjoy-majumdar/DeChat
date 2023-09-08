package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyGroupToolsEvent */
public final class NotifyGroupToolsEvent extends IEvent {

    /* renamed from: d */
    public C28782a f78878d = new C28782a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyGroupToolsEvent$a */
    public static final class C28782a {

        /* renamed from: a */
        public String f78879a;
    }

    public NotifyGroupToolsEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyGroupToolsEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78878d.f78879a, ((NotifyGroupToolsEvent) iEvent).f78878d.f78879a);
    }
}
