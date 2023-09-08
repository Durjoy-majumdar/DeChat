package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckIPCallIsStartedEvent */
public final class CheckIPCallIsStartedEvent extends IEvent {

    /* renamed from: d */
    public C80707a f236159d = new C80707a();

    /* renamed from: com.tencent.mm.autogen.events.CheckIPCallIsStartedEvent$a */
    public static final class C80707a {

        /* renamed from: a */
        public boolean f236160a = false;
    }

    public CheckIPCallIsStartedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckIPCallIsStartedEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f236159d.f236160a), Boolean.valueOf(((CheckIPCallIsStartedEvent) iEvent).f236159d.f236160a));
    }
}
