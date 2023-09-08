package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C64888zo1;

/* renamed from: com.tencent.mm.autogen.events.OnFinderVideoPluginBackgroundEvent */
public final class OnFinderVideoPluginBackgroundEvent extends IEvent {

    /* renamed from: d */
    public C55152a f154852d = new C55152a();

    /* renamed from: com.tencent.mm.autogen.events.OnFinderVideoPluginBackgroundEvent$a */
    public static final class C55152a {

        /* renamed from: a */
        public C64888zo1 f154853a;
    }

    public OnFinderVideoPluginBackgroundEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnFinderVideoPluginBackgroundEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f154852d.f154853a, ((OnFinderVideoPluginBackgroundEvent) iEvent).f154852d.f154853a);
    }
}
