package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ActiveLocationShareUIEvent */
public final class ActiveLocationShareUIEvent extends IEvent {

    /* renamed from: d */
    public C0992a f9021d = new C0992a();

    /* renamed from: com.tencent.mm.autogen.events.ActiveLocationShareUIEvent$a */
    public static final class C0992a {
    }

    public ActiveLocationShareUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ActiveLocationShareUIEvent)) {
            return false;
        }
        C0992a aVar = ((ActiveLocationShareUIEvent) iEvent).f9021d;
        this.f9021d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
