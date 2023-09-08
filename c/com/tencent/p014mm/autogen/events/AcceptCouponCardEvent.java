package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AcceptCouponCardEvent */
public final class AcceptCouponCardEvent extends IEvent {

    /* renamed from: d */
    public C67655a f193467d = new C67655a();

    /* renamed from: com.tencent.mm.autogen.events.AcceptCouponCardEvent$a */
    public static final class C67655a {

        /* renamed from: a */
        public String f193468a;

        /* renamed from: b */
        public int f193469b = 0;
    }

    public AcceptCouponCardEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AcceptCouponCardEvent)) {
            return false;
        }
        C67655a aVar = ((AcceptCouponCardEvent) iEvent).f193467d;
        return C46238a.m51546a(this.f193467d.f193468a, aVar.f193468a) && C46238a.m51546a(Integer.valueOf(this.f193467d.f193469b), Integer.valueOf(aVar.f193469b));
    }
}
