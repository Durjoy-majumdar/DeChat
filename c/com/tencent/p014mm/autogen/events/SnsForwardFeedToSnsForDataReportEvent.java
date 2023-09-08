package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsForwardFeedToSnsForDataReportEvent */
public final class SnsForwardFeedToSnsForDataReportEvent extends IEvent {

    /* renamed from: d */
    public C1138a f9512d = new C1138a();

    /* renamed from: com.tencent.mm.autogen.events.SnsForwardFeedToSnsForDataReportEvent$a */
    public static final class C1138a {

        /* renamed from: a */
        public String f9513a;

        /* renamed from: b */
        public String f9514b;
    }

    public SnsForwardFeedToSnsForDataReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsForwardFeedToSnsForDataReportEvent)) {
            return false;
        }
        C1138a aVar = ((SnsForwardFeedToSnsForDataReportEvent) iEvent).f9512d;
        return C46238a.m51546a(this.f9512d.f9513a, aVar.f9513a) && C46238a.m51546a(this.f9512d.f9514b, aVar.f9514b);
    }
}
