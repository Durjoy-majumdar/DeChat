package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceIBeaconPushRefreshUIEvent */
public final class ExDeviceIBeaconPushRefreshUIEvent extends IEvent {

    /* renamed from: d */
    public C40068a f107449d = new C40068a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceIBeaconPushRefreshUIEvent$a */
    public static final class C40068a {
    }

    public ExDeviceIBeaconPushRefreshUIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceIBeaconPushRefreshUIEvent)) {
            return false;
        }
        C40068a aVar = ((ExDeviceIBeaconPushRefreshUIEvent) iEvent).f107449d;
        this.f107449d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
