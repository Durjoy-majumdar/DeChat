package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartMonitorKVEvent */
public final class StartMonitorKVEvent extends IEvent {

    /* renamed from: d */
    public C55168a f154881d = new C55168a();

    /* renamed from: com.tencent.mm.autogen.events.StartMonitorKVEvent$a */
    public static final class C55168a {

        /* renamed from: a */
        public String f154882a;
    }

    public StartMonitorKVEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartMonitorKVEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f154881d.f154882a, ((StartMonitorKVEvent) iEvent).f154881d.f154882a);
    }
}
