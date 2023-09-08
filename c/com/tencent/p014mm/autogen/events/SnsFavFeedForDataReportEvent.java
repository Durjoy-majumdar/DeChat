package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent */
public final class SnsFavFeedForDataReportEvent extends IEvent {

    /* renamed from: d */
    public C92574a f265135d = new C92574a();

    /* renamed from: com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent$a */
    public static final class C92574a {

        /* renamed from: a */
        public String f265136a;

        /* renamed from: b */
        public String f265137b;
    }

    public SnsFavFeedForDataReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsFavFeedForDataReportEvent)) {
            return false;
        }
        C92574a aVar = ((SnsFavFeedForDataReportEvent) iEvent).f265135d;
        return C46238a.m51546a(this.f265135d.f265136a, aVar.f265136a) && C46238a.m51546a(this.f265135d.f265137b, aVar.f265137b);
    }
}
