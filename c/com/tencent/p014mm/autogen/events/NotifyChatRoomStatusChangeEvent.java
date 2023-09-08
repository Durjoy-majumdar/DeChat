package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent */
public final class NotifyChatRoomStatusChangeEvent extends IEvent {

    /* renamed from: d */
    public C67737a f193752d = new C67737a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyChatRoomStatusChangeEvent$a */
    public static final class C67737a {

        /* renamed from: a */
        public String f193753a;
    }

    public NotifyChatRoomStatusChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyChatRoomStatusChangeEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193752d.f193753a, ((NotifyChatRoomStatusChangeEvent) iEvent).f193752d.f193753a);
    }
}
