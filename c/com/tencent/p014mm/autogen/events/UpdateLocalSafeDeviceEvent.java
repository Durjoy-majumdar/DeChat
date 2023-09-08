package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.UpdateLocalSafeDeviceEvent */
public final class UpdateLocalSafeDeviceEvent extends IEvent {

    /* renamed from: d */
    public C28844a f79037d = new C28844a();

    /* renamed from: com.tencent.mm.autogen.events.UpdateLocalSafeDeviceEvent$a */
    public static final class C28844a {
    }

    public UpdateLocalSafeDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateLocalSafeDeviceEvent)) {
            return false;
        }
        C28844a aVar = ((UpdateLocalSafeDeviceEvent) iEvent).f79037d;
        this.f79037d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
