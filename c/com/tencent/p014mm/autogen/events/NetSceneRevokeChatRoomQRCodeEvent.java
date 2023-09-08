package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent */
public final class NetSceneRevokeChatRoomQRCodeEvent extends IEvent {

    /* renamed from: d */
    public C40143a f107657d = new C40143a();

    /* renamed from: e */
    public C40144b f107658e = new C40144b();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent$a */
    public static final class C40143a {
    }

    /* renamed from: com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent$b */
    public static final class C40144b {

        /* renamed from: a */
        public int f107659a;
    }

    public NetSceneRevokeChatRoomQRCodeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneRevokeChatRoomQRCodeEvent)) {
            return false;
        }
        NetSceneRevokeChatRoomQRCodeEvent netSceneRevokeChatRoomQRCodeEvent = (NetSceneRevokeChatRoomQRCodeEvent) iEvent;
        C40143a aVar = netSceneRevokeChatRoomQRCodeEvent.f107657d;
        this.f107657d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107657d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107657d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107658e.f107659a), Integer.valueOf(netSceneRevokeChatRoomQRCodeEvent.f107658e.f107659a));
    }
}
