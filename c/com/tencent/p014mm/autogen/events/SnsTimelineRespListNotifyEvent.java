package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent */
public final class SnsTimelineRespListNotifyEvent extends IEvent {

    /* renamed from: d */
    public C92594a f265199d = new C92594a();

    /* renamed from: com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent$a */
    public static final class C92594a {

        /* renamed from: a */
        public LinkedList<Long> f265200a;
    }

    public SnsTimelineRespListNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsTimelineRespListNotifyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f265199d.f265200a, ((SnsTimelineRespListNotifyEvent) iEvent).f265199d.f265200a);
    }
}
