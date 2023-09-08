package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent */
public final class SessionEdgeSqlChangeEvent extends IEvent {

    /* renamed from: d */
    public C114691a f343604d = new C114691a();

    /* renamed from: com.tencent.mm.autogen.events.SessionEdgeSqlChangeEvent$a */
    public static final class C114691a {

        /* renamed from: a */
        public long f343605a;

        /* renamed from: b */
        public String f343606b;

        /* renamed from: c */
        public Boolean f343607c;
    }

    public SessionEdgeSqlChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SessionEdgeSqlChangeEvent)) {
            return false;
        }
        C114691a aVar = ((SessionEdgeSqlChangeEvent) iEvent).f343604d;
        return C46238a.m51546a(Long.valueOf(this.f343604d.f343605a), Long.valueOf(aVar.f343605a)) && C46238a.m51546a(this.f343604d.f343606b, aVar.f343606b) && C46238a.m51546a(this.f343604d.f343607c, aVar.f343607c);
    }
}
