package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent */
public final class ExDeviceOnScanDeviceResultEvent extends IEvent {

    /* renamed from: d */
    public C40075a f107471d = new C40075a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent$a */
    public static final class C40075a {

        /* renamed from: a */
        public String f107472a;

        /* renamed from: b */
        public byte[] f107473b;

        /* renamed from: c */
        public boolean f107474c;
    }

    public ExDeviceOnScanDeviceResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceOnScanDeviceResultEvent)) {
            return false;
        }
        C40075a aVar = ((ExDeviceOnScanDeviceResultEvent) iEvent).f107471d;
        return C46238a.m51546a(this.f107471d.f107472a, aVar.f107472a) && C46238a.m51546a(this.f107471d.f107473b, aVar.f107473b) && C46238a.m51546a(Boolean.valueOf(this.f107471d.f107474c), Boolean.valueOf(aVar.f107474c));
    }
}
