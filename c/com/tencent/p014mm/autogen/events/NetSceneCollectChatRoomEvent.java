package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent */
public final class NetSceneCollectChatRoomEvent extends IEvent {

    /* renamed from: d */
    public C40136a f107636d = new C40136a();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent$a */
    public static final class C40136a {
    }

    public NetSceneCollectChatRoomEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneCollectChatRoomEvent)) {
            return false;
        }
        C40136a aVar = ((NetSceneCollectChatRoomEvent) iEvent).f107636d;
        this.f107636d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107636d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
