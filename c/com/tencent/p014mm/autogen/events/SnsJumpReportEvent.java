package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsJumpReportEvent */
public final class SnsJumpReportEvent extends IEvent {

    /* renamed from: d */
    public C92584a f265169d = new C92584a();

    /* renamed from: com.tencent.mm.autogen.events.SnsJumpReportEvent$a */
    public static final class C92584a {

        /* renamed from: a */
        public String f265170a;

        /* renamed from: b */
        public long f265171b;
    }

    public SnsJumpReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsJumpReportEvent)) {
            return false;
        }
        C92584a aVar = ((SnsJumpReportEvent) iEvent).f265169d;
        return C46238a.m51546a(this.f265169d.f265170a, aVar.f265170a) && C46238a.m51546a(Long.valueOf(this.f265169d.f265171b), Long.valueOf(aVar.f265171b));
    }
}
