package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent */
public final class QuitFindMoreFriendsUIEvent extends IEvent {

    /* renamed from: d */
    public C17686a f48110d = new C17686a();

    /* renamed from: com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent$a */
    public static final class C17686a {

        /* renamed from: a */
        public String f48111a;

        /* renamed from: b */
        public String f48112b;

        /* renamed from: c */
        public long f48113c;

        /* renamed from: d */
        public long f48114d;
    }

    public QuitFindMoreFriendsUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QuitFindMoreFriendsUIEvent)) {
            return false;
        }
        C17686a aVar = ((QuitFindMoreFriendsUIEvent) iEvent).f48110d;
        return C46238a.m51546a(this.f48110d.f48111a, aVar.f48111a) && C46238a.m51546a(this.f48110d.f48112b, aVar.f48112b) && C46238a.m51546a(Long.valueOf(this.f48110d.f48113c), Long.valueOf(aVar.f48113c)) && C46238a.m51546a(Long.valueOf(this.f48110d.f48114d), Long.valueOf(aVar.f48114d));
    }
}
