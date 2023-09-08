package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderSquareLiveViewLayoutEvent */
public final class FinderSquareLiveViewLayoutEvent extends IEvent {

    /* renamed from: d */
    public C55135a f154812d = new C55135a();

    /* renamed from: com.tencent.mm.autogen.events.FinderSquareLiveViewLayoutEvent$a */
    public static final class C55135a {

        /* renamed from: a */
        public long f154813a;
    }

    public FinderSquareLiveViewLayoutEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderSquareLiveViewLayoutEvent)) {
            return false;
        }
        return C46238a.m51546a(Long.valueOf(this.f154812d.f154813a), Long.valueOf(((FinderSquareLiveViewLayoutEvent) iEvent).f154812d.f154813a));
    }
}
