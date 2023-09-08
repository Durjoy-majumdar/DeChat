package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppActiveEvent */
public final class AppActiveEvent extends IEvent {

    /* renamed from: d */
    public C28702a f78710d = new C28702a();

    /* renamed from: com.tencent.mm.autogen.events.AppActiveEvent$a */
    public static final class C28702a {

        /* renamed from: a */
        public boolean f78711a;
    }

    public AppActiveEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppActiveEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f78710d.f78711a), Boolean.valueOf(((AppActiveEvent) iEvent).f78710d.f78711a));
    }
}
