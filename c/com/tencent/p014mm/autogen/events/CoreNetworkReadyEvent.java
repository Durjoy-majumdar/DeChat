package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.CoreNetworkReadyEvent */
public final class CoreNetworkReadyEvent extends IEvent {
    public CoreNetworkReadyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof CoreNetworkReadyEvent)) {
            return false;
        }
        CoreNetworkReadyEvent coreNetworkReadyEvent = (CoreNetworkReadyEvent) iEvent;
        return true;
    }
}
