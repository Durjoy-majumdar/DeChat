package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.EnableMainBottomTabSwitchEvent */
public final class EnableMainBottomTabSwitchEvent extends IEvent {

    /* renamed from: d */
    public C67680a f193551d = new C67680a();

    /* renamed from: com.tencent.mm.autogen.events.EnableMainBottomTabSwitchEvent$a */
    public static final class C67680a {

        /* renamed from: a */
        public boolean f193552a;
    }

    public EnableMainBottomTabSwitchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof EnableMainBottomTabSwitchEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f193551d.f193552a), Boolean.valueOf(((EnableMainBottomTabSwitchEvent) iEvent).f193551d.f193552a));
    }
}
