package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.KV14609ReportEvent */
public final class KV14609ReportEvent extends IEvent {

    /* renamed from: d */
    public C80727a f236226d = new C80727a();

    /* renamed from: com.tencent.mm.autogen.events.KV14609ReportEvent$a */
    public static final class C80727a {

        /* renamed from: a */
        public kv_14609 f236227a;

        /* renamed from: b */
        public kv_14609.C84151c f236228b;
    }

    public KV14609ReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof KV14609ReportEvent)) {
            return false;
        }
        C80727a aVar = ((KV14609ReportEvent) iEvent).f236226d;
        return C46238a.m51546a(this.f236226d.f236227a, aVar.f236227a) && C46238a.m51546a(this.f236226d.f236228b, aVar.f236228b);
    }
}
