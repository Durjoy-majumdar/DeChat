package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent */
public final class GetChatRoomInfoDetailEvent extends IEvent {

    /* renamed from: d */
    public C28752a f78814d = new C28752a();

    /* renamed from: com.tencent.mm.autogen.events.GetChatRoomInfoDetailEvent$a */
    public static final class C28752a {

        /* renamed from: a */
        public String f78815a;
    }

    public GetChatRoomInfoDetailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetChatRoomInfoDetailEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78814d.f78815a, ((GetChatRoomInfoDetailEvent) iEvent).f78814d.f78815a);
    }
}
