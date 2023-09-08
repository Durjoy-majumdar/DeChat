package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent */
public final class SnsForwardFeedToSingleChatForDataReportEvent extends IEvent {

    /* renamed from: d */
    public C92579a f265155d = new C92579a();

    /* renamed from: com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent$a */
    public static final class C92579a {

        /* renamed from: a */
        public String f265156a;

        /* renamed from: b */
        public String f265157b;
    }

    public SnsForwardFeedToSingleChatForDataReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsForwardFeedToSingleChatForDataReportEvent)) {
            return false;
        }
        C92579a aVar = ((SnsForwardFeedToSingleChatForDataReportEvent) iEvent).f265155d;
        return C46238a.m51546a(this.f265155d.f265156a, aVar.f265156a) && C46238a.m51546a(this.f265155d.f265157b, aVar.f265157b);
    }
}
