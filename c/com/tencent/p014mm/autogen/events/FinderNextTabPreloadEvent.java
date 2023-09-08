package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderNextTabPreloadEvent */
public final class FinderNextTabPreloadEvent extends IEvent {

    /* renamed from: d */
    public C1057a f9236d = new C1057a();

    /* renamed from: com.tencent.mm.autogen.events.FinderNextTabPreloadEvent$a */
    public static final class C1057a {

        /* renamed from: a */
        public int f9237a;
    }

    public FinderNextTabPreloadEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderNextTabPreloadEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9236d.f9237a), Integer.valueOf(((FinderNextTabPreloadEvent) iEvent).f9236d.f9237a));
    }
}
