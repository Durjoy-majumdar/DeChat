package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent */
public final class EnterFindMoreFriendsUIEvent extends IEvent {

    /* renamed from: d */
    public C17676a f48084d = new C17676a();

    /* renamed from: com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent$a */
    public static final class C17676a {

        /* renamed from: a */
        public String f48085a;

        /* renamed from: b */
        public long f48086b;

        /* renamed from: c */
        public long f48087c;
    }

    public EnterFindMoreFriendsUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EnterFindMoreFriendsUIEvent)) {
            return false;
        }
        C17676a aVar = ((EnterFindMoreFriendsUIEvent) iEvent).f48084d;
        return C46238a.m51546a(this.f48084d.f48085a, aVar.f48085a) && C46238a.m51546a(Long.valueOf(this.f48084d.f48086b), Long.valueOf(aVar.f48086b)) && C46238a.m51546a(Long.valueOf(this.f48084d.f48087c), Long.valueOf(aVar.f48087c));
    }
}
