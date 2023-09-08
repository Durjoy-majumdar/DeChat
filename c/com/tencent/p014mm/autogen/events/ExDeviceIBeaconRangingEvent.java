package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceIBeaconRangingEvent */
public final class ExDeviceIBeaconRangingEvent extends IEvent {

    /* renamed from: d */
    public C40069a f107450d = new C40069a();

    /* renamed from: e */
    public C40070b f107451e = new C40070b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceIBeaconRangingEvent$a */
    public static final class C40069a {

        /* renamed from: a */
        public String f107452a;

        /* renamed from: b */
        public boolean f107453b = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceIBeaconRangingEvent$b */
    public static final class C40070b {
    }

    public ExDeviceIBeaconRangingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceIBeaconRangingEvent)) {
            return false;
        }
        ExDeviceIBeaconRangingEvent exDeviceIBeaconRangingEvent = (ExDeviceIBeaconRangingEvent) iEvent;
        C40069a aVar = exDeviceIBeaconRangingEvent.f107450d;
        if (!C46238a.m51546a(this.f107450d.f107452a, aVar.f107452a) || !C46238a.m51546a(Boolean.valueOf(this.f107450d.f107453b), Boolean.valueOf(aVar.f107453b))) {
            return false;
        }
        C40070b bVar = exDeviceIBeaconRangingEvent.f107451e;
        this.f107451e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
