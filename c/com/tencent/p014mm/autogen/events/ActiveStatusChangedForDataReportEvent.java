package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent */
public final class ActiveStatusChangedForDataReportEvent extends IEvent {

    /* renamed from: d */
    public C80698a f236120d = new C80698a();

    /* renamed from: com.tencent.mm.autogen.events.ActiveStatusChangedForDataReportEvent$a */
    public static final class C80698a {

        /* renamed from: a */
        public boolean f236121a;

        /* renamed from: b */
        public String f236122b;
    }

    public ActiveStatusChangedForDataReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ActiveStatusChangedForDataReportEvent)) {
            return false;
        }
        C80698a aVar = ((ActiveStatusChangedForDataReportEvent) iEvent).f236120d;
        return C46238a.m51546a(Boolean.valueOf(this.f236120d.f236121a), Boolean.valueOf(aVar.f236121a)) && C46238a.m51546a(this.f236120d.f236122b, aVar.f236122b);
    }
}
