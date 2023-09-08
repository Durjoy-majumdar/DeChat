package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxPayGdprResultEvent */
public final class WxPayGdprResultEvent extends IEvent {

    /* renamed from: d */
    public C1169a f9615d = new C1169a();

    /* renamed from: com.tencent.mm.autogen.events.WxPayGdprResultEvent$a */
    public static final class C1169a {

        /* renamed from: a */
        public String f9616a;
    }

    public WxPayGdprResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxPayGdprResultEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f9615d.f9616a, ((WxPayGdprResultEvent) iEvent).f9615d.f9616a);
    }
}
