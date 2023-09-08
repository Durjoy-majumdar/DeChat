package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DoodleSessionEvent */
public final class DoodleSessionEvent extends IEvent {

    /* renamed from: d */
    public C28730a f78773d = new C28730a();

    /* renamed from: com.tencent.mm.autogen.events.DoodleSessionEvent$a */
    public static final class C28730a {
    }

    public DoodleSessionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DoodleSessionEvent)) {
            return false;
        }
        C28730a aVar = ((DoodleSessionEvent) iEvent).f78773d;
        this.f78773d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
