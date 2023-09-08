package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ShareCouponCardEvent */
public final class ShareCouponCardEvent extends IEvent {

    /* renamed from: d */
    public C92562a f265099d = new C92562a();

    /* renamed from: com.tencent.mm.autogen.events.ShareCouponCardEvent$a */
    public static final class C92562a {

        /* renamed from: a */
        public String f265100a;

        /* renamed from: b */
        public long f265101b;

        /* renamed from: c */
        public String f265102c;
    }

    public ShareCouponCardEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ShareCouponCardEvent)) {
            return false;
        }
        C92562a aVar = ((ShareCouponCardEvent) iEvent).f265099d;
        return C46238a.m51546a(this.f265099d.f265100a, aVar.f265100a) && C46238a.m51546a(Long.valueOf(this.f265099d.f265101b), Long.valueOf(aVar.f265101b)) && C46238a.m51546a(this.f265099d.f265102c, aVar.f265102c);
    }
}
