package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendOutMsgEvent */
public final class SendOutMsgEvent extends IEvent {

    /* renamed from: d */
    public C80740a f236286d = new C80740a();

    /* renamed from: com.tencent.mm.autogen.events.SendOutMsgEvent$a */
    public static final class C80740a {

        /* renamed from: a */
        public C72963f4 f236287a;
    }

    public SendOutMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendOutMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f236286d.f236287a, ((SendOutMsgEvent) iEvent).f236286d.f236287a);
    }
}
