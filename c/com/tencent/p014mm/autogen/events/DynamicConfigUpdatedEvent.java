package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent */
public final class DynamicConfigUpdatedEvent extends IEvent {
    public DynamicConfigUpdatedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DynamicConfigUpdatedEvent)) {
            return false;
        }
        DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent = (DynamicConfigUpdatedEvent) iEvent;
        return true;
    }
}
