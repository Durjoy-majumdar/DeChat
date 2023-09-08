package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceStartScanLanDeviceEvent */
public final class ExDeviceStartScanLanDeviceEvent extends IEvent {

    /* renamed from: d */
    public C1030a f9138d = new C1030a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceStartScanLanDeviceEvent$a */
    public static final class C1030a {

        /* renamed from: a */
        public boolean f9139a = false;
    }

    public ExDeviceStartScanLanDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceStartScanLanDeviceEvent)) {
            return false;
        }
        C1030a aVar = ((ExDeviceStartScanLanDeviceEvent) iEvent).f9138d;
        this.f9138d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9138d.getClass();
        return C46238a.m51546a((Object) null, (Object) null) && C46238a.m51546a(Boolean.valueOf(this.f9138d.f9139a), Boolean.valueOf(aVar.f9139a));
    }
}
