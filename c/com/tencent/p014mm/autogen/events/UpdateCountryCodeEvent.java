package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateCountryCodeEvent */
public final class UpdateCountryCodeEvent extends IEvent {

    /* renamed from: d */
    public C55172a f154894d = new C55172a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateCountryCodeEvent$a */
    public static final class C55172a {
    }

    public UpdateCountryCodeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateCountryCodeEvent)) {
            return false;
        }
        C55172a aVar = ((UpdateCountryCodeEvent) iEvent).f154894d;
        this.f154894d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
