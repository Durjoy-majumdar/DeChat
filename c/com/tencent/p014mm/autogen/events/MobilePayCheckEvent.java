package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MobilePayCheckEvent */
public final class MobilePayCheckEvent extends IEvent {

    /* renamed from: d */
    public C67731a f193736d = new C67731a();

    /* renamed from: com.tencent.mm.autogen.events.MobilePayCheckEvent$a */
    public static final class C67731a {

        /* renamed from: a */
        public String f193737a;
    }

    public MobilePayCheckEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MobilePayCheckEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f193736d.f193737a, ((MobilePayCheckEvent) iEvent).f193736d.f193737a);
    }
}
