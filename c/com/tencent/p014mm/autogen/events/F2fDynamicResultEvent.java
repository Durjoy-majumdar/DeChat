package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.F2fDynamicResultEvent */
public final class F2fDynamicResultEvent extends IEvent {

    /* renamed from: d */
    public C67690a f193583d = new C67690a();

    /* renamed from: com.tencent.mm.autogen.events.F2fDynamicResultEvent$a */
    public static final class C67690a {
    }

    public F2fDynamicResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof F2fDynamicResultEvent)) {
            return false;
        }
        C67690a aVar = ((F2fDynamicResultEvent) iEvent).f193583d;
        this.f193583d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
