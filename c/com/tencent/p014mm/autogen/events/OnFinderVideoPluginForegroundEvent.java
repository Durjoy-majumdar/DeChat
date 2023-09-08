package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C64888zo1;

/* renamed from: com.tencent.mm.autogen.events.OnFinderVideoPluginForegroundEvent */
public final class OnFinderVideoPluginForegroundEvent extends IEvent {

    /* renamed from: d */
    public C55153a f154854d = new C55153a();

    /* renamed from: com.tencent.mm.autogen.events.OnFinderVideoPluginForegroundEvent$a */
    public static final class C55153a {

        /* renamed from: a */
        public C64888zo1 f154855a;
    }

    public OnFinderVideoPluginForegroundEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnFinderVideoPluginForegroundEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f154854d.f154855a, ((OnFinderVideoPluginForegroundEvent) iEvent).f154854d.f154855a);
    }
}
