package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FPSLighterOperationEvent */
public final class FPSLighterOperationEvent extends IEvent {

    /* renamed from: d */
    public C1031a f9140d = new C1031a();

    /* renamed from: com.tencent.mm.autogen.events.FPSLighterOperationEvent$a */
    public static final class C1031a {
    }

    public FPSLighterOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FPSLighterOperationEvent)) {
            return false;
        }
        C1031a aVar = ((FPSLighterOperationEvent) iEvent).f9140d;
        this.f9140d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
