package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent */
public final class RefreshLuckyMoneyEnvelopeListEvent extends IEvent {

    /* renamed from: d */
    public C1114a f9424d = new C1114a();

    /* renamed from: com.tencent.mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent$a */
    public static final class C1114a {

        /* renamed from: a */
        public boolean f9425a = false;
    }

    public RefreshLuckyMoneyEnvelopeListEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RefreshLuckyMoneyEnvelopeListEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9424d.f9425a), Boolean.valueOf(((RefreshLuckyMoneyEnvelopeListEvent) iEvent).f9424d.f9425a));
    }
}
