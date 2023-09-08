package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportAdClickEvent */
public final class ReportAdClickEvent extends IEvent {

    /* renamed from: d */
    public C1115a f9426d = new C1115a();

    /* renamed from: com.tencent.mm.autogen.events.ReportAdClickEvent$a */
    public static final class C1115a {

        /* renamed from: a */
        public SnsAdClick f9427a;
    }

    public ReportAdClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportAdClickEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f9426d.f9427a, ((ReportAdClickEvent) iEvent).f9426d.f9427a);
    }
}
