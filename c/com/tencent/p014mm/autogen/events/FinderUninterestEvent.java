package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderUninterestEvent */
public final class FinderUninterestEvent extends IEvent {

    /* renamed from: d */
    public C1068a f9262d = new C1068a();

    /* renamed from: com.tencent.mm.autogen.events.FinderUninterestEvent$a */
    public static final class C1068a {

        /* renamed from: a */
        public String f9263a;

        /* renamed from: b */
        public int f9264b;
    }

    public FinderUninterestEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderUninterestEvent)) {
            return false;
        }
        C1068a aVar = ((FinderUninterestEvent) iEvent).f9262d;
        return C46238a.m51546a(this.f9262d.f9263a, aVar.f9263a) && C46238a.m51546a(Integer.valueOf(this.f9262d.f9264b), Integer.valueOf(aVar.f9264b));
    }
}
