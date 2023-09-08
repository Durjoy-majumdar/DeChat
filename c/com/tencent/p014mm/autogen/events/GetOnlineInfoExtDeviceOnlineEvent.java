package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.GetOnlineInfoExtDeviceOnlineEvent */
public final class GetOnlineInfoExtDeviceOnlineEvent extends IEvent {
    public GetOnlineInfoExtDeviceOnlineEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetOnlineInfoExtDeviceOnlineEvent)) {
            return false;
        }
        GetOnlineInfoExtDeviceOnlineEvent getOnlineInfoExtDeviceOnlineEvent = (GetOnlineInfoExtDeviceOnlineEvent) iEvent;
        return true;
    }
}
