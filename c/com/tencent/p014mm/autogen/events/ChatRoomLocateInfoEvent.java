package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent */
public final class ChatRoomLocateInfoEvent extends IEvent {

    /* renamed from: d */
    public C40051a f107403d = new C40051a();

    /* renamed from: com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent$a */
    public static final class C40051a {

        /* renamed from: a */
        public int f107404a = -1;

        /* renamed from: b */
        public long f107405b = -1;

        /* renamed from: c */
        public boolean f107406c = false;

        /* renamed from: d */
        public boolean f107407d = false;
    }

    public ChatRoomLocateInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ChatRoomLocateInfoEvent)) {
            return false;
        }
        C40051a aVar = ((ChatRoomLocateInfoEvent) iEvent).f107403d;
        return C46238a.m51546a(Integer.valueOf(this.f107403d.f107404a), Integer.valueOf(aVar.f107404a)) && C46238a.m51546a(Long.valueOf(this.f107403d.f107405b), Long.valueOf(aVar.f107405b)) && C46238a.m51546a(Boolean.valueOf(this.f107403d.f107406c), Boolean.valueOf(aVar.f107406c)) && C46238a.m51546a(Boolean.valueOf(this.f107403d.f107407d), Boolean.valueOf(aVar.f107407d));
    }
}
