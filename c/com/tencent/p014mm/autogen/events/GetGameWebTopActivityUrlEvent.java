package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetGameWebTopActivityUrlEvent */
public final class GetGameWebTopActivityUrlEvent extends IEvent {

    /* renamed from: d */
    public C24254a f69421d = new C24254a();

    /* renamed from: e */
    public C24255b f69422e = new C24255b();

    /* renamed from: com.tencent.mm.autogen.events.GetGameWebTopActivityUrlEvent$a */
    public static final class C24254a {
    }

    /* renamed from: com.tencent.mm.autogen.events.GetGameWebTopActivityUrlEvent$b */
    public static final class C24255b {
    }

    public GetGameWebTopActivityUrlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetGameWebTopActivityUrlEvent)) {
            return false;
        }
        GetGameWebTopActivityUrlEvent getGameWebTopActivityUrlEvent = (GetGameWebTopActivityUrlEvent) iEvent;
        C24254a aVar = getGameWebTopActivityUrlEvent.f69421d;
        this.f69421d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C24255b bVar = getGameWebTopActivityUrlEvent.f69422e;
        this.f69422e.getClass();
        bVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
