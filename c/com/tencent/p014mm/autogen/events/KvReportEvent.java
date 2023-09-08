package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.KvReportEvent */
public final class KvReportEvent extends IEvent {

    /* renamed from: d */
    public C28769a f78853d = new C28769a();

    /* renamed from: com.tencent.mm.autogen.events.KvReportEvent$a */
    public static final class C28769a {

        /* renamed from: a */
        public long f78854a;

        /* renamed from: b */
        public String f78855b;
    }

    public KvReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KvReportEvent)) {
            return false;
        }
        C28769a aVar = ((KvReportEvent) iEvent).f78853d;
        return C46238a.m51546a(Long.valueOf(this.f78853d.f78854a), Long.valueOf(aVar.f78854a)) && C46238a.m51546a(this.f78853d.f78855b, aVar.f78855b);
    }
}
