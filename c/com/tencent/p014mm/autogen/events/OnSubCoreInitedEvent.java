package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.OnSubCoreInitedEvent */
public final class OnSubCoreInitedEvent extends IEvent {
    public OnSubCoreInitedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnSubCoreInitedEvent)) {
            return false;
        }
        OnSubCoreInitedEvent onSubCoreInitedEvent = (OnSubCoreInitedEvent) iEvent;
        return true;
    }
}
