package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateChatRoomSpamStatusEvent */
public final class UpdateChatRoomSpamStatusEvent extends IEvent {

    /* renamed from: d */
    public C67805a f193979d = new C67805a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateChatRoomSpamStatusEvent$a */
    public static final class C67805a {

        /* renamed from: a */
        public String f193980a;

        /* renamed from: b */
        public int f193981b = 0;
    }

    public UpdateChatRoomSpamStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateChatRoomSpamStatusEvent)) {
            return false;
        }
        C67805a aVar = ((UpdateChatRoomSpamStatusEvent) iEvent).f193979d;
        return C46238a.m51546a(this.f193979d.f193980a, aVar.f193980a) && C46238a.m51546a(Integer.valueOf(this.f193979d.f193981b), Integer.valueOf(aVar.f193981b));
    }
}
