package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsTimelineRefreshEvent */
public final class SnsTimelineRefreshEvent extends IEvent {

    /* renamed from: d */
    public C92593a f265197d = new C92593a();

    /* renamed from: com.tencent.mm.autogen.events.SnsTimelineRefreshEvent$a */
    public static final class C92593a {

        /* renamed from: a */
        public int f265198a;
    }

    public SnsTimelineRefreshEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsTimelineRefreshEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f265197d.f265198a), Integer.valueOf(((SnsTimelineRefreshEvent) iEvent).f265197d.f265198a));
    }
}
