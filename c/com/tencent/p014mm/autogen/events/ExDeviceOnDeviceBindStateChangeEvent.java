package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent */
public final class ExDeviceOnDeviceBindStateChangeEvent extends IEvent {

    /* renamed from: d */
    public C40073a f107464d = new C40073a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent$a */
    public static final class C40073a {

        /* renamed from: a */
        public String f107465a;

        /* renamed from: b */
        public boolean f107466b;
    }

    public ExDeviceOnDeviceBindStateChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceOnDeviceBindStateChangeEvent)) {
            return false;
        }
        C40073a aVar = ((ExDeviceOnDeviceBindStateChangeEvent) iEvent).f107464d;
        return C46238a.m51546a(this.f107464d.f107465a, aVar.f107465a) && C46238a.m51546a(Boolean.valueOf(this.f107464d.f107466b), Boolean.valueOf(aVar.f107466b));
    }
}
