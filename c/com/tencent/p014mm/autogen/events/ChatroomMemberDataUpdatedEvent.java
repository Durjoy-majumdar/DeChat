package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChatroomMemberDataUpdatedEvent */
public final class ChatroomMemberDataUpdatedEvent extends IEvent {

    /* renamed from: d */
    public C40052a f107408d = new C40052a();

    /* renamed from: com.tencent.mm.autogen.events.ChatroomMemberDataUpdatedEvent$a */
    public static final class C40052a {

        /* renamed from: a */
        public String f107409a;
    }

    public ChatroomMemberDataUpdatedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChatroomMemberDataUpdatedEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107408d.f107409a, ((ChatroomMemberDataUpdatedEvent) iEvent).f107408d.f107409a);
    }
}
