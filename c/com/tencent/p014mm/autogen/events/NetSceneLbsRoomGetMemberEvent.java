package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetSceneLbsRoomGetMemberEvent */
public final class NetSceneLbsRoomGetMemberEvent extends IEvent {

    /* renamed from: d */
    public C55148a f154845d = new C55148a();

    /* renamed from: e */
    public C55149b f154846e = new C55149b();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneLbsRoomGetMemberEvent$a */
    public static final class C55148a {
    }

    /* renamed from: com.tencent.mm.autogen.events.NetSceneLbsRoomGetMemberEvent$b */
    public static final class C55149b {
    }

    public NetSceneLbsRoomGetMemberEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneLbsRoomGetMemberEvent)) {
            return false;
        }
        NetSceneLbsRoomGetMemberEvent netSceneLbsRoomGetMemberEvent = (NetSceneLbsRoomGetMemberEvent) iEvent;
        C55148a aVar = netSceneLbsRoomGetMemberEvent.f154845d;
        this.f154845d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f154845d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        C55149b bVar = netSceneLbsRoomGetMemberEvent.f154846e;
        this.f154846e.getClass();
        bVar.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f154846e.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
