package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendMsgSuccessEvent */
public final class SendMsgSuccessEvent extends IEvent {

    /* renamed from: d */
    public C67787a f193930d = new C67787a();

    /* renamed from: com.tencent.mm.autogen.events.SendMsgSuccessEvent$a */
    public static final class C67787a {

        /* renamed from: a */
        public C72963f4 f193931a;
    }

    public SendMsgSuccessEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendMsgSuccessEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193930d.f193931a, ((SendMsgSuccessEvent) iEvent).f193930d.f193931a);
    }
}
