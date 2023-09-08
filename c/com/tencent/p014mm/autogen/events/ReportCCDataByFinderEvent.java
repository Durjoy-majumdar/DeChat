package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportCCDataByFinderEvent */
public final class ReportCCDataByFinderEvent extends IEvent {

    /* renamed from: d */
    public C28800a f78922d = new C28800a();

    /* renamed from: com.tencent.mm.autogen.events.ReportCCDataByFinderEvent$a */
    public static final class C28800a {

        /* renamed from: a */
        public int f78923a = 0;
    }

    public ReportCCDataByFinderEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportCCDataByFinderEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78922d.f78923a), Integer.valueOf(((ReportCCDataByFinderEvent) iEvent).f78922d.f78923a));
    }
}
