package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsBehaviorNotifyFinderEvent */
public final class SnsBehaviorNotifyFinderEvent extends IEvent {

    /* renamed from: d */
    public C28826a f78984d = new C28826a();

    /* renamed from: com.tencent.mm.autogen.events.SnsBehaviorNotifyFinderEvent$a */
    public static final class C28826a {

        /* renamed from: a */
        public int f78985a;
    }

    public SnsBehaviorNotifyFinderEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsBehaviorNotifyFinderEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78984d.f78985a), Integer.valueOf(((SnsBehaviorNotifyFinderEvent) iEvent).f78984d.f78985a));
    }
}
