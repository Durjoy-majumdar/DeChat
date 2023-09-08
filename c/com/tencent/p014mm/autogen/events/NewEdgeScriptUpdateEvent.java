package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import oa1.C61982a;

/* renamed from: com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent */
public final class NewEdgeScriptUpdateEvent extends IEvent {

    /* renamed from: d */
    public C114682a f343580d = new C114682a();

    /* renamed from: com.tencent.mm.autogen.events.NewEdgeScriptUpdateEvent$a */
    public static final class C114682a {

        /* renamed from: a */
        public long f343581a;

        /* renamed from: b */
        public C61982a f343582b;
    }

    public NewEdgeScriptUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewEdgeScriptUpdateEvent)) {
            return false;
        }
        C114682a aVar = ((NewEdgeScriptUpdateEvent) iEvent).f343580d;
        return C46238a.m51546a(Long.valueOf(this.f343580d.f343581a), Long.valueOf(aVar.f343581a)) && C46238a.m51546a(this.f343580d.f343582b, aVar.f343582b);
    }
}
