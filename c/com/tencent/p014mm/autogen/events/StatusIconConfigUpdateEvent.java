package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent */
public final class StatusIconConfigUpdateEvent extends IEvent {

    /* renamed from: d */
    public C40171a f107775d = new C40171a();

    /* renamed from: com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent$a */
    public static final class C40171a {

        /* renamed from: a */
        public Long f107776a = 0L;

        /* renamed from: b */
        public Long f107777b = 0L;
    }

    public StatusIconConfigUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StatusIconConfigUpdateEvent)) {
            return false;
        }
        C40171a aVar = ((StatusIconConfigUpdateEvent) iEvent).f107775d;
        return C46238a.m51546a(this.f107775d.f107776a, aVar.f107776a) && C46238a.m51546a(this.f107775d.f107777b, aVar.f107777b);
    }
}
