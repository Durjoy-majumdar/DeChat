package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.QueryDoingInitEvent */
public final class QueryDoingInitEvent extends IEvent {

    /* renamed from: d */
    public C67764a f193857d = new C67764a();

    /* renamed from: com.tencent.mm.autogen.events.QueryDoingInitEvent$a */
    public static final class C67764a {

        /* renamed from: a */
        public boolean f193858a;
    }

    public QueryDoingInitEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof QueryDoingInitEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193857d.f193858a), Boolean.valueOf(((QueryDoingInitEvent) iEvent).f193857d.f193858a));
    }
}
