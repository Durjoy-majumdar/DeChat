package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HomeUITabChangeEvent */
public final class HomeUITabChangeEvent extends IEvent {

    /* renamed from: d */
    public C28762a f78831d = new C28762a();

    /* renamed from: com.tencent.mm.autogen.events.HomeUITabChangeEvent$a */
    public static final class C28762a {

        /* renamed from: a */
        public int f78832a;
    }

    public HomeUITabChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HomeUITabChangeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f78831d.f78832a), Integer.valueOf(((HomeUITabChangeEvent) iEvent).f78831d.f78832a));
    }
}
