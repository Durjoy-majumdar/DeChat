package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendMsgFailNotificationEvent */
public final class SendMsgFailNotificationEvent extends IEvent {

    /* renamed from: d */
    public C28821a f78972d = new C28821a();

    /* renamed from: com.tencent.mm.autogen.events.SendMsgFailNotificationEvent$a */
    public static final class C28821a {
    }

    public SendMsgFailNotificationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendMsgFailNotificationEvent)) {
            return false;
        }
        C28821a aVar = ((SendMsgFailNotificationEvent) iEvent).f78972d;
        this.f78972d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f78972d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
