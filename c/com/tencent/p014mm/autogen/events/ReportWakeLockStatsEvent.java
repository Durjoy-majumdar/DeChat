package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReportWakeLockStatsEvent */
public final class ReportWakeLockStatsEvent extends IEvent {

    /* renamed from: d */
    public C114688a f343594d = new C114688a();

    /* renamed from: com.tencent.mm.autogen.events.ReportWakeLockStatsEvent$a */
    public static final class C114688a {

        /* renamed from: a */
        public String f343595a;
    }

    public ReportWakeLockStatsEvent() {
        this.order = true;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReportWakeLockStatsEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f343594d.f343595a, ((ReportWakeLockStatsEvent) iEvent).f343594d.f343595a);
    }
}
