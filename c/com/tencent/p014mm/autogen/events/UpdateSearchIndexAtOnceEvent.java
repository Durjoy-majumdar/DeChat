package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent */
public final class UpdateSearchIndexAtOnceEvent extends IEvent {

    /* renamed from: d */
    public C1154a f9570d = new C1154a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent$a */
    public static final class C1154a {

        /* renamed from: a */
        public long f9571a = 800;
    }

    public UpdateSearchIndexAtOnceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateSearchIndexAtOnceEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f9570d.f9571a), Long.valueOf(((UpdateSearchIndexAtOnceEvent) iEvent).f9570d.f9571a));
    }
}
