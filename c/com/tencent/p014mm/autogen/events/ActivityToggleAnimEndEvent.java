package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent */
public final class ActivityToggleAnimEndEvent extends IEvent {

    /* renamed from: h */
    public C26876a f74717h = new C26876a();

    /* renamed from: com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent$a */
    public static final class C26876a {

        /* renamed from: a */
        public int f74718a;
    }

    public ActivityToggleAnimEndEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ActivityToggleAnimEndEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f74717h.f74718a), Integer.valueOf(((ActivityToggleAnimEndEvent) iEvent).f74717h.f74718a));
    }
}
