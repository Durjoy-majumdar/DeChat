package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderShareCloseEvent */
public final class FinderShareCloseEvent extends IEvent {

    /* renamed from: d */
    public C1061a f9247d = new C1061a();

    /* renamed from: com.tencent.mm.autogen.events.FinderShareCloseEvent$a */
    public static final class C1061a {
    }

    public FinderShareCloseEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderShareCloseEvent)) {
            return false;
        }
        C1061a aVar = ((FinderShareCloseEvent) iEvent).f9247d;
        this.f9247d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0L, 0L);
    }
}
