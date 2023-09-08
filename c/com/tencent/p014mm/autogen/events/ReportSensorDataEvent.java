package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportSensorDataEvent */
public final class ReportSensorDataEvent extends IEvent {

    /* renamed from: d */
    public C28803a f78927d = new C28803a();

    /* renamed from: com.tencent.mm.autogen.events.ReportSensorDataEvent$a */
    public static final class C28803a {

        /* renamed from: a */
        public byte[] f78928a;

        /* renamed from: b */
        public String f78929b;
    }

    public ReportSensorDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportSensorDataEvent)) {
            return false;
        }
        C28803a aVar = ((ReportSensorDataEvent) iEvent).f78927d;
        return C46238a.m51546a(this.f78927d.f78928a, aVar.f78928a) && C46238a.m51546a(this.f78927d.f78929b, aVar.f78929b);
    }
}
