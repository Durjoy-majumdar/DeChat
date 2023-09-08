package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendMsgFailEvent */
public final class SendMsgFailEvent extends IEvent {

    /* renamed from: d */
    public C67786a f193928d = new C67786a();

    /* renamed from: com.tencent.mm.autogen.events.SendMsgFailEvent$a */
    public static final class C67786a {

        /* renamed from: a */
        public C72963f4 f193929a;
    }

    public SendMsgFailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendMsgFailEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193928d.f193929a, ((SendMsgFailEvent) iEvent).f193928d.f193929a);
    }
}
