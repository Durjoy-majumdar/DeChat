package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FreeWifiStartMainUIEvent */
public final class FreeWifiStartMainUIEvent extends IEvent {

    /* renamed from: d */
    public C67702a f193626d = new C67702a();

    /* renamed from: com.tencent.mm.autogen.events.FreeWifiStartMainUIEvent$a */
    public static final class C67702a {

        /* renamed from: a */
        public String f193627a;
    }

    public FreeWifiStartMainUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FreeWifiStartMainUIEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193626d.f193627a, ((FreeWifiStartMainUIEvent) iEvent).f193626d.f193627a);
    }
}
