package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent */
public final class FinderFluentSwitchInterceptEvent extends IEvent {

    /* renamed from: d */
    public C1048a f9212d = new C1048a();

    /* renamed from: com.tencent.mm.autogen.events.FinderFluentSwitchInterceptEvent$a */
    public static final class C1048a {

        /* renamed from: a */
        public boolean f9213a;
    }

    public FinderFluentSwitchInterceptEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderFluentSwitchInterceptEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9212d.f9213a), Boolean.valueOf(((FinderFluentSwitchInterceptEvent) iEvent).f9212d.f9213a));
    }
}
