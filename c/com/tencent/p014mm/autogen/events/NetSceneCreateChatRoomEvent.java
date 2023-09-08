package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.List;

/* renamed from: com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent */
public final class NetSceneCreateChatRoomEvent extends IEvent {

    /* renamed from: d */
    public C40137a f107637d = new C40137a();

    /* renamed from: e */
    public C40138b f107638e = new C40138b();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent$a */
    public static final class C40137a {
    }

    /* renamed from: com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent$b */
    public static final class C40138b {

        /* renamed from: a */
        public int f107639a;

        /* renamed from: b */
        public String f107640b;

        /* renamed from: c */
        public List<String> f107641c;

        /* renamed from: d */
        public List<String> f107642d;

        /* renamed from: e */
        public List<String> f107643e;

        /* renamed from: f */
        public List<String> f107644f;

        /* renamed from: g */
        public List<String> f107645g;
    }

    public NetSceneCreateChatRoomEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneCreateChatRoomEvent)) {
            return false;
        }
        NetSceneCreateChatRoomEvent netSceneCreateChatRoomEvent = (NetSceneCreateChatRoomEvent) iEvent;
        C40137a aVar = netSceneCreateChatRoomEvent.f107637d;
        this.f107637d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107637d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107637d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        C40138b bVar = netSceneCreateChatRoomEvent.f107638e;
        return C46238a.m51546a(Integer.valueOf(this.f107638e.f107639a), Integer.valueOf(bVar.f107639a)) && C46238a.m51546a(this.f107638e.f107640b, bVar.f107640b) && C46238a.m51546a(this.f107638e.f107641c, bVar.f107641c) && C46238a.m51546a(this.f107638e.f107642d, bVar.f107642d) && C46238a.m51546a(this.f107638e.f107643e, bVar.f107643e) && C46238a.m51546a(this.f107638e.f107644f, bVar.f107644f) && C46238a.m51546a(this.f107638e.f107645g, bVar.f107645g);
    }
}
