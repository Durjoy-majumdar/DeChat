package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetSafeDeviceNameEvent */
public final class GetSafeDeviceNameEvent extends IEvent {

    /* renamed from: d */
    public C67713a f193657d = new C67713a();

    /* renamed from: e */
    public C67714b f193658e = new C67714b();

    /* renamed from: com.tencent.mm.autogen.events.GetSafeDeviceNameEvent$a */
    public static final class C67713a {

        /* renamed from: a */
        public Context f193659a;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetSafeDeviceNameEvent$b */
    public static final class C67714b {

        /* renamed from: a */
        public String f193660a;
    }

    public GetSafeDeviceNameEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetSafeDeviceNameEvent)) {
            return false;
        }
        GetSafeDeviceNameEvent getSafeDeviceNameEvent = (GetSafeDeviceNameEvent) iEvent;
        if (!C46238a.m51546a(this.f193657d.f193659a, getSafeDeviceNameEvent.f193657d.f193659a)) {
            return false;
        }
        return C46238a.m51546a(this.f193658e.f193660a, getSafeDeviceNameEvent.f193658e.f193660a);
    }
}
