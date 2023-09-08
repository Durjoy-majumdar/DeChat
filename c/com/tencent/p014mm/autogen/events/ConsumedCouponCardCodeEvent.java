package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ConsumedCouponCardCodeEvent */
public final class ConsumedCouponCardCodeEvent extends IEvent {

    /* renamed from: d */
    public C67676a f193543d = new C67676a();

    /* renamed from: com.tencent.mm.autogen.events.ConsumedCouponCardCodeEvent$a */
    public static final class C67676a {

        /* renamed from: a */
        public int f193544a = 0;
    }

    public ConsumedCouponCardCodeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ConsumedCouponCardCodeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193543d.f193544a), Integer.valueOf(((ConsumedCouponCardCodeEvent) iEvent).f193543d.f193544a));
    }
}
