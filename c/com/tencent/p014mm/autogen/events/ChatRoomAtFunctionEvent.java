package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent */
public final class ChatRoomAtFunctionEvent extends IEvent {

    /* renamed from: d */
    public C40049a f107397d = new C40049a();

    /* renamed from: com.tencent.mm.autogen.events.ChatRoomAtFunctionEvent$a */
    public static final class C40049a {

        /* renamed from: a */
        public String f107398a;

        /* renamed from: b */
        public String f107399b;
    }

    public ChatRoomAtFunctionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChatRoomAtFunctionEvent)) {
            return false;
        }
        C40049a aVar = ((ChatRoomAtFunctionEvent) iEvent).f107397d;
        return C46238a.m51546a(this.f107397d.f107398a, aVar.f107398a) && C46238a.m51546a(this.f107397d.f107399b, aVar.f107399b);
    }
}
