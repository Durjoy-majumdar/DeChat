package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent */
public final class OPPOFloatWindowModeChangedEvent extends IEvent {

    /* renamed from: d */
    public C67744a f193773d = new C67744a();

    /* renamed from: com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent$a */
    public static final class C67744a {

        /* renamed from: a */
        public boolean f193774a;
    }

    public OPPOFloatWindowModeChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OPPOFloatWindowModeChangedEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193773d.f193774a), Boolean.valueOf(((OPPOFloatWindowModeChangedEvent) iEvent).f193773d.f193774a));
    }
}
