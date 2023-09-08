package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent */
public final class WxPayLuckMoneyNewYearDownloadPAGResultEvent extends IEvent {

    /* renamed from: d */
    public C67833a f194107d = new C67833a();

    /* renamed from: com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent$a */
    public static final class C67833a {

        /* renamed from: a */
        public boolean f194108a = false;

        /* renamed from: b */
        public boolean f194109b = false;
    }

    public WxPayLuckMoneyNewYearDownloadPAGResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxPayLuckMoneyNewYearDownloadPAGResultEvent)) {
            return false;
        }
        C67833a aVar = ((WxPayLuckMoneyNewYearDownloadPAGResultEvent) iEvent).f194107d;
        return C46238a.m51546a(Boolean.valueOf(this.f194107d.f194108a), Boolean.valueOf(aVar.f194108a)) && C46238a.m51546a(Boolean.valueOf(this.f194107d.f194109b), Boolean.valueOf(aVar.f194109b));
    }
}
