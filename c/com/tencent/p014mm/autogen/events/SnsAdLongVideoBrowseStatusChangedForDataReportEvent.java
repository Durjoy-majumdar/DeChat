package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent */
public final class SnsAdLongVideoBrowseStatusChangedForDataReportEvent extends IEvent {

    /* renamed from: d */
    public C92570a f265123d = new C92570a();

    /* renamed from: com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent$a */
    public static final class C92570a {

        /* renamed from: a */
        public boolean f265124a;
    }

    public SnsAdLongVideoBrowseStatusChangedForDataReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsAdLongVideoBrowseStatusChangedForDataReportEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f265123d.f265124a), Boolean.valueOf(((SnsAdLongVideoBrowseStatusChangedForDataReportEvent) iEvent).f265123d.f265124a));
    }
}
