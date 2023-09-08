package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SessionConfigChangeEvent */
public final class SessionConfigChangeEvent extends IEvent {

    /* renamed from: d */
    public C114689a f343596d = new C114689a();

    /* renamed from: com.tencent.mm.autogen.events.SessionConfigChangeEvent$a */
    public static final class C114689a {

        /* renamed from: a */
        public String f343597a;

        /* renamed from: b */
        public Boolean f343598b;

        /* renamed from: c */
        public Boolean f343599c;
    }

    public SessionConfigChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SessionConfigChangeEvent)) {
            return false;
        }
        C114689a aVar = ((SessionConfigChangeEvent) iEvent).f343596d;
        return C46238a.m51546a(this.f343596d.f343597a, aVar.f343597a) && C46238a.m51546a(this.f343596d.f343598b, aVar.f343598b) && C46238a.m51546a(this.f343596d.f343599c, aVar.f343599c);
    }
}
