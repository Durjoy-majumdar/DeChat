package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.MMConnectivityChangeEvent */
public final class MMConnectivityChangeEvent extends IEvent {
    public MMConnectivityChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MMConnectivityChangeEvent)) {
            return false;
        }
        MMConnectivityChangeEvent mMConnectivityChangeEvent = (MMConnectivityChangeEvent) iEvent;
        return true;
    }
}
