package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetOpenImUrlEvent */
public final class GetOpenImUrlEvent extends IEvent {

    /* renamed from: d */
    public C28757a f78825d = new C28757a();

    /* renamed from: e */
    public C28758b f78826e = new C28758b();

    /* renamed from: com.tencent.mm.autogen.events.GetOpenImUrlEvent$a */
    public static final class C28757a {
    }

    /* renamed from: com.tencent.mm.autogen.events.GetOpenImUrlEvent$b */
    public static final class C28758b {
    }

    public GetOpenImUrlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetOpenImUrlEvent)) {
            return false;
        }
        GetOpenImUrlEvent getOpenImUrlEvent = (GetOpenImUrlEvent) iEvent;
        C28757a aVar = getOpenImUrlEvent.f78825d;
        this.f78825d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C28758b bVar = getOpenImUrlEvent.f78826e;
        this.f78826e.getClass();
        bVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
