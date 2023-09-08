package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetWxaSearchInfoEvent */
public final class GetWxaSearchInfoEvent extends IEvent {

    /* renamed from: d */
    public C1086a f9310d = new C1086a();

    /* renamed from: com.tencent.mm.autogen.events.GetWxaSearchInfoEvent$a */
    public static final class C1086a {
    }

    public GetWxaSearchInfoEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetWxaSearchInfoEvent)) {
            return false;
        }
        C1086a aVar = ((GetWxaSearchInfoEvent) iEvent).f9310d;
        this.f9310d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
