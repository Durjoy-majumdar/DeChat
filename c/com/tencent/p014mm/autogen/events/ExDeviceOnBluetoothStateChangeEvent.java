package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent */
public final class ExDeviceOnBluetoothStateChangeEvent extends IEvent {

    /* renamed from: d */
    public C40072a f107462d = new C40072a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent$a */
    public static final class C40072a {

        /* renamed from: a */
        public int f107463a = -1;
    }

    public ExDeviceOnBluetoothStateChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceOnBluetoothStateChangeEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f107462d.f107463a), Integer.valueOf(((ExDeviceOnBluetoothStateChangeEvent) iEvent).f107462d.f107463a));
    }
}
