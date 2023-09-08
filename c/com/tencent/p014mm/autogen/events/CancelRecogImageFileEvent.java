package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.CancelRecogImageFileEvent */
public final class CancelRecogImageFileEvent extends IEvent {

    /* renamed from: d */
    public C40046a f107390d = new C40046a();

    /* renamed from: com.tencent.mm.autogen.events.CancelRecogImageFileEvent$a */
    public static final class C40046a {

        /* renamed from: a */
        public long f107391a;

        /* renamed from: b */
        public String f107392b;
    }

    public CancelRecogImageFileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CancelRecogImageFileEvent)) {
            return false;
        }
        C40046a aVar = ((CancelRecogImageFileEvent) iEvent).f107390d;
        return C46238a.m51546a(Long.valueOf(this.f107390d.f107391a), Long.valueOf(aVar.f107391a)) && C46238a.m51546a(this.f107390d.f107392b, aVar.f107392b);
    }
}
