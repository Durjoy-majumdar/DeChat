package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetMFriendEvent */
public final class GetMFriendEvent extends IEvent {

    /* renamed from: d */
    public C1081a f9301d = new C1081a();

    /* renamed from: com.tencent.mm.autogen.events.GetMFriendEvent$a */
    public static final class C1081a {

        /* renamed from: a */
        public int f9302a = 1;
    }

    public GetMFriendEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetMFriendEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9301d.f9302a), Integer.valueOf(((GetMFriendEvent) iEvent).f9301d.f9302a));
    }
}
