package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetChatRoomWrapEvent */
public final class GetChatRoomWrapEvent extends IEvent {

    /* renamed from: d */
    public C67707a f193640d = new C67707a();

    /* renamed from: com.tencent.mm.autogen.events.GetChatRoomWrapEvent$a */
    public static final class C67707a {

        /* renamed from: a */
        public String f193641a;

        /* renamed from: b */
        public long f193642b;

        /* renamed from: c */
        public long f193643c;

        /* renamed from: d */
        public long f193644d;

        /* renamed from: e */
        public long f193645e;
    }

    public GetChatRoomWrapEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetChatRoomWrapEvent)) {
            return false;
        }
        C67707a aVar = ((GetChatRoomWrapEvent) iEvent).f193640d;
        return C46238a.m51546a(this.f193640d.f193641a, aVar.f193641a) && C46238a.m51546a(Long.valueOf(this.f193640d.f193642b), Long.valueOf(aVar.f193642b)) && C46238a.m51546a(Long.valueOf(this.f193640d.f193643c), Long.valueOf(aVar.f193643c)) && C46238a.m51546a(Long.valueOf(this.f193640d.f193644d), Long.valueOf(aVar.f193644d)) && C46238a.m51546a(Long.valueOf(this.f193640d.f193645e), Long.valueOf(aVar.f193645e));
    }
}
