package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent */
public final class WebviewReportTmplTransferEvent extends IEvent {

    /* renamed from: d */
    public C28855a f79068d = new C28855a();

    /* renamed from: com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent$a */
    public static final class C28855a {

        /* renamed from: a */
        public int f79069a;
    }

    public WebviewReportTmplTransferEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebviewReportTmplTransferEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f79068d.f79069a), Integer.valueOf(((WebviewReportTmplTransferEvent) iEvent).f79068d.f79069a));
    }
}
