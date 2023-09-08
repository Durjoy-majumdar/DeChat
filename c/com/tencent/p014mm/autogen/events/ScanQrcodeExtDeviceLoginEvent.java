package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent */
public final class ScanQrcodeExtDeviceLoginEvent extends IEvent {

    /* renamed from: d */
    public C28819a f78966d = new C28819a();

    /* renamed from: com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent$a */
    public static final class C28819a {

        /* renamed from: a */
        public String f78967a;

        /* renamed from: b */
        public int f78968b;
    }

    public ScanQrcodeExtDeviceLoginEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanQrcodeExtDeviceLoginEvent)) {
            return false;
        }
        C28819a aVar = ((ScanQrcodeExtDeviceLoginEvent) iEvent).f78966d;
        return C46238a.m51546a(this.f78966d.f78967a, aVar.f78967a) && C46238a.m51546a(Integer.valueOf(this.f78966d.f78968b), Integer.valueOf(aVar.f78968b));
    }
}
