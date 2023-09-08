package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent */
public final class UpdateFtsSearchDataEvent extends IEvent {

    /* renamed from: d */
    public C1153a f9569d = new C1153a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent$a */
    public static final class C1153a {
    }

    public UpdateFtsSearchDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateFtsSearchDataEvent)) {
            return false;
        }
        C1153a aVar = ((UpdateFtsSearchDataEvent) iEvent).f9569d;
        this.f9569d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0L, 0L);
    }
}
