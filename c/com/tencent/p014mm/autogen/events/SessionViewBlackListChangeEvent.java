package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SessionViewBlackListChangeEvent */
public final class SessionViewBlackListChangeEvent extends IEvent {

    /* renamed from: d */
    public C114694a f343618d = new C114694a();

    /* renamed from: com.tencent.mm.autogen.events.SessionViewBlackListChangeEvent$a */
    public static final class C114694a {

        /* renamed from: a */
        public long f343619a;

        /* renamed from: b */
        public String f343620b;

        /* renamed from: c */
        public Boolean f343621c;
    }

    public SessionViewBlackListChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SessionViewBlackListChangeEvent)) {
            return false;
        }
        C114694a aVar = ((SessionViewBlackListChangeEvent) iEvent).f343618d;
        return C46238a.m51546a(Long.valueOf(this.f343618d.f343619a), Long.valueOf(aVar.f343619a)) && C46238a.m51546a(this.f343618d.f343620b, aVar.f343620b) && C46238a.m51546a(this.f343618d.f343621c, aVar.f343621c);
    }
}
