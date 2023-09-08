package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent */
public final class NotifyNewFriendRequestEvent extends IEvent {

    /* renamed from: d */
    public C40146a f107665d = new C40146a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyNewFriendRequestEvent$a */
    public static final class C40146a {

        /* renamed from: a */
        public String f107666a;

        /* renamed from: b */
        public String f107667b;

        /* renamed from: c */
        public int f107668c;
    }

    public NotifyNewFriendRequestEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyNewFriendRequestEvent)) {
            return false;
        }
        C40146a aVar = ((NotifyNewFriendRequestEvent) iEvent).f107665d;
        return C46238a.m51546a(this.f107665d.f107666a, aVar.f107666a) && C46238a.m51546a(this.f107665d.f107667b, aVar.f107667b) && C46238a.m51546a(Integer.valueOf(this.f107665d.f107668c), Integer.valueOf(aVar.f107668c));
    }
}
