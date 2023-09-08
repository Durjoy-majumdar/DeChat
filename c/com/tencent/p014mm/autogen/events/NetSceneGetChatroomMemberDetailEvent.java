package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent */
public final class NetSceneGetChatroomMemberDetailEvent extends IEvent {

    /* renamed from: d */
    public C40141a f107649d = new C40141a();

    /* renamed from: com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent$a */
    public static final class C40141a {

        /* renamed from: a */
        public String f107650a;

        /* renamed from: b */
        public int f107651b;
    }

    public NetSceneGetChatroomMemberDetailEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NetSceneGetChatroomMemberDetailEvent)) {
            return false;
        }
        C40141a aVar = ((NetSceneGetChatroomMemberDetailEvent) iEvent).f107649d;
        if (!C46238a.m51546a(this.f107649d.f107650a, aVar.f107650a) || !C46238a.m51546a(Integer.valueOf(this.f107649d.f107651b), Integer.valueOf(aVar.f107651b))) {
            return false;
        }
        this.f107649d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
