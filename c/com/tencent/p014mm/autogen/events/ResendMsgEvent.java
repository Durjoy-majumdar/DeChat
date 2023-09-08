package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ResendMsgEvent */
public final class ResendMsgEvent extends IEvent {

    /* renamed from: d */
    public C28805a f78932d = new C28805a();

    /* renamed from: com.tencent.mm.autogen.events.ResendMsgEvent$a */
    public static final class C28805a {

        /* renamed from: a */
        public C72963f4 f78933a;
    }

    public ResendMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ResendMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78932d.f78933a, ((ResendMsgEvent) iEvent).f78932d.f78933a);
    }
}
