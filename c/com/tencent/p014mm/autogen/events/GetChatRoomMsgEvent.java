package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetChatRoomMsgEvent */
public final class GetChatRoomMsgEvent extends IEvent {

    /* renamed from: d */
    public C40117a f107584d = new C40117a();

    /* renamed from: com.tencent.mm.autogen.events.GetChatRoomMsgEvent$a */
    public static final class C40117a {

        /* renamed from: a */
        public byte[] f107585a;
    }

    public GetChatRoomMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetChatRoomMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107584d.f107585a, ((GetChatRoomMsgEvent) iEvent).f107584d.f107585a);
    }
}
