package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLocationRefreshEvent */
public final class FinderLocationRefreshEvent extends IEvent {

    /* renamed from: d */
    public C55132a f154801d = new C55132a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLocationRefreshEvent$a */
    public static final class C55132a {

        /* renamed from: a */
        public double f154802a;

        /* renamed from: b */
        public double f154803b;
    }

    public FinderLocationRefreshEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLocationRefreshEvent)) {
            return false;
        }
        C55132a aVar = ((FinderLocationRefreshEvent) iEvent).f154801d;
        return C46238a.m51546a(Double.valueOf(this.f154801d.f154802a), Double.valueOf(aVar.f154802a)) && C46238a.m51546a(Double.valueOf(this.f154801d.f154803b), Double.valueOf(aVar.f154803b));
    }
}
