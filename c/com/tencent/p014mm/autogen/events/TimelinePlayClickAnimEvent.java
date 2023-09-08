package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TimelinePlayClickAnimEvent */
public final class TimelinePlayClickAnimEvent extends IEvent {

    /* renamed from: d */
    public C92607a f265241d = new C92607a();

    /* renamed from: com.tencent.mm.autogen.events.TimelinePlayClickAnimEvent$a */
    public static final class C92607a {

        /* renamed from: a */
        public long f265242a = 0;
    }

    public TimelinePlayClickAnimEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TimelinePlayClickAnimEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f265241d.f265242a), Long.valueOf(((TimelinePlayClickAnimEvent) iEvent).f265241d.f265242a));
    }
}
