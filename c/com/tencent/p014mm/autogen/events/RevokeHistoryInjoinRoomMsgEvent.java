package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent */
public final class RevokeHistoryInjoinRoomMsgEvent extends IEvent {

    /* renamed from: d */
    public C28809a f78941d = new C28809a();

    /* renamed from: com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent$a */
    public static final class C28809a {

        /* renamed from: a */
        public long f78942a;
    }

    public RevokeHistoryInjoinRoomMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RevokeHistoryInjoinRoomMsgEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f78941d.f78942a), Long.valueOf(((RevokeHistoryInjoinRoomMsgEvent) iEvent).f78941d.f78942a));
    }
}
