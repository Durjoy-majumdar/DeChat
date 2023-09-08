package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent */
public final class HKCashierJSApiPayResultEvent extends IEvent {

    /* renamed from: d */
    public C1087a f9311d = new C1087a();

    /* renamed from: com.tencent.mm.autogen.events.HKCashierJSApiPayResultEvent$a */
    public static final class C1087a {

        /* renamed from: a */
        public int f9312a = 0;

        /* renamed from: b */
        public int f9313b = 0;
    }

    public HKCashierJSApiPayResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HKCashierJSApiPayResultEvent)) {
            return false;
        }
        C1087a aVar = ((HKCashierJSApiPayResultEvent) iEvent).f9311d;
        return C46238a.m51546a(Integer.valueOf(this.f9311d.f9312a), Integer.valueOf(aVar.f9312a)) && C46238a.m51546a(Integer.valueOf(this.f9311d.f9313b), Integer.valueOf(aVar.f9313b));
    }
}
