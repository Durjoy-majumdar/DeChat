package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NewYearDisasterTestEvent */
public final class NewYearDisasterTestEvent extends IEvent {

    /* renamed from: d */
    public C1096a f9351d = new C1096a();

    /* renamed from: com.tencent.mm.autogen.events.NewYearDisasterTestEvent$a */
    public static final class C1096a {
    }

    public NewYearDisasterTestEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewYearDisasterTestEvent)) {
            return false;
        }
        C1096a aVar = ((NewYearDisasterTestEvent) iEvent).f9351d;
        this.f9351d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
