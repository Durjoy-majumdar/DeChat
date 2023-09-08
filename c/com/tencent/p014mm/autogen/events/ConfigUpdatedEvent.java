package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ConfigUpdatedEvent */
public final class ConfigUpdatedEvent extends IEvent {

    /* renamed from: d */
    public C1000a f9044d = new C1000a();

    /* renamed from: com.tencent.mm.autogen.events.ConfigUpdatedEvent$a */
    public static final class C1000a {

        /* renamed from: a */
        public String f9045a;
    }

    public ConfigUpdatedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ConfigUpdatedEvent)) {
            return false;
        }
        if (!C46238a.m51546a(this.f9044d.f9045a, ((ConfigUpdatedEvent) iEvent).f9044d.f9045a)) {
            return false;
        }
        this.f9044d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
