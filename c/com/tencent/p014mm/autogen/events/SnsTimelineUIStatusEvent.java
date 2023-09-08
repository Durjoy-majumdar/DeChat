package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsTimelineUIStatusEvent */
public final class SnsTimelineUIStatusEvent extends IEvent {

    /* renamed from: d */
    public C28832a f79003d = new C28832a();

    /* renamed from: com.tencent.mm.autogen.events.SnsTimelineUIStatusEvent$a */
    public static final class C28832a {

        /* renamed from: a */
        public Boolean f79004a;
    }

    public SnsTimelineUIStatusEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsTimelineUIStatusEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f79003d.f79004a, ((SnsTimelineUIStatusEvent) iEvent).f79003d.f79004a);
    }
}
