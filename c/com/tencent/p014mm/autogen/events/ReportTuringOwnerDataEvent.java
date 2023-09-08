package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportTuringOwnerDataEvent */
public final class ReportTuringOwnerDataEvent extends IEvent {

    /* renamed from: d */
    public C28804a f78930d = new C28804a();

    /* renamed from: com.tencent.mm.autogen.events.ReportTuringOwnerDataEvent$a */
    public static final class C28804a {

        /* renamed from: a */
        public byte[] f78931a;
    }

    public ReportTuringOwnerDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportTuringOwnerDataEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78930d.f78931a, ((ReportTuringOwnerDataEvent) iEvent).f78930d.f78931a);
    }
}
