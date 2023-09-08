package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.DeviceInfoUpdateEvent */
public final class DeviceInfoUpdateEvent extends IEvent {
    public DeviceInfoUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DeviceInfoUpdateEvent)) {
            return false;
        }
        DeviceInfoUpdateEvent deviceInfoUpdateEvent = (DeviceInfoUpdateEvent) iEvent;
        return true;
    }
}
