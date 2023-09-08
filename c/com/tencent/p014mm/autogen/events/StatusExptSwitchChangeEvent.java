package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent */
public final class StatusExptSwitchChangeEvent extends IEvent {

    /* renamed from: d */
    public C40170a f107773d = new C40170a();

    /* renamed from: com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent$a */
    public static final class C40170a {

        /* renamed from: a */
        public String f107774a;
    }

    public StatusExptSwitchChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StatusExptSwitchChangeEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107773d.f107774a, ((StatusExptSwitchChangeEvent) iEvent).f107773d.f107774a);
    }
}
