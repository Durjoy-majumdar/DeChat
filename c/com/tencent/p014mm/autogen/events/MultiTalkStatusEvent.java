package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MultiTalkStatusEvent */
public final class MultiTalkStatusEvent extends IEvent {

    /* renamed from: d */
    public C55146a f154840d = new C55146a();

    /* renamed from: com.tencent.mm.autogen.events.MultiTalkStatusEvent$a */
    public static final class C55146a {

        /* renamed from: a */
        public boolean f154841a = false;
    }

    public MultiTalkStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MultiTalkStatusEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f154840d.f154841a), Boolean.valueOf(((MultiTalkStatusEvent) iEvent).f154840d.f154841a));
    }
}
