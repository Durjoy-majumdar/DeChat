package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FetchStreetViewUrlEvent */
public final class FetchStreetViewUrlEvent extends IEvent {

    /* renamed from: d */
    public C28741a f78787d = new C28741a();

    /* renamed from: e */
    public C28742b f78788e = new C28742b();

    /* renamed from: com.tencent.mm.autogen.events.FetchStreetViewUrlEvent$a */
    public static final class C28741a {
    }

    /* renamed from: com.tencent.mm.autogen.events.FetchStreetViewUrlEvent$b */
    public static final class C28742b {
    }

    public FetchStreetViewUrlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FetchStreetViewUrlEvent)) {
            return false;
        }
        FetchStreetViewUrlEvent fetchStreetViewUrlEvent = (FetchStreetViewUrlEvent) iEvent;
        C28741a aVar = fetchStreetViewUrlEvent.f78787d;
        this.f78787d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C28742b bVar = fetchStreetViewUrlEvent.f78788e;
        this.f78788e.getClass();
        bVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
