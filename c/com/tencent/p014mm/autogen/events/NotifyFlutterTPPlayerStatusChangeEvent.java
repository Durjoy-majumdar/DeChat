package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NotifyFlutterTPPlayerStatusChangeEvent */
public final class NotifyFlutterTPPlayerStatusChangeEvent extends IEvent {

    /* renamed from: d */
    public C1098a f9353d = new C1098a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyFlutterTPPlayerStatusChangeEvent$a */
    public static final class C1098a {
    }

    public NotifyFlutterTPPlayerStatusChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyFlutterTPPlayerStatusChangeEvent)) {
            return false;
        }
        C1098a aVar = ((NotifyFlutterTPPlayerStatusChangeEvent) iEvent).f9353d;
        this.f9353d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
