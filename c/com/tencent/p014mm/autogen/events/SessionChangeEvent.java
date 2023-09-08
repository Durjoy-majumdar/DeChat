package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SessionChangeEvent */
public final class SessionChangeEvent extends IEvent {

    /* renamed from: d */
    public C28822a f78973d = new C28822a();

    /* renamed from: com.tencent.mm.autogen.events.SessionChangeEvent$a */
    public static final class C28822a {

        /* renamed from: a */
        public String f78974a;

        /* renamed from: b */
        public long f78975b;

        /* renamed from: c */
        public int f78976c;
    }

    public SessionChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SessionChangeEvent)) {
            return false;
        }
        C28822a aVar = ((SessionChangeEvent) iEvent).f78973d;
        return C46238a.m51546a(this.f78973d.f78974a, aVar.f78974a) && C46238a.m51546a(Long.valueOf(this.f78973d.f78975b), Long.valueOf(aVar.f78975b)) && C46238a.m51546a(Integer.valueOf(this.f78973d.f78976c), Integer.valueOf(aVar.f78976c));
    }
}
