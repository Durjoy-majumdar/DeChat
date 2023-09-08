package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandUIOnStartEvent */
public final class AppBrandUIOnStartEvent extends IEvent {

    /* renamed from: d */
    public C80705a f236154d = new C80705a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandUIOnStartEvent$a */
    public static final class C80705a {

        /* renamed from: a */
        public String f236155a;
    }

    public AppBrandUIOnStartEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandUIOnStartEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f236154d.f236155a, ((AppBrandUIOnStartEvent) iEvent).f236154d.f236155a);
    }
}
