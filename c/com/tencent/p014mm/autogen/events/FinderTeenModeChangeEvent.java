package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderTeenModeChangeEvent */
public final class FinderTeenModeChangeEvent extends IEvent {

    /* renamed from: d */
    public C1065a f9255d = new C1065a();

    /* renamed from: com.tencent.mm.autogen.events.FinderTeenModeChangeEvent$a */
    public static final class C1065a {
    }

    public FinderTeenModeChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderTeenModeChangeEvent)) {
            return false;
        }
        C1065a aVar = ((FinderTeenModeChangeEvent) iEvent).f9255d;
        this.f9255d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
