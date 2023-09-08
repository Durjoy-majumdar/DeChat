package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent */
public final class ScanQrcodeLiveScreenCastAuthorizationEvent extends IEvent {

    /* renamed from: d */
    public C55162a f154870d = new C55162a();

    /* renamed from: com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent$a */
    public static final class C55162a {

        /* renamed from: a */
        public String f154871a;
    }

    public ScanQrcodeLiveScreenCastAuthorizationEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ScanQrcodeLiveScreenCastAuthorizationEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f154870d.f154871a, ((ScanQrcodeLiveScreenCastAuthorizationEvent) iEvent).f154870d.f154871a);
    }
}
