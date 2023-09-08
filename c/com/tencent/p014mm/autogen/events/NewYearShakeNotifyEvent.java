package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NewYearShakeNotifyEvent */
public final class NewYearShakeNotifyEvent extends IEvent {

    /* renamed from: d */
    public C1097a f9352d = new C1097a();

    /* renamed from: com.tencent.mm.autogen.events.NewYearShakeNotifyEvent$a */
    public static final class C1097a {
    }

    public NewYearShakeNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewYearShakeNotifyEvent)) {
            return false;
        }
        C1097a aVar = ((NewYearShakeNotifyEvent) iEvent).f9352d;
        this.f9352d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
