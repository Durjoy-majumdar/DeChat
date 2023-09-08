package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent */
public final class SnsForwardFeedToChatRoomForDataReportEvent extends IEvent {

    /* renamed from: d */
    public C92578a f265152d = new C92578a();

    /* renamed from: com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent$a */
    public static final class C92578a {

        /* renamed from: a */
        public String f265153a;

        /* renamed from: b */
        public String f265154b;
    }

    public SnsForwardFeedToChatRoomForDataReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsForwardFeedToChatRoomForDataReportEvent)) {
            return false;
        }
        C92578a aVar = ((SnsForwardFeedToChatRoomForDataReportEvent) iEvent).f265152d;
        return C46238a.m51546a(this.f265152d.f265153a, aVar.f265153a) && C46238a.m51546a(this.f265152d.f265154b, aVar.f265154b);
    }
}
