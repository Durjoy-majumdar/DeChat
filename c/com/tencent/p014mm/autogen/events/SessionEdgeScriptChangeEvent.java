package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SessionEdgeScriptChangeEvent */
public final class SessionEdgeScriptChangeEvent extends IEvent {

    /* renamed from: d */
    public C114690a f343600d = new C114690a();

    /* renamed from: com.tencent.mm.autogen.events.SessionEdgeScriptChangeEvent$a */
    public static final class C114690a {

        /* renamed from: a */
        public long f343601a;

        /* renamed from: b */
        public String f343602b;

        /* renamed from: c */
        public Boolean f343603c;
    }

    public SessionEdgeScriptChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SessionEdgeScriptChangeEvent)) {
            return false;
        }
        C114690a aVar = ((SessionEdgeScriptChangeEvent) iEvent).f343600d;
        return C46238a.m51546a(Long.valueOf(this.f343600d.f343601a), Long.valueOf(aVar.f343601a)) && C46238a.m51546a(this.f343600d.f343602b, aVar.f343602b) && C46238a.m51546a(this.f343600d.f343603c, aVar.f343603c);
    }
}
