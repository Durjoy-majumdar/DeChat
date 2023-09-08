package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent */
public final class RecogQBarOfImageFileFailedEvent extends IEvent {

    /* renamed from: d */
    public C40159a f107738d = new C40159a();

    /* renamed from: com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent$a */
    public static final class C40159a {

        /* renamed from: a */
        public String f107739a;
    }

    public RecogQBarOfImageFileFailedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecogQBarOfImageFileFailedEvent)) {
            return false;
        }
        C40159a aVar = ((RecogQBarOfImageFileFailedEvent) iEvent).f107738d;
        this.f107738d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0L, 0L) || !C46238a.m51546a(this.f107738d.f107739a, aVar.f107739a)) {
            return false;
        }
        this.f107738d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
