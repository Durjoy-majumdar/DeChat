package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TalkRoomServerEvent */
public final class TalkRoomServerEvent extends IEvent {

    /* renamed from: d */
    public C55169a f154883d = new C55169a();

    /* renamed from: e */
    public C55170b f154884e = new C55170b();

    /* renamed from: com.tencent.mm.autogen.events.TalkRoomServerEvent$a */
    public static final class C55169a {

        /* renamed from: a */
        public boolean f154885a = false;

        /* renamed from: b */
        public boolean f154886b = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.TalkRoomServerEvent$b */
    public static final class C55170b {

        /* renamed from: a */
        public String f154887a;
    }

    public TalkRoomServerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TalkRoomServerEvent)) {
            return false;
        }
        TalkRoomServerEvent talkRoomServerEvent = (TalkRoomServerEvent) iEvent;
        C55169a aVar = talkRoomServerEvent.f154883d;
        if (!C46238a.m51546a(Boolean.valueOf(this.f154883d.f154885a), Boolean.valueOf(aVar.f154885a)) || !C46238a.m51546a(Boolean.valueOf(this.f154883d.f154886b), Boolean.valueOf(aVar.f154886b))) {
            return false;
        }
        return C46238a.m51546a(this.f154884e.f154887a, talkRoomServerEvent.f154884e.f154887a);
    }
}
