package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AdLandingPagesDownloadEventEvent */
public final class AdLandingPagesDownloadEventEvent extends IEvent {

    /* renamed from: d */
    public C28701a f78708d = new C28701a();

    /* renamed from: com.tencent.mm.autogen.events.AdLandingPagesDownloadEventEvent$a */
    public static final class C28701a {

        /* renamed from: a */
        public String f78709a;
    }

    public AdLandingPagesDownloadEventEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AdLandingPagesDownloadEventEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78708d.f78709a, ((AdLandingPagesDownloadEventEvent) iEvent).f78708d.f78709a);
    }
}
