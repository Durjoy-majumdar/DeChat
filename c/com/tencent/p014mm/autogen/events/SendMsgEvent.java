package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SendMsgEvent */
public final class SendMsgEvent extends IEvent {

    /* renamed from: d */
    public C1132a f9496d = new C1132a();

    /* renamed from: com.tencent.mm.autogen.events.SendMsgEvent$a */
    public static final class C1132a {

        /* renamed from: a */
        public String f9497a;

        /* renamed from: b */
        public String f9498b;

        /* renamed from: c */
        public int f9499c;

        /* renamed from: d */
        public int f9500d;
    }

    public SendMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SendMsgEvent)) {
            return false;
        }
        C1132a aVar = ((SendMsgEvent) iEvent).f9496d;
        return C46238a.m51546a(this.f9496d.f9497a, aVar.f9497a) && C46238a.m51546a(this.f9496d.f9498b, aVar.f9498b) && C46238a.m51546a(Integer.valueOf(this.f9496d.f9499c), Integer.valueOf(aVar.f9499c)) && C46238a.m51546a(Integer.valueOf(this.f9496d.f9500d), Integer.valueOf(aVar.f9500d));
    }
}
