package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent */
public final class NetSceneDelChatRoomMemberEvent extends IEvent {

    /* renamed from: d */
    public C40139a f107646d = new C40139a();

    /* renamed from: e */
    public C40140b f107647e = new C40140b();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent$a */
    public static final class C40139a {
    }

    /* renamed from: com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent$b */
    public static final class C40140b {

        /* renamed from: a */
        public int f107648a;
    }

    public NetSceneDelChatRoomMemberEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneDelChatRoomMemberEvent)) {
            return false;
        }
        NetSceneDelChatRoomMemberEvent netSceneDelChatRoomMemberEvent = (NetSceneDelChatRoomMemberEvent) iEvent;
        C40139a aVar = netSceneDelChatRoomMemberEvent.f107646d;
        this.f107646d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107646d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107646d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f107646d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107647e.f107648a), Integer.valueOf(netSceneDelChatRoomMemberEvent.f107647e.f107648a));
    }
}
