package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanQRCodeOprationEvent */
public final class ScanQRCodeOprationEvent extends IEvent {

    /* renamed from: d */
    public C1128a f9472d = new C1128a();

    /* renamed from: com.tencent.mm.autogen.events.ScanQRCodeOprationEvent$a */
    public static final class C1128a {

        /* renamed from: a */
        public int f9473a = 0;
    }

    public ScanQRCodeOprationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanQRCodeOprationEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9472d.f9473a), Integer.valueOf(((ScanQRCodeOprationEvent) iEvent).f9472d.f9473a));
    }
}
