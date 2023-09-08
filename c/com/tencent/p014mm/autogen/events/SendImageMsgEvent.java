package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendImageMsgEvent */
public final class SendImageMsgEvent extends IEvent {

    /* renamed from: d */
    public C67785a f193926d = new C67785a();

    /* renamed from: com.tencent.mm.autogen.events.SendImageMsgEvent$a */
    public static final class C67785a {

        /* renamed from: a */
        public C72963f4 f193927a;
    }

    public SendImageMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendImageMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193926d.f193927a, ((SendImageMsgEvent) iEvent).f193926d.f193927a);
    }
}
