package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckIsSupportSoterFingerprintEvent */
public final class CheckIsSupportSoterFingerprintEvent extends IEvent {

    /* renamed from: d */
    public C67670a f193523d = new C67670a();

    /* renamed from: com.tencent.mm.autogen.events.CheckIsSupportSoterFingerprintEvent$a */
    public static final class C67670a {
    }

    public CheckIsSupportSoterFingerprintEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckIsSupportSoterFingerprintEvent)) {
            return false;
        }
        C67670a aVar = ((CheckIsSupportSoterFingerprintEvent) iEvent).f193523d;
        this.f193523d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f193523d.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f193523d.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
