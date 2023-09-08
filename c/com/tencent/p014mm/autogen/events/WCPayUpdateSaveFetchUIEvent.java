package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent */
public final class WCPayUpdateSaveFetchUIEvent extends IEvent {

    /* renamed from: d */
    public C67821a f194032d = new C67821a();

    /* renamed from: com.tencent.mm.autogen.events.WCPayUpdateSaveFetchUIEvent$a */
    public static final class C67821a {

        /* renamed from: a */
        public int f194033a = 0;
    }

    public WCPayUpdateSaveFetchUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WCPayUpdateSaveFetchUIEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f194032d.f194033a), Integer.valueOf(((WCPayUpdateSaveFetchUIEvent) iEvent).f194032d.f194033a));
    }
}
