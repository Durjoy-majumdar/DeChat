package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckDeviceHasAbilityEvent */
public final class ExDeviceCheckDeviceHasAbilityEvent extends IEvent {

    /* renamed from: d */
    public C40060a f107433d = new C40060a();

    /* renamed from: e */
    public C40061b f107434e = new C40061b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckDeviceHasAbilityEvent$a */
    public static final class C40060a {
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckDeviceHasAbilityEvent$b */
    public static final class C40061b {
    }

    public ExDeviceCheckDeviceHasAbilityEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceCheckDeviceHasAbilityEvent)) {
            return false;
        }
        ExDeviceCheckDeviceHasAbilityEvent exDeviceCheckDeviceHasAbilityEvent = (ExDeviceCheckDeviceHasAbilityEvent) iEvent;
        C40060a aVar = exDeviceCheckDeviceHasAbilityEvent.f107433d;
        this.f107433d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107433d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        C40061b bVar = exDeviceCheckDeviceHasAbilityEvent.f107434e;
        this.f107434e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
