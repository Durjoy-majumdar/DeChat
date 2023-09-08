package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotificationSendFailMsgFinishEvent */
public final class NotificationSendFailMsgFinishEvent extends IEvent {

    /* renamed from: d */
    public C114685a f343588d = new C114685a();

    /* renamed from: com.tencent.mm.autogen.events.NotificationSendFailMsgFinishEvent$a */
    public static final class C114685a {

        /* renamed from: a */
        public int f343589a;
    }

    public NotificationSendFailMsgFinishEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotificationSendFailMsgFinishEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f343588d.f343589a), Integer.valueOf(((NotificationSendFailMsgFinishEvent) iEvent).f343588d.f343589a));
    }
}
