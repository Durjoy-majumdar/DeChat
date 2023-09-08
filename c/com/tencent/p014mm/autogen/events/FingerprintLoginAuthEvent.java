package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FingerprintLoginAuthEvent */
public final class FingerprintLoginAuthEvent extends IEvent {

    /* renamed from: d */
    public C1070a f9266d = new C1070a();

    /* renamed from: com.tencent.mm.autogen.events.FingerprintLoginAuthEvent$a */
    public static final class C1070a {
    }

    public FingerprintLoginAuthEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FingerprintLoginAuthEvent)) {
            return false;
        }
        C1070a aVar = ((FingerprintLoginAuthEvent) iEvent).f9266d;
        this.f9266d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
