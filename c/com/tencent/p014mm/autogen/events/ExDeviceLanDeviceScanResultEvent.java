package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent */
public final class ExDeviceLanDeviceScanResultEvent extends IEvent {

    /* renamed from: d */
    public C1019a f9107d = new C1019a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent$a */
    public static final class C1019a {

        /* renamed from: a */
        public String f9108a;

        /* renamed from: b */
        public byte[] f9109b;
    }

    public ExDeviceLanDeviceScanResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceLanDeviceScanResultEvent)) {
            return false;
        }
        C1019a aVar = ((ExDeviceLanDeviceScanResultEvent) iEvent).f9107d;
        if (!C46238a.m51546a(this.f9107d.f9108a, aVar.f9108a) || !C46238a.m51546a(this.f9107d.f9109b, aVar.f9109b)) {
            return false;
        }
        this.f9107d.getClass();
        Boolean bool = Boolean.FALSE;
        return C46238a.m51546a(bool, bool);
    }
}
