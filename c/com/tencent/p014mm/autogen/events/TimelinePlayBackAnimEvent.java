package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TimelinePlayBackAnimEvent */
public final class TimelinePlayBackAnimEvent extends IEvent {

    /* renamed from: d */
    public C92606a f265239d = new C92606a();

    /* renamed from: com.tencent.mm.autogen.events.TimelinePlayBackAnimEvent$a */
    public static final class C92606a {

        /* renamed from: a */
        public long f265240a = 0;
    }

    public TimelinePlayBackAnimEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TimelinePlayBackAnimEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f265239d.f265240a), Long.valueOf(((TimelinePlayBackAnimEvent) iEvent).f265239d.f265240a));
    }
}
