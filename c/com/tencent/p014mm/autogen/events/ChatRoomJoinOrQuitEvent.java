package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent */
public final class ChatRoomJoinOrQuitEvent extends IEvent {

    /* renamed from: d */
    public C40050a f107400d = new C40050a();

    /* renamed from: com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent$a */
    public static final class C40050a {

        /* renamed from: a */
        public int f107401a = 0;

        /* renamed from: b */
        public String f107402b;
    }

    public ChatRoomJoinOrQuitEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChatRoomJoinOrQuitEvent)) {
            return false;
        }
        C40050a aVar = ((ChatRoomJoinOrQuitEvent) iEvent).f107400d;
        return C46238a.m51546a(Integer.valueOf(this.f107400d.f107401a), Integer.valueOf(aVar.f107401a)) && C46238a.m51546a(this.f107400d.f107402b, aVar.f107402b);
    }
}
