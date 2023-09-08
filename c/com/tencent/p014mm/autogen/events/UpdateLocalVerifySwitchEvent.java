package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent */
public final class UpdateLocalVerifySwitchEvent extends IEvent {

    /* renamed from: d */
    public C67808a f193987d = new C67808a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent$a */
    public static final class C67808a {

        /* renamed from: a */
        public boolean f193988a = false;

        /* renamed from: b */
        public boolean f193989b = false;
    }

    public UpdateLocalVerifySwitchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateLocalVerifySwitchEvent)) {
            return false;
        }
        C67808a aVar = ((UpdateLocalVerifySwitchEvent) iEvent).f193987d;
        return C46238a.m51546a(Boolean.valueOf(this.f193987d.f193988a), Boolean.valueOf(aVar.f193988a)) && C46238a.m51546a(Boolean.valueOf(this.f193987d.f193989b), Boolean.valueOf(aVar.f193989b));
    }
}
