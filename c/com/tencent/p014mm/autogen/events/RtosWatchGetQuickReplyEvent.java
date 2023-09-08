package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RtosWatchGetQuickReplyEvent */
public final class RtosWatchGetQuickReplyEvent extends IEvent {

    /* renamed from: d */
    public C28813a f78954d = new C28813a();

    /* renamed from: com.tencent.mm.autogen.events.RtosWatchGetQuickReplyEvent$a */
    public static final class C28813a {

        /* renamed from: a */
        public String f78955a;

        /* renamed from: b */
        public String f78956b;
    }

    public RtosWatchGetQuickReplyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RtosWatchGetQuickReplyEvent)) {
            return false;
        }
        C28813a aVar = ((RtosWatchGetQuickReplyEvent) iEvent).f78954d;
        return C46238a.m51546a(this.f78954d.f78955a, aVar.f78955a) && C46238a.m51546a(this.f78954d.f78956b, aVar.f78956b);
    }
}
