package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyNewMsgEvent */
public final class NotifyNewMsgEvent extends IEvent {

    /* renamed from: d */
    public C40147a f107669d = new C40147a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyNewMsgEvent$a */
    public static final class C40147a {

        /* renamed from: a */
        public int f107670a = 0;
    }

    public NotifyNewMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyNewMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107669d.f107670a), Integer.valueOf(((NotifyNewMsgEvent) iEvent).f107669d.f107670a));
    }
}
