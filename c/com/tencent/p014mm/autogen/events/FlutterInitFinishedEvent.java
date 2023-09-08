package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FlutterInitFinishedEvent */
public final class FlutterInitFinishedEvent extends IEvent {

    /* renamed from: d */
    public C1071a f9267d = new C1071a();

    /* renamed from: com.tencent.mm.autogen.events.FlutterInitFinishedEvent$a */
    public static final class C1071a {
    }

    public FlutterInitFinishedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FlutterInitFinishedEvent)) {
            return false;
        }
        C1071a aVar = ((FlutterInitFinishedEvent) iEvent).f9267d;
        this.f9267d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
