package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.UpdateExtDeviceEvent */
public final class UpdateExtDeviceEvent extends IEvent {
    public UpdateExtDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UpdateExtDeviceEvent)) {
            return false;
        }
        UpdateExtDeviceEvent updateExtDeviceEvent = (UpdateExtDeviceEvent) iEvent;
        return true;
    }
}
