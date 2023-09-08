package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtAgentLifeEvent */
public final class ExtAgentLifeEvent extends IEvent {

    /* renamed from: d */
    public C40094a f107514d = new C40094a();

    /* renamed from: com.tencent.mm.autogen.events.ExtAgentLifeEvent$a */
    public static final class C40094a {

        /* renamed from: a */
        public int f107515a;
    }

    public ExtAgentLifeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtAgentLifeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107514d.f107515a), Integer.valueOf(((ExtAgentLifeEvent) iEvent).f107514d.f107515a));
    }
}
