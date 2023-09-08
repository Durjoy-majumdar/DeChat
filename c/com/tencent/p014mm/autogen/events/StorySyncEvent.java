package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;

/* renamed from: com.tencent.mm.autogen.events.StorySyncEvent */
public final class StorySyncEvent extends IEvent {
    public StorySyncEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StorySyncEvent)) {
            return false;
        }
        StorySyncEvent storySyncEvent = (StorySyncEvent) iEvent;
        return true;
    }
}
