package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent */
public final class ChatroomMemberInviteerUpdatedEvent extends IEvent {

    /* renamed from: d */
    public C67667a f193513d = new C67667a();

    /* renamed from: com.tencent.mm.autogen.events.ChatroomMemberInviteerUpdatedEvent$a */
    public static final class C67667a {

        /* renamed from: a */
        public String f193514a;

        /* renamed from: b */
        public String f193515b;
    }

    public ChatroomMemberInviteerUpdatedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChatroomMemberInviteerUpdatedEvent)) {
            return false;
        }
        C67667a aVar = ((ChatroomMemberInviteerUpdatedEvent) iEvent).f193513d;
        return C46238a.m51546a(this.f193513d.f193514a, aVar.f193514a) && C46238a.m51546a(this.f193513d.f193515b, aVar.f193515b);
    }
}
