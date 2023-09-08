package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CheckMobileSpaceEvent */
public final class CheckMobileSpaceEvent extends IEvent {

    /* renamed from: d */
    public C67671a f193524d = new C67671a();

    /* renamed from: com.tencent.mm.autogen.events.CheckMobileSpaceEvent$a */
    public static final class C67671a {

        /* renamed from: a */
        public int f193525a = 0;
    }

    public CheckMobileSpaceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CheckMobileSpaceEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f193524d.f193525a), Integer.valueOf(((CheckMobileSpaceEvent) iEvent).f193524d.f193525a));
    }
}
