package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyEnterChattingEvent */
public final class NotifyEnterChattingEvent extends IEvent {

    /* renamed from: d */
    public C55150a f154847d = new C55150a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyEnterChattingEvent$a */
    public static final class C55150a {

        /* renamed from: a */
        public String f154848a;
    }

    public NotifyEnterChattingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyEnterChattingEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f154847d.f154848a, ((NotifyEnterChattingEvent) iEvent).f154847d.f154848a);
    }
}
