package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TraceOperationEvent */
public final class TraceOperationEvent extends IEvent {

    /* renamed from: d */
    public C28842a f79033d = new C28842a();

    /* renamed from: com.tencent.mm.autogen.events.TraceOperationEvent$a */
    public static final class C28842a {

        /* renamed from: a */
        public String f79034a;

        /* renamed from: b */
        public int f79035b = -1;
    }

    public TraceOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TraceOperationEvent)) {
            return false;
        }
        C28842a aVar = ((TraceOperationEvent) iEvent).f79033d;
        return C46238a.m51546a(this.f79033d.f79034a, aVar.f79034a) && C46238a.m51546a(Integer.valueOf(this.f79033d.f79035b), Integer.valueOf(aVar.f79035b));
    }
}
