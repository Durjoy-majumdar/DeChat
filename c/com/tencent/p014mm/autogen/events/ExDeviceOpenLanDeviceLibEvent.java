package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceOpenLanDeviceLibEvent */
public final class ExDeviceOpenLanDeviceLibEvent extends IEvent {

    /* renamed from: d */
    public C1021a f9112d = new C1021a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceOpenLanDeviceLibEvent$a */
    public static final class C1021a {

        /* renamed from: a */
        public boolean f9113a = false;
    }

    public ExDeviceOpenLanDeviceLibEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceOpenLanDeviceLibEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9112d.f9113a), Boolean.valueOf(((ExDeviceOpenLanDeviceLibEvent) iEvent).f9112d.f9113a));
    }
}
