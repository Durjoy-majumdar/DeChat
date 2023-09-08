package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SessionUBAConfigChangeEvent */
public final class SessionUBAConfigChangeEvent extends IEvent {

    /* renamed from: d */
    public C114693a f343615d = new C114693a();

    /* renamed from: com.tencent.mm.autogen.events.SessionUBAConfigChangeEvent$a */
    public static final class C114693a {

        /* renamed from: a */
        public String f343616a;

        /* renamed from: b */
        public Boolean f343617b;
    }

    public SessionUBAConfigChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SessionUBAConfigChangeEvent)) {
            return false;
        }
        C114693a aVar = ((SessionUBAConfigChangeEvent) iEvent).f343615d;
        return C46238a.m51546a(this.f343615d.f343616a, aVar.f343616a) && C46238a.m51546a(this.f343615d.f343617b, aVar.f343617b);
    }
}
