package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LogoutEvent */
public final class LogoutEvent extends IEvent {

    /* renamed from: d */
    public C28774a f78863d = new C28774a();

    /* renamed from: com.tencent.mm.autogen.events.LogoutEvent$a */
    public static final class C28774a {

        /* renamed from: a */
        public int f78864a = 0;
    }

    public LogoutEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LogoutEvent)) {
            return false;
        }
        C28774a aVar = ((LogoutEvent) iEvent).f78863d;
        this.f78863d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f78863d.f78864a), Integer.valueOf(aVar.f78864a));
    }
}
