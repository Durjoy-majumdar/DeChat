package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReceiveMsgEvent */
public final class ReceiveMsgEvent extends IEvent {

    /* renamed from: d */
    public C28796a f78913d = new C28796a();

    /* renamed from: com.tencent.mm.autogen.events.ReceiveMsgEvent$a */
    public static final class C28796a {

        /* renamed from: a */
        public C72963f4 f78914a;
    }

    public ReceiveMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReceiveMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78913d.f78914a, ((ReceiveMsgEvent) iEvent).f78913d.f78914a);
    }
}
