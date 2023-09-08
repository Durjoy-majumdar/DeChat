package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent */
public final class AppBrandVoipCheckIsDeviceUsingEvent extends IEvent {

    /* renamed from: d */
    public C55109a f154734d = new C55109a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent$a */
    public static final class C55109a {

        /* renamed from: a */
        public boolean f154735a = false;

        /* renamed from: b */
        public boolean f154736b = false;
    }

    public AppBrandVoipCheckIsDeviceUsingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandVoipCheckIsDeviceUsingEvent)) {
            return false;
        }
        C55109a aVar = ((AppBrandVoipCheckIsDeviceUsingEvent) iEvent).f154734d;
        return C46238a.m51546a(Boolean.valueOf(this.f154734d.f154735a), Boolean.valueOf(aVar.f154735a)) && C46238a.m51546a(Boolean.valueOf(this.f154734d.f154736b), Boolean.valueOf(aVar.f154736b));
    }
}
